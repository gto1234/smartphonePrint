package com.example.vkazancev.smartphoneprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.webkit.WebView;

public class DisplayReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_receipt);

        Intent intent = getIntent();
        String strTxnName = intent.getStringExtra( "TransactionName" );
        String strTxnAmount = intent.getStringExtra( "TransactionAmount" );

        WebView WView = findViewById(R.id.WebOutput);
        WView.loadDataWithBaseURL("", "safasf" + strTxnName + " " + strTxnAmount, "text/html", "UTF-8", "");
    }

    @Override
    protected void onStart() {
        super.onStart();



    }
}
