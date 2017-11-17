package com.example.chyi.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class F1Fragment extends Fragment {

    private View view;
    private Button f1test;
    private TextView f1tv;
    private MainActivity mainActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("XD","Attach");
        if( mainActivity==null ){
            mainActivity = (MainActivity)context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("XD","Detach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("XD","MSG:F1");
        if( view==null ){//
            view = inflater.inflate(R.layout.fragment_f1, container, false);

            f1test = (Button)view.findViewById(R.id.f1test1);
            f1tv = (TextView)view.findViewById(R.id.f1tv);

            f1test.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1test();
                }
            });
        }
        return view;
    }

    private void f1test(){

        f1tv.setText(""+(Math.random()*49+1));
        mainActivity.tv.setText("HELLO"+(Math.random()*49+1));
    }

}
