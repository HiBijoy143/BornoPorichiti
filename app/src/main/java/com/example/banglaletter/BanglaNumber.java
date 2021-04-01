package com.example.banglaletter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BanglaNumber#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BanglaNumber extends Fragment {
    private GridView gridView;
    private int[] bnumber= {R.drawable.n0, R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,
            R.drawable.n5, R.drawable.n6,R.drawable.n7, R.drawable.n8,R.drawable.n9

    };
    private CustomBNumber customBNumber;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BanglaNumber() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BanglaNumber.
     */
    // TODO: Rename and change types and number of parameters
    public static BanglaNumber newInstance(String param1, String param2) {
        BanglaNumber fragment = new BanglaNumber();
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
        View rootView = inflater.inflate(R.layout.fragment_bangla_number, container, false);
        gridView = rootView.findViewById(R.id.bnumberGridViewId);
        customBNumber = new CustomBNumber(getContext(),bnumber);
        gridView.setAdapter(customBNumber);
        return rootView;
    }
}