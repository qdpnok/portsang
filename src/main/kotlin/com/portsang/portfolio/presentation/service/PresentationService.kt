package com.portsang.portfolio.presentation.service

import com.portsang.portfolio.presentation.dto.IntroductionDTO
import com.portsang.portfolio.presentation.dto.LinkDTO
import com.portsang.portfolio.presentation.dto.ProjectDTO
import com.portsang.portfolio.presentation.dto.ResumeDTO
import com.portsang.portfolio.presentation.repository.PresentationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PresentationService(
    private val presentationRepository: PresentationRepository
) {

    @Transactional(readOnly = true)
    fun getIntroductions(): List<IntroductionDTO> {
        val introductions = presentationRepository.getActivateIntroductions()

        return introductions.map { IntroductionDTO(it) }
    }

    @Transactional(readOnly = true)
    fun getLinks(): List<LinkDTO> {
        val links = presentationRepository.getActivateLink()

        return links.map { LinkDTO(it) }
    }

    @Transactional(readOnly = true)
    fun getResume(): ResumeDTO {
        val experiences = presentationRepository.getActivateExperiences()
        val achievements = presentationRepository.getActivateAchievements()
        val skills = presentationRepository.getActivateSkills()

        return ResumeDTO(
            experiences = experiences,
            achievements = achievements,
            skills = skills,
        )
    }

    @Transactional(readOnly = true)
    fun getProjects(): List<ProjectDTO> {
        val projects = presentationRepository.getActivateProjects()

        return projects.map { ProjectDTO(it) }
    }

}