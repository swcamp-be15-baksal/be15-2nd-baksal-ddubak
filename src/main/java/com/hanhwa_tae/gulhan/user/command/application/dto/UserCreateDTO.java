package com.hanhwa_tae.gulhan.user.command.application.dto;

import com.hanhwa_tae.gulhan.user.command.domain.aggregate.GenderType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserCreateDTO {
    private final String userId;
    private final String password;
    private final String userName;
    private final String email;
    private final GenderType gender;
    private Long rankId;
}
