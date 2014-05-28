package co.yun56.ui.card;

import co.yun56.ui.card.MessageCard;
import com.afollestad.cardsui.Card;
import com.afollestad.cardsui.R;

/**
 * Created by eric on 14-5-27.
 */
public class FullTruckLoadCard extends MessageCard {

    private double loadWeight;

    public FullTruckLoadCard(int id, String origin, String destination) {
        super(id, origin + "  " + destination);
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public int getLayout() {
        return R.layout.list_item_card_full_truck_load;
    }

    @Override
    public boolean equalTo(Card other) {
        return other instanceof FullTruckLoadCard && this.id == ((FullTruckLoadCard) other).id;
    }
}
