package com.yandex.metrica.impl.ob;

import defpackage.F91;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Eh {
    public final List<Hh> a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public Eh(List<Hh> list, String str, long j, boolean z, boolean z2) {
        this.a = Collections.unmodifiableList(list);
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkFingerprintingState{sdkItemList=");
        sb.append(this.a);
        sb.append(", etag='");
        sb.append(this.b);
        sb.append("', lastAttemptTime=");
        sb.append(this.c);
        sb.append(", hasFirstCollectionOccurred=");
        sb.append(this.d);
        sb.append(", shouldRetry=");
        return F91.w(sb, this.e, '}');
    }
}
