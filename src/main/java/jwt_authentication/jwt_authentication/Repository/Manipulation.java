package jwt_authentication.jwt_authentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import jwt_authentication.jwt_authentication.Entities.FieldNames;

@Repository
public interface Manipulation extends JpaRepository<FieldNames, Long> {
  
}

