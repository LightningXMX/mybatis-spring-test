package test.mapper;

import test.model.People;

import java.util.List;

/**
 * Created by mingxin on 16/7/13.
 */
public interface PeopleMapper {

    People selectPeopleById(long id);

    People selectPeopleById2(long id);

    int insertPeople(People people);
    long insertPeople2(People people);


    int batchInsertPeople(List<People> peopleList);

    int deletePeople(Long id);

}
