package kg.auca.super_mega_snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MultiPlayerAdActivity extends AppCompatActivity {

    private ImageView cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player_ad);

        cancelBtn = findViewById(R.id.cancelBtn);
    }

    private void goToAnotherScreen() {
        Intent myIntent = new Intent(MultiPlayerAdActivity.this, MultiPlayerGameActivity.class);

    }
<<<<<<< HEAD


    public void onBackButtonClick (View view) {
        onBackPressed();
    }
=======
>>>>>>> e7a49e68ce4c8f7f266d0b59af4b98d842ec5abc
}