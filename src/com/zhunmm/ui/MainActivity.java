package com.zhunmm.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.zhunmm.R;
import com.zhunmm.ui.bash.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {
        case R.id.action_settings:

            break;

        default:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

}
