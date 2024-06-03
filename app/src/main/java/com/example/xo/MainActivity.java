package com.example.xo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, restart;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag=0;
    int count;
    String winner;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                result.setText("");
            }
        });
    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        result = findViewById(R.id.txtResult);
        restart = findViewById(R.id.btnrestart);
    }

    public void reset(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
    }

    public void check(View v){
        Button c = (Button) v;

        if(c.getText().toString()=="") {

            if (flag == 0) {
                c.setText("X");
                flag = 1;
                if(count==0){
                    result.setText("");
                }
                count++;
            } else {
                c.setText("O");
                flag = 0;
                if(count==0){
                    result.setText("");
                }
                count++;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    winner = b1;
                    if (b1 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b1 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    //2
                    winner = b4;
                    if (b4 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b4 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    //3
                    winner = b7;
                    if (b7 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b7 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    //4
                    winner = b1;
                    if (b1 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b1 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    //5
                    winner = b2;
                    if (b2 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b2 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    //6
                    winner = b3;
                    if (b3 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b3 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //7
                    winner = b1;
                    if (b1 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b1 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //8
                    winner = b3;
                    if (b3 == "X") {
                        result.setText("Player 1 is winner");
                    } else if (b3 == "O") {
                        result.setText("Player 2 is winner");
                    }
                    reset();
                }
            }
        }
    }
}