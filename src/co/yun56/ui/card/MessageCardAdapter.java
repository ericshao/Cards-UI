package co.yun56.ui.card;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.afollestad.cardsui.Card;
import com.afollestad.cardsui.CardAdapter;
import com.afollestad.cardsui.R;

/**
 * Created by eric on 14-5-27.
 */
public class MessageCardAdapter extends CardAdapter<Card> {

    public MessageCardAdapter(Context context) {
        super(context, 0);
        registerLayout(R.layout.list_item_card_container_load);
        registerLayout(R.layout.list_item_card_full_truck_load);
    }


    @Override
    protected boolean onProcessTitle(TextView title, Card card, int accentColor) {
        return super.onProcessTitle(title, card, accentColor);
    }

    @Override
    protected boolean onProcessContent(TextView content, Card card) {
        return super.onProcessContent(content, card);
    }

    @Override
    public View onViewCreated(int index, View recycled, Card card) {

        TextView title = (TextView) recycled.findViewById(android.R.id.title);
        if (title != null) onProcessTitle(title, card, mAccentColor);

        LinearLayout layLastMessage = (LinearLayout) recycled.findViewById(R.id.last_message);
        if (layLastMessage != null) onProcessLastMessage(recycled, card);

        switch (card.getLayout()){
            case R.layout.list_item_card_container_load:
                 onProcessContainerLoad(recycled, card);
                break;
            case R.layout.list_item_card_full_truck_load:
                onProcessFullTruckLoad(recycled, card);
                break;

        }


        return recycled;
    }

    @Override
    protected boolean onProcessThumbnail(ImageView icon, Card card) {
        return super.onProcessThumbnail(icon, card);
    }

    @Override
    protected boolean onProcessMenu(View view, Card card) {
        return super.onProcessMenu(view, card);
    }

    private boolean onProcessLastMessage(View view, Card card) {
        if (!(card instanceof MessageCard)) return false;
        MessageCard messageCard = (MessageCard)card;
        TextView sender = (TextView) view.findViewById(R.id.message_sender);
        //if (sender != null)
            //sender.setText(messageCard.getLastMessage().getSender());
        return true;
    }

    private boolean onProcessContainerLoad(View view, Card card) {
        TextView containerType = (TextView) view.findViewById(R.id.container_type);
        ContainerLoadCard containerLoadCard = (ContainerLoadCard)card;
        if (containerType != null)
            containerType.setText(containerLoadCard.getContainerType()+"");
        return true;
    }

    private boolean onProcessFullTruckLoad(View view, Card card) {
        TextView loadWeight = (TextView) view.findViewById(R.id.load_weight);
        FullTruckLoadCard fullTruckLoadCard = (FullTruckLoadCard)card;
        if (loadWeight != null)
            loadWeight.setText(fullTruckLoadCard.getLoadWeight()+"吨");
        return true;
    }
}
