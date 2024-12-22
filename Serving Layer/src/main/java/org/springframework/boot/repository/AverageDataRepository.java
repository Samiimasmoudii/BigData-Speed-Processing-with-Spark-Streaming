
package org.springframework.boot.repository;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.boot.entity.AverageData;


@Repository
public interface AverageDataRepository extends CassandraRepository<AverageData,String>{
	
	@Query("SELECT * FROM sensordatakeyspace.averagedata")
	 AverageData find();
	

}