package com.example.banglaletter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EnglishNumber#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EnglishNumber extends Fragment {

    private GridView gridView;
    private int[] enumber= {R.drawable.zero, R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,
            R.drawable.five, R.drawable.six,R.drawable.seven, R.drawable.eight,R.drawable.nine,

    };
    private CustomENumberAdapter customENumberAdapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EnglishNumber() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EnglishNumber.
     */
    // TODO: Rename and change types and number of parameters
    public static EnglishNumber newInstance(String param1, String param2) {
        EnglishNumber fragment = new EnglishNumber();
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
        View rootView = inflater.inflate(R.layout.fragment_english_capital, container, false);
        gridView = rootView.findViewById(R.id.capitalGridViewId);
        customENumberAdapter = new CustomENumberAdapter(getContext(),enumber);
        gridView.setAdapter(customENumberAdapter);
        return rootView;
    }
}