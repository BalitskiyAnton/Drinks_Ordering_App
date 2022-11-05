package com.example.drinksorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    private TextView helloTextView;
    private TextView additivesTextView;
    private RadioGroup radioGroup;
    private RadioButton radioButtonTee;
    private RadioButton radioButtonCoffee;
    private CheckBox checkBoxSugar;
    private CheckBox checkBoxMilk;
    private CheckBox checkBoxLimon;
    private Spinner spinnerTea;
    private Spinner spinnerCoffee;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        initViews();

    }

    private void initViews() {
        helloTextView = findViewById(R.id.helloTextView);
        additivesTextView = findViewById(R.id.additivesTextView);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonCoffee = findViewById(R.id.cofeeRadioButton);
        radioButtonTee = findViewById(R.id.teeRadioButton);
        checkBoxLimon = findViewById(R.id.limonCheckBox);
        checkBoxMilk = findViewById(R.id.milkCheckBox);
        checkBoxSugar = findViewById(R.id.sugarCheckBox);
        spinnerTea = findViewById(R.id.spinnerTee);
        spinnerCoffee = findViewById(R.id.spinnerCoffee);
        button = findViewById(R.id.button);
    }

    public static Intent newIntent(Context context, String userName) {
        Intent intent = new Intent(context, OrderActivity.class);
        intent.putExtra("userName", userName);
        return intent;
    }
}