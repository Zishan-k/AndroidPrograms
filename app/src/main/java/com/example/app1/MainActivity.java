package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button) findViewById(R.id.button);
        //Variable 'password' and 'email' is accessed from within inner class, needs to be declared final
        final EditText password= (EditText) findViewById(R.id.EnterPassword);
        final EditText email= (EditText) findViewById(R.id.EnterEmail);
        tv= (TextView) findViewById(R.id.displaytv);

        b.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                String s= "Email:"+ password.getText() + "\n" + "Password:"+email.getText();
                tv.setText(s);
                Toast.makeText(getApplicationContext(),"From OnClick",100).show();
            }
        });
    }


 /*   @SuppressLint("WrongConstant")
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "On Pause Called",100).show();
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"On Resume Called",100).show();
    }
*/
}