package domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class TestStep extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String sys;

    @ExcelProperty(index = 1)
    private String module;

    @ExcelProperty(index = 2)
    private String caseName;

    @ExcelProperty(index = 3)
    private String caseId;

    @ExcelProperty(index = 4)
    private String stepId;

    @ExcelProperty(index = 5)
    private String stepDesc;

    @ExcelProperty(index = 6)
    private String operation;

    @ExcelProperty(index = 7)
    private String param1;

    @ExcelProperty(index = 8)
    private String param2;

    @ExcelProperty(index = 9)
    private String param3;

    @ExcelProperty(index = 10)
    private String xpath;
}
