package com.damlabin.springsecurity.security;

import com.damlabin.springsecurity.utils.ConstantsUtils;
import com.damlabin.springsecurity.utils.SecurityUtils;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Implementation of {@link AuditorAware} based on Spring Security.
 */
@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(SecurityUtils.getCurrentUserLogin().orElse(ConstantsUtils.SYSTEM_ACCOUNT));
    }
}
