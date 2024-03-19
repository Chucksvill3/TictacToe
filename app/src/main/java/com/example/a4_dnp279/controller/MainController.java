package com.example.a4_dnp279.controller;

import com.example.a4_dnp279.Model.Marker;
import com.example.a4_dnp279.Model.TicTacToeBoard;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.view.TextViewView;

public class MainController {
    private TicTacToeBoard board;
    private GridButtonView gridButtonView;
    private TextViewView textViewView;
    private Marker startingMarker;
    private Marker currentMarker;
    private boolean gameOver;
    private int numXWins;
    private int numOWins;
    private int numDraws;

    public MainController(){
        this.startingMarker = Marker.X;
        this.currentMarker= startingMarker;
    }

    public  void setGridButtonView(GridButtonView gridButtonView){
        this.gridButtonView= gridButtonView;
    }

    public void setTextViewView(TextViewView textViewView){
        this.textViewView= textViewView;
    }

    public void nextMove(int row, int col ){
        board.setMarker(row,col,currentMarker);
        if (board.winningPositions(currentMarker) != null) {
            // If the current player has a winning position, the game is over
            gameOver = true;
            // Update the win count for the current player
            if (currentMarker == Marker.X) {
                numXWins++;
            } else {
                numOWins++;
            }
        } else
            if (board.numUnplayedSquares() == 0) {
            // If the board is full and there's no winner, it's a draw
            gameOver = true;
            numDraws++;
        } else {
            // If the game is not over, switch to the other player
            currentMarker = (currentMarker == Marker.X) ? Marker.O : Marker.X;
        }


        if(( ((board.winningPositions(currentMarker)) == null))){
           gameOver = false;
        }
        else
            if (board.numUnplayedSquares() == 0) {
            gameOver = true;
        }
    }

    public void startNewGame() {
        // Switch the starting marker
        startingMarker = (startingMarker == Marker.X) ? Marker.O : Marker.X;

        // The current marker is the starting marker at the start of the game
        currentMarker = startingMarker;
        board.clearBoard();


    }



}
