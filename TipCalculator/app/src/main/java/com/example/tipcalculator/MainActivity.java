package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount, size;
    TextView fifteenTip, fifteenTotal, twentyTip, twentyTotal, twentyFiveTip, twentyFiveTotal;
    Button button1;
    double amount1, size1, finalAmount1, finalTip15, finalTip20, finalAmount2, finalTip25, finalAmount3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.checkAmountValue);
        size = (EditText) findViewById(R.id.partySizeValue);
        button1 = (Button) findViewById(R.id.computeButton);
        fifteenTip = (TextView) findViewById(R.id.fifteenPercentTipValue);
        fifteenTotal = (TextView) findViewById(R.id.fifteenPercentTotalValue);
        twentyTip = (TextView) findViewById(R.id.twentyPercentTipValue);
        twentyTotal = (TextView) findViewById(R.id.twentyPercentTotalValue);
        twentyFiveTip = (TextView) findViewById(R.id.twentyFivePercentTipValue);
        twentyFiveTotal = (TextView) findViewById(R.id.twentyFivePercentTotalValue);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (amount.getText().toString().equals("") || size.getText().toString().equals("")) {
                        Context context = getApplicationContext();
                        CharSequence text = "Empty or incorrect value(s)!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    } else {
                        amount1 = Double.parseDouble(amount.getText().toString());
                        size1 = Double.parseDouble(size.getText().toString());

                        finalTip15 = (amount1 * 0.15) / size1;
                        finalAmount1 = (amount1 + (amount1 * 0.15)) / size1;

                        finalTip20 = (amount1 * 0.20) / size1;
                        finalAmount2 = (amount1 + (amount1 * 0.20)) / size1;

                        finalTip25 = (amount1 * 0.25) / size1;
                        finalAmount3 = (amount1 + (amount1 * 0.25)) / size1;


                        fifteenTip.setText(Double.toString(Math.round(finalTip15)));
                        fifteenTotal.setText(Double.toString(Math.round(finalAmount1)));
                        twentyTip.setText(Double.toString(Math.round(finalTip20)));
                        twentyTotal.setText(Double.toString(Math.round(finalAmount2)));
                        twentyFiveTip.setText(Double.toString(Math.round(finalTip25)));
                        twentyFiveTotal.setText(Double.toString(Math.round(finalAmount3)));
                    }
                }

            });



            }

}