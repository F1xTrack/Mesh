package p000;

/* renamed from: Rk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8218Rk0 extends C8374Uk0 implements InterfaceC8188Qv0 {

    /* renamed from: d */
    public volatile C7967Mo1 f10408d;

    /* renamed from: e */
    public final /* synthetic */ C7236z f10409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8218Rk0(C8582Yk0 c8582Yk0, C4090g1 c4090g1, C7236z c7236z) {
        super(c8582Yk0, c4090g1);
        this.f10409e = c7236z;
        if (c8582Yk0 == null) {
            m7111g(0);
            throw null;
        }
        this.f10408d = null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m7110a(int i) {
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

    /* renamed from: g */
    public static /* synthetic */ void m7111g(int i) {
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

    @Override // p000.C8374Uk0
    /* renamed from: e */
    public final void mo7112e(Object obj) {
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = obj;
        c7967Mo1.f7363b = Thread.currentThread();
        this.f10408d = c7967Mo1;
        try {
            if (obj != null) {
                this.f10409e.invoke(obj);
            } else {
                m7110a(2);
                throw null;
            }
        } finally {
            this.f10408d = null;
        }
    }

    @Override // p000.C8374Uk0
    /* renamed from: f */
    public final C0926Oi mo6752f(boolean z) {
        return new C0926Oi(C4214i.f28722g.invoke(Boolean.valueOf(z)), false, 7);
    }

    @Override // p000.C8374Uk0, p000.InterfaceC6434mZ
    public final Object invoke() throws Throwable {
        Object objInvoke;
        C7967Mo1 c7967Mo1 = this.f10408d;
        if (c7967Mo1 == null || ((Thread) c7967Mo1.f7363b) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) c7967Mo1.f7363b) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = c7967Mo1.f7362a;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        m7111g(2);
        throw null;
    }
}
