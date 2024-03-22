package com.example.a4_dnp279;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a4_dnp279.controller.GridButtonListener;
import com.example.a4_dnp279.controller.MainController;
import com.example.a4_dnp279.controller.NextGameButtonListener;
import com.example.a4_dnp279.view.GridButtonView;
import com.example.a4_dnp279.view.TextViewView;

public class MainActivity extends AppCompatActivity {
    private MainController mainController;
    private GridButtonView gridButtonView;
    private TextView statusTextView;
    private TextView xWinsTextView;
    private TextView oWinsTextView;
    private TextView drawsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        gridButtonView = new GridButtonView();
        statusTextView = findViewById(R.id.statusText);
        xWinsTextView = findViewById(R.id.xWinsText);
        oWinsTextView = findViewById(R.id.oWinsText);
        drawsTextView = findViewById(R.id.drawsText);

        // Initialize the main controller
        mainController = new MainController();

        // Set up the game board layout and status views
        setupButtons();

        // Assign listeners to buttons
        assignButtonListeners();
    }

    private void setupButtons() {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        gridButtonView.addButton(0, 0, button1);
        gridButtonView.addButton(0, 1, button2);
        gridButtonView.addButton(0, 2, button3);
        gridButtonView.addButton(1, 0, button4);
        gridButtonView.addButton(1, 1, button5);
        gridButtonView.addButton(1, 2, button6);
        gridButtonView.addButton(2, 0, button7);
        gridButtonView.addButton(2, 1, button8);
        gridButtonView.addButton(2, 2, button9);
    }

    private void assignButtonListeners() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int buttonId = getResources().getIdentifier("button" + (i * 3 + j + 1), "id", getPackageName());
                Button button = findViewById(buttonId);
                button.setOnClickListener(new GridButtonListener(i, j, button));
            }
        }

        Button nextGameButton = findViewById(R.id.nextGameButton);
        nextGameButton.setOnClickListener(new NextGameButtonListener());
    }

    // Method to update status TextView
    public void updateStatusTextView(String status) {
        statusTextView.setText(status);
    }

    // Method to update X wins TextView
    public void updateXWinsTextView(String wins) {
        xWinsTextView.setText(wins);
    }

    // Method to update O wins TextView
    public void updateOWinsTextView(String wins) {
        oWinsTextView.setText(wins);
    }

    // Method to update draws TextView
    public void updateDrawsTextView(String draws) {
        drawsTextView.setText(draws);
    }
}
