package defpackage;

/* renamed from: ol */
/* loaded from: classes2.dex */
public abstract class AbstractC6326ol {
    public static final N8 a;
    public static final N8 b;
    public static final N8 c;
    public static final N8 d;
    public static final N8 e;

    static {
        C4258i c4258i = C4258i.s;
        int i = AbstractC1999Zk.a;
        a = new N8(c4258i);
        b = new N8(C4258i.t);
        c = new N8(C4258i.p);
        d = new N8(C4258i.r);
        e = new N8(C4258i.q);
    }

    public static final C3430de0 a(Class cls) {
        O90.f(cls, "jClass");
        Object objK = a.k(cls);
        O90.d(objK, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C3430de0) objK;
    }
}
