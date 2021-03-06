package com.uniandes.stampidia.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.uniandes.stampidia.model.StmpUser;

public interface UserRepository extends CrudRepository<StmpUser,Integer>{

	@Override
    public StmpUser save(StmpUser s);

    @Override
    StmpUser findOne(Integer integer);
    
    @Query(value="select s from StmpUser s where s.username = :username ") 
	StmpUser findUserByName(@Param("username") String username);
}
