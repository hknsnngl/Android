package com.example.absolutelayoutprogramatikyontem1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.CheckBox;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    private AbsoluteLayout pnl;
    private AbsoluteLayout.LayoutParams prms;
    private Button btn;
    private CheckBox chk;

    public void init(){
        pnl = new AbsoluteLayout(this);
        btn = new Button(this );
        chk = new CheckBox(this);

        btn.setText("Düğme");
        prms = new AbsoluteLayout.LayoutParams(200,50,30,40);
        pnl.addView(btn,prms);

        chk.setText("Seçenek");
        chk.setLayoutParams(new AbsoluteLayout.LayoutParams(200,55,100,200));
        pnl.addView(chk);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);
    }
}
