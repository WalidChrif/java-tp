package com.tppfe.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentId implements Serializable {

    private Long id;
    private String code;

    public StudentId() {
    }

    public StudentId(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentId)) return false;

        StudentId studentId = (StudentId) o;

        if (!Objects.equals(id, studentId.id)) return false;
        return Objects.equals(code, studentId.code);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentId{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
