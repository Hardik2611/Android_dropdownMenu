package com.example.hardikgoyal_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        String s1 = item.getTitle().toString();
        switch (id)
        {
            case R.id.item1:
                Toast.makeText(MainActivity.this, "item1 selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item2:
                Toast.makeText(MainActivity.this, "item2 selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                Toast.makeText(MainActivity.this, "item3 selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item4:
                Toast.makeText(MainActivity.this, "item4 selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item5:
                Toast.makeText(MainActivity.this, "item5 selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item6:
                Toast.makeText(MainActivity.this, "item6 selected", Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}