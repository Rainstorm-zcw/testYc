package com.example.testyc;

import com.example.testyc.mbg.MainGenerator;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成bean配置
 * @author zcw
 * @version 2019-05-08
 */
public class MBGRunner {

    @Test
    public void test(){
        System.out.println("哈哈");
    }

    @Test
    public void run() throws InvalidConfigurationException {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        File configFile = new File(System.getProperty("user.dir") + "/src/test/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MainGenerator myBatisGenerator = new MainGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("Congratulation！");
        } catch (IOException | XMLParserException | SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
