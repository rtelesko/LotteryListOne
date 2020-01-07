package com.example.lotterylistone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TopLevelActivity extends AppCompatActivity {

    // GUI controls
    private ListView lvOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        // Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> lvOptions,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    LotteryCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        // Add the listener to the list view
        lvOptions = findViewById(R.id.lvOptions);
        lvOptions.setOnItemClickListener(itemClickListener);
    }
}

