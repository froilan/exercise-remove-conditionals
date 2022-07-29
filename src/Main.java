import com.synacy.exercise.*;
import com.synacy.exercise.Medium.EmailMessage;
import com.synacy.exercise.Medium.FaxMessage;
import com.synacy.exercise.Medium.SmsMessage;
import com.synacy.exercise.Medium.VoiceMessage;

public class Main {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Contact chuck = new Contact("chuckee", "631234567891", "chuckee.saliente@synacy.com");
        Contact june = new Contact("june", "631234567892", "june.ligan@synacy.com");
        Contact len = new Contact("len", "631234567893", "len.laurito@synacy.com");
        Contact von = new Contact("von", "631234567894", "von.alino@synacy.com");

        messenger.sendMessage(new FaxMessage("hello world", chuck));
        messenger.sendMessage(new SmsMessage("hello world", june));
        messenger.sendMessage(new EmailMessage("hello world", len));
        messenger.sendMessage(new VoiceMessage("hello world", von));
    }



}
