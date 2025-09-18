package p000;

import java.lang.reflect.Method;

/* renamed from: xg1 */
/* loaded from: classes2.dex */
public final class C11702xg1 extends AbstractC7379Bg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f45735b;

    public C11702xg1(Method method) {
        this.f45735b = method;
    }

    @Override // p000.AbstractC7379Bg1
    /* renamed from: a */
    public final Object mo799a(Class cls) {
        String strM23026a = C6459my.m23026a(cls);
        if (strM23026a == null) {
            return this.f45735b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM23026a));
    }
}
