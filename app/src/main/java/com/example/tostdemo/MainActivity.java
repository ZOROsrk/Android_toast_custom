package com.example.tostdemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Toast toast;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.my_toast,(ViewGroup)findViewById(R.id.my_cust_toast));

        TextView text =layout.findViewById(R.id.t1);
        text.setText("This is a custom toast");

        toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                toast.show();
            }
        });
    }

}
