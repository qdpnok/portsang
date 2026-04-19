package com.portsang.portfolio.admin.context.project.controller

import com.portsang.portfolio.admin.context.project.form.ProjectSkillForm
import com.portsang.portfolio.admin.context.project.service.AdminProjectSkillService
import com.portsang.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/project/skill")
class AdminProjectSkillApiController(
    private val adminProjectSkillService: AdminProjectSkillService
) {

    @PostMapping
    fun postProjectSkill(@RequestBody @Validated form: ProjectSkillForm): ResponseEntity<Any> {
        adminProjectSkillService.save(form)

        return ApiResponse.successCreate()
    }

    @DeleteMapping
    fun deleteProjectSkill(@PathVariable id: Long): ResponseEntity<Any> {
        adminProjectSkillService.delete(id)

        return ApiResponse.successDelete()
    }
}