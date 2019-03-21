package com.lwp.dp.template.jdbc;

import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
@FunctionalInterface
public interface RowMapper<T> {
    T mapRow(ResultSet var1, int var2) throws Exception;
}
