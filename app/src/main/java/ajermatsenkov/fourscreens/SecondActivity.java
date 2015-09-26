package ajermatsenkov.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void changeToThird(View v) {
        Intent i = new Intent(this, ThirdActivity.class);
        startActivity(i);
    }
}
