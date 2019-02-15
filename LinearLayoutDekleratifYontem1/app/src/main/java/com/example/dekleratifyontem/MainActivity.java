package com.example.dekleratifyontem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    /*  View nesneler için global tanımlanmalıdır ki aynı nesne farklı fonk. tarafından kolayca kullanılabilsin.    */
    private LinearLayout pnlMain;
    private Button btnTest;
    private CheckBox chkTest;

    /*  Nesneleri oluşturan fonkiyon    */
    private void init(){
        pnlMain = (LinearLayout)findViewById(R.id.pnlMain);
        btnTest = (Button)findViewById(R.id.btnTest);
        chkTest = (CheckBox)findViewById(R.id.chkTest);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init(); /*  nesneleri çağırmak    */
    }
}