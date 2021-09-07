package baa.fit.bstu.by;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import baa.fit.bstu.by.text.TextFunctionRenamed;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", " counter =" + count);
        }
        
        displayText();
    }

    private void displayText() {
        TextFunctionRenamed tfr = new TextFunctionRenamed();
        TextView nt = findViewById(R.id.tw_id);
        nt.setText(tfr.getValue());
    }
}