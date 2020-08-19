package com.example.firstActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

}


    public void onclickButtonLister(){
            button=(Button)findViewById(R.id.button);
            button.setOnClickListner{
                new View.OnClickListener{} {

                @Override
                        public void onClick(View view);
                        Context context=getApplicationContext();
                        CharSequence text ="Navigation Activity2";
                        int duration= Toast.LENGTH_SHORT;
                         toast=Toast.makeText(context , text , duration);
                         toast.setGravity(Gravity.CENTER_VERTICAL, 0 ,0);
                         toast.show();

                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
            }
        }
    }
}