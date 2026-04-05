package com.portsang.portfolio.presentation.dto

import com.portsang.portfolio.domain.entity.Introduction

data class IntroductionDTO (
    val content: String
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}