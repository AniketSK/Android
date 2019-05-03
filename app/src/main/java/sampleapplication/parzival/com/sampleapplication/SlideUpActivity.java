package sampleapplication.parzival.com.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SlideUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_up);
    }

    public static void launchActivity(Activity origin) {
        origin.startActivity(new Intent(origin.getApplicationContext(),SlideUpActivity.class));
        origin.overridePendingTransition(R.anim.slide_up, R.anim.no_animation);
    }
}
