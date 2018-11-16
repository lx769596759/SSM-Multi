package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Dome", description = "人员pojo")
public class Dome {

    // 字段注解
    @ApiModelProperty(value = "姓名", name = "name", required = true, example = "张珊")
    private String name;

    // 字段注解
    @ApiModelProperty(value = "年龄", name = "name", required = true, example = "20")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "dome{" +
                "userName='" + name + '\'' +
                ", password='" + age + '\'' +
                '}';
    }
}

