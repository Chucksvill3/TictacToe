package com.example.a4_dnp279.controller;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.controller.MainController;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.view.TextViewView;
import android.view.View;

public class GridButtonListener {
    private int row;
    private int col;
    static  MainController mainController;


    public void setRow(int row){
        this.row = row;

    }

    public void setCol(int col){
        this.col= col;
    }


    public GridButtonListener(int row, int col){
        this.row= row;
        this.col= col;
    }

    public static void setMainController(MainController mainController){
        GridButtonListener.mainController = mainController;
    }

    public void onClick(View view){
        mainController.nextMove(row, col);
    }

}
