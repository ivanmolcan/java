package sk.ivanmolcan.udemy.entityrelationship.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Injection do springu, aby spring tuto triedu inicioval. Service,component a repository funguju podobne.
// Staci len jedno. V podstate ide len, ktora terminologia sa lepsie hodi
@Service
@Component
@Repository
public class DataCleansingService {

    public DataCleansingService() {
    }
}
