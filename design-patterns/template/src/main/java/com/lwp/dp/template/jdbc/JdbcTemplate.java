package com.lwp.dp.template.jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author lanwp
 * @Date 2019/3/22
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    protected void closeConnection(Connection conn) throws SQLException {
        if (conn != null){
            conn.close();
        }
    }

    protected PreparedStatement getStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    protected void closeStatement(Statement stm) throws SQLException {
        if (stm != null) {
            stm.close();
        }
    }

    protected void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }

    public List<?> executeQuery(String sql, Object[] values, RowMapper<?> rowMapper) {

        List<?> result = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = this.getConnection();
            pstm = getStatement(conn, sql);
            rs = this.executeQuery(pstm, values);
            result = this.prepareResultSet(rs, rowMapper);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.closeResultSet(rs);
                this.closeStatement(pstm);
                this.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    protected List<?> prepareResultSet(ResultSet rs, RowMapper rowMapper) throws Exception {
        List<Object> list = new ArrayList<>();
        if (rs != null) {
            int row = 0;
            while (rs.next()) {
                list.add(rowMapper.mapRow(rs, row ++));
            }
        }
        return list;
    }

    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

}
