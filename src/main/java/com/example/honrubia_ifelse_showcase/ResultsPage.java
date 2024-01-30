package com.example.honrubia_ifelse_showcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class ResultsPage extends AppCompatActivity {

    TextView PresidentList;
    TextView VicePresidentList;
    TextView SecretaryList;

    String president1;
    String vicepres1;
    String secretary1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
        PresidentList = findViewById(R.id.PresidentList);
        VicePresidentList = findViewById(R.id.VicePresidentList);
        SecretaryList = findViewById(R.id.SecretaryList);

        Intent i = getIntent();
        president1 = i.getStringExtra("president");
        vicepres1 = i.getStringExtra("vicepresident");
        secretary1 = i.getStringExtra("secretary");

        PresidentList.setText("President: " + president1);
        VicePresidentList.setText("Vice President: " + vicepres1);
        SecretaryList.setText("Secretary: " + secretary1);


    }

    public void BackToMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}