package defpackage;

/* loaded from: classes.dex */
public final class FZ0 {
    public static final LC0 c = new LC0("firebase_sessions_enabled");
    public static final LC0 d = new LC0("firebase_sessions_sampling_rate");
    public static final LC0 e = new LC0("firebase_sessions_restart_timeout");
    public static final LC0 f = new LC0("firebase_sessions_cache_duration");
    public static final LC0 g = new LC0("firebase_sessions_cache_updated_time");
    public final InterfaceC3729fD a;
    public C8384zY0 b;

    public FZ0(InterfaceC3729fD interfaceC3729fD) throws Throwable {
        this.a = interfaceC3729fD;
        AbstractC3767fP1.c(new CZ0(this, null));
    }

    public static final void a(FZ0 fz0, C0546Gt0 c0546Gt0) {
        fz0.getClass();
        fz0.b = new C8384zY0((Boolean) c0546Gt0.b(c), (Double) c0546Gt0.b(d), (Integer) c0546Gt0.b(e), (Integer) c0546Gt0.b(f), (Long) c0546Gt0.b(g));
    }

    public final boolean b() {
        Integer num;
        C8384zY0 c8384zY0 = this.b;
        if (c8384zY0 == null) {
            O90.o("sessionConfigs");
            throw null;
        }
        if (c8384zY0 != null) {
            Long l = c8384zY0.e;
            return l == null || (num = c8384zY0.d) == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        O90.o("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.LC0 r6, java.lang.Object r7, defpackage.AbstractC1963Yy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.DZ0
            if (r0 == 0) goto L13
            r0 = r8
            DZ0 r0 = (defpackage.DZ0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            DZ0 r0 = new DZ0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.RQ1.d(r8)     // Catch: java.io.IOException -> L27
            goto L4d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.RQ1.d(r8)
            fD r8 = r5.a     // Catch: java.io.IOException -> L27
            EZ0 r2 = new EZ0     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.c = r3     // Catch: java.io.IOException -> L27
            NC0 r6 = new NC0     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L4d
            return r1
        L4a:
            r6.toString()
        L4d:
            Tf1 r6 = defpackage.C1518Tf1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FZ0.c(LC0, java.lang.Object, Yy):java.lang.Object");
    }
}
