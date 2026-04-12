package com.portsang.portfolio.presentation.interceptor

import com.portsang.portfolio.domain.entity.HttpInterface
import com.portsang.portfolio.domain.repository.HttpInterfaceRepository
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.HandlerInterceptor
import java.lang.Exception

@Configuration
class PresentationInterceptor(
    private val httpInterfaceRepository: HttpInterfaceRepository
) : HandlerInterceptor {
    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        val httpInterface = HttpInterface(request)
        httpInterfaceRepository.save(httpInterface)
    }
}