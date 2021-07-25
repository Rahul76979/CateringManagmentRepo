package com.catering.ssvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catering.ssvc.DTO.CateringMaterialOrderEntity;

public interface CateringMaterialOrderRepo extends JpaRepository<CateringMaterialOrderEntity, Long> {

}
