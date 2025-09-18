package p000;

import java.lang.reflect.Method;

/* renamed from: wg1 */
/* loaded from: classes.dex */
public final class C11575wg1 extends AbstractC7483Dg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f45024b;

    /* renamed from: c */
    public final /* synthetic */ int f45025c;

    public C11575wg1(int i, Method method) {
        this.f45024b = method;
        this.f45025c = i;
    }

    @Override // p000.AbstractC7483Dg1
    /* renamed from: a */
    public final Object mo281a(Class cls) {
        String strM2278o = ES1.m2278o(cls);
        if (strM2278o == null) {
            return this.f45024b.invoke(null, cls, Integer.valueOf(this.f45025c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM2278o));
    }
}
