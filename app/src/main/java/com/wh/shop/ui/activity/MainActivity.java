package com.wh.shop.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.wh.shop.R;
import com.wh.shop.bean.Tabs;
import com.wh.shop.ui.fragment.CartFragment;
import com.wh.shop.ui.fragment.CategoryFragment;
import com.wh.shop.ui.fragment.FragmentTabHost;
import com.wh.shop.ui.fragment.HomeFragment;
import com.wh.shop.ui.fragment.HotFragment;
import com.wh.shop.ui.fragment.MineFragment;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseActivity {

    private List<Tabs> mTabsList = new ArrayList<>();


    @BindView(R.id.realtabcontent)
    FrameLayout     mRealtabcontent;
    @BindView(android.R.id.tabhost)
    FragmentTabHost mTabhost;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {


    }

    @Override
    protected void initData() {

        initTabs();
    }

    private void initTabs() {

        //调用setup()方法，设置FragmentManager以及指定用于装载Fragment的布局容器
        mTabhost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        //新建5个分页，并且添加到List当中，便于管理，其中的图标我们使用了selector进行状态选择，即选中的时候会变色
        addToList(HomeFragment.class, R.drawable.selector_icon_home, R.string.home);
        addToList(HotFragment.class, R.drawable.selector_icon_hot, R.string.hot);
        addToList(CategoryFragment.class, R.drawable.selector_icon_category, R.string.category);
        addToList(CartFragment.class, R.drawable.selector_icon_cart, R.string.cart);
        addToList(MineFragment.class, R.drawable.selector_icon_mine, R.string.mine);

        for (Tabs tab : mTabsList) {
            //新建5个TabSpec，并且设置好它的Indicator
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(getString(tab.getTitle()));
            View view = LayoutInflater.from(this).inflate(R.layout.tab_indicator, null);
            ImageView iv_tab_icon = view.findViewById(R.id.icon_tab);
            TextView tv_tab_text = view.findViewById(R.id.txt_indicator);

            iv_tab_icon.setImageResource(tab.getIcon());
            tv_tab_text.setText(tab.getTitle());

            tabSpec.setIndicator(view);

            //把每个TabSpec 添加到FragmentTabHost 里面
            mTabhost.addTab(tabSpec, tab.getFramgent(), null);
        }

        //去掉分隔线
        mTabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);

    }

    private void addToList(Class fragment, int icon, int title) {
        Tabs tab = new Tabs(fragment, icon, title);
        mTabsList.add(tab);
    }


}

