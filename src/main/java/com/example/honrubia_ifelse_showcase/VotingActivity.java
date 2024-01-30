package com.example.honrubia_ifelse_showcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.RadioGroup;

public class VotingActivity extends AppCompatActivity {

    RadioGroup radioGroupPresident;
    RadioGroup radioGroupVicePresident;
    RadioGroup radioGroupSecretary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        radioGroupPresident = findViewById(R.id.radioGroupPresident);
        radioGroupVicePresident = findViewById(R.id.radioGroupVicePresident);
        radioGroupSecretary = findViewById(R.id.radioGroupSecretary);
    }

    public void submitvote(View view) {
        int selectedPresidentId = radioGroupPresident.getCheckedRadioButtonId();
        int selectedVicePresidentId = radioGroupVicePresident.getCheckedRadioButtonId();
        int selectedSecretaryId = radioGroupSecretary.getCheckedRadioButtonId();

        if (selectedPresidentId == -1 || selectedVicePresidentId == -1 || selectedSecretaryId == -1) {
            Toast.makeText(this, "Please vote for President, Vice President, and Secretary.", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton radioButtonPresident = findViewById(selectedPresidentId);
        RadioButton radioButtonVicePresident = findViewById(selectedVicePresidentId);
        RadioButton radioButtonSecretary = findViewById(selectedSecretaryId);

        String president1 = radioButtonPresident.getText().toString();
        String vicepres1 = radioButtonVicePresident.getText().toString();
        String secretary1 = radioButtonSecretary.getText().toString();

        Intent i = new Intent(this, ResultsPage.class);
        i.putExtra("president", president1);
        i.putExtra("vicepresident", vicepres1);
        i.putExtra("secretary", secretary1);
        startActivity(i);
    }
}

