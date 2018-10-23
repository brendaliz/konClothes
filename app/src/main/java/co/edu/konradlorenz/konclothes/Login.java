package co.edu.konradlorenz.konclothes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button btnRegistrarse;
    private Button btnAcceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        btnAcceder = (Button) findViewById(R.id.btnAcceder);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }
        }
        );

        //This intent needs to be tested
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
