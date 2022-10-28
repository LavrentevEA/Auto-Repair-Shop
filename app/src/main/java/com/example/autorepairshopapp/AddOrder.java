package com.example.autorepairshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import org.json.JSONException;
import org.json.JSONObject;

public class AddOrder extends AppCompatActivity {

    private EditText year;
    private EditText repair_parts;
    private EditText cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);
        Spinner spinner_brand = (Spinner) findViewById(R.id.spinner_brand);
        Spinner spinner_model = (Spinner) findViewById(R.id.spinner_model);
        Spinner spinner_work = (Spinner) findViewById(R.id.spinner_work);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.work, android.R.layout.simple_spinner_item);
        try {
            JSONObject jsonObject = new JSONObject("model.json");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        spinner_work.setAdapter(adapter1);

    }
}