package com.pluralsight.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Dgtal on 9/25/13.
 */
public class OtherActivity extends Activity  {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        setupUIEvents();
    }



void setupUIEvents() {
Button theButton = (Button) findViewById(R.id.TopSectionButton);
theButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        OtherActivity.this.handleButtonClick(Button view);
    }
});

   Button theButton2 = (Button) findViewbyId(R.id.button2);
    theButton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            handleButton2Click(Button view);
        }
    });
}
void handleButtonClick (Button button) {
TextView textView = (TextView) findViewById(R.id.firtTopTextView);
 textView.setText("Click 1");

}

  void handleButton2Click (Button button) {
TextView textView = (TextView) findViewById(R.id.firtTopTextView);
 textView.setText("Click 2");
}


