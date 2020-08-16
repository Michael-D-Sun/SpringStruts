package cn.michael.daoimpl;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> getAll() {
        return this.getSqlSession().selectList("cn.michael.entity.UserMapper.selectAll");
    }
}
