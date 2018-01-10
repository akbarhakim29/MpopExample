package com.bymankind.mpopexample;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.starmicronics.stario.PortInfo;
import com.starmicronics.stario.StarBluetoothManager;
import com.starmicronics.stario.StarIOPort;
import com.starmicronics.stario.StarIOPortException;
import com.starmicronics.starioextension.StarIoExt;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeviceFragment extends Fragment {
    private ProgressDialog mProgressDialog;
    RecyclerView rv_device_connect;
    DeviceAdapter deviceAdapter;
    private List<PortInfo> mPortList;

    StarBluetoothManager manager = null;
    private String              mPortName;
    private String              mPortSettings;
    private String              mMacAddress;
    private String              mModelName;
    private StarIoExt.Emulation mEmulation;
    private Boolean             mDrawerOpenStatus;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setMessage("Communicating...");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_device, container, false);
        rv_device_connect = (RecyclerView) rootview.findViewById(R.id.rv_device_connect);
        deviceAdapter = new DeviceAdapter();
        return rootview;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

    }

    public void loadData(){
        /*try {
            mPortList = StarIOPort.searchPrinter("BT:", getActivity());

        } catch (StarIOPortException e) {
            e.printStackTrace();
        }*/


    }

    /**
     * Register printer information to SharedPreference.
     */
    private void registerPrinter() {
        PrinterSetting setting = new PrinterSetting(getActivity());
        setting.write(mModelName, mPortName, mMacAddress, mPortSettings, mEmulation, mDrawerOpenStatus);
    }





}
