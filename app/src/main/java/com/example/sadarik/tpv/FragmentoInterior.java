package com.example.sadarik.tpv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



    /*POR AHORA SIN UTILIDAD*/
public class FragmentoInterior extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_interior, container, false);
      /*  TextView tv = (TextView) v.findViewById(R.id);
        tv.setText("Interior");*/
        return v;
    }


}
