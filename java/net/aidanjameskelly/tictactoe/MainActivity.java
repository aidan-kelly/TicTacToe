package net.aidanjameskelly.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean redTurn = true;

    //0=empty 1=red 2=yellow
    int[] gameState = {0,0,0,0,0,0,0,0,0};

    boolean gameOver = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkWinner(){
        if((gameState[0] == 1 && gameState[1] == 1 && gameState[2]==1) || gameState[0] == 2 && gameState[1] == 2 && gameState[2]==2){
            if(gameState[0] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[3] == 1 && gameState[4] == 1 && gameState[5]==1) || gameState[3] == 2 && gameState[4] == 2 && gameState[5]==2){
            if(gameState[3] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[6] == 1 && gameState[7] == 1 && gameState[8]==1) || gameState[6] == 2 && gameState[7] == 2 && gameState[8]==2){
            if(gameState[6] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[0] == 1 && gameState[3] == 1 && gameState[6]==1) || gameState[0] == 2 && gameState[3] == 2 && gameState[6]==2){
            if(gameState[0] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[1] == 1 && gameState[4] == 1 && gameState[7]==1) || gameState[1] == 2 && gameState[4] == 2 && gameState[7]==2){
            if(gameState[1] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[2] == 1 && gameState[5] == 1 && gameState[8]==1) || gameState[2] == 2 && gameState[5] == 2 && gameState[8]==2){
            if(gameState[2] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[0] == 1 && gameState[4] == 1 && gameState[8]==1) || gameState[0] == 2 && gameState[4] == 2 && gameState[8]==2){
            if(gameState[0] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;
        }else if((gameState[2] == 1 && gameState[4] == 1 && gameState[6]==1) || gameState[2] == 2 && gameState[4] == 2 && gameState[6]==2){
            if(gameState[2] ==1){
                Toast.makeText(this, "Red Wins!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Yellow Wins!!!", Toast.LENGTH_SHORT).show();
            }
            gameOver=true;

        }

        boolean aZero = false;
        for(int x = 0; x<gameState.length; x++){
            if(gameState[x] == 0){
                aZero = true;
            }
        }

        if(aZero == false){
            Toast.makeText(this, "It's a tie!!!", Toast.LENGTH_SHORT).show();
            gameOver = true;
        }




        if(gameOver){
            Button button = findViewById(R.id.button);
            button.setAlpha(1);
        }
    }

    public void cellClickUni(ImageView red, ImageView yellow, int cellNum){
        if(redTurn && gameState[cellNum]==0){

            redTurn = false;

            red.animate().alpha(1);

            gameState[cellNum] = 1;
        }else if(!redTurn && gameState[cellNum] ==0){

            redTurn = true;

            yellow.animate().alpha(1);

            gameState[cellNum] = 2;
        }else{
            Toast.makeText(this, "Invalid move!", Toast.LENGTH_SHORT).show();
        }

        //call the check to see if someone won
        checkWinner();

    }

    public void cell0Click(View v){

        ImageView red0 = findViewById(R.id.red0);
        ImageView yellow0 = findViewById(R.id.yellow0);

        cellClickUni(red0, yellow0, 0);
    }


    public void cell1Click(View v){

        ImageView red1 = findViewById(R.id.red1);
        ImageView yellow1 = findViewById(R.id.yellow1);

        cellClickUni(red1, yellow1, 1);
    }

    public void cell2Click(View v){

        ImageView red2 = findViewById(R.id.red2);
        ImageView yellow2 = findViewById(R.id.yellow2);

        cellClickUni(red2, yellow2, 2);
    }

    public void cell3Click(View v){

        ImageView red3 = findViewById(R.id.red3);
        ImageView yellow3 = findViewById(R.id.yellow3);

        cellClickUni(red3, yellow3, 3);
    }

    public void cell4Click(View v){

        ImageView red4 = findViewById(R.id.red4);
        ImageView yellow4 = findViewById(R.id.yellow4);

        cellClickUni(red4, yellow4, 4);
    }

    public void cell5Click(View v){

        ImageView red5 = findViewById(R.id.red5);
        ImageView yellow5 = findViewById(R.id.yellow5);

        cellClickUni(red5, yellow5, 5);
    }

    public void cell6Click(View v){

        ImageView red6 = findViewById(R.id.red6);
        ImageView yellow6 = findViewById(R.id.yellow6);

        cellClickUni(red6, yellow6, 6);
    }

    public void cell7Click(View v){

        ImageView red7 = findViewById(R.id.red7);
        ImageView yellow7 = findViewById(R.id.yellow7);

        cellClickUni(red7, yellow7, 7);
    }

    public void cell8Click(View v){

        ImageView red8 = findViewById(R.id.red8);
        ImageView yellow8 = findViewById(R.id.yellow8);

        cellClickUni(red8, yellow8, 8);
    }

    public void playAgain(View v){
        redTurn = true;
        gameOver = false;

        for(int x =0; x<gameState.length;x++){
            gameState[x] = 0;
        }

        Button playAgain = findViewById(R.id.button);
        playAgain.setAlpha(0);



        ImageView red0 = findViewById(R.id.red0);
        ImageView yellow0 = findViewById(R.id.yellow0);
        ImageView red1 = findViewById(R.id.red1);
        ImageView yellow1 = findViewById(R.id.yellow1);
        ImageView red2 = findViewById(R.id.red2);
        ImageView yellow2 = findViewById(R.id.yellow2);
        ImageView red3 = findViewById(R.id.red3);
        ImageView yellow3 = findViewById(R.id.yellow3);
        ImageView red4 = findViewById(R.id.red4);
        ImageView yellow4 = findViewById(R.id.yellow4);
        ImageView red5 = findViewById(R.id.red5);
        ImageView yellow5 = findViewById(R.id.yellow5);
        ImageView red6 = findViewById(R.id.red6);
        ImageView yellow6 = findViewById(R.id.yellow6);
        ImageView red7 = findViewById(R.id.red7);
        ImageView yellow7 = findViewById(R.id.yellow7);
        ImageView red8 = findViewById(R.id.red8);
        ImageView yellow8 = findViewById(R.id.yellow8);

        ImageView[] views = {red0,red1, red2, red3,red4,red5,red6,red7,red8,yellow0,yellow1,yellow2,yellow3,yellow4,yellow5,yellow6,yellow7,yellow8};

        for(ImageView ourView : views){
            ourView.animate().alpha(0);
        }
    }


}
