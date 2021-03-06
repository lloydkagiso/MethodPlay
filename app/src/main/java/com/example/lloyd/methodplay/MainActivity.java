package com.example.lloyd.methodplay;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * when the order button is clicked then this method is been displayed
     */
    public void submitOrder(View view)
    {
        int quantity = 2;
        display(quantity);
        displayPrice(quantity * 5);

    }


    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    /*
    * the method will be called when the displayprice is been called
     */

    private  void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("" + number);
    }

}
