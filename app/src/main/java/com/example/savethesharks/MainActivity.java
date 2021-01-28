package com.example.savethesharks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.TextView);
        tv.setText(print_fact());
    }

    public String print_fact() {
        String[] facts = {
                "Sharks do not have bones!",
                "Shark skin feels similar to sandpaper!",
                "Scientists age sharks by counting the rings on their vertebrae!",
                "Each whale shark’s spot pattern is unique as a fingerprint!",
                "THERE ARE OVER 500 SPECIES OF SHARK!",
                "Goblin sharks can be a bright pink colour!",
                "Hammerhead sharks have hammer-shaped heads (duh!)",
                "MOST SHARKS ARE COLD-BLOODED!",
                "SHARKS HAVE A SIXTH SENSE!",
                "Sharks have been around for over 400 million years!"
        };
        Random rand = new Random();
        int x = rand.nextInt(10);
        return "Did you know?\n" + facts[x];
    }

    public void open(View view) {
        Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthyseas.org/donate/?utm_source=gads&utm_medium=search&utm_campaign=ocean%20threats-url2&gclid=Cj0KCQiA3Y-ABhCnARIsAKYDH7sgA8nU4t-OB_BWW_GtjODI5GzzSE3Leb2oiMOOM7P9yOiTxiMyu1EaAo7HEALw_wcB"));
        startActivity(browseIntent);
    }
}