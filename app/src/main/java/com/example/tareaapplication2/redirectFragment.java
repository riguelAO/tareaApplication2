package com.example.tareaapplication2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link redirectFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class redirectFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public redirectFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment redirectFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static redirectFragment newInstance(String param1, String param2) {
        redirectFragment fragment = new redirectFragment();
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

    private ImageButton ibChrome,ibBike,ibFace,ibSteam,ibHbo,ibIg,ibPou,ibGeometry,ibSpotify;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_redirect,container, false);

        ibChrome=view.findViewById(R.id.ibChrome);
        ibBike=view.findViewById(R.id.ibBike);
        ibFace=view.findViewById(R.id.ibFace);
        ibSteam=view.findViewById(R.id.ibSteam);
        ibHbo=view.findViewById(R.id.ibHbo);
        ibIg=view.findViewById(R.id.ibIg);
        ibPou=view.findViewById(R.id.ibPou);
        ibGeometry=view.findViewById(R.id.ibGeometry);
        ibSpotify=view.findViewById(R.id.ibSpotify);

        ibChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("http://www.google.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
                Toast.makeText(getActivity(),"abriendo navegador",Toast.LENGTH_SHORT).show();
            }
        });
        ibBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bike=getContext().getPackageManager().getLaunchIntentForPackage("com.topfreegames.bikeracefreeworld");
                startActivity(bike);
                Toast.makeText(getActivity(),"abriendo bike race",Toast.LENGTH_SHORT).show();
            }
        });
        ibFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook=getContext().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
                Toast.makeText(getActivity(),"abriendo faceBook",Toast.LENGTH_SHORT).show();
            }
        });
        ibSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent steam=getContext().getPackageManager().getLaunchIntentForPackage("com.valvesoftware.android.steam.community");
                startActivity(steam);
                Toast.makeText(getActivity(),"abriendo Steam",Toast.LENGTH_SHORT).show();
            }
        });
        ibHbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hbo=getContext().getPackageManager().getLaunchIntentForPackage("com.hbo.broadband");
                startActivity(hbo);
                Toast.makeText(getActivity(),"abriendo HBO",Toast.LENGTH_SHORT).show();
            }
        });
        ibIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram=getContext().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(instagram);
                Toast.makeText(getActivity(),"abriendo Instagram",Toast.LENGTH_SHORT).show();
            }
        });
        ibPou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pou=getContext().getPackageManager().getLaunchIntentForPackage("me.pou.app");
                startActivity(pou);
                Toast.makeText(getActivity(),"abriendo Pou",Toast.LENGTH_SHORT).show();
            }
        });
        ibGeometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geometry=getContext().getPackageManager().getLaunchIntentForPackage("com.robtopx.geometryjumplite");
                startActivity(geometry);
                Toast.makeText(getActivity(),"abriendo Geometry Dash Free",Toast.LENGTH_SHORT).show();
            }
        });
        ibSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotify=getContext().getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                startActivity(spotify);
                Toast.makeText(getActivity(),"abriendo Spotify",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}