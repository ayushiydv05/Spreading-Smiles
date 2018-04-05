package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.text.NumberFormat;

public class volunteer extends AppCompatActivity {
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v) {
                                       openthanks();
                                   }
                               }
        );
    }
    public void openthanks(){
        Intent intent=new Intent(this, thankyou2.class);
        startActivity(intent);
    }
}
