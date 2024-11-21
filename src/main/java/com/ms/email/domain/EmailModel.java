package com.ms.email.domain;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel implements Serializable {
    @Serial
    private static final long serialVersionUID = -6945885328578311262L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emailId")
    private UUID emailId;
    @Column(name = "userId")
    private UUID userId;
    @Column(name = "emailFrom")
    private String emailFrom;
    @Column(name = "emailTo")
    private String emailTo;
    @Column(name = "subject")
    private String subject;
    @Column(columnDefinition = "TEXT", name = "text")
    private String text;
    @Column(name = "sendEmailDate")
    private LocalDateTime sendDateEmail;
    @Enumerated(EnumType.STRING)
    @Column(name = "statusEmail")
    private StatusEmail statusEmail;
}
