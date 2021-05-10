import com.zbchht.service.SpeakerService;
import com.zbchht.service.SpeakerServiceImpl;

public class Application {

    public static void main(String argsp[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
