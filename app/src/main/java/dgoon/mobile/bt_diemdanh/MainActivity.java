package dgoon.mobile.bt_diemdanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btnNhap, btnHuy;
    EditText edtMSV, edtTen, edtQQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap = (Button) findViewById(R.id.buttonNhap);
        btnHuy = (Button) findViewById(R.id.buttonHuy);
        edtMSV = (EditText) findViewById(R.id.editTextTextMSV);
        edtTen = (EditText) findViewById(R.id.editTextTextTSV);
        edtQQ = (EditText) findViewById(R.id.editTextTextQQ);


        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, MainActivity2.class);
                a.putExtra("key_1",edtMSV.getText().toString());
                a.putExtra("key_2", edtTen.getText().toString());
                a.putExtra("key_3", edtQQ.getText().toString());
                startActivity(a);
            }
        });
    }


}