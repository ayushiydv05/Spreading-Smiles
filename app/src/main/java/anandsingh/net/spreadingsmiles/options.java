package anandsingh.net.spreadingsmiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static anandsingh.net.spreadingsmiles.R.id.imageView2;

public class options extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        imageView1.setOnClickListener(new View.OnClickListener() {  //sharer
            @Override
            public void onClick(View view) {
                open3();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {   //discover needy
            @Override
            public void onClick(View view) {
                open1();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {    //volunteer
            @Override
            public void onClick(View view) {
                open2();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {   //ngo
            @Override
            public void onClick(View view) {
                open4();
            }
        });

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