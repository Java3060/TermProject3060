package Util.security;

import org.springframework.aot.generate.ValueCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.aot.generate.ValueCodeGenerator.withDefaults;

@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.authorizeRequests( (authorize) -> authorize
                    .requestMatchers("/api/auth").permitAll()
                    .requestMatchers("/api/**").authenticated()
                    .requestMatchers("/api/user").hasRole("tm_admin")
                    .requestMatchers(HttpMethod.POST,"/api/users/").hasRole("tm_admin")
                    .requestMatchers(HttpMethod.DELETE,"/api/task/**").hasRole("tm_admin")
                    .cors(ValueCodeGenerator.withDefaults()))
                    .and().oauth2ResourceServer().jwt();
            return http.build();
        }
    }
}
