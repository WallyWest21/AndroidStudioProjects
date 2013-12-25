package com.example.lottonumbers;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import java.util.Random;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import static com.example.lottonumbers.ShakeDetector.OnShakeListener;
import static java.lang.Thread.sleep;

public class MainActivity extends Activity {

    // The following are used for the shake detection
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto);
         setupUIEvents();



            //Thread.sleep(1000);


// ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new OnShakeListener() {

            @Override
            public void onShake(int count) throws InterruptedException {
                /*
                 * The following method, "handleShakeEvent(count):" is a stub //
                 * method you would use to setup whatever you want done once the
                 * device has been shook.
                 */
                handleShakeEvent();
            }
        });



    }

     void handleShakeEvent() throws InterruptedException {
        //TextView textView = (TextView) findViewById(R.id.ResultView1);

        //Random r = new Random();
        //int i1=r.nextInt(49-1) + 1;
        //String result = new Integer(i1).toString();

       // textView.setText(result);
         handleButtonClick();
    }

    @Override
    public void onResume() {
        super.onResume();
        // Add the following line to register the Session Manager Listener onResume
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,    SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        // Add the following line to unregister the Sensor Manager onPause
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    void setupUIEvents() {

        Button theButton= (Button) findViewById(R.id.goButton);
        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    //for(int i=1; i<11; i++){
                    handleButtonClick();
                      //  Thread.sleep(1000);
                    //}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
                      }
    void handleButtonClick () throws InterruptedException {
        TextView textView1 = (TextView) findViewById(R.id.ResultView1);
        TextView textView2 = (TextView) findViewById(R.id.ResultView2);

        Random r = new Random();
        int i1=r.nextInt(49-1) + 1;
        String result = new Integer(i1).toString();

        textView1.setText(result);


        i1=r.nextInt(49-1) + 1;
        result = new Integer(i1).toString();
            //Thread.sleep(1000);
        textView2.setText(result);

    }


       };




