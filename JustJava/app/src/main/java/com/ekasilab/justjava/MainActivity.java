package com.ekasilab.justjava;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.text.NumberFormat;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(1);
        displayPrice(2*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_txv);
        quantityTextView.setText("" + number);
    }

    /**
     *
     *
     */
    public void increment(View view)
    {
        int quantity = 3;
        display(quantity);

    }
    public void decrement (View view)
    {
        int quantity = 1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayPrice(int number) {
        TextView priceTxv = (TextView) findViewById(R.id.price_txv);
        priceTxv.setText(String.format(""+number));

    }
}

