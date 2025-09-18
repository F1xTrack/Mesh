package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4146hO1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[PHI: r4
  0x004f: PHI (r4v2 char) = (r4v1 char), (r4v3 char) binds: [B:8:0x0044, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[PHI: r3
  0x0051: PHI (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:7:0x0042, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.lang.String r6) {
        /*
            if (r6 == 0) goto L68
            java.lang.StringBuilder r6 = defpackage.AbstractC7538v51.M(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "\\]"
            java.lang.String r1 = "[\\"
            java.lang.String r6 = defpackage.D51.m(r6, r1, r0)
            java.lang.String r0 = "\\["
            java.lang.String r1 = "]\\"
            java.lang.String r6 = defpackage.D51.m(r6, r1, r0)
            java.lang.String r0 = "\\}"
            java.lang.String r1 = "{\\"
            java.lang.String r6 = defpackage.D51.m(r6, r1, r0)
            java.lang.String r0 = "\\{"
            java.lang.String r1 = "}\\"
            java.lang.String r6 = defpackage.D51.m(r6, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length()
            r0.<init>(r1)
            r1 = 0
        L34:
            int r2 = r6.length()
            if (r1 >= r2) goto L5c
            char r2 = r6.charAt(r1)
            r3 = 93
            r4 = 91
            if (r2 == r4) goto L51
            if (r2 == r3) goto L4f
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L51
            if (r2 == r3) goto L4f
            goto L52
        L4f:
            r2 = r4
            goto L52
        L51:
            r2 = r3
        L52:
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L34
        L5c:
            r3 = 0
            r5 = 62
            java.lang.String r1 = ""
            r2 = 0
            r4 = 0
            java.lang.String r6 = defpackage.AbstractC8069xu.H(r0, r1, r2, r3, r4, r5)
            return r6
        L68:
            Kd1 r6 = new Kd1
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4146hO1.a(java.lang.String):java.lang.String");
    }

    public static long b(int i, long j) {
        long j2 = i;
        AbstractC3377dM1.d("sampleRate must be greater than 0.", j2 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static long c(int i, long j) {
        long j2 = i;
        AbstractC3377dM1.d("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }
}
