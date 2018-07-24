package br.edu.iff.pooa20181.fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    View view;

    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // obter a view do fragmento
        view = inflater.inflate(R.layout.fragment_primeiro, container, false);
        // linkar com o componente da view
        //define de qual view está pegando a referencia do botao, por isso view.findById
        Button b = (Button) view.findViewById(R.id.btnOk);
        //agora trata da forma normal
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // o contexto é obtido de forma diferente
                //todos os componentes que usam contexto tem que pegar o contexo da forma abaixo
                Toast.makeText(getActivity().getApplicationContext(),
                        "Estou no fragmento!!!", Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }

}
