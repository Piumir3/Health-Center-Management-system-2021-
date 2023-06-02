package com.example.studentmanagementsystem.service;
//
//public interface ResourcesService {
//}
import com.example.studentmanagementsystem.entity.Resources;

import java.util.List;

public interface ResourcesService {
    List<Resources> getAllResources();

    Resources saveResources(Resources resources);

    Resources getResourcesById(Long id);

    Resources updateResources(Resources resources);

    void deleteResourcesById(Long id);
}