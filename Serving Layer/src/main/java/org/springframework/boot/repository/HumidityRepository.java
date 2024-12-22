

package org.springframework.boot.repository;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.boot.entity.Humidity;

import java.util.Date;
import java.util.UUID;


@Repository
public interface HumidityRepository extends CassandraRepository<Humidity,UUID>{
	
	@Query("SELECT * FROM sensordatakeyspace.humidity WHERE timestamp > ?0 ALLOW FILTERING")
	 Iterable<Humidity> findHumidityByDate(Date date);

}