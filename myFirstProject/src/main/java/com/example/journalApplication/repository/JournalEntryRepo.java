package com.example.journalApplication.repository;

import com.example.journalApplication.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, String>{

    Optional<JournalEntry> findById(ObjectId id);

    void deleteById(ObjectId id);
}
