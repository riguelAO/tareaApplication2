package com.example.tareaapplication2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link calculadoraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class calculadoraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public calculadoraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment calculadoraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static calculadoraFragment newInstance(String param1, String param2) {
        calculadoraFragment fragment = new calculadoraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    private Button btnSuma,btnResta,btnMultiplicacion,btnDividir,btnClear;
    private EditText etNumero1, etNumero2, etRespuesta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_calculadora,container,false);

        etNumero1=view.findViewById(R.id.etNumero1);
        etNumero2=view.findViewById(R.id.etNumero2);
        etRespuesta=view.findViewById(R.id.etRespuesta);

        btnSuma=view.findViewById(R.id.btnSuma);
        btnResta=view.findViewById(R.id.btnResta);
        btnMultiplicacion=view.findViewById(R.id.btnMultiplicar);
        btnDividir=view.findViewById(R.id.btnDividir);
        btnClear=view. findViewById(R.id.btnClear);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1+numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1-numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1*numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1=Integer.parseInt(etNumero1.getText().toString());
                double numero2=Integer.parseInt(etNumero2.getText().toString());
                double rpta=numero1/numero2;

                etRespuesta.setText(rpta+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumero1.setText("");
                etNumero2.setText("");
                etRespuesta.setText("");
            }
        });

        return view;
    }
}