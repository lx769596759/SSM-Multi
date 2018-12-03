package serviceimp;

import domain.Dome;
import domain.TestStep;
import mapper.DomeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TestService;
import utils.ExcelHelper;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    public static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private DomeMapper domeMapper;

    @Override
    public String getNameAndAge() {
        //String filePath = "E:\\test.xlsx";
        String filePath = "E:\\BMSNZBillMainProcess.xls";
        List<Object> list = ExcelHelper.simpleReadListString(filePath,1,1);
        List<Object> list2 = ExcelHelper.simpleReadJavaModel(filePath,1,1,TestStep.class);

        try {
            ExcelHelper.writeExcel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println(list2);

        Dome dome = domeMapper.getNameAndAge();
        Dome dome2 = domeMapper.selectAll();
        logger.info("Service log : " + dome);
        return  dome.toString();
    }
}
