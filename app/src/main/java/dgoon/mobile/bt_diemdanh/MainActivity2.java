package dgoon.mobile.bt_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtMSV, txtTen, txtQQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtMSV = (TextView) findViewById(R.id.editTextTextMSV);
        txtTen = (TextView) findViewById(R.id.editTextTextTSV);
        txtQQ = (TextView) findViewById(R.id.editTextTextQQ);

        Intent a = getIntent();
        String value1 = a.getStringExtra("Key_1");
        String value2 = a.getStringExtra("Key_2");
        String value3 = a.getStringExtra("Key_3");


        txtMSV.setText(value1);
        txtTen.setText(value2);
        txtQQ.setText(value3);

    }
}