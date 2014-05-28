package com.afollestad.sample;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import co.yun56.ui.card.CardData;
import co.yun56.ui.card.CardFactory;
import co.yun56.ui.card.MessageCardAdapter;
import com.afollestad.cardsui.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 14-5-27.
 */
public class MainActivity extends Activity implements Card.CardMenuListener<Card> {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        // This is quick way of theming the action bar without using styles.xml (e.g. using ActionBar Style Generator)
        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.holo_blue_dark)));
        getActionBar().setDisplayShowHomeEnabled(false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        final CardFactory cardFactory =  new CardFactory();

        // Initializes a CardAdapter with a blue accent color and basic popup menu for each card
        //CardAdapter<Card> cardsAdapter = new CardAdapter<Card>(this, 0)

        //        .setPopupMenu(R.menu.card_popup, this); // the popup menu callback is this activity

        final CardAdapter<Card> cardsAdapter = new MessageCardAdapter(this)
                    .setPopupMenu(R.menu.card_popup,this);

        CardListView cardsList = (CardListView) findViewById(R.id.cardsList);
        cardsList.setAdapter(cardsAdapter);
        cardsList.setOnCardClickListener(new CardListView.CardClickListener() {
            @Override
            public void onCardClick(int index, CardBase card, View view) {
                LoadData containerLoadData = new LoadData();
                containerLoadData.setLoadId(100);
                containerLoadData.setType(1);
                containerLoadData.setOrigin("苏州");
                containerLoadData.setDestination("太仓港");
                containerLoadData.setContainerType(3);

                //cardsAdapter.add(cardFactory.getCard(containerLoadData));
                if (index == 0) {
                   // startActivity(new Intent(MainActivity.this, CustomActivity.class));
                    cardsAdapter.add(cardFactory.getCard(containerLoadData));
                }
                else if (index == 1) {
                    cardsAdapter.update(cardFactory.getCard(containerLoadData), false);
                }
            }
        });
/*
        cardsAdapter.add(new Card("View a custom adapter's cards")
                .setPopupMenu(-1, null)); // disables the popup menu set to the adapter for this card
        cardsAdapter.add(new CardHeader("Week Days"));
        cardsAdapter.add(new Card("Wednesday", "Hump day!"));
        cardsAdapter.add(new Card("Friday", "We made it!"));

        cardsAdapter.add(new CardHeader("Countries")
                // The action text here is set to a string resource, if you don't specify a context and/or string the default "See More" is used
                .setAction(this, R.string.what_else, new CardHeader.ActionListener() {
                    @Override
                    public void onClick(CardHeader header) {
                        Toast.makeText(getApplicationContext(), header.getActionTitle(), Toast.LENGTH_SHORT).show();
                    }
                }));
        cardsAdapter.add(new CardCenteredHeader("Nothing to see here"));

        cardsAdapter.add(new CardHeader("Companies", "The world's top tech businesses."));
        cardsAdapter.add(new Card("Google", "Android is the best!")
                .setThumbnail(this, R.drawable.android)  // sets a thumbnail image from drawable resources
                .setPopupMenu(-1, null));
        cardsAdapter.add(new Card("Microsoft", "We're trying.")
                .setThumbnail(this, R.drawable.wp)
                .setPopupMenu(-1, null));
        cardsAdapter.add(new Card("Apple", "Steve Jobs")
                .setPopupMenu(-1, null));
*/
        LoadData containerLoadData = new LoadData();
        containerLoadData.setLoadId(100);
        containerLoadData.setType(1);
        containerLoadData.setOrigin("苏州工业园");
        containerLoadData.setDestination("洋山港");
        containerLoadData.setContainerType(3);

        LoadData fullTruckLoadData = new LoadData();
        fullTruckLoadData.setLoadId(200);
        fullTruckLoadData.setType(2);
        fullTruckLoadData.setOrigin("宁波");
        fullTruckLoadData.setDestination("东莞");
        fullTruckLoadData.setAmount(36);

        List<CardData> cardDataList = new ArrayList<CardData>();
        cardDataList.add(containerLoadData);
        cardDataList.add(fullTruckLoadData);


        cardsAdapter.add(cardFactory.getCards(cardDataList));

    }

    @Override
    public void onMenuItemClick(Card card, MenuItem item) {

    }
}