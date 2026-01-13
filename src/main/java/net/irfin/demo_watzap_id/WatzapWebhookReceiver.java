package net.irfin.demo_watzap_id;

import net.irfin.demo_watzap_id.dto.WatzapIncomingChatDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WatzapWebhookReceiver {

    @PostMapping
    public void receiveRequest(WatzapIncomingChatDto dto) {
        System.out.println("Received webhook:");
        System.out.println("Type: " + dto.getType());
        System.out.println("Chat ID: " + dto.getData().getChatId());
        System.out.println("Message ID: " + dto.getData().getMessageId());
        System.out.println("Name: " + dto.getData().getName());
        System.out.println("Profile Picture: " + dto.getData().getProfilePicture());
        System.out.println("Timestamp: " + dto.getData().getTimestamp());
        System.out.println("Message Body: " + dto.getData().getMessageBody());
    }
}
