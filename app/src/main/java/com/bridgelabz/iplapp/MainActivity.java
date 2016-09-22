package com.bridgelabz.iplapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Nadimuddin on 20/9/16.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get instance of firebase database project
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        //get reference of JSON object
        DatabaseReference reference = database.getReference();


        //get XML object of RecyclerView
        final RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle_view);

        //initialize layout for RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        //set layout to RecyclerView
        recyclerView.setLayoutManager(layoutManager);

        //set value event listener for firebase reference
        reference.addValueEventListener(new ValueEventListener() {

            /*
             * onDataChange method to read a static snapshot of the contents at given JSON object
             * This method is triggered once when the listener is attached
             * and again every time the data changes.
             */
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                GenericTypeIndicator<ArrayList<PlayerInfo>> type = new GenericTypeIndicator<ArrayList<PlayerInfo>>() {
                };

                ArrayList<PlayerInfo> playerList = dataSnapshot.getValue(type);
                IPLAdapter adapter = new IPLAdapter(playerList);
                recyclerView.setAdapter(adapter);
            }

            //this will called when error occur while getting data from firebase
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        /*createTeamList();
        IPLAdapter adapter = new IPLAdapter(mArrayList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);*/
    }

    /*private void createTeamList()
    {
        mArrayList = new ArrayList<>();
        mArrayList.add(new IPLTeam("Delhi Dare Devils", "GMR Group", "Paddy Upton", "Zaheer Khan", "Delhi", R.drawable.delhi_d));
        mArrayList.add(new IPLTeam("Mumbai Indians", "Reliance Industries, Mukesh Ambani", "Ricky Ponting", "Rohit Sharma", "Mumbai", R.drawable.mumbai_indian));
        mArrayList.add(new IPLTeam("Gujarat Lions", "Intex Technologies", "Brad Hodge", "Suresh Raina", "Gujarat", R.drawable.gujarat_lions));
        mArrayList.add(new IPLTeam("Kings XI Panjab","KPH Dream Cricket Pvt Ltd","Sanjay Bangar", "Murali Vijay", "Panjab", R.drawable.kings_eleven_panjab));

    }*/
}