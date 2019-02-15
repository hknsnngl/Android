package com.example.programatikyontem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    /*global tanım*/
    private LinearLayout pnlTest;
    private ScrollView svTest;
    private CheckBox chkTest;
    private Button btnTest;

    /*Nesneleri oluşturan fonkiyon*/
    private void init(){

        svTest = new ScrollView(this); // LinearLayout yatay olsaydı,new HorizontalScrollView(this); kullanılacaktı.

        pnlTest = new LinearLayout(this);
        pnlTest.setOrientation(LinearLayout.VERTICAL); //HORIZONTAL: yatay

        for (int i=1; i<=20; ++i){
            if (i%2 == 0){
                chkTest = new CheckBox(this);
                chkTest.setId(i);
                chkTest.setText("Seçenek"+ i);

                //Layout Parametreleri
                LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(400,80);
                lp1.setMargins(10,5,10,5);
                lp1.gravity= Gravity.LEFT;
                chkTest.setLayoutParams(lp1);
                pnlTest.addView(chkTest,lp1);
            }
            else{
                btnTest = new Button(this);
                btnTest.setId(i);
                btnTest.setText("Düğme" + i);
                //Layout parametreleri
                LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(250,90);
                lp2.setMargins(10,5,10,5);
                lp2.gravity=Gravity.RIGHT;
                btnTest.setLayoutParams(lp2);
                pnlTest.addView(btnTest,lp2);
            }
        }
        svTest.addView(pnlTest); //LinearLayout ScrollView'e child olarak eklenmiştir.
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(); /*nesneleri çağırmak*/
        setContentView(svTest);//ScrollView olmasaydı. pnlTest olacaktı.

    }
}
