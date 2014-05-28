package co.yun56.ui.card;

import co.yun56.ui.card.MessageCard;
import com.afollestad.cardsui.Card;
import com.afollestad.cardsui.R;

/**
 * Created by eric on 14-5-27.
 */
public class ContainerLoadCard extends MessageCard {
    private int containerType;

    public ContainerLoadCard(int id, String origin, String destination) {
        super(id, origin + "  " + destination);
    }

    public int getContainerType() {
        return containerType;
    }

    public void setContainerType(int containerType) {
        this.containerType = containerType;
    }

    @Override
    public int getLayout() {
        return R.layout.list_item_card_container_load;
    }

    @Override
    public boolean equalTo(Card other) {
        return other instanceof ContainerLoadCard && this.id == ((ContainerLoadCard) other).id;
    }
}
