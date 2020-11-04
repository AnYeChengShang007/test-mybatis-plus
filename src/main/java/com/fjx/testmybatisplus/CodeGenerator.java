package com.fjx.testmybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

//代码自动生成器
public class CodeGenerator {

    public static void main(String[] args) {
        //构建一个代码自动生成器对象
        AutoGenerator mpg = new AutoGenerator();

        //1、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projPath = System.getProperty("user.dir");
        gc.setOutputDir(projPath+"/src/main/java");
        gc.setAuthor("冯金星");
        gc.setOpen(false);
        gc.setFileOverride(false);//是否覆盖
        gc.setServiceName("%sService");//去service的I前缀
        gc.setIdType(IdType.ASSIGN_ID);//设置id类型
        gc.setDateType(DateType.ONLY_DATE);//设置日期类型
        mpg.setGlobalConfig(gc);

        //设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql:///mybatis_plus?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        //配置包的配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("diy");
        packageConfig.setParent("com.fjx.testmybatisplus");
        packageConfig.setEntity("pojo");//实体类的包名
        packageConfig.setMapper("mapper");//mapper的包名
        packageConfig.setService("service");//servie的包名
        packageConfig.setController("controller");//controller的包名
        mpg.setPackageInfo(packageConfig);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("user");//设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);//命名规则
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//同上
        strategy.setLogicDeleteFieldName("deleted");//逻辑删除
//        strategy.setEntityLombokModel(true);   lombok

        //自动填充
        TableFill create_time = new TableFill("create_time", FieldFill.INSERT);
        TableFill update_time = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> list = new ArrayList<>();
        list.add(create_time);
        list.add(update_time);
        strategy.setTableFillList(list);
        strategy.setVersionFieldName("version");//乐观锁
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);//
        mpg.setStrategy(strategy);
        mpg.execute();//执行
    }
}
