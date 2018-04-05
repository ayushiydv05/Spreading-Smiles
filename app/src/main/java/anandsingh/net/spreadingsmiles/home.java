package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
        Intent intent=new Intent(this, thankyou1.class);
        startActivity(intent);
    }
}