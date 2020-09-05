package com.example.simplelistjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Array of strings
    String MasterAndroidApps[] =
            {"Master Android App",
             "Master Android App Pro",
             "Master Flutter",
             "Master Kotlin App",
             "Subscribe to AndroidMasterAPP",
             "Rate 5 stars Master Android App"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring and instantiating ListView
        ListView simpleList = findViewById(R.id.listy);

        // Create an ArrayAdapter object
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String >(
                this,
                R.layout.listview_item,
                R.id.textView,
                MasterAndroidApps);

        // Set adater to View
        simpleList.setAdapter(arrayAdapter);


    }
}
