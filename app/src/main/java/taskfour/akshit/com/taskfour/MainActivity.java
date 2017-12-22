package taskfour.akshit.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button my_button;
    EditText editText;
    EditText editText2;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.textView3);
        editText3 = (EditText) findViewById(R.id.textView4);

        final Intent i = new Intent(getApplicationContext(),Attributes.class);

        my_button = (Button) findViewById(R.id.button);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  i.putExtra("movie_name",editText.getText().toString());
                i.putExtra("genre",editText2.getText().toString());
                i.putExtra("cast",editText3.getText().toString());

                   startActivity(i);
            }
        });

    }
}