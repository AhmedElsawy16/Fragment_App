package com.example.a7med_11.fragment_app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by a7med_11 on 03/01/16.
 */
public class FragmentA extends Fragment{

    Button button;

    connection conn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_a_layout,container,false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        conn = (connection) getActivity();
        button = (Button) getActivity().findViewById(R.id.button2);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                conn.con("Hi! my name is ahmed");
            }
        });
        
    }


}
