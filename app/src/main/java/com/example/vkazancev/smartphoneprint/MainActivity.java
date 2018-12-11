package com.example.vkazancev.smartphoneprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;


import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private String[] aTransactionNames = {
        "Sale",
        "Refund",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Filling spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aTransactionNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.TransactionNameValue);
        spinner.setAdapter(adapter);


//        //Setting button click handler
//        Button btnReceiptGenerate = (Button)findViewById(R.id.BGenerate);
//        OnClickListener OnReceiptGenerateClick = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        };


    }

    public void onGenerateButtonClick() {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // Получае текст данного текстового поля
        String message = editText.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        // запуск activity
        startActivity(intent);
    }

}
