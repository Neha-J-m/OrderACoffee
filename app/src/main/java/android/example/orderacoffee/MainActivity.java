package android.example.orderacoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<total, item1> extends AppCompatActivity {
int item1 = 0;
int item2 = 0;
int item3 = 0;
int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment1(View view) {
       item1 = item1 + 1;
       displayquant1(item1);
    }
    public void decrement1(View view) {
        if (item1==0)
            displayquant1(item1);
        else
            {
            item1 = item1 - 1;
            displayquant1(item1);
        }
    }
    public void increment2(View view) {
        item2 = item2 + 1;
        displayquant2(item2);
    }
    public void decrement2(View view) {
       if(item2==0)
           displayquant2(item2);
       else {
           item2 = item2 - 1;
           displayquant2(item2);
       }
    }
    public void increment3(View view) {
        item3 = item3 + 1;
        displayquant3(item3);
    }
    public void decrement3(View view) {
        if(item3==0)
            displayquant3(item3);
        else {
            item3 = item3 - 1;
            displayquant3(item3);
        }
    }
    public void displaytext(View view) {
        String message;
        if(item1==0&&item2==0&&item3==0)
            message = "You haven't ordered anything.";
         else {
             total = ( item1 * 150)+(item2 * 120)+(item3 * 100);
            message = "Your Total is:Rs. " + (total);
            message = message + "\nThank You!";
        }
        displayMessage(message);
    }
    private void displayquant1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quant1);
        quantityTextView.setText("" + number);
    }
    private void displayquant2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quant2);
        quantityTextView.setText("" + number);
    }
    private void displayquant3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quant3);
        quantityTextView.setText("" + number);
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}