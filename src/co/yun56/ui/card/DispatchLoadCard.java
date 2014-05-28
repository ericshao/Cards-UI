package co.yun56.ui.card;

import co.yun56.ui.card.MessageCard;
import com.afollestad.cardsui.Card;

/**
 * Created by eric on 14-5-28.
 */
public class DispatchLoadCard extends MessageCard {
    public DispatchLoadCard(int id, String origin, String destination) {
        super(id, origin + "  " + destination);
    }

    @Override
    public boolean equalTo(Card other) {
        return other instanceof DispatchLoadCard && this.id == ((DispatchLoadCard) other).id;
    }
}
