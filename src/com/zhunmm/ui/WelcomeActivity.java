package com.zhunmm.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.zhunmm.R;
import com.zhunmm.ui.bash.BaseActivity;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        this.findViewById(R.id.onClick).setOnClickListener(
                new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        MainActivity.actionActivity(WelcomeActivity.this);
                        WelcomeActivity.this.finish();
                    }
                });
        
        

    }

}
