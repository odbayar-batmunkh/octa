package mn.octagon.userservice.service;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

import static database.Tables.TESTLEGDEEL;

@Service
public class DslProvider {

    DataSource defaultDataSource;
    DSLContext ctx;


    //creates connection between service and database using default data source configured in properties
    public DSLContext dslProvider() {
        Configuration configuration = new DefaultConfiguration().set(defaultDataSource).set(SQLDialect.POSTGRES);
        DSLContext create = DSL.using(configuration);
        return create;
    }

    //to select from specific tables it is quite simple you only need to convert normal SQL to function
    public void selectSample(){
        ctx.select().from(TESTLEGDEEL).fetch();
    }



}
