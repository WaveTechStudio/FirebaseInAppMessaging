package finja.com.firebaseinnapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the instance id to test on device.

        FirebaseApp.initializeApp(MainActivity.this);
        Log.d("Instance ID ",FirebaseInstanceId.getInstance().getId());
    }
}
