package controller;

import common.response.Response;
import common.response.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)

    public Response helloWorld() {
        String userInfo = testService.getNameAndAge();
        return ResponseHelper.buildOk(userInfo);
    }
}
