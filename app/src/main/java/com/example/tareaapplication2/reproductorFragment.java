package com.example.tareaapplication2;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link reproductorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class reproductorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public reproductorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment reproductorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static reproductorFragment newInstance(String param1, String param2) {
        reproductorFragment fragment = new reproductorFragment();
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

    private ImageButton ibPlay,ibNext,ibPrev,ibPause;
    private MediaPlayer mp;
    private double startTime=0;
    private double finalTime=0;
    private SeekBar seekbar;
    private Handler myHandler=new Handler();
    private TextView tvName,txt2;
    private int canciones[]={R.raw.apiadate,R.raw.blues,R.raw.feels,R.raw.lover,R.raw.stole};
    private String canc[]={"apiadate de mi - Victor Manuelle","the blues - Candyman", "feels - clavin harris","part time lover - stevie wonder","stole the show - kygo"};
    private int index=0;
    public static int oneTimeOnly =0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_reproductor,container,false);

        ibPlay=view.findViewById(R.id.ibPlay);
        ibPause=view.findViewById(R.id.ibPause);
        ibNext=view.findViewById(R.id.ibNext);
        ibPrev=view.findViewById(R.id.ibPrev);
        tvName=view.findViewById(R.id.tvName);
        txt2=view.findViewById(R.id.txt2);

        tvName.setText(canc[index]);
        mp=MediaPlayer.create(getContext(),R.raw.apiadate);
        seekbar =view.findViewById(R.id.seekBar);

        ibPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Toast.makeText(getActivity(),"reproduciendo",Toast.LENGTH_SHORT).show();
                finalTime=mp.getDuration();
                startTime=mp.getCurrentPosition();
                if(oneTimeOnly==0){
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly=1;
                }
                txt2.setText(String.format("%d:%d",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                    finalTime))));
                myHandler.postDelayed(UpdateSongTime,100);
            }
        });
        ibPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                Toast.makeText(getActivity(),"pausa",Toast.LENGTH_SHORT).show();
            }
        });
        ibNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                if (index>4)index=0;
                mp.stop();
                mp=MediaPlayer.create(getActivity().getApplication(),canciones[index]);
                tvName.setText(canc[index]);
            }
        });
        ibPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if (index<0)index=4;
                mp.stop();
                mp=MediaPlayer.create(getActivity().getApplication(),canciones[index]);
                tvName.setText(canc[index]);
            }
        });
        return view;
    }
    private Runnable UpdateSongTime = new Runnable() {
        public void run (){
            startTime=mp.getCurrentPosition();
            seekbar.setProgress((int) startTime);
            myHandler.postDelayed((Runnable) this,100);
        }
    };
}