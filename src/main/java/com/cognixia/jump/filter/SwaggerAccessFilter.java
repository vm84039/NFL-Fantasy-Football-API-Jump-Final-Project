package com.cognixia.jump.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

public class SwaggerAccessFilter extends OncePerRequestFilter {

    private final RequestMatcher requestMatcher;

    public SwaggerAccessFilter(RequestMatcher requestMatcher) {
        this.requestMatcher = requestMatcher;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (requestMatcher.matches(request)) {
            // Allow access to Swagger UI without authentication
            filterChain.doFilter(request, response);
        } else {
            // Continue with the authentication and authorization process
            filterChain.doFilter(request, response);
        }
    }
}
