package com.example.a4_dnp279.view;
import android.graphics.Color;
import android.widget.Button;

// GridButtonView class represents the view for the Tic Tac Toe grid buttons
public class GridButtonView {
    private Button[][] buttons = new Button[3][3]; // 2D array to hold buttons representing the grid

    // Method to add a button to the grid at a specified row and column
    public void addButton(int row, int col, Button button) {
        // Check if the position is valid before adding the button
        if (isValidPosition(row, col)) {
            buttons[row][col] = button;
        }
    }

    // Method to set the text on a button at a specified row and column
    public void setText(int row, int col, String text) {
        // Check if the position is valid before setting the text
        if (isValidPosition(row, col)) {
            buttons[row][col].setText(text);
        }
    }

    // Method to set the background color of a button at a specified row and column
    public void setColor(int row, int col, int red, int green, int blue) {
        // Check if the position is valid before setting the color
        if (isValidPosition(row, col)) {
            int colorValue = Color.rgb(red, green, blue); // Create color value from RGB components
            buttons[row][col].setBackgroundColor(colorValue); // Set the background color
        }
    }

    // Private helper method to check if a position is valid within the grid
    private boolean isValidPosition(int row, int col) {
        // Check if row and column indices are within the grid bounds (0 to 2)
        return row >= 0 && row < 3 && col >= 0 && col < 3;
    }
}
