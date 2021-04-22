package org.ignite.graphQL.repository;

import org.ignite.graphQL.domain.TechTalk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IgniteTalkRepository extends JpaRepository<TechTalk,Long> {

}
