package doc.service.notifServices;

import org.springframework.stereotype.Service;

@Service
public interface Sender {
    void send(String to, String ffrom, String core, String subj, String host) ;
}
