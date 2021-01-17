package com.example.savethesharks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView)findViewById(R.id.TextView);
        tv.setText(print_fact());
    }

    public String print_fact()
    {
       String[] facts={"Did you know? \n Sharks do not have bones!",
           "Did you know? \n Shark skin feels similar to sandpaper.",
           "Did you know? \n Scientists age sharks by counting the rings on their vertebrae.",
           "Did you know? \n Each whale shark’s spot pattern is unique as a fingerprint. ",
               "Did you know? \n THERE ARE OVER 500 SPECIES OF SHARK!",
               "Did you know? \n Goblin sharks can be a bright pink colour",
               "Did you know? \n hammerhead sharks have hammer-shaped heads (duh!)",
               "Did you know? \n MOST SHARKS ARE COLD-BLOODED",
               "Did you know? \n SHARKS HAVE A SIXTH SENSE",
               "Did you know? \n Sharks have been around for over 400 million years"
       };
       Random rand= new Random();
       int x= rand.nextInt(10);
        return facts[x];
    }

    public void open(View view)
    {
        Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthyseas.org/donate/?utm_source=gads&utm_medium=search&utm_campaign=ocean%20threats-url2&gclid=Cj0KCQiA3Y-ABhCnARIsAKYDH7sgA8nU4t-OB_BWW_GtjODI5GzzSE3Leb2oiMOOM7P9yOiTxiMyu1EaAo7HEALw_wcB"));
        startActivity(browseIntent);
    }
}