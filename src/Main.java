import com.synacy.exercise.Contact;
import com.synacy.exercise.MessageType;
import com.synacy.exercise.Messenger;

public class Main {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Contact chuck = new Contact("chuckee", "631234567891", "chuckee.saliente@synacy.com");
        Contact june = new Contact("june", "631234567892", "june.ligan@synacy.com");
        Contact len = new Contact("len", "631234567893", "len.laurito@synacy.com");
        Contact von = new Contact("von", "631234567894", "von.alino@synacy.com");

        messenger.sendMessage("hello world", chuck, MessageType.FAX);
        messenger.sendMessage("hello world", june, MessageType.SMS);
        messenger.sendMessage("hello world", len, MessageType.EMAIL);
        messenger.sendMessage("hello world", von, MessageType.VOICE);
    }
}
