package com.eomsbd.Islamic.activity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.eomsbd.Islamic.R;
import com.eomsbd.Islamic.fragment.Sura177Fragment;
import com.eomsbd.Islamic.fragment.Sura215Fragment;
import com.eomsbd.Islamic.fragment.Sura54Fragment;
import com.eomsbd.Islamic.fragment.sura18Fragment;
import com.eomsbd.Islamic.fragment.sura20Fragment;
import com.eomsbd.Islamic.fragment.sura245Fragment;
import com.eomsbd.Islamic.fragment.sura247Fragment;
import com.eomsbd.Islamic.fragment.sura261Fragment;
import com.eomsbd.Islamic.fragment.sura36_38Fragment;
import com.eomsbd.Islamic.fragment.sura7Fragment;
import com.eomsbd.Islamic.fragment.sura92Fragment;
import com.eomsbd.Islamic.fragment.sura97Fragment;

import java.util.List;

public class StartActivity extends AppCompatActivity  {
    ListView listView;
    ConstraintLayout constraintLayout;
    LinearLayout button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        listView = findViewById(R.id.list_item);
        constraintLayout = findViewById(R.id.container);
        button=findViewById(R.id.startBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String[] item = getResources().getStringArray(R.array.list);
        ArrayAdapter adapter = new ArrayAdapter(StartActivity.this, android.R.layout.simple_list_item_1, item);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    Sura177Fragment fragment = new Sura177Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 1) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    Sura215Fragment fragment = new Sura215Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 2) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura245Fragment fragment = new sura245Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 3) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura247Fragment fragment = new sura247Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 4) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    Sura54Fragment fragment = new Sura54Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 5) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura261Fragment fragment = new sura261Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 6) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura97Fragment fragment = new sura97Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 7) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura18Fragment fragment = new sura18Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 8) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura20Fragment fragment = new sura20Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 9) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura92Fragment fragment = new sura92Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 10) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura36_38Fragment fragment = new sura36_38Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 11) {
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    sura7Fragment fragment = new sura7Fragment();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        tellFragments();
        super.onBackPressed();
    }

    private void tellFragments() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment f : fragments) {
            if (f != null && f instanceof Sura177Fragment) {
                ((Sura177Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Sura215Fragment) {
                ((Sura215Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura245Fragment) {
                ((sura245Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura247Fragment) {
                ((sura247Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Sura54Fragment) {
                ((Sura54Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura261Fragment) {
                ((sura261Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura97Fragment) {
                ((sura97Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura18Fragment) {
                ((sura18Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura20Fragment) {
                ((sura20Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura92Fragment) {
                ((sura92Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura36_38Fragment) {
                ((sura36_38Fragment) f).onBackPressed();
            } else if (f != null && f instanceof sura7Fragment) {
                ((sura7Fragment) f).onBackPressed();
            }

        }
    }
}