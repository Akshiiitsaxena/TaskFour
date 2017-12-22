package taskfour.akshit.com.taskfour;


import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Attributes extends AppCompatActivity {

    TextView text;
    TextView text2;
    TextView text3;
    RelativeLayout rview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attributes);

        rview = (RelativeLayout) findViewById(R.id.relative_layout);
        text = (TextView) findViewById(R.id.text_view);
        text2 = (TextView) findViewById(R.id.text_view2);
        text3 = (TextView) findViewById(R.id.text_view3);

        Snackbar snkbr = Snackbar.make(rview,"These are the attributes",Snackbar.LENGTH_LONG);
        snkbr.show();

        text.setText(getIntent().getExtras().getString("movie_name"));
        text2.setText(getIntent().getExtras().getString("genre"));
        text3.setText(getIntent().getExtras().getString("cast"));
        

    }
}
