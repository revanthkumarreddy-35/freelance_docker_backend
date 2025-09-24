package com.freelancer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freelancer.Entity.Attachments;

@Repository
public interface AttachmentsRepository extends JpaRepository<Attachments, Long> {
}
