package com.hanhwa_tae.gulhan.user.command.domain.aggregate;

import com.hanhwa_tae.gulhan.common.domain.DeleteType;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Table(name = "user_info")
@EntityListeners(AuditingEntityListener.class)
public class UserInfo {
    @Id
    private Long userNo;

    /* 반대로 조회할 일은 없지 않을까요 ..? (단방향 매핑)*/
    @MapsId
    @OneToOne
    @JoinColumn(name = "user_no")
    private User user;

    @Temporal(TemporalType.DATE)
    private Date birth;

    private int point = 0;

    @Column(unique = true)
    private String phone;

    @CreatedDate
    private Timestamp created_at;

    @LastModifiedDate
    private Timestamp updated_at;

    @Enumerated(EnumType.STRING)
    private DeleteType isDeleted = DeleteType.N; // 삭제여부 soft

    private String address;

    private String countryCode = "82";
}