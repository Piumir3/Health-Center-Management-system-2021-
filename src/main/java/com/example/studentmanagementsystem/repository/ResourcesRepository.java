//package com.example.studentmanagementsystem.repository;
//
//public interface ResourcesRepository {
//}
package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.entity.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourcesRepository extends JpaRepository<Resources, Long> {
}
