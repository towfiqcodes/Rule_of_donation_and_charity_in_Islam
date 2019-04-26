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
public class sura92Fragment extends Fragment implements OnBackPressed {

LinearLayout button10;
    public sura92Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sura92, container, false);
        button10 = view.findViewById(R.id.backButton10);
        button10.setOnClickListener(new View.OnClickListener() {
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
