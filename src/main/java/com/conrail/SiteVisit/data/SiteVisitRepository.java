package com.conrail.SiteVisit.data;

import com.conrail.SiteVisit.models.SiteVisit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteVisitRepository extends CrudRepository<SiteVisit, Integer> {





}
