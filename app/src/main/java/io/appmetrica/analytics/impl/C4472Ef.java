package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Ef */
/* loaded from: classes2.dex */
public final class C4472Ef {

    /* renamed from: a */
    public final String f30076a;

    /* renamed from: b */
    public final long f30077b;

    /* renamed from: c */
    public final long f30078c;

    /* renamed from: d */
    public final EnumC4447Df f30079d;

    public C4472Ef(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C4496Ff c4496FfM19415a = C4496Ff.m19415a(bArr);
        this.f30076a = c4496FfM19415a.f30139a;
        this.f30077b = c4496FfM19415a.f30141c;
        this.f30078c = c4496FfM19415a.f30140b;
        this.f30079d = m19358a(c4496FfM19415a.f30142d);
    }

    /* renamed from: a */
    public final byte[] m19359a() {
        C4496Ff c4496Ff = new C4496Ff();
        c4496Ff.f30139a = this.f30076a;
        c4496Ff.f30141c = this.f30077b;
        c4496Ff.f30140b = this.f30078c;
        int iOrdinal = this.f30079d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        c4496Ff.f30142d = i;
        return MessageNano.toByteArray(c4496Ff);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4472Ef.class != obj.getClass()) {
            return false;
        }
        C4472Ef c4472Ef = (C4472Ef) obj;
        return this.f30077b == c4472Ef.f30077b && this.f30078c == c4472Ef.f30078c && this.f30076a.equals(c4472Ef.f30076a) && this.f30079d == c4472Ef.f30079d;
    }

    public final int hashCode() {
        int iHashCode = this.f30076a.hashCode() * 31;
        long j = this.f30077b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f30078c;
        return this.f30079d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f30076a + "', referrerClickTimestampSeconds=" + this.f30077b + ", installBeginTimestampSeconds=" + this.f30078c + ", source=" + this.f30079d + '}';
    }

    public C4472Ef(String str, long j, long j2, EnumC4447Df enumC4447Df) {
        this.f30076a = str;
        this.f30077b = j;
        this.f30078c = j2;
        this.f30079d = enumC4447Df;
    }

    /* renamed from: a */
    public static EnumC4447Df m19358a(int i) {
        if (i == 1) {
            return EnumC4447Df.f30020c;
        }
        if (i != 2) {
            return EnumC4447Df.f30019b;
        }
        return EnumC4447Df.f30021d;
    }
}
