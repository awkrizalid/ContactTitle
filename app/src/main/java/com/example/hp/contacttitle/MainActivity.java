package com.example.hp.contacttitle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.view.View;
//import android.content.intent;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] contactlist = {
                "Faisal Imran" , "Abdul Wahab" , "Salahuddin Ayubi" , "Tipu Sultan" , "Ibne Batuta" ,
                "Ibne Khaldoon",  "Muhammad Qasim" , "Mahmood Ghazni" ,"Ismail Jaffar", "Jalaluddin Rumi",
                "Shams Tabrezi" , "Yunus Emre" , "Saadi Sherazi" , "Omar Khayyam" , "Ibn Arabi" ,
                "Sultan Walad", "Ibne Sina" , "Mansur Hallaj" , "Abdul Qadir", "Qasim Firdowsi" ,
                "Muhammad Ghazali" , "Said Narsi" , "Junaid Baghdadi" , "Abu Yazid" , "Shams Udin" ,
                "Sultan Abdal" , "Hasan Basra" , "Hasan Kharaqani" , "Shahab Udin" , "Syekh Siti" ,
                "Makhdoom Baba" , "Imadudin Nasimi", "Bayazid Bastami" , "Sher Shahsuri" , "Bullah Shah" ,
                "Waris Shah" , "Attar Nishapuri" , "Bektash Wali" , "Ibne Alfarid" , "Fazal Wali" ,
                "Akhmet Yassawi" , "Dhulnun Almisri" , "Sultan Ahmet" , "Al Khidr" , "Dhul Qarnayn" ,
                "Jukar Sunami" ,"Pulao Kababi" ,
                "Jannat Khan" , "Shamsher Khan" , "Yusha Adam" , "Mikael Adam" , "Israfeel Adam"

        };

        ListAdapter contactAdapter = new ContactList(this , contactlist);
        //ListAdapter numberAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , numberlist);
        ListView iListView = (ListView) findViewById(R.id.iListView);
        iListView.setAdapter(contactAdapter);

        iListView.setOnItemClickListener(

                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String contactlist = String.valueOf(parent.getItemAtPosition(position));
                        System.out.println("go");

                        Intent myIntent=new Intent(MainActivity.this,ContactDetails.class);
                        myIntent.putExtra("theKey",contactlist);




                        startActivity(myIntent);
                    }
                }
        );



    }
}
