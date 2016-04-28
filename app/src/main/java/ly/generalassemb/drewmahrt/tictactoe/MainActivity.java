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

    private EditText playerOne, playerTwo;
    private TextView lastWinnar;
    private Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BRANCH MAIN
        // find views by ID
        playerOne = (EditText) findViewById(R.id.player_one_name);
        playerTwo = (EditText) findViewById(R.id.player_two_name);
        lastWinnar = (TextView) findViewById(R.id.last_winner_text);
        startGame = (Button) findViewById(R.id.start_game_button);

    }

    public void startGame(View view) {

        // update them with input
//        playerOne = new String(playerOne.getText().toString());
//        playerTwo = new String(playerTwo.getText().toString());

        // new Intent with input
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        intent.putExtra("playerOneName", playerOne.getText().toString());
        intent.putExtra("playerTwoName", playerTwo.getText().toString());

        // start game activity with player info (input)
        startActivity(intent);

    }


    //implement SHARED PREFS after GameActivity completion
}
