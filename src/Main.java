import com.synacy.exercise.Contact;
import com.synacy.exercise.Message;
import com.synacy.exercise.MessageType;
import com.synacy.exercise.Messenger;

public class Main {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Contact chuck = new Contact("chuckee", "631234567891", "chuckee.saliente@synacy.com");
        Contact june = new Contact("june", "631234567892", "june.ligan@synacy.com");
        Contact len = new Contact("len", "631234567893", "len.laurito@synacy.com");
        Contact von = new Contact("von", "631234567894", "von.alino@synacy.com");

        messenger.sendMessage(FaxMessage("hello world", chuck));
        messenger.sendMessage(SmsMessage("hello world", june));
        messenger.sendMessage(EmailMessage("hello world", len));
        messenger.sendMessage(VoiceMessage("hello world", von));
    }

    private static Message VoiceMessage(String message, Contact contact) {
        System.out.printf("Sending %s to %s from %s via call\n", message, contact.getPhoneNumber(), contact.getName());
        return MessageType.VOICE;
    }

    private static Message EmailMessage(String message, Contact contact) {
        System.out.printf("Sending %s to %s from %s via email\n", message, contact.getEmailAddress(), contact.getName());
        return MessageType.EMAIL;
    }

    private static Message SmsMessage(String message, Contact contact) {
        System.out.printf("Sending %s to %s from %s via sms\n", message, contact.getPhoneNumber(), contact.getName());
        return MessageType.SMS;
    }

    private static Message FaxMessage(String message, Contact contact) {
        System.out.printf("Sending %s to %s from %s via fax\n", message, contact.getPhoneNumber(), contact.getName());
        return MessageType.FAX;
    }



}
