package com.p019vk.push.core.backoff;

import com.p019vk.push.core.utils.RandomUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC10132lO1;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m22267d2 = {"Lcom/vk/push/core/backoff/ExponentialBackOff;", "Lcom/vk/push/core/backoff/BackOff;", "", "getNextBackOff", "()J", "LTf1;", "resetBackOff", "()V", "Builder", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ExponentialBackOff implements BackOff {

    /* renamed from: a */
    public final long f20324a;

    /* renamed from: b */
    public final long f20325b;

    /* renamed from: c */
    public final long f20326c;

    /* renamed from: d */
    public final long f20327d;

    /* renamed from: e */
    public final double f20328e;

    /* renamed from: f */
    public long f20329f;

    @Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m22267d2 = {"Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "", "<init>", "()V", "", "backOff", "initialBackOff", "(J)Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "maxBackOff", "deviation", "standardDeviation", "averageDeviation", "", "factor", "scaleFactor", "(D)Lcom/vk/push/core/backoff/ExponentialBackOff$Builder;", "Lcom/vk/push/core/backoff/BackOff;", "build", "()Lcom/vk/push/core/backoff/BackOff;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {

        /* renamed from: a */
        public long f20330a = 100;

        /* renamed from: b */
        public long f20331b = 600000;

        /* renamed from: c */
        public long f20332c = 100;

        /* renamed from: d */
        public long f20333d = 1000;

        /* renamed from: e */
        public double f20334e = 2.0d;

        public final Builder averageDeviation(long deviation) {
            if (deviation >= 0) {
                this.f20333d = deviation;
                return this;
            }
            throw new IllegalStateException(("average deviation should be positive: " + deviation + " <= 0").toString());
        }

        public final BackOff build() {
            return new ExponentialBackOff(this.f20330a, this.f20331b, this.f20332c, this.f20333d, this.f20334e, null);
        }

        public final Builder initialBackOff(long backOff) {
            if (backOff > 0) {
                this.f20330a = backOff;
                return this;
            }
            throw new IllegalStateException(("initial back off should be positive: " + backOff + " < 0").toString());
        }

        public final Builder maxBackOff(long backOff) {
            if (backOff > 0) {
                this.f20331b = backOff;
                return this;
            }
            throw new IllegalStateException(("max back off should be positive: " + backOff + " < 0").toString());
        }

        public final Builder scaleFactor(double factor) {
            if (factor > 1.0d) {
                this.f20334e = factor;
                return this;
            }
            throw new IllegalStateException(("scale factor should be above one: " + factor + " < 1").toString());
        }

        public final Builder standardDeviation(long deviation) {
            if (deviation > 0) {
                this.f20332c = deviation;
                return this;
            }
            throw new IllegalStateException(("standard deviation should be positive: " + deviation + " < 0").toString());
        }
    }

    public ExponentialBackOff(long j, long j2, long j3, long j4, double d, DefaultConstructorMarker defaultConstructorMarker) {
        this.f20324a = j;
        this.f20325b = j2;
        this.f20326c = j3;
        this.f20327d = j4;
        this.f20328e = d;
        this.f20329f = j;
    }

    @Override // com.p019vk.push.core.backoff.BackOff
    public long getNextBackOff() {
        long jM22417b = AbstractC10132lO1.m22417b((long) (this.f20329f * this.f20328e), this.f20325b) + ((long) ((RandomUtils.INSTANCE.nextGaussian() * this.f20326c) + this.f20327d));
        this.f20329f = jM22417b;
        return jM22417b;
    }

    @Override // com.p019vk.push.core.backoff.BackOff
    public void resetBackOff() {
        this.f20329f = this.f20324a;
    }
}
