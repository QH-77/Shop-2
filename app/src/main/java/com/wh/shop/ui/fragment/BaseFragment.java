package com.wh.shop.ui.fragment;
/*
 * @创建者 Administrator
 * @创建时间 2017/10/22 0022 17:29
 * @描述 ${TODO}
 *
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 * 
 */

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public abstract class BaseFragment extends Fragment {
    private int mFragmentLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentLayout(), container, false);
        return view;
    }
    public abstract int getFragmentLayout();
}
