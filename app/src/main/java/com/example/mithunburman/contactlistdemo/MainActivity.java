package com.example.mithunburman.contactlistdemo;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {//pick_contact declaring by Mithun burman on 21.07.2017

    private static final int PICK_CONTACT = 1234;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click (View view){
        Intent content = new Intent (Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        // This will start activity to open contact
        startActivityForResult(content, PICK_CONTACT);
    }
}
