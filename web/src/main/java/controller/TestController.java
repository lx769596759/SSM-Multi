package controller;

import common.response.Response;
import common.response.ResponseHelper;
import domain.Goods;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import service.TestService;

@Controller
@RequestMapping("/test")
@Api(description = "测试接口")
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ApiOperation(value = "查询用户", notes = "查询用户详细信息，姓名+年龄", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response helloWorld() {
        String userInfo = testService.getNameAndAge();

        Goods goods = new Goods();
        goods.setName("辣条");
        goods.setPrice("4.5元");
        System.out.println(goods.toString());
        return ResponseHelper.buildOk(userInfo);
    }
}
