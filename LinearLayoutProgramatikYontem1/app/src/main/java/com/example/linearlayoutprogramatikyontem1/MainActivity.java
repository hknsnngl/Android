package com.example.linearlayoutprogramatikyontem1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText et;
    private LinearLayout pnl;
    public void init(){
        pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        btn = new Button(this);
        btn.setBackgroundColor(Color.GREEN);
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(110,55);
        lp1.weight = 0.5f;
        lp1.gravity = Gravity.RIGHT;
        lp1.setMargins(1,0,0,0);
        pnl.addView(btn,lp1);

        et = new EditText(this);
        et.setBackgroundColor(Color.YELLOW);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(230,55);
        lp2.weight = 0.4f;
        lp2.gravity = Gravity.LEFT;
        lp2.setMargins(1,0,0,0);
        pnl.addView(et,lp2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);
    }
}
