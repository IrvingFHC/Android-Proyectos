package irvinghernandez.radiobuttonandckeckbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
        final CheckBox chb1=(CheckBox)findViewById(R.id.chb1);
        final CheckBox chb2=(CheckBox)findViewById(R.id.chb2);
        Button btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int precio = 0;
                String curso = "";
                if (rg.getCheckedRadioButtonId() == R.id.rb1){
                    precio = 900;
                    curso = "Matematicas";
                }
                else if (rg.getCheckedRadioButtonId() == R.id.rb2){
                    precio = 700;
                    curso = "Geografia";
                }
                else if (rg.getCheckedRadioButtonId() == R.id.rb3){
                    precio = 850;
                    curso = "Historia";
                }

                double D1 = 0, D2 = 0;
                if (chb1.isChecked()){
                    D1 = precio * .05;
                }
                if (chb2.isChecked()){
                    D2 = precio * .10;
                }
                double total = precio -D1 -D2;
                Toast.makeText(getApplicationContext(), "Curso" + curso +
                "\nPrecio: "+ precio + "\nDescuento:"
                +D1+"\nDecuento2:" + D2+ "\nTotal:" +total, Toast.LENGTH_LONG).show();

            }
        });

        setContentView(R.layout.activity_main);
    }

}