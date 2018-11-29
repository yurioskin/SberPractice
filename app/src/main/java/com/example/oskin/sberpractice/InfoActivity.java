package com.example.oskin.sberpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mEditText.setText(InfoActivity.class.getSimpleName());
    }

    private void initListeners() {
        mButton.setOnClickListener(new ButtonClickListener());
    }

    private void initViews() {
        mButton = findViewById(R.id.info_close_all_prev);
        mEditText = findViewById(R.id.info_text_view);
    }

    public final static Intent newIntent(Context context){
        Intent intent = new Intent(context, InfoActivity.class);
        return intent;
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(SplashActivity.newIntent(InfoActivity.this));
        }
    }
}
