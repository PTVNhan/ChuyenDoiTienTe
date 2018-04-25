package com.nhoxut.chuyendoitiente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button clear, convert;
    final int tyGia = 22000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = (Button) findViewById(R.id.buttonClear);
        convert = (Button) findViewById(R.id.buttonConvert);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtUS = (EditText) findViewById(R.id.editUS);
                EditText  edtVN = (EditText) findViewById(R.id.editVN);
                String strUS = edtUS.getText().toString();
                String strVN = String.valueOf(Integer.parseInt(strUS)*tyGia);
                edtVN.setText(strVN);
            }

        });
    }
}
