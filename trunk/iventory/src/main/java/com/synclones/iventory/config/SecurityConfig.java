package com.synclones.iventory.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	 @Autowired
	 private UserDetailsService userDetailsService;

	 @Bean
	 public BCryptPasswordEncoder bCryptPasswordEncoder(){
		 return new BCryptPasswordEncoder();
	 }
	  
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http
//        .authorizeRequests()
//            .antMatchers("/resources/**", "/registration").permitAll()
//            .anyRequest().authenticated()
//            .and()
//        .formLogin()
//            .loginPage("/login")
//            .permitAll()
//            .and()
//        .logout()
//            .permitAll();
		
		// http.authorizeRequests().antMatchers("/", "/home").permitAll()
		// .anyRequest().authenticated().and()
		// .formLogin().loginPage("/login").permitAll().and()
		// .logout().permitAll();"/", "/home", 
		http.authorizeRequests().antMatchers("/login", "/registration").permitAll()
				.antMatchers("/admin/**").hasAuthority("ADMIN")
				.antMatchers("/user/**").hasAuthority("USER").anyRequest().fullyAuthenticated()
				.and()
				.formLogin().loginPage("/login").permitAll()
				.and()
				.logout().logoutUrl("/logout")
		            .logoutSuccessUrl("/login")
		            .permitAll();
		// .and()
		// .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
		
//		
//		Addditionl
//	    http
//        .authorizeRequests()
//        .antMatchers("/signup").permitAll()
//        .antMatchers("/").permitAll()
//        //.antMatchers("/first").hasAuthority("Service_Center")
//        .antMatchers("/login").permitAll()
//        .anyRequest().fullyAuthenticated()
//.and().formLogin()
//        .loginPage("/login")
//        .usernameParameter("email")
//        .passwordParameter("password")
//        .defaultSuccessUrl("/default")
//        .failureUrl("/login?error").permitAll()
//.and().logout()
//        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//        .logoutSuccessUrl("/login?logout")
//        .deleteCookies("JSESSIONID")
//        .invalidateHttpSession(true).permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// auth.inMemoryAuthentication()
		// .withUser("user").password("password").roles("USER");
/**		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
				.password("password").roles("ADMIN");*/
		System.out.println("configureGlobal "+auth.toString());
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/template/**", "/static/**", "/scripts/**", "/styles/**", "/images/**");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		System.out.println("configure "+auth.toString());
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

}
