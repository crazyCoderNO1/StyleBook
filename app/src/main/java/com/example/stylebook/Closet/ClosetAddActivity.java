package com.example.stylebook.Closet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.stylebook.R;

public class ClosetAddActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closet_item_add);
        FloatingActionButton floartingdone=(FloatingActionButton)findViewById(R.id.floatingbar_done);
        floartingdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClosetAddActivity.this.finish();
            }
        });
    }
}