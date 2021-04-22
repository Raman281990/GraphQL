package org.ignite.graphQL.service;

import java.util.List;
import org.ignite.graphQL.domain.Attendee;
import org.ignite.graphQL.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    public List<Attendee> findAll() {
        return attendeeRepository.findAll();
    }

}
