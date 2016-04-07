package com.example.a7med_11.fragment_app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by a7med_11 on 03/01/16.
 */
public class FragmentB extends Fragment{
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_b_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView)getActivity().findViewById(R.id.textView3);
    }
    public void modifyText(String data){

        textView.setText(data);
    }
}
