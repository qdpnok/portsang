package com.portsang.portfolio.presentation.repository

import com.portsang.portfolio.domain.entity.Achievement
import com.portsang.portfolio.domain.entity.Experience
import com.portsang.portfolio.domain.entity.Introduction
import com.portsang.portfolio.domain.entity.Link
import com.portsang.portfolio.domain.entity.Project
import com.portsang.portfolio.domain.entity.Skill
import com.portsang.portfolio.domain.repository.AchievementRepository
import com.portsang.portfolio.domain.repository.ExperienceRepository
import com.portsang.portfolio.domain.repository.IntroductionRepository
import com.portsang.portfolio.domain.repository.LinkRepository
import com.portsang.portfolio.domain.repository.ProjectRepository
import com.portsang.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRepository: ProjectRepository,
    private val skillRepository: SkillRepository
) {

    fun getActivateAchievements(): List<Achievement> {
        return achievementRepository.findAllByIsActive(true)
    }

    fun getActivateExperiences(): List<Experience> {
        return experienceRepository.findAllByIsActive(true)
    }

    fun getActivateIntroductions(): List<Introduction> {
        return introductionRepository.findAllByIsActive(true)
    }

    fun getActivateLink(): List<Link> {
        return linkRepository.findAllByIsActive(true)
    }

    fun getActivateProjects(): List<Project> {
        return projectRepository.findAllByIsActive(true)
    }

    fun getActivateSkills(): List<Skill> {
        return skillRepository.findAllByIsActive(true)
    }
}