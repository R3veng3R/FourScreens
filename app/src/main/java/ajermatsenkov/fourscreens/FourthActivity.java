package ajermatsenkov.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void changeToFirst(View v) {
        Intent i = new Intent(this, FirstActivity.class);
        startActivity(i);
    }
}
