package activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import app.janeyweather.com.janeyweather.R;

/**
 * Created by 楚哥 on 2016/3/25.
 */
public class homePageActivity extends Activity{

    private Button chooseprivince;
    private Button switchcity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home_layout);
        chooseprivince = (Button)findViewById(R.id.choose_province);
        switchcity = (Button)findViewById(R.id.switch_city);
        switchcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePageActivity.this,ChooseAreaActivity.class);
                startActivity(intent);
            }
        });
        chooseprivince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePageActivity.this,ChooseAreaActivity.class);
                startActivity(intent);
            }
        });

    }

}
