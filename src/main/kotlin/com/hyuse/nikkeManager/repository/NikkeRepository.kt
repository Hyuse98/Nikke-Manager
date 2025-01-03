package com.hyuse.nikkeManager.repository

import com.hyuse.nikkeManager.enums.*
import com.hyuse.nikkeManager.model.Nikke
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface NikkeRepository : JpaRepository<Nikke, Int>, JpaSpecificationExecutor<Nikke> {

    @Query("SELECT n FROM Nikke n WHERE n.name = :name")
    fun findByName(@Param("name") name: String): Nikke?

    @Modifying
    @Query("DELETE FROM Nikke n WHERE n.name = :name")
    fun deleteByName(@Param("name") name: String)

}