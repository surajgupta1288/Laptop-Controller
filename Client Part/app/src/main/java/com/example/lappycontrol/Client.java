package com.example.lappycontrol;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void,Void,Void>
{
    String type="";
    String ip_address = "192.168.42.99";
    Client(String t)
    {
        type = t;
    }
    protected Void doInBackground(Void... args0)
    {
        if(type == "shutdown") {
            try {
            Socket cli= new Socket(ip_address, 9999);
            OutputStream output = cli.getOutputStream();
            DataOutputStream out = new DataOutputStream(output);
                out.writeBytes("shutdown");

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else if (type == "restart")
        {
            try {
                Socket cli = new Socket(ip_address, 9999);
                OutputStream output = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(output);
                out.writeBytes("restart");

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else if(type == "music")
        {
            try {
                Socket cli = new Socket(ip_address, 9999);
                OutputStream output = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(output);
                out.writeBytes("music");

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return null;

    }
}
