//package com.example.studentmanagementsystem.service.impl;
//
//public class ResourcesServiceImpl {
//}
package com.example.studentmanagementsystem.service.impl;

import com.example.studentmanagementsystem.entity.Resources;
import com.example.studentmanagementsystem.repository.ResourcesRepository;
import com.example.studentmanagementsystem.service.ResourcesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    private ResourcesRepository resourcesRepository;

    public ResourcesServiceImpl(ResourcesRepository resourcesRepository) {
        this.resourcesRepository = resourcesRepository;
    }

    @Override
    public List<Resources> getAllResources() {
        return resourcesRepository.findAll();
    }

    @Override
    public  Resources saveResources(Resources resources) {
        return resourcesRepository.save(resources);
    }

    @Override
    public Resources getResourcesById(Long id) {
        return resourcesRepository.findById(id).get();
    }

    @Override
    public Resources updateResources(Resources resources) {
        return resourcesRepository.save(resources);
    }

    @Override
    public void deleteResourcesById(Long id) {
        resourcesRepository.deleteById(id);
    }
}
