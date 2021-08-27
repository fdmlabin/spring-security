package com.damlabin.springsecurity.repository;

import com.damlabin.springsecurity.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Optional<Authority> findByName(String name);

    Authority findOneByName(String name);
}
