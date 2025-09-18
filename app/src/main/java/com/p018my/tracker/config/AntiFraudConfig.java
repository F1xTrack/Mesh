package com.p018my.tracker.config;

import com.p018my.tracker.obfuscated.AbstractC2346n1;

/* loaded from: classes2.dex */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {
        boolean useLightSensor = AbstractC2346n1.f20061a;
        boolean useMagneticFieldSensor = true;
        boolean useGyroscope = true;
        boolean usePressureSensor = true;
        boolean useProximitySensor = AbstractC2346n1.f20062b;

        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.useLightSensor, this.useMagneticFieldSensor, this.useGyroscope, this.usePressureSensor, this.useProximitySensor);
        }

        public Builder useGyroscopeSensor(boolean z) {
            this.useGyroscope = z;
            return this;
        }

        public Builder useLightSensor(boolean z) {
            this.useLightSensor = z;
            return this;
        }

        public Builder useMagneticFieldSensor(boolean z) {
            this.useMagneticFieldSensor = z;
            return this;
        }

        public Builder usePressureSensor(boolean z) {
            this.usePressureSensor = z;
            return this;
        }

        public Builder useProximitySensor(boolean z) {
            this.useProximitySensor = z;
            return this;
        }
    }

    public AntiFraudConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useLightSensor = z;
        this.useMagneticFieldSensor = z2;
        this.useGyroscope = z3;
        this.usePressureSensor = z4;
        this.useProximitySensor = z5;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
