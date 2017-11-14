package com.landsoft.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculartorActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_input_number;

    private Button btn_number_1, btn_number_2, btn_number_3, btn_number_4,
            btn_number_5, btn_number_6, btn_number_7, btn_number_8,
            btn_number_9, btn_number_0,
            btn_plus, btn_sub, btn_multi, btn_div,
            btn_result,
            btn_point, btn_all_clear, btn_clear;

    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculartor);
        initWiget();
        seetEventClickView();
    }

    private void initWiget() {
        edt_input_number = findViewById(R.id.edt_input_number);

        tv_result = findViewById(R.id.tv_result);

        btn_number_1 = findViewById(R.id.btn_number_1);
        btn_number_2 = findViewById(R.id.btn_number_2);
        btn_number_3 = findViewById(R.id.btn_number_3);
        btn_number_4 = findViewById(R.id.btn_number_4);
        btn_number_5 = findViewById(R.id.btn_number_5);
        btn_number_6 = findViewById(R.id.btn_number_6);
        btn_number_7 = findViewById(R.id.btn_number_7);
        btn_number_8 = findViewById(R.id.btn_number_8);
        btn_number_9 = findViewById(R.id.btn_number_9);
        btn_number_0 = findViewById(R.id.btn_number_0);

        btn_plus = findViewById(R.id.btn_plus);
        btn_sub = findViewById(R.id.btn_sub);
        btn_multi = findViewById(R.id.btn_multi);
        btn_div = findViewById(R.id.btn_div);

        btn_result = findViewById(R.id.btn_result);
        btn_point = findViewById(R.id.btn_point);
        btn_all_clear = findViewById(R.id.btn_all_clear);
        btn_clear = findViewById(R.id.btn_clear);
    }

    private void seetEventClickView() {
        btn_number_1.setOnClickListener(this);
        btn_number_2.setOnClickListener(this);
        btn_number_3.setOnClickListener(this);
        btn_number_4.setOnClickListener(this);
        btn_number_5.setOnClickListener(this);
        btn_number_6.setOnClickListener(this);
        btn_number_7.setOnClickListener(this);
        btn_number_8.setOnClickListener(this);
        btn_number_9.setOnClickListener(this);
        btn_number_0.setOnClickListener(this);

        btn_plus.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_div.setOnClickListener(this);

        btn_result.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_all_clear.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_number_1:
                edt_input_number.append(btn_number_1.getText());
                break;

            case R.id.btn_number_2:
                edt_input_number.append(btn_number_2.getText());
                break;

            case R.id.btn_number_3:
                edt_input_number.append(btn_number_3.getText());
                break;

            case R.id.btn_number_4:
                edt_input_number.append(btn_number_4.getText());
                break;

            case R.id.btn_number_5:
                edt_input_number.append(btn_number_5.getText());
                break;

            case R.id.btn_number_6:
                edt_input_number.append(btn_number_6.getText());
                break;

            case R.id.btn_number_7:
                edt_input_number.append(btn_number_7.getText());
                break;

            case R.id.btn_number_8:
                edt_input_number.append(btn_number_8.getText());
                break;

            case R.id.btn_number_9:
                edt_input_number.append(btn_number_9.getText());
                break;

            case R.id.btn_number_0:
                edt_input_number.append(btn_number_0.getText());
                break;

            case R.id.btn_plus:
                edt_input_number.append(btn_plus.getText());
                break;

            case R.id.btn_sub:
                edt_input_number.append(btn_sub.getText());
                break;

            case R.id.btn_multi:
                edt_input_number.append(btn_multi.getText());
                break;

            case R.id.btn_div:
                edt_input_number.append(btn_div.getText());
                break;

            case R.id.btn_result:

                break;

            case R.id.btn_point:
                edt_input_number.append(btn_point.getText());
                break;

            case R.id.btn_all_clear:
                edt_input_number.setText("");
                break;
            case R.id.btn_clear:
                BaseInputConnection connection = new BaseInputConnection(edt_input_number,true);
                connection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
                break;
        }
    }
}
