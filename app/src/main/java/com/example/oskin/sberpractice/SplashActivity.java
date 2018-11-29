package com.example.oskin.sberpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mEditText.setText(SplashActivity.class.getSimpleName());
    }

    private void initListeners() {
        mButton.setOnClickListener(new ButtonClickListener());
    }

    private void initViews() {
        mButton = findViewById(R.id.splash_button_to_main);
        mEditText = findViewById(R.id.splash_text_view);
    }

    public final static Intent newIntent(Context context){
        Intent intent = new Intent(context, SplashActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(MainActivity.newIntent(SplashActivity.this));
        }
    }
}
