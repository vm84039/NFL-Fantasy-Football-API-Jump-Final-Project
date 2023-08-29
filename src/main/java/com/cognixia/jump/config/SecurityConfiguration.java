package com.cognixia.jump.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;



import com.cognixia.jump.filter.JwtRequestFilter;
import com.cognixia.jump.filter.SwaggerAccessFilter;

@Configuration
public class SecurityConfiguration {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	JwtRequestFilter jwtRequestFilter;
	
	@Bean
	protected UserDetailsService userDetailsService() {
		
		return userDetailsService;
	}
	
	@Bean
	protected SecurityFilterChain filterChain( HttpSecurity http ) throws Exception {
		
		RequestMatcher requestMatcher = new AntPathRequestMatcher("/swagger-ui/index.html", HttpMethod.GET.toString());
        http.addFilterBefore(new SwaggerAccessFilter(requestMatcher), BasicAuthenticationFilter.class);
        
        http
        .csrf().disable()
        .authorizeRequests()
            .antMatchers("/swagger-ui.html").permitAll()
            .antMatchers("/webjars/**").permitAll() // Allow access to webjars
            .antMatchers("/v3/api-docs/**").permitAll() // Allow access to the API documentation
            .antMatchers("/authenticate").permitAll()
            .antMatchers(HttpMethod.POST, "/api/statistics/").hasRole("ADMIN")
            .antMatchers("/api/user/**").hasRole("ADMIN")
            .antMatchers("/api/statistics/**").hasRole("USER")
            .antMatchers(HttpMethod.GET, "/api/players/**").permitAll()
            .antMatchers("/api/all").permitAll()
            .anyRequest().authenticated()
    .and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

    // Exception handling begins here
    http.exceptionHandling()
        .authenticationEntryPoint((request, response, ex) -> {
            // Handle authentication-related exceptions here
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Not able to authenticate token");
        })
        .accessDeniedHandler((request, response, ex) -> {
            // Handle access denied exceptions here
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write("*************   Not authorized for this API  *******");
        });

    return http.build();
	
	}
	
	@Bean
	protected PasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
				
	}
	
	@Bean
	protected DaoAuthenticationProvider authenticationProvider() {

		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(encoder());

		return authProvider;
	}

	@Bean
	protected AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}

	
	
}