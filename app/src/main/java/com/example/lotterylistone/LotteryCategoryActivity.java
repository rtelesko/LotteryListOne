package com.example.lotterylistone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class LotteryCategoryActivity extends AppCompatActivity {

    // GUI controls
    private ListView lvLottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_category);
        ArrayAdapter<Lottery> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Lottery.lotteries);
        lvLottery = findViewById(R.id.lvLottery);
        lvLottery.setAdapter(listAdapter);

        // Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> lvLottery,
                                            View itemView,
                                            int position,
                                            long id) {
                        // Pass the lottery the user clicks on to LotteryActivity
                        Intent intent = new Intent(LotteryCategoryActivity.this,
                                LotteryActivity.class);
                        intent.putExtra(LotteryActivity.EXTRA_LOTTERYID, (int) id);
                        startActivity(intent);
                    }
                };

        // Assign the listener to the list view
        lvLottery.setOnItemClickListener(itemClickListener);
    }
}
