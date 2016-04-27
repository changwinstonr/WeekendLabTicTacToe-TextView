package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText playerOne, playerTwo;
    String playerOneText, playerTwoText, lastWinnarText, playerWinnar;
    TextView lastWinnar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BRANCH MAIN
        // find views by ID
        lastWinnar = (TextView) findViewById(R.id.last_winner_text);
        playerOne = (EditText) findViewById(R.id.player_one_name);
        playerTwo = (EditText) findViewById(R.id.player_two_name);

        // update them with input
        playerOneText = new String(playerOne.getText().toString());
        playerTwoText = new String(playerTwo.getText().toString());

        // new Intent with input
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
            intent.putExtra("playerOneName", playerOne.getText().toString());
            intent.putExtra("playerTwoName", playerTwo.getText().toString());

        // start game activity with player info (input)
        startActivity(intent);

        //ADD & COMMIT; MERGE


    }

    //SHARED PREFS after GameActivity completion
}
