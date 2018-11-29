package com.example.oskin.sberpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();
        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mEditText.setText(DetailsActivity.class.getSimpleName());
    }

    private void initListeners() {
        mButton.setOnClickListener(new ButtonClickListener());
    }

    private void initViews() {
        mButton = findViewById(R.id.details_button_to_info);
        mEditText = findViewById(R.id.details_text_view);
    }

    public final static Intent newIntent(Context context){
        Intent intent = new Intent(context, DetailsActivity.class);
        return intent;
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(InfoActivity.newIntent(DetailsActivity.this));
        }
    }
}
