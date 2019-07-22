package com.boyma.viewpagercards;


import androidx.cardview.widget.CardView;

public interface CardAdapter {

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
