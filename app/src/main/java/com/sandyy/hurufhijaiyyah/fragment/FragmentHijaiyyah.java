package com.sandy.hurufhijaiyyah.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sandy.hurufhijaiyyah.R;

public class FragmentHijaiyyah extends Fragment {

    public FragmentHijaiyyah(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hijaiyyah, container, false);

        return view;
    }
}