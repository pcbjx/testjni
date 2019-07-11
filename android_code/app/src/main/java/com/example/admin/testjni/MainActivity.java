package com.example.admin.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int u32_v;

    Button bt_value;

    View.OnClickListener mygetconclicklistener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int value = 0;//= getv();

            bt_value.setText(""+value);
        }
    };

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_value = findViewById(R.id.bt_get_value);
        bt_value.setOnClickListener(mygetconclicklistener);
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }



    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native int getv();
    public native int setv(int value);
}
