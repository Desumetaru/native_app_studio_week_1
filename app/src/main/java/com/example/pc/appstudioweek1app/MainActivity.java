package com.example.pc.appstudioweek1app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    // initialize button widgets on create
    private Button Button1Click, Button2Click, Button3Click, Button4Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1Click = (Button) findViewById(R.id.button_1);
        Button2Click = (Button) findViewById(R.id.button_2);
        Button3Click = (Button) findViewById(R.id.button_3);
        Button4Click = (Button) findViewById(R.id.button_4);
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
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    // Generate pop-up message on each button click
    public void Button1Click(View view) {
        String response = "You pushed Button 1!";
        Toast toast = Toast.makeText(this, response, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 700);
        toast.show();
    }

    public void Button2Click(View view) {
        String response = "You pushed Button 2!";
        Toast toast = Toast.makeText(this, response, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 700);
        toast.show();
    }

    public void Button3Click(View view) {
        String response = "You pushed Button 3!";
        Toast toast = Toast.makeText(this, response, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 700);
        toast.show();
    }

    public void Button4Click(View view) {
        String response = "You pushed Button 4!";
        Toast toast = Toast.makeText(this, response, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 700);
        toast.show();
    }
}
