/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.tables;


import com.example.demo.db.Indexes;
import com.example.demo.db.Keys;
import com.example.demo.db.Test;
import com.example.demo.db.tables.records.MobileRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 全国手机号码段归属地
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mobile extends TableImpl<MobileRecord> {

    private static final long serialVersionUID = -365949846;

    /**
     * The reference instance of <code>test.mobile</code>
     */
    public static final Mobile MOBILE = new Mobile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MobileRecord> getRecordType() {
        return MobileRecord.class;
    }

    /**
     * The column <code>test.mobile.id</code>. 主键
     */
    public final TableField<MobileRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>test.mobile.phone</code>. 手机号码段
     */
    public final TableField<MobileRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.CHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "手机号码段");

    /**
     * The column <code>test.mobile.province</code>. 省份
     */
    public final TableField<MobileRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.CHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "省份");

    /**
     * The column <code>test.mobile.city</code>. 市
     */
    public final TableField<MobileRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.CHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "市");

    /**
     * The column <code>test.mobile.service_provider</code>. 运营商
     */
    public final TableField<MobileRecord, String> SERVICE_PROVIDER = createField("service_provider", org.jooq.impl.SQLDataType.CHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "运营商");

    /**
     * The column <code>test.mobile.city_code</code>. 区号
     */
    public final TableField<MobileRecord, String> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.CHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "区号");

    /**
     * The column <code>test.mobile.postcode</code>. 邮编
     */
    public final TableField<MobileRecord, String> POSTCODE = createField("postcode", org.jooq.impl.SQLDataType.CHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "邮编");

    /**
     * Create a <code>test.mobile</code> table reference
     */
    public Mobile() {
        this(DSL.name("mobile"), null);
    }

    /**
     * Create an aliased <code>test.mobile</code> table reference
     */
    public Mobile(String alias) {
        this(DSL.name(alias), MOBILE);
    }

    /**
     * Create an aliased <code>test.mobile</code> table reference
     */
    public Mobile(Name alias) {
        this(alias, MOBILE);
    }

    private Mobile(Name alias, Table<MobileRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mobile(Name alias, Table<MobileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("全国手机号码段归属地"));
    }

    public <O extends Record> Mobile(Table<O> child, ForeignKey<O, MobileRecord> key) {
        super(child, key, MOBILE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MOBILE_PHONE, Indexes.MOBILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MobileRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MobileRecord> getPrimaryKey() {
        return Keys.KEY_MOBILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MobileRecord>> getKeys() {
        return Arrays.<UniqueKey<MobileRecord>>asList(Keys.KEY_MOBILE_PRIMARY, Keys.KEY_MOBILE_PHONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mobile as(String alias) {
        return new Mobile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mobile as(Name alias) {
        return new Mobile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mobile rename(String name) {
        return new Mobile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mobile rename(Name name) {
        return new Mobile(name, null);
    }
}
