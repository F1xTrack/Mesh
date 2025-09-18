package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import p000.AbstractC1374Vq;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.qm */
/* loaded from: classes2.dex */
public final class C5406qm implements TempCacheStorage.Entry {

    /* renamed from: a */
    public final long f32472a;

    /* renamed from: b */
    public final String f32473b;

    /* renamed from: c */
    public final long f32474c;

    /* renamed from: d */
    public final byte[] f32475d;

    public C5406qm(long j, String str, long j2, byte[] bArr) {
        this.f32472a = j;
        this.f32473b = str;
        this.f32474c = j2;
        this.f32475d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5406qm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C5406qm c5406qm = (C5406qm) obj;
        if (this.f32472a == c5406qm.f32472a && O90.m5963a(this.f32473b, c5406qm.f32473b) && this.f32474c == c5406qm.f32474c) {
            return Arrays.equals(this.f32475d, c5406qm.f32475d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f32475d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f32472a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f32473b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f32474c;
    }

    public final int hashCode() {
        long j = this.f32472a;
        int iM8586e = AbstractC1374Vq.m8586e(((int) (j ^ (j >>> 32))) * 31, 31, this.f32473b);
        long j2 = this.f32474c;
        return Arrays.hashCode(this.f32475d) + ((((int) (j2 ^ (j2 >>> 32))) + iM8586e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TempCacheEntry(id=");
        sb.append(this.f32472a);
        sb.append(", scope='");
        sb.append(this.f32473b);
        sb.append("', timestamp=");
        sb.append(this.f32474c);
        sb.append(", data=array[");
        return AbstractC1374Vq.m8591j(sb, this.f32475d.length, "])");
    }
}
