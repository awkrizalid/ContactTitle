package com.example.hp.contacttitle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class ContactList extends ArrayAdapter<String> {

    TextView contactNumber,ContactName,twoCharacters;
    ImageView contactImageView;
    static  HashMap myContacts=new HashMap();
    String contactItem;
    private void gerneratContact(){
        myContacts.put("Faisal Imran","090078601");
        myContacts.put("Abdul Wahab","03001234567");
        myContacts.put("Salahuddin Ayubi","03110029824");
        myContacts.put("Tipu Sultan","03440785826");
        myContacts.put("Ibne Batuta","03331146726");
        myContacts.put("Ibne Khaldoon","03121846256");
        myContacts.put("Muhammad Qasim","04587114311");
        myContacts.put("Mahmood Ghazni","2294784612");
        myContacts.put("Ismail Jaffar","8456178954");
        myContacts.put("Jalaluddin Rumi","1324568413");
        myContacts.put("Shams Tabrezi","0341654891");
        myContacts.put("Yunus Emre","31258111561");
        myContacts.put("Saadi Sherazi","225446121");
        myContacts.put("Omar Khayyam","65158411135");
        myContacts.put("Ibn Arabi","1501548451");
        myContacts.put("Sultan Walad","03123154689");
        myContacts.put("Ibne Sina","0348481181");
        myContacts.put("Mansur Hallaj","0313131542");
        myContacts.put("Abdul Qadir","02551112356");
        myContacts.put("Qasim Firdowsi","035464646488");
        myContacts.put("Muhammad Ghazali","0347979784");
        myContacts.put("Said Narsi","028484654655");
        myContacts.put("Junaid Baghdadi","04545648949");
        myContacts.put("Abu Yazid","06546515324");
        myContacts.put("Shams Udin","0320321035");
        myContacts.put("Sultan Abdal","16164646");
        myContacts.put("Hasan Basra","03215461518");
        myContacts.put("Hasan Kharaqani","0150321564");
        myContacts.put("Shahab Udin","546210156");
        myContacts.put("Syekh Siti","65401561261");
        myContacts.put("Makhdoom Baba","54601218964");
        myContacts.put("Imadudin Nasimi","5601560165");
        myContacts.put("Bayazid Bastami","65016510654");
        myContacts.put("Sher Shahsuri","65106510651");
        myContacts.put("Bullah Shah","651065106501");
        myContacts.put("Waris Shah","65046501321");
        myContacts.put("Attar Nishapuri","654605165201");
        myContacts.put("Bektash Wali","65103210654");
        myContacts.put("Ibne Alfarid","9876546578");
        myContacts.put("Fazal Wali","98745616015");
        myContacts.put("Akhmet Yassawi","84065165045");
        myContacts.put("Dhulnun Almisri","5102316548");
        myContacts.put("Sultan Ahmet","546546587418");
        myContacts.put("Al Khidr","6846161897");
        myContacts.put("Dhul Qarnayn","68402106540");
        myContacts.put("Jukar Sunami","6510654989");
        myContacts.put("Pulao Kababi","6154654110");
        myContacts.put("Jannat Khan","16461644614");
        myContacts.put("Shamsher Khan","154218721");
        myContacts.put("Yusha Adam","21848741254");
        myContacts.put("Mikael Adam","2154875421");
        myContacts.put("Israfeel Adam","0154845120");




    }


    public ContactList(Context context, String[] contactlist) {

        super(context,R.layout.contactlist,contactlist);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        gerneratContact();
        LayoutInflater contactInflater = LayoutInflater.from(getContext());
        View contactView = contactInflater.inflate(R.layout.contactlist, parent , false);
        twoCharacters=(TextView)   contactView.findViewById(R.id.iInsideCircleText);
        contactNumber=(TextView) contactView.findViewById(R.id.iContactNumber);
        contactItem = getItem(position);
        ContactName = (TextView) contactView.findViewById(R.id.iContactName);
        contactImageView = (ImageView) contactView.findViewById(R.id.iContactImageView);
        ContactName.setText(contactItem);
        contactNumber.setText(""+myContacts.get(contactItem));
        twoCharacters.setText(splitName());
        titleColor();

        return contactView;
    }

    public void titleColor()
    {
        if (twoCharacters.getText().charAt(0)=='A' || twoCharacters.getText().charAt(0)=='B')
            contactImageView.setImageResource(R.drawable.cshape);
        if (twoCharacters.getText().charAt(0)=='C' || twoCharacters.getText().charAt(0)=='D')
            contactImageView.setImageResource(R.drawable.cshape1);
        if (twoCharacters.getText().charAt(0)=='E' || twoCharacters.getText().charAt(0)=='F')
            contactImageView.setImageResource(R.drawable.cshape2);
        if (twoCharacters.getText().charAt(0)=='G' || twoCharacters.getText().charAt(0)=='H')
            contactImageView.setImageResource(R.drawable.cshape3);
        if (twoCharacters.getText().charAt(0)=='I' || twoCharacters.getText().charAt(0)=='J')
            contactImageView.setImageResource(R.drawable.cshape4);
        if (twoCharacters.getText().charAt(0)=='K' || twoCharacters.getText().charAt(0)=='L')
            contactImageView.setImageResource(R.drawable.cshape5);
        if (twoCharacters.getText().charAt(0)=='M' || twoCharacters.getText().charAt(0)=='N')
            contactImageView.setImageResource(R.drawable.cshape6);
        if (twoCharacters.getText().charAt(0)=='O' || twoCharacters.getText().charAt(0)=='P')
            contactImageView.setImageResource(R.drawable.cshape7);
        if (twoCharacters.getText().charAt(0)=='Q' || twoCharacters.getText().charAt(0)=='R')
            contactImageView.setImageResource(R.drawable.cshape8);
        if (twoCharacters.getText().charAt(0)=='S' || twoCharacters.getText().charAt(0)=='T')
            contactImageView.setImageResource(R.drawable.cshape9);
        if (twoCharacters.getText().charAt(0)=='U' || twoCharacters.getText().charAt(0)=='V')
            contactImageView.setImageResource(R.drawable.cshape10);
        if (twoCharacters.getText().charAt(0)=='W' || twoCharacters.getText().charAt(0)=='X')
            contactImageView.setImageResource(R.drawable.cshape11);
        if (twoCharacters.getText().charAt(0)=='Y' || twoCharacters.getText().charAt(0)=='Z')
            contactImageView.setImageResource(R.drawable.cshape12);

    }



    private  String splitName(){
        String[] words=contactItem.split(" ");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        String twchar="";
        for(String w:words){
            twchar+=w.charAt(0);
        }
        return twchar;
    }
}
