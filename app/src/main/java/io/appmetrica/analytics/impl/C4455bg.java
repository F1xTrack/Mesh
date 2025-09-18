package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4455bg implements RemoteConfigMetaInfo {
    public final long a;
    public final long b;

    public C4455bg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final C4455bg a(long j, long j2) {
        return new C4455bg(j, j2);
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4455bg)) {
            return false;
        }
        C4455bg c4455bg = (C4455bg) obj;
        return this.a == c4455bg.a && this.b == c4455bg.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((int) ((j2 >>> 32) ^ j2)) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.a);
        sb.append(", lastUpdateTime=");
        return AbstractC7209tN0.y(sb, this.b, ')');
    }

    public final long a() {
        return this.a;
    }

    public static C4455bg a(C4455bg c4455bg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4455bg.a;
        }
        if ((i & 2) != 0) {
            j2 = c4455bg.b;
        }
        c4455bg.getClass();
        return new C4455bg(j, j2);
    }
}
