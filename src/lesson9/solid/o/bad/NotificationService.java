package lesson9.solid.o.bad;

public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if ("email".equals(typeMessage)) {
            //write email
            //use JavaMailSenderAPI

        }

        if ("sms".equals(typeMessage)) {
            //write sms
            //send sms

        }
    }
}
