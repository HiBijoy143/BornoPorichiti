package com.example.banglaletter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BanglaBanjon#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BanglaBanjon extends Fragment {
    private GridView gridView;
    private int[] bbanjon= {R.drawable.b1, R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,
            R.drawable.b6,R.drawable.b7, R.drawable.b8,R.drawable.b9,R.drawable.b10,
            R.drawable.b11, R.drawable.b12, R.drawable.b13,R.drawable.b14,R.drawable.b15,R.drawable.b16,
            R.drawable.b17, R.drawable.b18,R.drawable.b19, R.drawable.b20,R.drawable.b21,R.drawable.b22,
            R.drawable.b23,R.drawable.b24, R.drawable.b25,R.drawable.b26,R.drawable.b27,R.drawable.b28,
            R.drawable.b29, R.drawable.b30,R.drawable.b31, R.drawable.b32,R.drawable.b33,R.drawable.b34,
            R.drawable.b35,R.drawable.b36, R.drawable.b37,R.drawable.b38, R.drawable.b39

    };
    private CustomBbanjon customBbanjon;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BanglaBanjon() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BanglaBanjon.
     */
    // TODO: Rename and change types and number of parameters
    public static BanglaBanjon newInstance(String param1, String param2) {
        BanglaBanjon fragment = new BanglaBanjon();
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
        View rootView = inflater.inflate(R.layout.fragment_bangla_banjon, container, false);
        gridView = rootView.findViewById(R.id.banjonGridViewId);
        customBbanjon = new CustomBbanjon(getContext(),bbanjon);
        gridView.setAdapter(customBbanjon);
        return rootView;
    }
}