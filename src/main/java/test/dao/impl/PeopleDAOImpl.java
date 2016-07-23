package test.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import test.dao.IPeopleDAO;
import test.model.People;

/**
 * Created by mingxin on 16/7/23.
 */
public class PeopleDAOImpl implements IPeopleDAO {


    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public People getPeopleById(long id) {
        return (People) sqlSessionTemplate.selectOne("test.mapper.PeopleMapper.selectPeopleById", id);
    }
}
