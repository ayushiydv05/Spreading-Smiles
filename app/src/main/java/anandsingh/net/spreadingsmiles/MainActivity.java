package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.text.NumberFormat;

import anandsingh.net.spreadingsmiles.R;


public class MainActivity extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button_id);
        b.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        openlogin();
                    }
                }
        );
    }
    public void openlogin(){
        Intent intent=new Intent(this, login.class);
        startActivity(intent);
    }

}
