package com.boyma.viewpagercards;


import android.support.v7.widget.CardView;

public interface CardAdapter {

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
