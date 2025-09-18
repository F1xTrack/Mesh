package defpackage;

/* renamed from: Uk0 */
/* loaded from: classes2.dex */
public class C1610Uk0 implements InterfaceC5908mZ {
    public final C1922Yk0 a;
    public final InterfaceC5908mZ b;
    public volatile Object c;

    public C1610Uk0(C1922Yk0 c1922Yk0, InterfaceC5908mZ interfaceC5908mZ) {
        if (c1922Yk0 == null) {
            a(0);
            throw null;
        }
        this.c = EnumC1844Xk0.a;
        this.a = c1922Yk0;
        this.b = interfaceC5908mZ;
    }

    public static /* synthetic */ void a(int i) {
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

    public C1135Oi f(boolean z) {
        C1135Oi c1135OiD = this.a.d(null, "in a lazy value");
        if (c1135OiD != null) {
            return c1135OiD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:48:0x0011, B:50:0x0017, B:57:0x002a, B:59:0x0035, B:61:0x003a, B:63:0x0043, B:64:0x0046, B:68:0x0055, B:70:0x005b, B:72:0x005f, B:73:0x0066, B:74:0x006d, B:75:0x006e, B:76:0x0074, B:65:0x0048), top: B:79:0x0011, inners: #1 }] */
    @Override // defpackage.InterfaceC5908mZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            boolean r1 = r0 instanceof defpackage.EnumC1844Xk0
            if (r1 != 0) goto La
            defpackage.AbstractC7201tK1.d(r0)
            return r0
        La:
            Yk0 r0 = r5.a
            V01 r0 = r0.a
            r0.lock()
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof defpackage.EnumC1844Xk0     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            defpackage.AbstractC7201tK1.d(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            Yk0 r1 = r5.a
            V01 r1 = r1.a
            r1.unlock()
            return r0
        L22:
            r0 = move-exception
            goto L75
        L24:
            Xk0 r1 = defpackage.EnumC1844Xk0.b
            Xk0 r2 = defpackage.EnumC1844Xk0.c
            if (r0 != r1) goto L38
            r5.c = r2     // Catch: java.lang.Throwable -> L22
            r3 = 1
            Oi r3 = r5.f(r3)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.b     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L38
            java.lang.Object r0 = r3.c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            if (r0 != r2) goto L46
            r0 = 0
            Oi r0 = r5.f(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.b     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L46
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L46:
            r5.c = r1     // Catch: java.lang.Throwable -> L22
            mZ r0 = r5.b     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L54
            r5.e(r0)     // Catch: java.lang.Throwable -> L54
            r5.c = r0     // Catch: java.lang.Throwable -> L54
            goto L1a
        L54:
            r0 = move-exception
            boolean r2 = defpackage.H02.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r5.c     // Catch: java.lang.Throwable -> L22
            if (r2 != r1) goto L66
            hp1 r1 = new hp1     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r5.c = r1     // Catch: java.lang.Throwable -> L22
        L66:
            Yk0 r1 = r5.a     // Catch: java.lang.Throwable -> L22
            tt r1 = r1.b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L6e:
            Xk0 r1 = defpackage.EnumC1844Xk0.a     // Catch: java.lang.Throwable -> L22
            r5.c = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L75:
            Yk0 r1 = r5.a
            V01 r1 = r1.a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1610Uk0.invoke():java.lang.Object");
    }

    public void e(Object obj) {
    }
}
