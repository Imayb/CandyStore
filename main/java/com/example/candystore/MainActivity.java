package com.example.candystore;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.candystore.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button btnStore, btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnStore = (Button) findViewById(R.id.btnStore);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentStore = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(intentStore);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignIn = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intentSignIn);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignUp = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intentSignUp);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button
        // specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            Intent addIntent = new Intent(this, AddActivity.class);
            this.startActivity(addIntent);
            return true;
        }

        if (id == R.id.action_delete) {
            Intent deleteIntent = new Intent(this, DeleteActivity.class);
            this.startActivity(deleteIntent);
            return true;
        }

        if (id == R.id.action_update) {
            Intent updateIntent = new Intent(this, UpdateActivity.class);
            this.startActivity(updateIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    /*@Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
}