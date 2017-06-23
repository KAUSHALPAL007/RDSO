package com.example.ankit.orh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ConfirmationScreen extends AppCompatActivity
{
    Toolbar toolbar;
    TextView textv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_screen);
        toolbar = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setLogo(R.drawable.logo3);
        getSupportActionBar().setTitle("    ORH and Vehicle Management System");
        getSupportActionBar().setSubtitle("    Welcome Dhiraj Srivastava");

        textv = (TextView)findViewById(R.id.head1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return super.onOptionsItemSelected(item);
    }
}
