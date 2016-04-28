package ly.generalassemb.drewmahrt.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class GameActivity extends AppCompatActivity implements OnClickListener {
    // BRANCH GAME
    //initialize variables
    TextView currentTurn, block_1, block_2, block_3, block_4, block_5, block_6, block_7, block_8, block_9;
    TextView[] blockArray;
    ImageView playAgain;
    String playerO, playerX;
    boolean turn = true;
    // create a counter (int) set it to 0
    //ADD&COMMIT
    int next_turn = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        currentTurn = (TextView) findViewById(R.id.game_message_text);

        // get intent
        // update the text view with p1 name
        //ADD&COMMIT
        //currentTurn.setText(getIntent().getExtras().getString("playerO") + " " + "your turn.");
        //currentTurn.setText(getIntent().getExtras().getString("playerX") + " " + "your turn.");

        // find all views by ID
        //ADD&COMMIT
        block_1 = (TextView) findViewById(R.id.textView);
        block_2 = (TextView) findViewById(R.id.textView2);
        block_3 = (TextView) findViewById(R.id.textView3);
        block_4 = (TextView) findViewById(R.id.textView4);
        block_5 = (TextView) findViewById(R.id.textView5);
        block_6 = (TextView) findViewById(R.id.textView6);
        block_7 = (TextView) findViewById(R.id.textView7);
        block_8 = (TextView) findViewById(R.id.textView8);
        block_9 = (TextView) findViewById(R.id.textView9);
//        playAgain = (ImageView) findViewById(R.id.playAgain);

        blockArray = new TextView[]{
                block_1, block_2, block_3, block_4, block_5,
                block_6, block_7, block_8, block_9};

        for (TextView action : blockArray){
            action.setOnClickListener(this);
        }

        /*playAgain.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                turn = true;
                next_turn = 0;
                //replay(true);
            }
        });*/

    }

        // on each click listener :
        //1. if counter is 0 or even number input an "X" to that text view using setText()
        //2. if counter is odd number input an "X" to that text view using setText()
        // set all on click listeners for each view
        //ADD&COMMIT
        public void blockSelect(TextView markBlock){
            if(turn){
                currentTurn.setText(getIntent().getExtras().getString("playerX")+" 's \nturn!");
                currentTurn.setTextColor(Color.WHITE);
                markBlock.setText("X");
            }else{
                currentTurn.setText(getIntent().getExtras().getString("playerO")+" 's \nturn!");
                currentTurn.setTextColor(Color.WHITE);
                markBlock.setText("O");
            }
            //increment the counter
            next_turn++;
            markBlock.setClickable(false);
            turn = !turn;
            checkWin();
        }
        //ADD&COMMIT


        // check for a win
        // all boxes on top row contain the same value
        //1. if ("view1".getText() == "view2".getText() && "view1".getText() == "view3".getText())
        //2. is it an X or an O?
        //3. add draw Toast
        //ADD&COMMIT; MERGE

    public void checkWin() {
        boolean winnar = false;
        // 1 2 3
        // 4 5 6
        // 7 8 9
        //horiz
        if (block_1.getText() == block_2.getText()
                && block_2.getText() == block_3.getText()
                && !block_1.isClickable())
                winnar = true;
        else if (block_4.getText() == block_5.getText()
                && block_5.getText() == block_6.getText()
                && !block_4.isClickable())
                winnar = true;
        else if (block_7.getText() == block_8.getText()
                && block_8.getText() == block_9.getText()
                && !block_7.isClickable())
                winnar = true;
        //vert
        if (block_1.getText() == block_4.getText()
                && block_4.getText() == block_7.getText()
                && !block_1.isClickable())
                winnar = true;
        else if (block_2.getText() == block_5.getText()
                && block_5.getText() == block_8.getText()
                && !block_4.isClickable())
                winnar = true;
        else if (block_3.getText() == block_6.getText()
                && block_6.getText() == block_9.getText()
                && !block_3.isClickable())
                winnar = true;
        //diag
        if (block_1.getText() == block_5.getText()
                && block_5.getText() == block_9.getText()
                && !block_1.isClickable())
                winnar = true;
        else if (block_3.getText() == block_5.getText()
                && block_5.getText() == block_7.getText()
                && !block_3.isClickable())
                winnar = true;

   /*     if (winnar){
            if (!turn){
                currentTurn.setText(getIntent().getExtras().getString("playerO")+" is a winnar!");
               */
            }

    @Override
    public void onClick(View v) {

    }
}




