package com.example.a4_dnp279.controller;
import android.view.View;

public class NextGameButtonListener {
    private static MainController mainController;

    public static void setMainController(MainController mainController){
        NextGameButtonListener.mainController = mainController;
    }

    public void onClick(View view){
        mainController.startNewGame();
    }
}
