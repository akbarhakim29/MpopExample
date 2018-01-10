package com.bymankind.mpopexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Server-Panduit on 1/10/2018.
 */

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder>{


    @Override
    public DeviceAdapter.DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DeviceAdapter.DeviceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DeviceViewHolder extends RecyclerView.ViewHolder {
        public DeviceViewHolder(View itemView) {
            super(itemView);
        }
    }
}
