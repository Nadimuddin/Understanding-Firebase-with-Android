package com.bridgelabz.iplapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Nadimuddin on 21/9/16.
 */
public class ComponentHolder extends RecyclerView.ViewHolder
{
    RelativeLayout layout;
    TextView playerName;
    TextView batting;
    TextView bowling;
    TextView dOB;
    TextView nationality;
    TextView role;

    public ComponentHolder(View view) {
        super(view);
        //getting XML object
        layout = (RelativeLayout)view.findViewById(R.id.container);
        playerName = (TextView)view.findViewById(R.id.playerName);
        batting = (TextView)view.findViewById(R.id.batting);
        bowling = (TextView)view.findViewById(R.id.bowling);
        dOB = (TextView)view.findViewById(R.id.dOB);
        nationality = (TextView)view.findViewById(R.id.nationality);
        role = (TextView)view.findViewById(R.id.role);
    }
}