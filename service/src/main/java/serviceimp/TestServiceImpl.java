package serviceimp;

import domain.Dome;
import mapper.DomeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TestService;

@Service
public class TestServiceImpl implements TestService {
    public static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private DomeMapper domeMapper;

    @Override
    public String getNameAndAge() {
        Dome dome = domeMapper.getNameAndAge();
        Dome dome2 = domeMapper.selectAll();
        logger.info("Service log : " + dome);
        return  dome.toString();
    }
}
