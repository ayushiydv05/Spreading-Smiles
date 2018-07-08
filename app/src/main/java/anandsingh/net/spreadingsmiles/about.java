package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import anandsingh.net.spreadingsmiles.R;

public class about extends AppCompatActivity {
    private Button boo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        boo=(Button) findViewById(R.id.button);
        boo.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v) {
                                     openoptions();
                                 }
                             }
        );
    }
    public void openoptions(){
        Intent intent=new Intent(this, options.class);
        startActivity(intent);
    }
}
