package aik.sinau.com.myideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnProses, btnReset;
    EditText edtBerat, edtTinggi;
    TextView txtHasil;
    float vBerat, vTinggi, hasilResult, hasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReset = (Button) findViewById(R.id.btnReset);
        edtBerat = (EditText) findViewById(R.id.editBerat);
        edtTinggi = (EditText) findViewById(R.id.editTinggi);
        btnProses = (Button) findViewById(R.id.btnProces);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vBerat = Float.parseFloat(edtBerat.getText().toString());
                vTinggi = Float.parseFloat(edtTinggi.getText().toString());
                hasil1 = vTinggi * vTinggi;
                hasilResult = vBerat / hasil1;
                hasil(hasilResult);
            }

            public void hasil(float hasilResult) {

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtBerat.setText("");
                edtTinggi.setText("");
                txtHasil.setText("Hasil");
            }
        });}

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rdbMale:
                if (checked)

                    if (hasilResult < 17) {
                        txtHasil.setText(" Anda kekurangan berat badan/kurus");
                    } else if (hasilResult >= 23) {
                        txtHasil.setText(" Anda kelebihan berat badan");
                    } else if (hasilResult >= 17) {
                        txtHasil.setText("Berat badan normal atau ideal");
                    } else if (hasilResult == 27) {
                        txtHasil.setText("Obesitas, sebaiknya segera lakukan program penurunan berat badan");
                        txtHasil.setText(String.valueOf(hasilResult));
                    } else {
                        txtHasil.setText("hasil tidak di ketahui");
                    }
                    break;
            case R.id.rdbFemale:
                if (checked)
                    if (hasilResult < 18) {
                        txtHasil.setText(" Anda kekurangan berat badan/kurus");
                    } else if (hasilResult >= 25) {
                        txtHasil.setText(" Anda kelebihan berat badan");
                    } else if (hasilResult>= 18) {
                        txtHasil.setText("Berat badan normal atau ideal");
                    } else if (hasilResult == 27) {
                        txtHasil.setText("Obesitas, sebaiknya segera lakukan program penurunan berat badan");
                        txtHasil.setText(String.valueOf(hasilResult));
                    } else {
                        txtHasil.setText("hasil tidak di ketahui");
                    }
                break;
        }

    }
}




