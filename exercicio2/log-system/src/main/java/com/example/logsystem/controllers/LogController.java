package com.example.logsystem.controllers;

import com.example.logsystem.entities.Log;
import com.example.logsystem.services.LogService;
import com.example.logsystem.utils.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService servLog;

    @GetMapping("/{id}")
    public Optional<Log> findById(@PathVariable String id) {
        return servLog.findById(id);
    }

    @GetMapping
    public List<Log> findAll() {
        return servLog.findAll();
    }

    @GetMapping("/action/{id}")
    public Optional<Log> findByAction(@PathVariable Action id) {
        return servLog.findByAction(id);
    }

    @GetMapping("/user/{id}")
    public Optional<Log> findByuser(@PathVariable String userId) {
        return servLog.findByUser(userId);
    }
}