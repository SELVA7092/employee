package com.selva.employee.Repository;

import com.selva.employee.model.Empdetailss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface Savedata extends JpaRepository<Empdetailss,Integer> {
Optional<Empdetailss> findByEmpname(String name);
void deleteByEmpname(String name);
}
