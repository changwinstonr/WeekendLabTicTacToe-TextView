package ly.generalassemb.drewmahrt.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    // BRANCH GAME
    //initialize variables
    TextView currentTurn, block_1, block_2, block_3, block_4, block_5, block_6, block_7, block_8, block_9;
    String playerO, playerX;
    boolean turn = true;
    double counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        currentTurn = (TextView) findViewById(R.id.game_message_text);

        // get intent
        // update the text view with p1 name
        //ADD&COMMIT
        currentTurn.setText(getIntent().getExtras().getString("playerO") + " " + "your turn.");
        //currentTurn.setText(getIntent().getExtras().getString("playerX") + " " + "your turn.");

        // find all views by ID
        //ADD&COMMIT
        


        // set all on click listeners for each view
        //ADD&COMMIT

        // create a counter (int) set it to 0
        //ADD&COMMIT

        // on each click listener :
            //1. if counter is 0 or even number input an "X" to that text view using setText()
            //2. if counter is odd number input an "X" to that text view using setText()
            //3. increment the counter
        //ADD&COMMIT

        // check for a win
            // all boxes on top row contain the same value
            //1. if ("view1".getText() == "view2".getText() && "view1".getText() == "view3".getText())
            //2. is it an X or an O?
        //ADD&COMMIT; MERGE

    }
}
