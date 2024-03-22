package com.example.a4_dnp279.controller;

import com.example.a4_dnp279.Model.Marker;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.controller.MainController;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.view.TextViewView;
import android.view.View;
import android.widget.Button;

// This class implements the OnClickListener interface and represents a listener for a grid button in a Tic Tac Toe game.
public class GridButtonListener implements View.OnClickListener {
    // The row and column of the button in the grid
    private int row;
    private int col;
    // The main controller of the game
    static MainController mainController;
    // The button in the grid
    private Button button;

    // Setter for the row
    public void setRow(int row){
        this.row = row;
    }

    // Setter for the column
    public void setCol(int col){
        this.col= col;
    }

    // Setter for the button
    public void setButton(Button button) {
        this.button = button;
    }

    // Constructor for the GridButtonListener
    public GridButtonListener(int row, int col, Button button){
        this.row= row;
        this.col= col;
        this.button = button;
    }

    // Setter for the main controller
    public static void setMainController(MainController mainController){
        GridButtonListener.mainController = mainController;
    }

    // This method is called when the button is clicked
    @Override
    public void onClick(View view) {
        // Get the current marker from the main controller
        Marker marker = mainController.getCurrentMarker();
        // Set the text of the button to the current marker
        if (marker == Marker.X) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        // Make the next move in the game
        mainController.nextMove(row, col);
    }
}
