package com.example.logsystem.services;

import com.example.logsystem.entities.Log;
import com.example.logsystem.message.LogMessage;
import com.example.logsystem.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogService {
    @Autowired
    private LogRepository repoLog;

    @Autowired
    private LogMessage logMessage;

    public List<Log> findAll() {
        return repoLog.findAll();
    }

    public Optional<Log> findById(String id) {
        return repoLog.findById(id);
    }

    public Optional<Log> findByUser(String id) {
        return repoLog.findByUser(id);
    }

    public Optional<Log> findByAction (Enum action) { return repoLog.findByAction(action);}

}