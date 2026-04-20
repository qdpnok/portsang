package com.portsang.portfolio.admin.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
class AdminSecurityConfiguration {

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests {
                it.requestMatchers("/admin/**").authenticated()
                    .anyRequest().permitAll()
            }
            .headers {
                it.frameOptions { frameOptions ->
                    frameOptions.sameOrigin()
                }
            }
            .formLogin {
                it.defaultSuccessUrl("/admin", true)
                it.permitAll()
            }
            .logout {
                it.logoutUrl("/admin/logout")
                it.logoutSuccessUrl("/")
                it.permitAll()
            }

        return http.build()
    }
}