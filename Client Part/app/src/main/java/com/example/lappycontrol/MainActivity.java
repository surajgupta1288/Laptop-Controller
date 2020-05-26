package com.example.lappycontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shutdown(View v)
    {
        Client mycli = new Client("shutdown");
        mycli.execute();
    }
    public void restart(View v)
    {
        Client mycli = new Client("restart");
        mycli.execute();

    }
    public void music(View v)
    {
        Client mycli = new Client("music");
        mycli.execute();

    }
}
