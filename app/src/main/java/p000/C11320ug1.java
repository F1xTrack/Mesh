package p000;

import java.lang.reflect.Method;

/* renamed from: ug1 */
/* loaded from: classes.dex */
public final class C11320ug1 extends AbstractC7483Dg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f43791b;

    /* renamed from: c */
    public final /* synthetic */ Object f43792c;

    public C11320ug1(Object obj, Method method) {
        this.f43791b = method;
        this.f43792c = obj;
    }

    @Override // p000.AbstractC7483Dg1
    /* renamed from: a */
    public final Object mo281a(Class cls) {
        String strM2278o = ES1.m2278o(cls);
        if (strM2278o == null) {
            return this.f43791b.invoke(this.f43792c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2278o));
    }
}
