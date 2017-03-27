package com.example.administrator.myapplication;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.myapplication.databinding.LoginLayoutBinding;

public class MainActivity extends AppCompatActivity implements User.Listener {

    private User user;
    private LoginLayoutBinding layoutBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutBinding = DataBindingUtil.setContentView(this, R.layout.login_layout);
        user = new User();
        user.setName("zhang san");
        user.setPassWorld("123456");
        layoutBinding.setUser(user);
        layoutBinding.etName.setBackgroundColor(Color.BLUE);
        layoutBinding.setListener(this);
    }

    public void login(){
        Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();

    }

    public void register(){
        Toast.makeText(this, "register", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, user.getName(), Toast.LENGTH_SHORT).show();
    }
}
