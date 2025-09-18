package p000;

/* loaded from: classes.dex */
public final class FZ0 {

    /* renamed from: c */
    public static final LC0 f3308c = new LC0("firebase_sessions_enabled");

    /* renamed from: d */
    public static final LC0 f3309d = new LC0("firebase_sessions_sampling_rate");

    /* renamed from: e */
    public static final LC0 f3310e = new LC0("firebase_sessions_restart_timeout");

    /* renamed from: f */
    public static final LC0 f3311f = new LC0("firebase_sessions_cache_duration");

    /* renamed from: g */
    public static final LC0 f3312g = new LC0("firebase_sessions_cache_updated_time");

    /* renamed from: a */
    public final InterfaceC4039fD f3313a;

    /* renamed from: b */
    public C11939zY0 f3314b;

    public FZ0(InterfaceC4039fD interfaceC4039fD) throws Throwable {
        this.f3313a = interfaceC4039fD;
        AbstractC9366fP1.m18231c(new CZ0(this, null));
    }

    /* renamed from: a */
    public static final void m2672a(FZ0 fz0, C7664Gt0 c7664Gt0) {
        fz0.getClass();
        fz0.f3314b = new C11939zY0((Boolean) c7664Gt0.m3186b(f3308c), (Double) c7664Gt0.m3186b(f3309d), (Integer) c7664Gt0.m3186b(f3310e), (Integer) c7664Gt0.m3186b(f3311f), (Long) c7664Gt0.m3186b(f3312g));
    }

    /* renamed from: b */
    public final boolean m2673b() {
        Integer num;
        C11939zY0 c11939zY0 = this.f3314b;
        if (c11939zY0 == null) {
            O90.m5977o("sessionConfigs");
            throw null;
        }
        if (c11939zY0 != null) {
            Long l = c11939zY0.f46869e;
            return l == null || (num = c11939zY0.f46868d) == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        O90.m5977o("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2674c(p000.LC0 r6, java.lang.Object r7, p000.AbstractC1571Yy r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.DZ0
            if (r0 == 0) goto L13
            r0 = r8
            DZ0 r0 = (p000.DZ0) r0
            int r1 = r0.f2046c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2046c = r1
            goto L18
        L13:
            DZ0 r0 = new DZ0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2044a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f2046c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.RQ1.m7017d(r8)     // Catch: java.io.IOException -> L27
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
            p000.RQ1.m7017d(r8)
            fD r8 = r5.f3313a     // Catch: java.io.IOException -> L27
            EZ0 r2 = new EZ0     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f2046c = r3     // Catch: java.io.IOException -> L27
            NC0 r6 = new NC0     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.mo2067a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L4d
            return r1
        L4a:
            r6.toString()
        L4d:
            Tf1 r6 = p000.C8313Tf1.f11463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FZ0.m2674c(LC0, java.lang.Object, Yy):java.lang.Object");
    }
}
