package com.example.banglaletter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnglishCapital#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnglishCapital extends Fragment {

    private GridView gridView;
    private int[] capital= {R.drawable.a, R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e, R.drawable.f,
            R.drawable.g,R.drawable.h, R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,
            R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,
            R.drawable.u,R.drawable.v,R.drawable.w, R.drawable.x,R.drawable.y,R.drawable.z
    };
    private CustomCapitalAdapter customCapitalAdapter;
    public String[] name ={"A","B","C","D","E","F"};
    int pos = 0;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EnglishCapital() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EnglishCapital.
     */
    // TODO: Rename and change types and number of parameters
    public static EnglishCapital newInstance(String param1, String param2) {
        EnglishCapital fragment = new EnglishCapital();
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
//        LayoutInflater layoutInflater = getLayoutInflater();
//        View view = layoutInflater.inflate(R.layout.fragment_english_capital, null);
//        gridView = view.findViewById(R.id.capitalGridViewId);
//        CustomCapitalAdapter customCapitalAdapter = new CustomCapitalAdapter(this, capital);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_english_capital, container, false);
        gridView = rootView.findViewById(R.id.capitalGridViewId);
        customCapitalAdapter = new CustomCapitalAdapter(getContext(),capital);
        gridView.setAdapter(customCapitalAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(capital[position]==0)
                {
                    Toast.makeText(getActivity(), "A", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }

}