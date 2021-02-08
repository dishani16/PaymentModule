package com.cg.main.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	//query to get status and id from payment table
    @Query(nativeQuery =true, value = "select status, id from payment_table p")
	List<Object[]> findAllStatus();
	//query to get status and id from payment table based on id
    @Query(nativeQuery =true, value = "select status from payment_table p where p.id=:id")
	Object findStatusById(@Param("id") int id);

}
