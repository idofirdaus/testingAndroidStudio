package com.example.idofirdaus.firdausadinugroho_1202154378_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        a = (TextView) findViewById(R.id.namamenu);
        b = (TextView) findViewById(R.id.jumlahporsi);
        c = (TextView) findViewById(R.id.harga);
        d = (TextView) findViewById(R.id.restaurant);

        if (getIntent().getExtras() != null) {

            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("Menu"));
            b.setText(bundle.getString("Jumlah"));
            c.setText(bundle.getString("Total"));
            c.setText(bundle.getString("Restaurant"));
        } else {
            a.setText(getIntent().getStringExtra("Menu"));
            b.setText(getIntent().getStringExtra("Jumlah"));
            c.setText(getIntent().getStringExtra("Total"));
            d.setText(getIntent().getStringExtra("Restaurant"));
        }
    }
}