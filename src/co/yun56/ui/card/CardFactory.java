package co.yun56.ui.card;

import com.afollestad.cardsui.Card;
import com.afollestad.sample.LoadData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 14-5-27.
 */
public class CardFactory {

    public List<Card> getCards(List<CardData> dataList){
        List<Card> cardList = new ArrayList<Card>();

        for (CardData cardData : dataList) {
            LoadData loadData = (LoadData)cardData;
            Card card = getCard(loadData);

            cardList.add(card);
        }


        return cardList;
    }

    public Card getCard(CardData cardData){



            LoadData loadData = (LoadData)cardData;
            Card card = null;
            switch (cardData.getCardType()) {
                case 1:
                    ContainerLoadCard containerLoadCard = new ContainerLoadCard(loadData.getLoadId(), loadData.getOrigin(), loadData.getDestination());
                    containerLoadCard.setContainerType(loadData.getContainerType());
                    card = containerLoadCard;
                    break;
                case 2:
                    FullTruckLoadCard fullTruckLoadCard = new FullTruckLoadCard(loadData.getLoadId(), loadData.getOrigin(), loadData.getDestination());
                    fullTruckLoadCard.setLoadWeight(loadData.getAmount());
                    card = fullTruckLoadCard;
                    break;
                default:
                    card = new Card("default card");
            }
        return card;
    }
}
