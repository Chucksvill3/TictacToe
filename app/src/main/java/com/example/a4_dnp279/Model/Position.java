package com.example.a4_dnp279.Model;

// This class represents a position on a Tic Tac Toe board.
public class Position {
    // The row of the position
    int row;
    // The column of the position
    int col;

    // Getter for the row
    public int getRow() {
        return row;
    }

    // Getter for the column
    public int getCol() {
        return col;
    }

    // Constructor for the Position
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
