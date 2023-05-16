package com.ojas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ojas.filter.SecurityFilter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableWebMvc
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private InvalidUserAuthEntryPoint authenticationEntryPoint;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private SecurityFilter securityFilter;

	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests()
				.antMatchers("/user/save", "/user/login", "/user/getAll").authenticated().anyRequest()
				.permitAll().and().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)// if we dont write it will
																							// become statefull
				// : varify user for 2 nd Req onwards

				.and()
				// register filter for 2nd request onwards
				.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);

	}

//	@Bean
//	public CorsConfigurationSource Cors() {
//		CorsConfiguration configure = new CorsConfiguration();
//		configure.setAllowedOrigins(Arrays.asList("GET"));
//		configure.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//		configure.setAllowedHeaders(Arrays.asList("authorization", "content-type", "X-auth-Token"));
//		configure.setExposedHeaders(Arrays.asList("X-auth-Token"));
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//
//		source.registerCorsConfiguration("/**", configure);
//
//		return source;
//
//	}

}
