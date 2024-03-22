package com.example.a4_dnp279.controller;

import com.example.a4_dnp279.Model.Marker;
import com.example.a4_dnp279.Model.TicTacToeBoard;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.view.TextViewView;

public class MainController {
    // Declaring the game board, views, and game state variables
    private TicTacToeBoard board;
    private GridButtonView gridButtonView;
    private TextViewView textViewView;
    private Marker startingMarker;
    private Marker currentMarker;
    private boolean gameOver;
    private int numXWins;
    private int numOWins;
    private int numDraws;

    // Constructor initializes the starting marker and current marker
    public MainController(){
        this.startingMarker = Marker.X;
        this.currentMarker= startingMarker;
    }

    // Setter for the GridButtonView
    public  void setGridButtonView(GridButtonView gridButtonView){
        this.gridButtonView= gridButtonView;
    }

    // Getter for the current marker
    public Marker getCurrentMarker(){
        return currentMarker;
    }

    // Setter for the TextViewView
    public void setTextViewView(TextViewView textViewView){
        this.textViewView= textViewView;
    }

    // Method to handle the next move in the game
    public void nextMove(int row, int col) {
        // Set the marker at the specified position on the board
        board.setMarker(row, col, currentMarker);

        // Check if the current marker has a winning position
        if (board.winningPositions(currentMarker) != null) {
            // If so, the game is over and the current marker wins
            gameOver = true;
            if (currentMarker == Marker.X) {
                numXWins++;
                textViewView.displayXWins("X Wins: " + numXWins);
            } else {
                numOWins++;
                textViewView.displayOWins("O Wins: " + numOWins);
            }
        } else if (board.numUnplayedSquares() == 0) {
            // If there are no unplayed squares, the game is a draw
            gameOver = true;
            numDraws++;
            textViewView.displayDraws("Draws: " + numDraws);
        } else {
            // Otherwise, switch the current marker and continue the game
            currentMarker = (currentMarker == Marker.X) ? Marker.O : Marker.X;
            textViewView.displayStatus("Current Player: " + currentMarker);
        }

        // Check if the game is over
        if (board.winningPositions(currentMarker) == null) {
            gameOver = false;
        } else if (board.numUnplayedSquares() == 0) {
            gameOver = true;
        }
    }

    // Method to start a new game
    public void startNewGame() {
        // Switch the starting marker
        startingMarker = (startingMarker == Marker.X) ? Marker.O : Marker.X;
        currentMarker = startingMarker;

        // Clear the board and update the views
        board.clearBoard();
        textViewView.displayStatus("Current Player: " + currentMarker);
        textViewView.displayXWins("X Wins: " + numXWins);
        textViewView.displayOWins("O Wins: " + numOWins);
        textViewView.displayDraws("Draws: " + numDraws);
    }
}
