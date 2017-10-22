package com.wh.shop.bean;
/*
 * @创建者 weihao
 * @创建时间 2017/10/22 0022 17:37

 * 
 */

import android.support.v4.app.Fragment;

import com.wh.shop.ui.fragment.HomeFragment;

public class Tabs {
    private Class framgent;
    private int   icon;
    private int   title;

    public Class getFramgent() {
        return framgent;
    }

    public void setFramgent(Class framgent) {
        this.framgent = framgent;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public Tabs(Class framgent, int icon, int title) {
        this.framgent = framgent;
        this.icon = icon;
        this.title = title;
    }
}

