package com.example.demo.web;

import com.example.demo.db.Tables;
import com.example.demo.db.tables.Mobile;
import com.example.demo.db.tables.records.MobileRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.List;

/**
 * HomeController class
 *
 * @author gexc
 * @date 2019/06/11
 */
@RestController
public class HomeController {

    @Autowired DSLContext dsl;

    @GetMapping("/")
    public String index() {
        return "@index";
    }

    @GetMapping("/m")
    public Object mobiles() {
//        ResultSet rs = dsl.selectFrom(Tables.MOBILE).limit(3).fetchResultSet();
//        MobileRecord mobile = dsl.selectFrom(Tables.MOBILE).limit(1).fetchOne();
//        Result<MobileRecord> result = dsl.selectFrom(Tables.MOBILE).limit(3).fetch();
        Result<MobileRecord> result = dsl.selectFrom(Tables.MOBILE).fetch();
        return result.formatJSON();
    }
}
