package com.example.administrator.myapplication;

import android.view.View;

/**
 * Created by Administrator on 2017/3/26.
 */

public class User {
    private String name;
    private String passWorld;

    public String getName() {
        return name;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public interface Listener{
        void onClick(View view);
    }

}
