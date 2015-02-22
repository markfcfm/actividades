package menu1.xsj.com.menu1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class actividadprincipal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrarboton();
    }

    private void entrarboton() {
        Button accionentrar = (Button) findViewById(R.id.bEntrar);
        accionentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(actividadprincipal.this,Segundaclase.class));
            }
        });
    }


}
