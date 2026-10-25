package com.example.android.justjava

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    var quantity = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitOrder(view: View) {
        val price = quantity * 5
        
        // Task 1
        val message1 = "Amount Due $" + price
        
        // Task 2
        val message2 = "That would be $" + price + " please."
        
        // Task 3
        val message3 = "You owe " + price + " bucks, dude!"
        
        // Task 4
        val message4 = price.toString() + " dollars for " + quantity + " cups of coffee. Pay up."
        
        // Task 5
        val message5 = "Total: $" + price

        // Change the displayMessage to test each one!
        displayMessage(message5) 
    }

    fun increment(view: View) {
        quantity = quantity + 1
        display(quantity)
    }

    fun decrement(view: View) {
        quantity = quantity - 1
        display(quantity)
    }

    private fun display(number: Int) {
        val quantityTextView = findViewById<TextView>(R.id.quantity_text_view)
        quantityTextView.text = number.toString()
    }

    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<TextView>(R.id.price_text_view)
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }

    private fun displayMessage(message: String) {
        val priceTextView = findViewById<TextView>(R.id.price_text_view)
        priceTextView.text = message
    }
}