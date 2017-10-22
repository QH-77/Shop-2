package com.wh.shop.ui.activity;
/*
 * @创建者 Administrator
 * @创建时间 2017/10/22 0022 17:39
 * @描述 ${TODO}
 *
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 * 
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.wh.shop.R;

import butterknife.ButterKnife;

public abstract class BaseActivity extends FragmentActivity {
    private int mLayoutId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
        initData();
    }

    public abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();


}
