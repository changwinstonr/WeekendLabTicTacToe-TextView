package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText playerOne, playerTwo;
    TextView lastWinnar;
    //Button startGame;
    String playerName1, playerName2, winnar;

    //call prefs shared
    public static final String PREFERENCES_KEY = "ly.generalassemb.drewmahrt.tictactoe.prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // BRANCH MAIN
        // find views by ID
    public void startGameClick (View view){
        playerOne = (EditText) findViewById(R.id.player_one_name);
        playerTwo = (EditText) findViewById(R.id.player_two_name);
        //startGame = (Button) findViewById(R.id.start_game_button);

        //startGame.setOnClickListener(new View.OnClickListener() {
        //    @Override
            // update them with input
        playerName1 = new String(playerOne.getText().toString());
        playerName2 = new String(playerTwo.getText().toString());

            // new Intent with input
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            intent.putExtra("playerOneName", playerOne.getText().toString());
            intent.putExtra("playerTwoName", playerTwo.getText().toString());
            // start game activity with player info (input)
            startActivity(intent);
        }
        //get winner of TTT share dem prefs
        //implement SHARED PREFS after GameActivity completion
        @Override
        protected void onResume(){
            super.onResume();
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(PREFERENCES_KEY, MODE_PRIVATE);
            sharedPreferences.getString("winnar","");
            lastWinnar = (TextView) findViewById(R.id.last_winner_text);
            winnar = String.valueOf(sharedPreferences.getString("winnar",""));
            lastWinnar.setText(winnar);
        }


    }




