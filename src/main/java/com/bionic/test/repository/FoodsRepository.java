package com.bionic.test.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bionic.test.dto.FoodsDTO;

@Repository
public interface FoodsRepository extends CrudRepository<FoodsDTO, UUID> {
    Optional<FoodsDTO> findById(UUID id);
}
