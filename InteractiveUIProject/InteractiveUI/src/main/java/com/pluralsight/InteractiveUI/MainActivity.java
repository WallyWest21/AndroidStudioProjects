package com.pluralsight.InteractiveUI;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {



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
        boolean handled = false;

        int id = item.getItemId();
        switch (id) {
            case R.id.action_other:
                onclickMenuOther(item);
                handled =true;
                break;
            case R.id.action_exit:
                onClickMenuExit(item);
                handled =true;
                break;
            default:
                handled=super.onOptionsItemSelected(item);
        }
        return handled;
    }

    public void onclickMenuOther(MenuItem item){
        Toast toast =Toast.makeText(this, "Other Click", Toast.LENGTH_LONG );
                toast.show();

    }
    public void onClickMenuExit (MenuItem item){
        finish();
    }
}
