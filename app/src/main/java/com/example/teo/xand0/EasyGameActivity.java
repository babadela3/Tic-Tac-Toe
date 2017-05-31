package com.example.teo.xand0;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EasyGameActivity extends AppCompatActivity {

    private int[][] gameMatrix;
    private int matrixSpaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);

        final Button restartButton = (Button) findViewById(R.id.buttonRestart);
        final Button backButton = (Button) findViewById(R.id.buttonBack);
        final TextView textResult = (TextView) findViewById(R.id.result);
        textResult.setVisibility(View.INVISIBLE);

        initialise();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[0][0] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[0][0] = 1;
                        button1.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button1.setEnabled(true);
                    }
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[0][1] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[0][1] = 1;
                        button2.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button2.setEnabled(true);
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[0][2] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[0][2] = 1;
                        button3.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button3.setEnabled(true);
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[1][0] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[1][0] = 1;
                        button4.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button4.setEnabled(true);
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[1][1] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[1][1] = 1;
                        button5.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button5.setEnabled(true);
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[1][2] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[1][2] = 1;
                        button6.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button6.setEnabled(true);
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[2][0] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[2][0] = 1;
                        button7.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button7.setEnabled(true);
                    }
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[2][1] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[2][1] = 1;
                        button8.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button8.setEnabled(true);
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gameMatrix[2][2] == 0 && matrixSpaces != 9){
                    matrixSpaces++;
                    if(matrixSpaces % 2 == 1){
                        gameMatrix[2][2] = 1;
                        button9.setBackgroundResource(R.drawable.bluex);
                        computerAction();
                        button9.setEnabled(true);
                    }
                }
            }
        });
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);

                button1.setBackgroundColor(Color.parseColor("#ffffff"));
                button2.setBackgroundColor(Color.parseColor("#ffffff"));
                button3.setBackgroundColor(Color.parseColor("#ffffff"));
                button4.setBackgroundColor(Color.parseColor("#ffffff"));
                button5.setBackgroundColor(Color.parseColor("#ffffff"));
                button6.setBackgroundColor(Color.parseColor("#ffffff"));
                button7.setBackgroundColor(Color.parseColor("#ffffff"));
                button8.setBackgroundColor(Color.parseColor("#ffffff"));
                button9.setBackgroundColor(Color.parseColor("#ffffff"));

                matrixSpaces = 0;
                for(int i = 0 ; i < 3 ; i++)
                    for(int j = 0 ; j < 3 ; j++){
                        gameMatrix[i][j] = 0;
                    }
                textResult.setVisibility(View.INVISIBLE);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initialise(){
        gameMatrix = new int[4][4];
    }

    private boolean computerAction(){
        if(checkOpponentWon() == true){
            TextView textResult = (TextView) findViewById(R.id.result);
            textResult.setText("AI CÂȘTIGAT!");
            textResult.setVisibility(View.VISIBLE);
            matrixSpaces = 9;

            final Button button1 = (Button) findViewById(R.id.button1);
            final Button button2 = (Button) findViewById(R.id.button2);
            final Button button3 = (Button) findViewById(R.id.button3);
            final Button button4 = (Button) findViewById(R.id.button4);
            final Button button5 = (Button) findViewById(R.id.button5);
            final Button button6 = (Button) findViewById(R.id.button6);
            final Button button7 = (Button) findViewById(R.id.button7);
            final Button button8 = (Button) findViewById(R.id.button8);
            final Button button9 = (Button) findViewById(R.id.button9);

            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);


        }
        if(matrixSpaces != 9) {
            Random rand = new Random();
            int randomChoise = rand.nextInt(9 - matrixSpaces);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    if (gameMatrix[i][j] == 0 && randomChoise == 0) {
                        gameMatrix[i][j] = 2;
                        matrixSpaces++;
                        colorMatrix(i, j);
                        randomChoise--;
                    }
                    if (gameMatrix[i][j] == 0 && randomChoise > 0)
                        randomChoise--;
                }
        }
        if(checkComputerWon() == true){
            TextView textResult = (TextView) findViewById(R.id.result);
            textResult.setText("AI PIERDUT!");
            textResult.setVisibility(View.VISIBLE);
            matrixSpaces = 9;

            final Button button1 = (Button) findViewById(R.id.button1);
            final Button button2 = (Button) findViewById(R.id.button2);
            final Button button3 = (Button) findViewById(R.id.button3);
            final Button button4 = (Button) findViewById(R.id.button4);
            final Button button5 = (Button) findViewById(R.id.button5);
            final Button button6 = (Button) findViewById(R.id.button6);
            final Button button7 = (Button) findViewById(R.id.button7);
            final Button button8 = (Button) findViewById(R.id.button8);
            final Button button9 = (Button) findViewById(R.id.button9);

            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
        }
        if(matrixSpaces == 9 && checkOpponentWon() == false && checkComputerWon() == false){
            TextView textResult = (TextView) findViewById(R.id.result);
            textResult.setText("EGALITATE!");
            textResult.setVisibility(View.VISIBLE);
        }

        return true;
    }

    private boolean checkOpponentWon(){
        if(gameMatrix[0][0] == 1 && gameMatrix[0][1] == 1 && gameMatrix[0][2] == 1)
            return true;
        if(gameMatrix[1][0] == 1 && gameMatrix[1][1] == 1 && gameMatrix[1][2] == 1)
            return true;
        if(gameMatrix[2][0] == 1 && gameMatrix[2][1] == 1 && gameMatrix[2][2] == 1)
            return true;
        if(gameMatrix[0][0] == 1 && gameMatrix[1][0] == 1 && gameMatrix[2][0] == 1)
            return true;
        if(gameMatrix[0][1] == 1 && gameMatrix[1][1] == 1 && gameMatrix[2][1] == 1)
            return true;
        if(gameMatrix[0][2] == 1 && gameMatrix[1][2] == 1 && gameMatrix[2][2] == 1)
            return true;
        if(gameMatrix[0][0] == 1 && gameMatrix[1][1] == 1 && gameMatrix[2][2] == 1)
            return true;
        if(gameMatrix[0][2] == 1 && gameMatrix[1][1] == 1 && gameMatrix[2][0] == 1)
            return true;
        return false;
    }

    private boolean checkComputerWon(){
        if(gameMatrix[0][0] == 2 && gameMatrix[0][1] == 2 && gameMatrix[0][2] == 2)
            return true;
        if(gameMatrix[1][0] == 2 && gameMatrix[1][1] == 2 && gameMatrix[1][2] == 2)
            return true;
        if(gameMatrix[2][0] == 2 && gameMatrix[2][1] == 2 && gameMatrix[2][2] == 2)
            return true;
        if(gameMatrix[0][0] == 2 && gameMatrix[1][0] == 2 && gameMatrix[2][0] == 2)
            return true;
        if(gameMatrix[0][1] == 2 && gameMatrix[1][1] == 2 && gameMatrix[2][1] == 2)
            return true;
        if(gameMatrix[0][2] == 2 && gameMatrix[1][2] == 2 && gameMatrix[2][2] == 2)
            return true;
        if(gameMatrix[0][0] == 2 && gameMatrix[1][1] == 2 && gameMatrix[2][2] == 2)
            return true;
        if(gameMatrix[0][2] == 2 && gameMatrix[1][1] == 2 && gameMatrix[2][0] == 2)
            return true;
        return false;
    }

    private boolean colorMatrix(int coordX, int coordY){
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);

        if(coordX == 0 && coordY == 0){
            button1.setBackgroundResource(R.drawable.circlered);
            button1.setEnabled(true);
            return true;
        }
        if(coordX == 0 && coordY == 1){
            button2.setBackgroundResource(R.drawable.circlered);
            button2.setEnabled(true);
            return true;
        }
        if(coordX == 0 && coordY == 2){
            button3.setBackgroundResource(R.drawable.circlered);
            button3.setEnabled(true);
            return true;
        }
        if(coordX == 1 && coordY == 0){
            button4.setBackgroundResource(R.drawable.circlered);
            button4.setEnabled(true);
            return true;
        }
        if(coordX == 1 && coordY == 1){
            button5.setBackgroundResource(R.drawable.circlered);
            button5.setEnabled(true);
            return true;
        }
        if(coordX == 1 && coordY == 2){
            button6.setBackgroundResource(R.drawable.circlered);
            button6.setEnabled(true);
            return true;
        }
        if(coordX == 2 && coordY == 0){
            button7.setBackgroundResource(R.drawable.circlered);
            button7.setEnabled(true);
            return true;
        }
        if(coordX == 2 && coordY == 1){
            button8.setBackgroundResource(R.drawable.circlered);
            button8.setEnabled(true);
            return true;
        }
        if(coordX == 2 && coordY == 2){
            button9.setBackgroundResource(R.drawable.circlered);
            button9.setEnabled(true);
            return true;
        }
        return true;
    }
}
