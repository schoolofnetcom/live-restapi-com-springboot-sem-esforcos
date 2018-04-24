package com.schoolofnet.liveRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schoolofnet.liveRestAPI.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
//	Note findByTitle(String title);
}
