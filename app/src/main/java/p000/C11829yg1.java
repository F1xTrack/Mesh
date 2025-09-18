package p000;

import java.lang.reflect.Method;

/* renamed from: yg1 */
/* loaded from: classes.dex */
public final class C11829yg1 extends AbstractC7483Dg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f46415b;

    public C11829yg1(Method method) {
        this.f46415b = method;
    }

    @Override // p000.AbstractC7483Dg1
    /* renamed from: a */
    public final Object mo281a(Class cls) {
        String strM2278o = ES1.m2278o(cls);
        if (strM2278o == null) {
            return this.f46415b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2278o));
    }
}
