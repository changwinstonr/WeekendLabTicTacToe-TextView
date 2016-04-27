package ly.generalassemb.drewmahrt.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // BRANCH GAME
        // get intent
        //
        //ADD&COMMIT

        // update the text view with p1 name
        //ADD&COMMIT

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
