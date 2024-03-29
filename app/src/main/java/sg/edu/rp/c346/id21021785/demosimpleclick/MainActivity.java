package sg.edu.rp.c346.id21021785.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 2: Create object
    Button btn;
    EditText name;
    ToggleButton toggle;
    TextView display;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 3: Link object to UI widget
        btn = findViewById(R.id.button1);
        name = findViewById(R.id.editTextTextPersonName1);
        display = findViewById(R.id.textViewDisplay);
        toggle = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, name.getText(), Toast.LENGTH_LONG).show();
                String txt = name.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();
                //display.setText(txt);
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    display.setText("He says " + txt);
                } else if (checkedRadioId == R.id.radioButtonGenderFemale){
                    display.setText("She says " + txt);
                } else {
                    display.setText("It says " + txt);
                }
            }
        });

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggle.isChecked()) {
                    name.setEnabled(true);
                } else {
                    name.setEnabled(false);
                }
            }
        });

    }
}