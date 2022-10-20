package com.example.idkwhattoeat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Home homeFragment = new Home();
    Cravings cravingsFragment = new Cravings();
    Profile profileFragment = new Profile();
    Random randomFragment = new Random();
    Upload uploadFragment = new Upload();

    @Override

    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).commit();
                        return true;
                    case R.id.cravings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, cravingsFragment).commit();
                        return true;
                    case R.id.random:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, randomFragment).commit();
                        return true;
                    case R.id.upload:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, uploadFragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, profileFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }
}

