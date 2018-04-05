package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class options extends AppCompatActivity {
    private Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        b1=(Button) findViewById(R.id.needy);
        b1.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v) {
                                     open1();
                                 }
                             }
        );
        b2=(Button) findViewById(R.id.vol);
        b2.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v) {
                                      open2();
                                  }
                              }
        );
        b3=(Button) findViewById(R.id.don);
        b3.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v) {
                                      open3();
                                  }
                              }
        );
        b4=(Button) findViewById(R.id.ngo);
        b4.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v) {
                                      open4();
                                  }
                              }
        );
    }
    public void open1(){
        Intent intent=new Intent(this, updateinfo.class);
        startActivity(intent);
    }
    public void open2(){
        Intent intent=new Intent(this, volunteer.class);
        startActivity(intent);
    }
    public void open3(){
        Intent intent=new Intent(this, donor.class);
        startActivity(intent);
    }
    public void open4(){
        Intent intent=new Intent(this, ngo.class);
        startActivity(intent);
    }
}