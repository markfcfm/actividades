package menu1.xsj.com.menu1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by final on 20/02/2015.
 */
public class Segundaclase extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundaactividad);
        botonregresar();

    }

    private void botonregresar() {
        Button accionregresar = (Button) findViewById(R.id.bregresar);
        accionregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Segundaclase.this,actividadprincipal.class));

            }
        });
    }

}
