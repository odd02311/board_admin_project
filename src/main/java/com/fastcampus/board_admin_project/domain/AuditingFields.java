package com.fastcampus.board_admin_project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AuditingFields {

  /** 생성일시 */
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  // 메타 데이터
  @CreatedDate
  @Column(nullable = false, updatable = false)
  protected LocalDateTime createdAt; // 생성일시

  /** 생성자 */
  @CreatedBy
  @Column(nullable = false, updatable = false,length = 100)
  protected String createdBy; // 생성자

  /** 수정일시 */
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  @LastModifiedDate
  @Column(nullable = false)
  protected LocalDateTime modifiedAt; // 수정일시

  /** 수정자 */
  @LastModifiedBy
  @Column(nullable = false, length = 100)
  protected String modifiedBy; // 수정자
}

