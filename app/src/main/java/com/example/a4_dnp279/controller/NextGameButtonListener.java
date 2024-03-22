package com.example.a4_dnp279.controller;

import android.view.View;

// This class implements the OnClickListener interface and represents a listener for the "Next Game" button in a Tic Tac Toe game.
public class NextGameButtonListener implements View.OnClickListener {
    // The main controller of the game
    private static MainController mainController;

    // Setter for the main controller
    public static void setMainController(MainController mainController) {
        NextGameButtonListener.mainController = mainController;
    }

    // This method is called when the "Next Game" button is clicked
    @Override
    public void onClick(View view) {
        // Start a new game
        mainController.startNewGame();
    }
}
