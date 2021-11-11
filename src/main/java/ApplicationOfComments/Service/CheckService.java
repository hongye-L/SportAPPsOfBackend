package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.ClockInDAO;
import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {
    @Autowired
    ClockInDAO clockInDAO;
    public POSTs getTeaching(String nickname){
        return clockInDAO.CheckInTeaching(nickname);
    }
    public POSTs getArts(String nickname){
        return clockInDAO.CheckInArts(nickname);
    }
    public POSTs getSports(String nickname){
        return clockInDAO.CheckInSport(nickname);
    }
}
