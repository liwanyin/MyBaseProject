package com.oceanwing.signalcomtool.ui.fragment.about;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oceanwing.signalcomtool.R;
import com.oceanwing.signalcomtool.base.BaseBackFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends BaseBackFragment {
    private Toolbar mToolbar;

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    protected void initToolbarNav(Toolbar toolbar) {
        super.initToolbarNav(toolbar);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        ((TextView) view.findViewById(R.id.tittle)).setText(R.string.about);
    }

    public static AboutFragment newInstance() {
        Bundle args = new Bundle();

        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
