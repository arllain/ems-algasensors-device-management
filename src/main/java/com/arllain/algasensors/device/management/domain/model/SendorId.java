package com.arllain.algasensors.device.management.domain.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SendorId implements Serializable {

    private TSID value;

    public SendorId(TSID value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public SendorId(Long value) {
        Objects.requireNonNull(value);
        this.value = TSID.from(value);
    }

    public SendorId(String value) {
        Objects.requireNonNull(value);
        this.value = TSID.from(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }


}
