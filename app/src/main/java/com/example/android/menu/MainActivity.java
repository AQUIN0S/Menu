package com.example.android.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.menu_item_1) TextView menuItem1;
    @BindView(R.id.menu_item_2) TextView menuItem2;
    @BindView(R.id.menu_item_3) TextView menuItem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.print_button)
    public void printToLogs() {
        Log.v("Menu Item 1", menuItem1.getText().toString());
        Log.v("Menu Item 2", menuItem2.getText().toString());
        Log.v("Menu Item 3", menuItem3.getText().toString());

    }
}
