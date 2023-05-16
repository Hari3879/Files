package com.ojas.filter;
import java.io.IOException;
import java.util.List;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.ojas.utils.JwtUtil;
@Component
public class SecurityFilter extends OncePerRequestFilter {
	@Autowired
	private JwtUtil util;
	@Autowired
	private UserDetailsService userDetailsService;
	
	public SecurityFilter() {
		System.out.println("filter invoked");
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//read rtoken from autherization header
		
		String token = request.getHeader("Authorization");
		if(token!=null) {
			//do validation
			String username = util.getUsername(token);
			
			List<String> rolesFromToken = util.getRolesFromToken(token);
			System.out.println("==================>-2222............"+rolesFromToken);
		
			System.out.println("=====================>"+username);
			//username should not null  , context authentication must be null
			if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
				UserDetails usr = userDetailsService.loadUserByUsername(username);
				//validate token
				boolean isValid = util.validateToken(token, usr.getUsername());
				if(isValid) {
					UsernamePasswordAuthenticationToken authToken=
							new UsernamePasswordAuthenticationToken(username, usr.getPassword(),usr.getAuthorities());
					
					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					
					//final object stored in Security context with user details
					SecurityContextHolder.getContext().setAuthentication(authToken);
				}
			}
			
		}
		filterChain.doFilter(request, response);
		System.out.println("filter class");
	}
}
