package com.example.tablelayoutprogramatikyontem;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    private TableLayout pnl;
    private TableRow row;
    private Button btn;
    private TableRow.LayoutParams lp;

    private void init(){
        pnl = new TableLayout(this);
        for(int r=1; r<=5; ++r){
            row = new TableRow(this);
            for(int c=1; c<=5; ++c){
                btn = new Button(this);
                btn.setText(String.format("R:%d C: %d",r,c));
                btn.setWidth(150);
                btn.setHeight(60);
                row.addView(btn);
            }
            pnl.addView(row);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);

        /*Child Eleman Yakalama*/
        TableRow tr = (TableRow)pnl.getChildAt(0);
        ((Button)tr.getChildAt(2)).setBackgroundColor(Color.YELLOW);
    }
}
