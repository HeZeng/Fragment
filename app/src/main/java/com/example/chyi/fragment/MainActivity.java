package com.example.chyi.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fmrg;
    private FragmentTransaction transaction;
    private F1Fragment F1;
    private  F2Fragment F2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);

        F1 = new F1Fragment();
        F2 = new F2Fragment();

        fmrg = getSupportFragmentManager();
        transaction = fmrg.beginTransaction();
        transaction.add(R.id.container,F1);
        transaction.commit();


    }

    public void test1(View view) {
        transaction = fmrg.beginTransaction();
        transaction.replace(R.id.container,F1);
        transaction.commit();

    }

    public void test2(View view) {
        transaction = fmrg.beginTransaction();
        transaction.replace(R.id.container,F2);
        transaction.commit();
    }
}
