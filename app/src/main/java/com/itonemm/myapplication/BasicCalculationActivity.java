package com.itonemm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BasicCalculationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculation);
    }

    public void buAdd(View view) {

        EditText edt_num1=findViewById(R.id.edt_num1);
        EditText edt_num2=findViewById(R.id.edt_num2);
        String num1=edt_num1.getText().toString().trim();
        String num2=edt_num2.getText().toString().trim();
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res=n1+n2;
        TextView txtresult=findViewById(R.id.txt_result);
        txtresult.setText(String.valueOf(res));

    }

    public void buSub(View view) {
        EditText edt_num1=findViewById(R.id.edt_num1);
        EditText edt_num2=findViewById(R.id.edt_num2);
        String num1=edt_num1.getText().toString().trim();
        String num2=edt_num2.getText().toString().trim();
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int res=n1-n2;
        TextView txtresult=findViewById(R.id.txt_result);
        txtresult.setText(String.valueOf(res));
    }
}
