package ru.itis.dentalclinic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.NullRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import ru.itis.dentalclinic.entities.User;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final DataSource dataSource;
    private final UserDetailsService userDetailsService;

    @Autowired
    public SecurityConfig(UserDetailsService userDetailsService, DataSource dataSource) {
        this.userDetailsService = userDetailsService;
        this.dataSource = dataSource;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        RequestCache nullRequestCache = new NullRequestCache();

        http.
                csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)

                .formLogin(login -> login
                        .loginPage("/signIn").permitAll()
                        .loginProcessingUrl("/signIn")
                        .defaultSuccessUrl("/")
                        .usernameParameter("email")
                        .passwordParameter("password")
                        .permitAll())

                .authorizeHttpRequests(request ->
                        request
                                .requestMatchers("/signUp").permitAll()
                                .requestMatchers("/signup").permitAll()
                                .requestMatchers("/admin/**").hasAuthority(User.Role.ADMIN.name())
                                .requestMatchers("/main").authenticated()
                                .requestMatchers("/static/**", "/public/**").permitAll()
                                .requestMatchers("/resources/**").permitAll()
                                .requestMatchers("/").permitAll()
                                .requestMatchers("/personalAccount").authenticated()
                                .requestMatchers("/createAppointment").authenticated()
                                .requestMatchers(HttpMethod.POST, "/createAppointment").authenticated()
                                .requestMatchers("procedureList").authenticated()
                                .requestMatchers("/patientAppointmentsList").authenticated()
                                .requestMatchers("/timeSlots").authenticated()
                                .requestMatchers("/search/**").authenticated())

                .logout(httpSecurityLogoutConfigurer ->
                        httpSecurityLogoutConfigurer.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .logoutSuccessUrl("/signIn?logout")
                                .deleteCookies("JSESSIONID")
                                .invalidateHttpSession(true))
                                .requestCache(cache -> cache.requestCache(nullRequestCache)
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}