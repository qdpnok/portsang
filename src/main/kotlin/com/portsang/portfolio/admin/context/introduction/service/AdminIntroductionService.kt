package com.portsang.portfolio.admin.context.introduction.service

import com.portsang.portfolio.admin.data.TableDTO
import com.portsang.portfolio.domain.entity.Achievement
import com.portsang.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {
    fun getIntroductionTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = introductionRepository.findAll()

        return TableDTO.form(classInfo, entities)
    }
}