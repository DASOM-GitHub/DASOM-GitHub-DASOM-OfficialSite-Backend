package dmu.dasom.dasom_homepage.domain.admin;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudyParticipants {
    private int studyNo;
    private int participantNo;
    private String participantRole;
}