package com.example.a4_dnp279.Model;
import com.example.a4_dnp279.Model.Marker;


public class TicTacToeBoard {
    private Marker[][] board = new Marker[3][3];

    public TicTacToeBoard() {
        // Initialize the game board (3x3 array) with empty strings
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    }

    public void setMarker(int row, int col, Marker marker) {
        board[row][col] = marker;

    }

    public Marker getMarker(int row, int col) {
        Marker marker = board[row][col];
        return marker;


    }

    public int[] winningPositions(Marker player) {
        // Check for horizontal wins
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player &&
                    board[row][1] == player &&
                    board[row][2] == player) {
                return new int[]{row, 0, row, 1, row, 2}; // 3 positions
            }
        }

        // Check for vertical wins
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player &&
                    board[1][col] == player &&
                    board[2][col] == player) {
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

        return null;
    }

    public int numUnplayedSquares() {

        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == null) {
                    count++;

                }

            }
        }

        return count;
    }

    public void clearBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = null;

            }

        }
    }

}