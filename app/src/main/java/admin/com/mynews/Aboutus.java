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
    TextView headline,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgvw = (ImageView) findViewById(R.id.descimg);
        imgvw.setImageResource(R.mipmap.image_head);

        headline = (TextView) findViewById(R.id.texthead);
        headline.setText(R.string.headline);

        desc = (TextView) findViewById(R.id.textdesc);
        desc.setText(R.string.telugu);





    }

}

