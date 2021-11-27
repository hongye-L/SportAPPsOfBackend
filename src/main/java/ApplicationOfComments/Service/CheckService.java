package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.ClockInDAO;
import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Check service.
 */
@Service
public class CheckService {
    /**
     * The Clock in dao.
     */
    @Autowired
    ClockInDAO clockInDAO;

    /**
     * Get teaching pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs getTeaching(String nickname){
        return clockInDAO.CheckInTeaching(nickname);
    }

    /**
     * Get arts pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs getArts(String nickname){
        return clockInDAO.CheckInArts(nickname);
    }

    /**
     * Get sports pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs getSports(String nickname){
        return clockInDAO.CheckInSport(nickname);
    }
}
