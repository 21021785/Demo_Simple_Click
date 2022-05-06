package sg.edu.rp.c346.id21021785.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 2: Create object
    Button btn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 3: Link object to UI widget
        btn = findViewById(R.id.button1);
        name = findViewById(R.id.editTextTextPersonName1);
        String txt = name.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, name.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();
            }
        });

    }
}