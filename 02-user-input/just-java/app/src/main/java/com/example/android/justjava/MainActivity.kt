package com.example.android.justjava

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        val quantity = 5
        display(quantity)
        displayPrice(quantity * 5)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById<TextView>(R.id.quantity_text_view)
        quantityTextView.text = number.toString()
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<TextView>(R.id.price_text_view)
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }
}