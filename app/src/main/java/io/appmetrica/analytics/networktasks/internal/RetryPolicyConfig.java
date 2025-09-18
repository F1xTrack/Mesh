package io.appmetrica.analytics.networktasks.internal;

import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int i, int i2) {
        this.maxIntervalSeconds = i;
        this.exponentialMultiplier = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryPolicyConfig retryPolicyConfig = (RetryPolicyConfig) obj;
        return this.maxIntervalSeconds == retryPolicyConfig.maxIntervalSeconds && this.exponentialMultiplier == retryPolicyConfig.exponentialMultiplier;
    }

    public int hashCode() {
        return (this.maxIntervalSeconds * 31) + this.exponentialMultiplier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb.append(this.maxIntervalSeconds);
        sb.append(", exponentialMultiplier=");
        return AbstractC7222ym.m26235l(sb, this.exponentialMultiplier, '}');
    }
}
