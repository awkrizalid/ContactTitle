package com.example.hp.contacttitle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetails extends Activity {


    TextView secondContactName ,secondContactNumber ,secondInsideCirlceText;
    ImageView secondContactView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactdetails);
        System.out.println("jukar");
        getAllView();


        Intent gotIt=getIntent();
        name=gotIt.getStringExtra("theKey");
        secondContactName.setText(name);
        secondInsideCirlceText.setText(splitName());
        secondContactNumber.setText(""+ContactList.myContacts.get(name));
        titleColor();


    }

    private void getAllView()
    {
        secondContactName=(TextView)findViewById(R.id.iSecondContactName);
        secondContactNumber=(TextView)findViewById(R.id.iSecondContactNumber);
        secondInsideCirlceText=(TextView)findViewById(R.id.iSecondInsideCircleText);
        secondContactView=(ImageView)findViewById(R.id.detailsImageView);

    }

    private  String splitName(){
        String[] words=name.split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){
            twchar+=w.charAt(0);
        }
        return twchar;
    }

    public void titleColor()
    {
        if (secondInsideCirlceText.getText().charAt(0)=='A' || secondInsideCirlceText.getText().charAt(0)=='B')
            secondContactView.setImageResource(R.drawable.cshape);
        if (secondInsideCirlceText.getText().charAt(0)=='C' || secondInsideCirlceText.getText().charAt(0)=='D')
            secondContactView.setImageResource(R.drawable.cshape1);
        if (secondInsideCirlceText.getText().charAt(0)=='E' || secondInsideCirlceText.getText().charAt(0)=='F')
            secondContactView.setImageResource(R.drawable.cshape2);
        if (secondInsideCirlceText.getText().charAt(0)=='G' || secondInsideCirlceText.getText().charAt(0)=='H')
            secondContactView.setImageResource(R.drawable.cshape3);
        if (secondInsideCirlceText.getText().charAt(0)=='I' || secondInsideCirlceText.getText().charAt(0)=='J')
            secondContactView.setImageResource(R.drawable.cshape4);
        if (secondInsideCirlceText.getText().charAt(0)=='K' || secondInsideCirlceText.getText().charAt(0)=='L')
            secondContactView.setImageResource(R.drawable.cshape5);
        if (secondInsideCirlceText.getText().charAt(0)=='M' || secondInsideCirlceText.getText().charAt(0)=='N')
            secondContactView.setImageResource(R.drawable.cshape6);
        if (secondInsideCirlceText.getText().charAt(0)=='O' || secondInsideCirlceText.getText().charAt(0)=='P')
            secondContactView.setImageResource(R.drawable.cshape7);
        if (secondInsideCirlceText.getText().charAt(0)=='Q' || secondInsideCirlceText.getText().charAt(0)=='R')
            secondContactView.setImageResource(R.drawable.cshape8);
        if (secondInsideCirlceText.getText().charAt(0)=='S' || secondInsideCirlceText.getText().charAt(0)=='T')
            secondContactView.setImageResource(R.drawable.cshape9);
        if (secondInsideCirlceText.getText().charAt(0)=='U' || secondInsideCirlceText.getText().charAt(0)=='V')
            secondContactView.setImageResource(R.drawable.cshape10);
        if (secondInsideCirlceText.getText().charAt(0)=='W' || secondInsideCirlceText.getText().charAt(0)=='X')
            secondContactView.setImageResource(R.drawable.cshape11);
        if (secondInsideCirlceText.getText().charAt(0)=='Y' || secondInsideCirlceText.getText().charAt(0)=='Z')
            secondContactView.setImageResource(R.drawable.cshape12);

    }
}
