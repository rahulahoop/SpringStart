package com.startup.bhonsale.rahul.startup.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class PersistenceConfig extends BasePersistenceConfig {

    private static final String DATABASE_PLACEHOLDER = "database";
    public static final String PROPERTY_FILE_PATH = "file.path";

    private static final Logger LOG = LoggerFactory.getLogger(PersistenceConfig.class);


    @Override
    public DataSource dataSource() {
        return null;
    }

    @Override
    protected Properties getHibernateProperties() {
        return null;
    }
}
