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
    boolean cekRbtnM, cekRbtnF;
    float vBerat, vTinggi, hasilResult, hasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rbM =(RadioButton) findViewById(R.id.rdbMale);
        final RadioButton rbF = (RadioButton) findViewById(R.id.rdbFemale);
        btnReset = (Button) findViewById(R.id.btnReset);
        edtBerat = (EditText) findViewById(R.id.editBerat);
        edtTinggi = (EditText) findViewById(R.id.editTinggi);
        btnProses = (Button) findViewById(R.id.btnProces);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        final TextView txtTips= (TextView) findViewById(R.id.txtTip);

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

                if (cekRbtnM == true){
                    if (hasilResult < 17) {
                        txtHasil.setText(" Anda kekurangan berat badan/kurus");
                        txtTips.setText("Tambah konsumsi makanan berkalori");
                    } else if (hasilResult >= 23) {
                        txtHasil.setText(" Anda kelebihan berat badan");
                        txtTips.setText(" Harus waspada mulai lah diet dari sekarang");
                    } else if (hasilResult >= 17) {
                        txtHasil.setText("Berat badan normal atau ideal");
                        txtTips.setText("Selamat berat badan anda termasuk ideal");
                    } else if (hasilResult == 27) {
                        txtHasil.setText("Obesitas");
                        txtTips.setText(" sebaiknya segera lakukan program penurunan berat badan");

                    } else {
                        txtHasil.setText("hasil tidak di ketahui");
                    }
                }else if (cekRbtnF == true){

                    if (hasilResult < 18) {
                        txtHasil.setText(" Anda kekurangan berat badan/kurus");
                        txtTips.setText("Tambah konsumsi makanan berkalori");
                    } else if (hasilResult >= 25) {
                        txtHasil.setText(" Anda kelebihan berat badan");
                        txtTips.setText(" Harus waspada mulai lah diet dari sekarang");
                    } else if (hasilResult>= 18) {
                        txtHasil.setText("Berat badan normal atau ideal");
                        txtTips.setText("Selamat berat badan anda termasuk ideal");
                    } else if (hasilResult == 27) {
                        txtHasil.setText("Obesitas");
                        txtTips.setText(" sebaiknya segera lakukan program penurunan berat badan");

                    } else {
                        txtHasil.setText("hasil tidak di ketahui");
                    }
                }else{
                    txtHasil.setText("pilih jender");
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtBerat.setText("");
                txtTips.setText("");
                edtTinggi.setText("");
                txtHasil.setText("Hasil");
                rbM.setChecked(false);
                rbF.setChecked(false);
            }
        });}

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rdbMale:
                if (checked)
                    cekRbtnM=true;


                    break;
            case R.id.rdbFemale:
                if (checked)
                    cekRbtnF=true;
                break;
        }

    }
}




