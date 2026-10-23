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

    fun submitOrder(view: View) {
        val quantity = 2
        display(quantity)
        displayPrice(quantity * 5)
    }

    // ADDED: Increment Method
    fun increment(view: View) {
        val quantity = 3
        display(quantity)
    }

    // ADDED: Decrement Method
    fun decrement(view: View) {
        val quantity = 1
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
}