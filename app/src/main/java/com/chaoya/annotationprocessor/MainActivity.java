package com.chaoya.annotationprocessor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chaoya.appannotation.BindView;
import com.chaoya.appapi.LCYViewBinder;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sample_text)
    TextView sample_text;
    @BindView(R.id.button)
    Button mButton;

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LCYViewBinder.bind(this);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sample_text.setText(stringFromJNI());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LCYViewBinder.unBind(this);
    }

    public native String stringFromJNI();
}
