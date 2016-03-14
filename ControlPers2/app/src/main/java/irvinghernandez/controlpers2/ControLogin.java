package irvinghernandez.controlpers2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Irving Hernández on 09/03/2016.
 */
public class ControLogin extends LinearLayout {
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView lblMensaje;

    private OnLoginClickListener listener;

    public ControLogin(Context context) {
        super(context);
        inicializar();
    }

    public ControlLogin(Context context, AttributeSet attrs){
        super(context, attrs);
        inicializar();

        TypedArray a = getContext().obtainStyledAttributes(attrs,R.style.ControlLogin);
        String textoBoton = a.getString(R.style.controlLogin_login_text);

        btnLogin.setText(textoBoton);

        a.recycle();
    }

    private void inicializar(){
        String infService= Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.control_login,this,true);

        txtUsuario=(EditText)findViewById(R.id.TxtUsuario);
        txtPassword=(EditText)findViewById(R.id.TxtPassword);
        btnLogin=(Button)findViewById(R.id.BtnAceptar);
        lblMensaje=(TextView)findViewById(R.id.LblMensaje);

        asignarEventos();
    }

    public void setOnLoginListener(OnLoginListener l){
        listener = l;
    }

    private void asignarEventos(){
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onLogin(txtUsuario.getText().toString(),txtPassword.getText().toString());
            }
        });
    }

    public void setMensaje(String msg){
        lblMensaje.setText(msg);
    }
}
