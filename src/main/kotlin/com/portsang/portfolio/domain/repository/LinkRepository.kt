package com.portsang.portfolio.domain.repository

import com.portsang.portfolio.domain.entity.Skill
import com.portsang.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>{

}