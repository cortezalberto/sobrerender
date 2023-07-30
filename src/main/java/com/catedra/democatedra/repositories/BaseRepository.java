package com.catedra.democatedra.repositories;

import com.catedra.democatedra.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}

