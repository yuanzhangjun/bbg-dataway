package com.bbg.bbgdataway;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author 袁张峻
 * @email yuanzhangjun@bubugao.com
 * @date 2020/11/17
 */
@DimModule
@Component
public class ExampleModule implements SpringModule {
    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("primaryDatasource")
    private DataSource primaryDatasource;

    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable {
        // .DataSource form Spring boot into Hasor
        // 元数据源
        apiBinder.installModule(new JdbcModule(Level.Full, this.dataSource));
        // 主要查询数据源
        apiBinder.installModule(new JdbcModule(Level.Full, "primaryDatasource", this.primaryDatasource ));
    }
}
