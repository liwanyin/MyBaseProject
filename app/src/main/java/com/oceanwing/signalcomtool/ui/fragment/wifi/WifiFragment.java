package com.oceanwing.signalcomtool.ui.fragment.wifi;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oceanwing.signalcomtool.R;
import com.oceanwing.signalcomtool.base.BaseMainFragment;
import com.oceanwing.signalcomtool.event.TabSelectedEvent;
import com.oceanwing.signalcomtool.ui.fragment.MainFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * A simple {@link Fragment} subclass.
 */
public class WifiFragment extends BaseMainFragment {
    private Toolbar mToolbar;

    public WifiFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wifi, container, false);
        initView(view);

        return view;
    }

    private void initView(View view) {
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        mToolbar.setTitle("");
        ((TextView)view.findViewById(R.id.tittle)).setText(R.string.wifi);
    }

    public static WifiFragment newInstance() {
        Bundle args = new Bundle();

        WifiFragment fragment = new WifiFragment();
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Reselected Tab
     */
    @Subscribe
    public void onTabSelectedEvent(TabSelectedEvent event) {
        if (event.position != MainFragment.SECOND)
            return;
    }
}
