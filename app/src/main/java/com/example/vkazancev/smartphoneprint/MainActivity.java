package com.example.vkazancev.smartphoneprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;


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

    }

    public void onGenerateButtonClick(View view) {
        Intent intent = new Intent(this, DisplayReceipt.class);
        // Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.AmountValue);
        // Получае текст данного текстового поля
        String strParam = editText.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra("TransactionAmount", strParam);

        Spinner spinner = (Spinner) findViewById(R.id.TransactionNameValue);
        strParam = spinner.getSelectedItem().toString();

        intent.putExtra("TransactionName", strParam);

        // запуск activity
        startActivity(intent);
    }

}
