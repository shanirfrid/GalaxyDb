package com.shanir.galaxyDb.services;

import com.shanir.galaxyDb.models.Host;
import com.shanir.galaxyDb.repositories.HostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class HostService {
    private final HostRepository hostRepository;

    public Host getById(String hostName) {
        Optional<Host> returnValue =
                this.hostRepository.findById(hostName);
        return returnValue.isEmpty() ? null : returnValue.get();
    }

    public Iterable<Host> findAll() {
        return this.hostRepository.findAll();
    }

    public Host addHost(Host host) {
        return this.hostRepository.save(host);
    }

    public void deleteByHost(String hostName) {
        this.hostRepository.deleteById(hostName);
    }
}
