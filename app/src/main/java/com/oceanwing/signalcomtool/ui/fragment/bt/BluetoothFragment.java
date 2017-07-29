package com.oceanwing.signalcomtool.ui.fragment.bt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oceanwing.signalcomtool.R;
import com.oceanwing.signalcomtool.base.BaseMainFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BluetoothFragment extends BaseMainFragment {
    private Toolbar mToolbar;

    public BluetoothFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bluetooth, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        ((TextView)view.findViewById(R.id.tittle)).setText(R.string.bluetooth);
    }

    public static BluetoothFragment newInstance() {
        Bundle args = new Bundle();

        BluetoothFragment fragment = new BluetoothFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
