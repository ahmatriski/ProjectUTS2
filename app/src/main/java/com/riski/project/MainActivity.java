package com.riski.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    LinearLayout mlinePilGan, mLineEssay;	//variabel baru bertipe LinearLayout
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.nav_chats:
                        selectedFragment = new ChatsFragment();
                        break;
                    case R.id.nav_status:
                        selectedFragment = new StatusFragment();
                        break;
                    case R.id.nav_home:
                        selectedFragment = new HomeFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);
        mLineEssay = (LinearLayout) findViewById(R.id.lineEssay);

        //memberi aksi ketika diklik
        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(MainActivity.this, KuisPilihanGanda.class);
                startActivity(i); //jalankan Intent
            }
        });

        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent i = new Intent(MainActivity.this, KuisEssay.class);
                startActivity(i);
            }
        });
    }

}