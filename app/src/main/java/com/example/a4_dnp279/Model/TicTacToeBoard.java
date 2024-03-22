package com.example.a4_dnp279.Model;
import com.example.a4_dnp279.Model.Marker;

// TicTacToeBoard class represents the game board for Tic Tac Toe
public class TicTacToeBoard {
    private Marker[][] board = new Marker[3][3]; // 2D array to represent the game board

    // Constructor to initialize the game board with empty markers
    public TicTacToeBoard() {
        // Initialize the game board (3x3 array) with empty markers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    }

    // Method to set a marker at a specific position on the board
    public void setMarker(int row, int col, Marker marker) {
        board[row][col] = marker;
    }

    // Method to get the marker at a specific position on the board
    public Marker getMarker(int row, int col) {
        return board[row][col];
    }

    // Method to find the positions that constitute a winning combination for a player
    public int[] winningPositions(Marker player) {
        // Check for horizontal wins
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return new int[]{row, 0, row, 1, row, 2}; // 3 positions
            }
        }

        // Check for vertical wins
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return new int[]{0, col, 1, col, 2, col}; // 3 positions
            }
        }

        // Check for diagonal wins (from top-left to bottom-right)
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return new int[]{0, 0, 1, 1, 2, 2}; // 3 positions
        }

        // Check for diagonal wins (from top-right to bottom-left)
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return new int[]{0, 2, 1, 1, 2, 0}; // 3 positions
        }

        return null; // Return null if no winning combination is found
    }

    // Method to count the number of unplayed squares on the board
    public int numUnplayedSquares() {
        int count = 0;
        // Iterate through the board and count the number of squares that are null (unplayed)
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == null) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to clear the board, setting all markers to null (reset the game)
    public void clearBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = null;
            }
        }
    }
}
