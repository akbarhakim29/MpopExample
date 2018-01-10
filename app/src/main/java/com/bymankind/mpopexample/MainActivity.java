package com.bymankind.mpopexample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.starmicronics.starioextension.StarIoExt;


public class MainActivity extends AppCompatActivity {

    Button btn_open_cashdrawer, btn_connect_bt, btn_connect_usb, btn_print, btn_status_device;
    StarIoExt.Emulation emulation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open_cashdrawer = (Button) findViewById(R.id.btn_open_cashdrawer);
        btn_connect_bt = (Button) findViewById(R.id.btn_connect_bt);
        btn_connect_usb = (Button) findViewById(R.id.btn_connect_usb);
        btn_print = (Button) findViewById(R.id.btn_print);
        btn_status_device = (Button) findViewById(R.id.btn_status_device);

        /*PrinterSetting setting = new PrinterSetting(getApplicationContext());*/
        emulation = StarIoExt.Emulation.StarPRNT;

        btn_connect_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeviceFragment deviceFragment = new DeviceFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_main, deviceFragment)
                        .addToBackStack(MainActivity.class.getSimpleName())
                        .commit();
            }
        });

        btn_connect_usb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_open_cashdrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiFunctions.createGenericData(emulation);
            }
        });

        btn_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_status_device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.frame_main, deviceStatusFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


}
