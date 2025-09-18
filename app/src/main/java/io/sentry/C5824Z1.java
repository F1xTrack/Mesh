package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.protocol.EnumC6080C;
import java.util.UUID;

/* renamed from: io.sentry.Z1 */
/* loaded from: classes2.dex */
public final class C5824Z1 extends C5798Q1 {

    /* renamed from: p */
    public static final EnumC6080C f33461p = EnumC6080C.CUSTOM;

    /* renamed from: k */
    public String f33462k;

    /* renamed from: l */
    public EnumC6080C f33463l;

    /* renamed from: m */
    public C5820Y0 f33464m;

    /* renamed from: n */
    public C5985c f33465n;

    /* renamed from: o */
    public EnumC5816X f33466o;

    public C5824Z1(String str, EnumC6080C enumC6080C, String str2, C5820Y0 c5820y0) {
        super(new C6104t((UUID) null), new C5803S1(), str2, null, null);
        this.f33466o = EnumC5816X.SENTRY;
        AbstractC6003a.m21735D(str, "name is required");
        this.f33462k = str;
        this.f33463l = enumC6080C;
        this.f33382d = c5820y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0028  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.C5824Z1 m21492a(com.yandex.metrica.C3796o r9) throws java.lang.NumberFormatException {
        /*
            r9.getClass()
            java.lang.Object r0 = r9.f25480c
            io.sentry.c r0 = (io.sentry.C5985c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            r2 = 0
            r0.f34087b = r2
            java.lang.String r3 = "sentry-sample_rate"
            java.lang.String r3 = r0.m21700b(r3)
            if (r3 == 0) goto L28
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L28
            java.lang.Double r5 = java.lang.Double.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L28
            boolean r5 = io.sentry.config.AbstractC6003a.m21764y(r5, r2)     // Catch: java.lang.NumberFormatException -> L28
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
            java.lang.Object r2 = r9.f25478a
            r3 = r2
            io.sentry.protocol.t r3 = (io.sentry.protocol.C6104t) r3
            java.lang.Object r9 = r9.f25479b
            r4 = r9
            io.sentry.S1 r4 = (io.sentry.C5803S1) r4
            r6 = 0
            java.lang.String r5 = "default"
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            io.sentry.X r9 = io.sentry.EnumC5816X.SENTRY
            r8.f33466o = r9
            java.lang.String r9 = "<unlabeled transaction>"
            r8.f33462k = r9
            r8.f33464m = r1
            io.sentry.protocol.C r9 = io.sentry.C5824Z1.f33461p
            r8.f33463l = r9
            r8.f33465n = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5824Z1.m21492a(com.yandex.metrica.o):io.sentry.Z1");
    }
}
