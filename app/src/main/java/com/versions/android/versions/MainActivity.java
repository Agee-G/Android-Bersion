package com.versions.android.versions;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mShowAnswer;
    private TextView mAnswerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnswerTextView=(TextView) findViewById(R.id.API) ;
        mShowAnswer=(Button) findViewById(R.id.show_answer_button);
        mShowAnswer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Build.VERSION.SDK_INT==Build.VERSION_CODES.ICE_CREAM_SANDWICH){
                    mAnswerTextView.setText(R.string.ice1);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1){
                    mAnswerTextView.setText(R.string.ice2);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.JELLY_BEAN){
                    mAnswerTextView.setText(R.string.JB1);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.JELLY_BEAN_MR1){
                    mAnswerTextView.setText(R.string.JB2);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.JELLY_BEAN_MR2){
                    mAnswerTextView.setText(R.string.JB3);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.KITKAT){
                    mAnswerTextView.setText(R.string.KK1);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.LOLLIPOP){
                    mAnswerTextView.setText(R.string.LL1);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.LOLLIPOP_MR1){
                    mAnswerTextView.setText(R.string.LL2);
                }  if(Build.VERSION.SDK_INT==Build.VERSION_CODES.M){
                    mAnswerTextView.setText(R.string.M1);
                }
            }
        });
    }
}
