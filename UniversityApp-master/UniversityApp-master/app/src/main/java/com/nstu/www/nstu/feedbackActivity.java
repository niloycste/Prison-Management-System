package com.nstu.www.nstu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class feedbackActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendButton, clearButton;
    private EditText nameEditText, messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        sendButton = (Button) findViewById(R.id.sendButtonId);
        clearButton = (Button) findViewById(R.id.clearButtonId);
        nameEditText = (EditText) findViewById(R.id.nameEditTextId);
        messageEditText = (EditText) findViewById(R.id.messageEditTextId);
        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {

            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();

            if (view.getId() == R.id.sendButtonId) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ni6670154@gmail.com","piashabhijeetsaha@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "feedback from app");
                intent.putExtra(Intent.EXTRA_TEXT, "NAME:" + name + "\n MESSAGE:" + message);
                startActivity(Intent.createChooser(intent, "feedback with"));

            } else if (view.getId() == R.id.clearButtonId) {
                nameEditText.setText("");
                messageEditText.setText("");
            }

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception:"+e,Toast.LENGTH_SHORT).show();

        }



    }
}
