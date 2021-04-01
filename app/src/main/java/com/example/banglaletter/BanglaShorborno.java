package com.example.banglaletter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BanglaShorborno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BanglaShorborno extends Fragment {
    private GridView gridView;
    private int[] bshorborno= {R.drawable.s1, R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s4,
            R.drawable.s5, R.drawable.s6,R.drawable.s7, R.drawable.s8,R.drawable.s9,R.drawable.s10,
            R.drawable.s11

    };
    private CustomBShorborno customBShorborno;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BanglaShorborno() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BanglaShorborno.
     */
    // TODO: Rename and change types and number of parameters
    public static BanglaShorborno newInstance(String param1, String param2) {
        BanglaShorborno fragment = new BanglaShorborno();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_bangla_shorborno, container, false);
        gridView = rootView.findViewById(R.id.shorbornoGridViewId);
        customBShorborno = new CustomBShorborno(getContext(),bshorborno);
        gridView.setAdapter(customBShorborno);
        return rootView;
    }
}