package com.example.a4_dnp279.view;

import android.widget.TextView;

public class TextViewView {
    private TextView statusTextView;
    private TextView xWinsTextView;
    private TextView oWinsTextView;
    private TextView drawsTextView;

    public TextViewView(TextView statusTextView, TextView xWinsTextView, TextView oWinsTextView, TextView drawsTextView) {
        this.statusTextView = statusTextView;
        this.xWinsTextView = xWinsTextView;
        this.oWinsTextView = oWinsTextView;
        this.drawsTextView = drawsTextView;
    }

    // Setters for instance variables
    public void setStatusTextView(String status) {
        statusTextView.setText(status);
    }

    public void setXWinsTextView(String xWins) {
        xWinsTextView.setText(xWins);
    }

    public void setOWinsTextView(String oWins) {
        oWinsTextView.setText(oWins);
    }

    public void setDrawsTextView(String draws) {
        drawsTextView.setText(draws);
    }

    // Display methods
    public void displayStatus(String status) {
        setStatusTextView(status);
    }

    public void displayXWins(String xWins) {
        setXWinsTextView(xWins);
    }

    public void displayOWins(String oWins) {
        setOWinsTextView(oWins);
    }

    public void displayDraws(String draws) {
        setDrawsTextView(draws);
    }
}
