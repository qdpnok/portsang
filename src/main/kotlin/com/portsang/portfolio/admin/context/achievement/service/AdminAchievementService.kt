package com.portsang.portfolio.admin.context.achievement.service

import com.portsang.portfolio.admin.data.TableDTO
import com.portsang.portfolio.domain.entity.Achievement
import com.portsang.portfolio.domain.repository.AchievementRepository
import org.springframework.stereotype.Service

@Service
class AdminAchievementService(
    private val achievementRepository: AchievementRepository
) {
    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRepository.findAll()

        return TableDTO.form(classInfo, entities)
    }
}