package io.pivotal.pal.tracker.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder
            .withDetail("app-key", "7111c752-15c3-4c8b-a113-9ab7b8313c0f")
            .build();
    }
}
