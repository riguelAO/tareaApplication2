package com.example.tareaapplication2;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link maravillasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class maravillasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public maravillasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment maravillasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static maravillasFragment newInstance(String param1, String param2) {
        maravillasFragment fragment = new maravillasFragment();
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

    private Button btnchichen,btncristo,btnmahal,btnmuralla,btnpetra,btnpicchu,btnroma;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maravillas, container, false);

        btnchichen = view.findViewById(R.id.btnChichen);
        btncristo = view.findViewById(R.id.btnCrito);
        btnmahal = view.findViewById(R.id.btnMahal);
        btnmuralla = view.findViewById(R.id.btnMuralla);
        btnpetra = view.findViewById(R.id.btnPetra);
        btnpicchu = view.findViewById(R.id.btnPicchu);
        btnroma = view.findViewById(R.id.btnroma);

        btnchichen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mpchichen = MediaPlayer.create(getContext(), R.raw.chichen);
                mpchichen.start();
            }
        });
        btncristo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mpcristo = MediaPlayer.create(getContext(), R.raw.cristo);
                mpcristo.start();
            }
        });
        btnmahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mpmahal = MediaPlayer.create(getContext(), R.raw.mahal);
                mpmahal.start();
            }
        });
        btnmuralla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mpmuralla = MediaPlayer.create(getContext(), R.raw.muralla);
                mpmuralla.start();
            }
        });
        btnpetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mppetra = MediaPlayer.create(getContext(), R.raw.petra);
                mppetra.start();
            }
        });
        btnpicchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mppicchu = MediaPlayer.create(getContext(), R.raw.picchu);
                mppicchu.start();
            }
        });
        btnroma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mproma = MediaPlayer.create(getContext(), R.raw.roma);
                mproma.start();
            }
        });
        return view;
}}