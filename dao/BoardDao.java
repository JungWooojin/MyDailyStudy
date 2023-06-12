package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private MyConnection mc;

    public BoardDao() {
        mc = new MyConnection();
    }

    public int insBoard(BoardEntity entity) {
        int result = 0;
        String sql = "Insert into t_board\n" +
                "SET title = ?" +
                ", ctnt = ?" +
                ", iuser = ?";


        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnt());
            ps.setInt(3, entity.getIuser());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }//스택형식으로 순차적으로 밖에서부터 닫아주어야한다.


        }
        return result;
    }

    public List<BoardVo> selBoard(BoardSelDto dto) {
        List<BoardVo> list = new ArrayList<>();
        String sql = "select A.iboard,A.title,A.created_at createdAt,B.nm writer,B.main_pic writerMainPic\n" +
                "        from t_board A\n" +
                "        inner join t_user B\n" +
                "        on A.iuser=B.iuser\n" +
                "        order by iboard desc\n" +
                "        limit ? , ?";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIdx());
            ps.setInt(2, dto.getRow());
            rs = ps.executeQuery();

            while (rs.next()) { // rs.next는 커서가 넥스트호출하는순간 젤첫번째 레코드를 선택 boolean타입만 가능
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String createdAt = rs.getString("createdAt");
                String writer = rs.getString("writer");
                String writerMainPic = rs.getString("writerMainPic");

                BoardVo vo = new BoardVo(iboard, title, createdAt, writer, writerMainPic);
                list.add(vo);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return list;
    }

    public BoardDetailVo selBoardDetail(BoardSelDto dto) {
        String sql = "select A.iboard,A.title,A.ctnt,A.created_at createdAt,B.nm writer,B.main_pic writerMainPic\n" +
                "        from t_board A\n" +
                "        inner join t_user B\n" +
                "        on A.iuser=B.iuser\n" +
                "        where iboard = ?";
        BoardDetailVo vo = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIboard());
            rs = ps.executeQuery();

            if (rs.next()) { // rs.next는 커서가 넥스트호출하는순간 젤첫번째 레코드를 선택 boolean타입만 가능
                int iboard = rs.getInt("iboard");

                String title = rs.getString("title");
                String ctnt = rs.getString("ctnt");
                String createdAt = rs.getString("createdAt");
                String writer = rs.getString("writer");
                String writerMainPic = rs.getString("writerMainPic");
                vo = new BoardDetailVo(iboard, title, ctnt, createdAt, writer, writerMainPic);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return vo;
    }

    ;

    public int updBoard(BoardUpdDto dto) {
        int result = 0;
        String sql = "update t_board\n" +
                "SET title = ?" +
                ", ctnt = ?" +
                "where iboard = ? and iuser = ?";


        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getTitle());
            ps.setString(2, dto.getCtnt());
            ps.setInt(3, dto.getIboard());
            ps.setInt(4, dto.getIuser());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }//스택형식으로 순차적으로 밖에서부터 닫아주어야한다.


        }
        return result;
    }

}
