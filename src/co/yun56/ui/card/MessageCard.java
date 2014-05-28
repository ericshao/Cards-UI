package co.yun56.ui.card;

import com.afollestad.cardsui.Card;

import java.util.List;

/**
 * Created by eric on 14-5-27.
 */
public class MessageCard extends Card{
    protected int id;
    protected String postTimestamp;
    protected String footNote;

    private Message lastMessage;
    private List<Contact> responders;

    private String actionTitle;
    private ActionListener mCallback;

    public MessageCard(int id, String title) {
        super(title);
        this.id = id;
    }

    public MessageCard setPostTimestamp(long timestamp) {
        //postTimestamp = timestamp;
        return this;
    }

    public String getPostTimestamp() {
        return postTimestamp;
    }

    public MessageCard setLastMessage(Message message) {
        this.lastMessage = message;
        return this;
    }

    public Message getLastMessage() {
        return lastMessage;
    }

    public MessageCard setFootNote(String footNote) {
        this.footNote = footNote;
        return this;
    }

    public String getFootNote() {
        return footNote;
    }

    public MessageCard setAction(ActionListener callback) {
        mCallback = callback;
        return this;
    }

    public MessageCard setAction(String title, ActionListener callback) {
        actionTitle = title;
        mCallback = callback;
        return this;
    }

    @Override
    public String getActionTitle() {
        return actionTitle;
    }



    public interface ActionListener {
        public void onClick(MessageCard messageCard);
    }

    public class Message {
        private String sender;
        private String body;
        private boolean unread;

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public boolean isUnread() {
            return unread;
        }

        public void setUnread(boolean unread) {
            this.unread = unread;
        }
    }

    public class Contact {
        private int contactId;
        private String avatar;
        private String name;

        public int getContactId() {
            return contactId;
        }

        public void setContactId(int contactId) {
            this.contactId = contactId;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

