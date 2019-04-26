package com.eomsbd.Islamic.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eomsbd.Islamic.Interface.OnBackPressed;
import com.eomsbd.Islamic.R;
import com.eomsbd.Islamic.activity.StartActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sura54Fragment extends Fragment implements OnBackPressed {
LinearLayout button5;

    public Sura54Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sura54, container, false);
        button5= view.findViewById(R.id.backButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), StartActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getActivity(), StartActivity.class);
        startActivity(i);
    }
}
