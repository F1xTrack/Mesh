package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4823qm implements TempCacheStorage.Entry {
    public final long a;
    public final String b;
    public final long c;
    public final byte[] d;

    public C4823qm(long j, String str, long j2, byte[] bArr) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4823qm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C4823qm c4823qm = (C4823qm) obj;
        if (this.a == c4823qm.a && O90.a(this.b, c4823qm.b) && this.c == c4823qm.c) {
            return Arrays.equals(this.d, c4823qm.d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.a;
        int iE = AbstractC1705Vq.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b);
        long j2 = this.c;
        return Arrays.hashCode(this.d) + ((((int) (j2 ^ (j2 >>> 32))) + iE) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TempCacheEntry(id=");
        sb.append(this.a);
        sb.append(", scope='");
        sb.append(this.b);
        sb.append("', timestamp=");
        sb.append(this.c);
        sb.append(", data=array[");
        return AbstractC1705Vq.j(sb, this.d.length, "])");
    }
}
