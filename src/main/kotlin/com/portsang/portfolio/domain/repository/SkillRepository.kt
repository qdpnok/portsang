package com.portsang.portfolio.domain.repository

import com.portsang.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>{

}