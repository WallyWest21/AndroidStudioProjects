package com.pluralsight.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Dgtal on 9/24/13.
 */
public class Activity3 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_3);
        super.onCreate(savedInstanceState);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity3, menu);
        return true;}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        boolean handled = true;
        int id = item.getItemId();
        switch (id) {
            case R.id.action_showToast:
                onClickMenuShowToast(item);
                break;
            case R.id.action_close:
                onClickMenuClose(item);
                break;

            default:
                handled = super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);



    }


     void onClickMenuClose (MenuItem item){
finish();
    }
    void onClickMenuShowToast (MenuItem item){
        Toast toast = Toast.makeText(this, getString(R.string.thisIsAToastText), Toast.LENGTH_LONG);
        toast.show();

    }
}