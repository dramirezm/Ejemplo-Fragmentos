package bosc.codigofacilitoapp.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import bosc.codigofacilitoapp.Interfaces.EnviarMensaje;
import bosc.codigofacilitoapp.R;

/**
 * Created by Diego Ramirez on 09/12/2015.
 */
public class Izquierda extends Fragment {
    View rootView;
    EditText campo;
    Button boton;
    EnviarMensaje EM;
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container ,Bundle savedInstanceState)
    {
        rootView = layoutInflater.inflate(R.layout.izquierda,container,false);


        campo = (EditText)rootView.findViewById(R.id.edt);
        boton = (Button)rootView.findViewById(R.id.btn);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });

        return rootView;
    }



    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        try
        {
            EM = (EnviarMensaje) activity;

        }catch (ClassCastException e)
        {
            throw  new ClassCastException("Necesitas Implementar");
        }
    }


}
