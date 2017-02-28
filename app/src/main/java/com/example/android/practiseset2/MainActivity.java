package com.example.android.practiseset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int na=0,nb=0;
    public void point_threeA (View View)
    {
        na+=3;
        display(na);
    }
    public void point_threeB (View View)
    {
        nb+=3;
        display1(nb);
    }
    public void point_twoA (View View)
    {
        na+=2;
        display(na);
    }
    public void point_twoB (View View)
    {
        nb+=2;
        display1(nb);
    }
    public void point_oneA (View View)
    {
        na+=1;
        display(na);
    }
    public void point_oneB (View View)
    {
        nb+=1;
        display1(nb);
    }
    public void reset(View View)
    {
        na = nb =0;
        display1(nb);
        display(na);

    }

    private void display(int num) {
        TextView t = (TextView) findViewById(R.id.A_score);
        t.setText(""+num);
    }

    private void display1(int num) {
        TextView t = (TextView) findViewById(R.id.B_score);
        t.setText(""+num);
    }


}

