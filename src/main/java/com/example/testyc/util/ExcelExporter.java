package com.example.testyc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author zcw
 * @date 2019-12-16
 * @description excel导出
 */
@Component
public class ExcelExporter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelExporter.class);
    private static final String EXCEL_NAME = "excelName";
    private static final String DEFAULT_EXCEL_NAME = "数据导出";
    private static final String HEADERS = "headers";
    private static final String LINES = "lines";
    private static final String HEADER_DATA = "headerData";
    private static final String SHEETS = "sheets";
    private static final String SHEETS_NAME = "sheetName";
    private static final String KEY = "key";
    private static final String NAME = "name";


    public static void export(HttpServletRequest request, HttpServletResponse response, Map<String,Object> data){

    }
}
