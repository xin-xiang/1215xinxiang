package com.xinxiang.dao;

import com.xinxiang.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{
    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        String sql = "insert into usertable values(?,?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, user.getId());
        st.setString(2, user.getUsername());
        st.setString(3, user.getPassword());
        st.setString(4, user.getEmail());
        st.setString(5, user.getGender());
        st.setString(6, user.getBirthday());
        st.executeUpdate();
        return true;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        String sql="delete from usertable where id=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,user.getId());
        st.executeUpdate();
        return 1;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        String sql="update usertable set username=?,password=?,email=?,gender=?,birthday=? where id=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,user.getUsername());
        st.setString(2,user.getPassword());
        st.setString(3, user.getEmail());
        st.setString(4, user.getGender());
        st.setString(5,user.getBirthday());
        st.setInt(6,user.getId());
        st.executeUpdate();
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        String sql = "select * from usertable where id=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setInt(1, id);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return user;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {

        String sql = "select * from usertable where username=? and password=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        String sql = "select * from usertable where username=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setString(1, username);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }
        return (List<User>) user;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        String sql = "select * from usertable where password=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setString(1,password);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        String sql = "select * from usertable where email=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setString(1,email);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        String sql = "select * from usertable where gender=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setString(1,gender);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findByBirthday(Connection con, Date birthday) throws SQLException {
        String sql = "select * from usertable where birthday=?";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        st.setDate(1, (java.sql.Date) birthday);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return (List<User>) user;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        String sql = "select * from usertable";
        PreparedStatement st;
        ResultSet rs;
        st = con.prepareStatement(sql);
        rs = st.executeQuery();
        User user=null;
        if (rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthday(String.valueOf(rs.getDate("birthday")));
        }

        return (List<User>) user;
    }
}
