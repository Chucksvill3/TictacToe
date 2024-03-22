package com.example.a4_dnp279.view;

import android.widget.TextView;

// TextViewView class represents the view for displaying text in the Tic Tac Toe game
public class TextViewView {
    private TextView statusTextView; // TextView to display game status
    private TextView xWinsTextView; // TextView to display number of X wins
    private TextView oWinsTextView; // TextView to display number of O wins
    private TextView drawsTextView; // TextView to display number of draws

    // Constructor to initialize TextViews
    public TextViewView(TextView statusTextView, TextView xWinsTextView, TextView oWinsTextView, TextView drawsTextView) {
        this.statusTextView = statusTextView;
        this.xWinsTextView = xWinsTextView;
        this.oWinsTextView = oWinsTextView;
        this.drawsTextView = drawsTextView;
    }

    // Setter method for statusTextView
    public void setStatusTextView(String status) {
        statusTextView.setText(status);
    }

    // Setter method for xWinsTextView
    public void setXWinsTextView(String xWins) {
        xWinsTextView.setText(xWins);
    }

    // Setter method for oWinsTextView
    public void setOWinsTextView(String oWins) {
        oWinsTextView.setText(oWins);
    }

    // Setter method for drawsTextView
    public void setDrawsTextView(String draws) {
        drawsTextView.setText(draws);
    }

    // Display method for game status
    public void displayStatus(String status) {
        setStatusTextView(status);
    }

    // Display method for number of X wins
    public void displayXWins(String xWins) {
        setXWinsTextView(xWins);
    }

    // Display method for number of O wins
    public void displayOWins(String oWins) {
        setOWinsTextView(oWins);
    }

    // Display method for number of draws
    public void displayDraws(String draws) {
        setDrawsTextView(draws);
    }
}
