package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Instance_Class.callAPI().signUpUser("abc","xyz@gmail.com","123456").enqueue(new Callback<RegisterUser>() {
            @Override
            public void onResponse(Call<RegisterUser> call, Response<RegisterUser> response) {
                Log.d("TTT", "onResponse: ="+response.body());
                if(response.body().connection==1)
                {
                    if(response.body().result==1)
                    {
                        Log.d("TTT", "Registered..");
                        Toast.makeText(MainActivity.this, "User Registered", Toast.LENGTH_LONG).show();
                    } else if (response.body().result==2)
                    {
                        Log.d("TTT", "User already Registered");
                        Toast.makeText(MainActivity.this, "User already Registered", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Log.d("TTT", "Not Registered..");
                        Toast.makeText(MainActivity.this, "User not Registered", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Log.d("TTT", "Something went Wrong..!");
                    Toast.makeText(MainActivity.this, "Something went Wrong..!", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterUser> call, Throwable t) {
                Log.e("TTT", "onError: ="+t.getLocalizedMessage());
            }
        });
    }
}