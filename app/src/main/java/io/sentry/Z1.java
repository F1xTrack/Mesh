package io.sentry;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class Z1 extends Q1 {
    public static final io.sentry.protocol.C p = io.sentry.protocol.C.CUSTOM;
    public String k;
    public io.sentry.protocol.C l;
    public Y0 m;
    public C5113c n;
    public X o;

    public Z1(String str, io.sentry.protocol.C c, String str2, Y0 y0) {
        super(new io.sentry.protocol.t((UUID) null), new S1(), str2, null, null);
        this.o = X.SENTRY;
        io.sentry.config.a.D(str, "name is required");
        this.k = str;
        this.l = c;
        this.d = y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.Z1 a(com.yandex.metrica.o r9) throws java.lang.NumberFormatException {
        /*
            r9.getClass()
            java.lang.Object r0 = r9.c
            io.sentry.c r0 = (io.sentry.C5113c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            r2 = 0
            r0.b = r2
            java.lang.String r3 = "sentry-sample_rate"
            java.lang.String r3 = r0.b(r3)
            if (r3 == 0) goto L28
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L28
            java.lang.Double r5 = java.lang.Double.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L28
            boolean r5 = io.sentry.config.a.y(r5, r2)     // Catch: java.lang.NumberFormatException -> L28
            if (r5 == 0) goto L28
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L28
            goto L29
        L28:
            r3 = r1
        L29:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r3 == 0) goto L35
            io.sentry.Y0 r1 = new io.sentry.Y0
            r1.<init>(r2, r3)
            goto L3b
        L35:
            io.sentry.Y0 r3 = new io.sentry.Y0
            r3.<init>(r2, r1)
            r1 = r3
        L3b:
            io.sentry.Z1 r8 = new io.sentry.Z1
            java.lang.Object r2 = r9.a
            r3 = r2
            io.sentry.protocol.t r3 = (io.sentry.protocol.t) r3
            java.lang.Object r9 = r9.b
            r4 = r9
            io.sentry.S1 r4 = (io.sentry.S1) r4
            r6 = 0
            java.lang.String r5 = "default"
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            io.sentry.X r9 = io.sentry.X.SENTRY
            r8.o = r9
            java.lang.String r9 = "<unlabeled transaction>"
            r8.k = r9
            r8.m = r1
            io.sentry.protocol.C r9 = io.sentry.Z1.p
            r8.l = r9
            r8.n = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Z1.a(com.yandex.metrica.o):io.sentry.Z1");
    }
}
