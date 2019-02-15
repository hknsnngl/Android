package com.example.relativelayoutprogramatikyontem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout pnl;
    private RelativeLayout.LayoutParams prms1,prms2;
    private Button btn1,btn2;

    public void init(){
        pnl = new RelativeLayout(this);

        btn1 = new Button(this);
        btn1.setText("Deneme");
        btn1.setId(R.id.your_button_id);
        prms1=new RelativeLayout.LayoutParams(200,80);
        prms1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        prms1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        btn1.setLayoutParams(prms1);

        btn2 = new Button(this);
        btn2.setText("Test");
        btn2.setId(R.id.your_button_id1);
        prms2=new RelativeLayout.LayoutParams(170,90);
        prms1.addRule(RelativeLayout.LEFT_OF);
        prms1.addRule(RelativeLayout.ABOVE,btn1.getId());
        btn2.setLayoutParams(prms2);

        pnl.addView(btn1);
        pnl.addView(btn2);




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);
    }
}
