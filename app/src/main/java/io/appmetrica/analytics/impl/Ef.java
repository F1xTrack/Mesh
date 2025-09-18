package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes2.dex */
public final class Ef {
    public final String a;
    public final long b;
    public final long c;
    public final Df d;

    public Ef(byte[] bArr) throws InvalidProtocolBufferNanoException {
        Ff ffA = Ff.a(bArr);
        this.a = ffA.a;
        this.b = ffA.c;
        this.c = ffA.b;
        this.d = a(ffA.d);
    }

    public final byte[] a() {
        Ff ff = new Ff();
        ff.a = this.a;
        ff.c = this.b;
        ff.b = this.c;
        int iOrdinal = this.d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        ff.d = i;
        return MessageNano.toByteArray(ff);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ef.class != obj.getClass()) {
            return false;
        }
        Ef ef = (Ef) obj;
        return this.b == ef.b && this.c == ef.c && this.a.equals(ef.a) && this.d == ef.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + '}';
    }

    public Ef(String str, long j, long j2, Df df) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = df;
    }

    public static Df a(int i) {
        if (i == 1) {
            return Df.c;
        }
        if (i != 2) {
            return Df.b;
        }
        return Df.d;
    }
}
