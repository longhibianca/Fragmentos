package br.edu.iff.pooa20181.fragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //quando cria a activity, mostra o primeiro fragmento
        if (savedInstanceState == null) {
        // adicionar o fragmento inicial
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frame_container, new PrimeiroFragment())
                    .commit();

        }
        //pega a referencia dos botões
        Button f1 = (Button) findViewById(R.id.btnFrag1);
        Button f2 = (Button) findViewById(R.id.btnFrag2);

        //quando clicar no btn 1 abre o primeiro fragmento
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new PrimeiroFragment()).commit();

            }
        });

        //quando clcicar no segundo btn, abre o segundo fragmento
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new SegundoFragment()).commit();

            }
        });
    }
}
