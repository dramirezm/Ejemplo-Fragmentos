package bosc.codigofacilitoapp.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bosc.codigofacilitoapp.R;

/**
 * Created by Diego Ramirez on 09/12/2015.
 */
public class Derecha extends Fragment {
    View rootView;
    TextView txt;
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState)
    {
        rootView = layoutInflater.inflate(R.layout.derecho,container,false);
        txt = (TextView)rootView.findViewById(R.id.txt);



        return rootView;
    }

    public void ObtenerDatos(String mensaje)
    {
        txt.setText(mensaje);
    }
}
