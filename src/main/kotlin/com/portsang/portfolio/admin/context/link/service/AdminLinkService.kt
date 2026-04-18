package com.portsang.portfolio.admin.context.link.service

import com.portsang.portfolio.admin.data.TableDTO
import com.portsang.portfolio.domain.entity.Link
import com.portsang.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {
    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.form(classInfo, entities)
    }
}