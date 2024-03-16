package com.example.a4_dnp279.view;
import android.graphics.Color;
import android.widget.Button;

public class GridButtonView {
    private Button[][] buttons = new Button[3][3];




    public void addButton(int row, int col, Button button) {
        if (isValidPosition(row, col)) {
            buttons[row][col] = button;
        }
    }

    // Method to set the text on a button at a specified row and column
    public void setText(int row, int col, String text) {
        if (isValidPosition(row, col)) {
            buttons[row][col].setText(text);
        }
    }

    // Method to set the background color of a button at a specified row and column
    public void setColor(int row, int col, int red, int green, int blue) {
        if (isValidPosition(row, col)) {
            int Value = Color.rgb(red, green, blue);
            buttons[row][col].setBackgroundColor(Value);
        }
    }


    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3;
    }
}
