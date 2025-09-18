package p000;

/* renamed from: Uk0 */
/* loaded from: classes2.dex */
public class C8374Uk0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final C8582Yk0 f12016a;

    /* renamed from: b */
    public final InterfaceC6434mZ f12017b;

    /* renamed from: c */
    public volatile Object f12018c;

    public C8374Uk0(C8582Yk0 c8582Yk0, InterfaceC6434mZ interfaceC6434mZ) {
        if (c8582Yk0 == null) {
            m8136a(0);
            throw null;
        }
        this.f12018c = EnumC8530Xk0.f13942a;
        this.f12016a = c8582Yk0;
        this.f12017b = interfaceC6434mZ;
    }

    /* renamed from: a */
    public static /* synthetic */ void m8136a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: f */
    public C0926Oi mo6752f(boolean z) {
        C0926Oi c0926OiMo6421d = this.f12016a.mo6421d(null, "in a lazy value");
        if (c0926OiMo6421d != null) {
            return c0926OiMo6421d;
        }
        m8136a(2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:48:0x0011, B:50:0x0017, B:57:0x002a, B:59:0x0035, B:61:0x003a, B:63:0x0043, B:64:0x0046, B:68:0x0055, B:70:0x005b, B:72:0x005f, B:73:0x0066, B:74:0x006d, B:75:0x006e, B:76:0x0074, B:65:0x0048), top: B:79:0x0011, inners: #1 }] */
    @Override // p000.InterfaceC6434mZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12018c
            boolean r1 = r0 instanceof p000.EnumC8530Xk0
            if (r1 != 0) goto La
            p000.AbstractC11148tK1.m24879d(r0)
            return r0
        La:
            Yk0 r0 = r5.f12016a
            V01 r0 = r0.f14498a
            r0.lock()
            java.lang.Object r0 = r5.f12018c     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof p000.EnumC8530Xk0     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            p000.AbstractC11148tK1.m24879d(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            Yk0 r1 = r5.f12016a
            V01 r1 = r1.f14498a
            r1.unlock()
            return r0
        L22:
            r0 = move-exception
            goto L75
        L24:
            Xk0 r1 = p000.EnumC8530Xk0.f13943b
            Xk0 r2 = p000.EnumC8530Xk0.f13944c
            if (r0 != r1) goto L38
            r5.f12018c = r2     // Catch: java.lang.Throwable -> L22
            r3 = 1
            Oi r3 = r5.mo6752f(r3)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.f8575b     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L38
            java.lang.Object r0 = r3.f8576c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            if (r0 != r2) goto L46
            r0 = 0
            Oi r0 = r5.mo6752f(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.f8575b     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L46
            java.lang.Object r0 = r0.f8576c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L46:
            r5.f12018c = r1     // Catch: java.lang.Throwable -> L22
            mZ r0 = r5.f12017b     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L54
            r5.mo7112e(r0)     // Catch: java.lang.Throwable -> L54
            r5.f12018c = r0     // Catch: java.lang.Throwable -> L54
            goto L1a
        L54:
            r0 = move-exception
            boolean r2 = p000.H02.m3208a(r0)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r5.f12018c     // Catch: java.lang.Throwable -> L22
            if (r2 != r1) goto L66
            hp1 r1 = new hp1     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r5.f12018c = r1     // Catch: java.lang.Throwable -> L22
        L66:
            Yk0 r1 = r5.f12016a     // Catch: java.lang.Throwable -> L22
            tt r1 = r1.f14499b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L6e:
            Xk0 r1 = p000.EnumC8530Xk0.f13942a     // Catch: java.lang.Throwable -> L22
            r5.f12018c = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L75:
            Yk0 r1 = r5.f12016a
            V01 r1 = r1.f14498a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8374Uk0.invoke():java.lang.Object");
    }

    /* renamed from: e */
    public void mo7112e(Object obj) {
    }
}
