package admin.com.mynews;

/**
 * @Author anudeep on 11/30/2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    ImageView imgvw;
    TextView txtvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgvw = (ImageView) findViewById(R.id.descimg);
        imgvw.setImageResource(R.mipmap.ic_launcher);

        txtvw = (TextView) findViewById(R.id.desctext);
        txtvw.setText("Hello");


    }

}

