package defpackage;

import java.util.List;

/* renamed from: xB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7934xB {
    public final P70 a;
    public final long b;
    public final long c;
    public final long d;

    public C7934xB(List list, long j, long j2) {
        this.a = P70.u(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
