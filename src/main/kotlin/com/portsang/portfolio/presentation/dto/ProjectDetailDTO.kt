package com.portsang.portfolio.presentation.dto

import com.portsang.portfolio.domain.entity.ProjectDetail

class ProjectDetailDTO (
    val content: String,
    val url: String?
) {
    constructor(projectDetail: ProjectDetail): this(
        content = projectDetail.content,
        url = projectDetail.url
    )
}