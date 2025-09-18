package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.bg */
/* loaded from: classes2.dex */
public final class C5025bg implements RemoteConfigMetaInfo {

    /* renamed from: a */
    public final long f31322a;

    /* renamed from: b */
    public final long f31323b;

    public C5025bg(long j, long j2) {
        this.f31322a = j;
        this.f31323b = j2;
    }

    /* renamed from: a */
    public final C5025bg m20193a(long j, long j2) {
        return new C5025bg(j, j2);
    }

    /* renamed from: b */
    public final long m20194b() {
        return this.f31323b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5025bg)) {
            return false;
        }
        C5025bg c5025bg = (C5025bg) obj;
        return this.f31322a == c5025bg.f31322a && this.f31323b == c5025bg.f31323b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f31322a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f31323b;
    }

    public final int hashCode() {
        long j = this.f31322a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f31323b;
        return ((int) ((j2 >>> 32) ^ j2)) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.f31322a);
        sb.append(", lastUpdateTime=");
        return AbstractC11153tN0.m24913y(sb, this.f31323b, ')');
    }

    /* renamed from: a */
    public final long m20192a() {
        return this.f31322a;
    }

    /* renamed from: a */
    public static C5025bg m20191a(C5025bg c5025bg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c5025bg.f31322a;
        }
        if ((i & 2) != 0) {
            j2 = c5025bg.f31323b;
        }
        c5025bg.getClass();
        return new C5025bg(j, j2);
    }
}
