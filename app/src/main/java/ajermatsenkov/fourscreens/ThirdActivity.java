package ajermatsenkov.fourscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void changeToFourth(View v) {
        Intent i = new Intent(this, FourthActivity.class);
        startActivity(i);
    }
}
