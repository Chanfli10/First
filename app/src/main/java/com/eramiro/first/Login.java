package com.eramiro.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.eramiro.first.R;



public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


//    Glide for loading girls
        ImageView mGirl = findViewById(R.id.totti);

        Glide.with(this)
            .load("https://as.com/futbol/imagenes/2013/03/03/internacional/1362345833_285639_1362345896_noticia_grande.jpg")
             // .load(R.drawable.totti)
                .transition(DrawableTransitionOptions.withCrossFade(100))

//                .centerCrop()
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
//                .circleCrop()
                .into(mGirl);
        ImageView logo = findViewById(R.id.logo);
        Glide.with(this)
                .load(R.drawable.images)
        .transition(DrawableTransitionOptions.withCrossFade(100))
        .circleCrop()
        .into(logo);







    }

    private void transition(DrawableTransitionOptions withCrossFade) {
    }


    // Method for Vaccinate button
    public void openMain(View v) {
        Intent intent = new Intent(Login.this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void openSignup(View v) {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }

}

