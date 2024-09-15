package com.prachex.dummyproject1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//it is generic - entity and long id
@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long>
{
    
    
}
