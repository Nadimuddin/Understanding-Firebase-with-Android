package com.bridgelabz.iplapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Nadimuddin on 20/9/16.
 */
public class IPLAdapter extends RecyclerView.Adapter<ComponentHolder>
{
    private static final String TAG = "IPLAdapter";

    //ArrayList for where player's info stored
    ArrayList<PlayerInfo> mArrayList;

    //constructor to get ArrayList of PlayerInfo
    public IPLAdapter(ArrayList<PlayerInfo> arrayList)
    {
        mArrayList = arrayList;
    }

    @Override
    public ComponentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ComponentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ComponentHolder holder, int position)
    {
        Log.d(TAG, "onBindViewHolder() called with: " + "holder = [" + holder + "], position = [" + position + "]");
        PlayerInfo team = mArrayList.get(position);
        holder.layout.setBackgroundResource(team.getLogoId());
        holder.playerName.setText(team.getPlayerName());
        holder.batting.setText(team.getBatting());
        holder.bowling.setText(team.getBowling());
        holder.dOB.setText(team.getDOB());
        holder.nationality.setText(team.getNationality());
        holder.role.setText(team.getRole());
    }

    //get size of list of players
    @Override
    public int getItemCount()
    {
        return mArrayList.size();
    }
}