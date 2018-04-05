package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donor extends AppCompatActivity {
    private Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);
        b1=(Button) findViewById(R.id.home);
        b1.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v) {
                                     openthanks();
                                 }
                             }
        );
        b2=(Button) findViewById(R.id.res);
        b2.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v) {
                                      opens();
                                  }
                              }
        );
    }
    public void openthanks(){
        Intent intent=new Intent(this, home.class);
        startActivity(intent);
    }
    public void opens(){
        Intent intent=new Intent(this, rest.class);
        startActivity(intent);
    }
}
