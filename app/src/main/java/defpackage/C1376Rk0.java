package defpackage;

/* renamed from: Rk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1376Rk0 extends C1610Uk0 implements InterfaceC1331Qv0 {
    public volatile C0999Mo1 d;
    public final /* synthetic */ C8277z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376Rk0(C1922Yk0 c1922Yk0, C3881g1 c3881g1, C8277z c8277z) {
        super(c1922Yk0, c3881g1);
        this.e = c8277z;
        if (c1922Yk0 == null) {
            g(0);
            throw null;
        }
        this.d = null;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.C1610Uk0
    public final void e(Object obj) {
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = obj;
        c0999Mo1.b = Thread.currentThread();
        this.d = c0999Mo1;
        try {
            if (obj != null) {
                this.e.invoke(obj);
            } else {
                a(2);
                throw null;
            }
        } finally {
            this.d = null;
        }
    }

    @Override // defpackage.C1610Uk0
    public final C1135Oi f(boolean z) {
        return new C1135Oi(C4258i.g.invoke(Boolean.valueOf(z)), false, 7);
    }

    @Override // defpackage.C1610Uk0, defpackage.InterfaceC5908mZ
    public final Object invoke() throws Throwable {
        Object objInvoke;
        C0999Mo1 c0999Mo1 = this.d;
        if (c0999Mo1 == null || ((Thread) c0999Mo1.b) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) c0999Mo1.b) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = c0999Mo1.a;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        g(2);
        throw null;
    }
}
