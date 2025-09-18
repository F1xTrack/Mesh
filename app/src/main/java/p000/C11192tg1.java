package p000;

import java.lang.reflect.Method;

/* renamed from: tg1 */
/* loaded from: classes2.dex */
public final class C11192tg1 extends AbstractC7379Bg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f43214b;

    /* renamed from: c */
    public final /* synthetic */ Object f43215c;

    public C11192tg1(Object obj, Method method) {
        this.f43214b = method;
        this.f43215c = obj;
    }

    @Override // p000.AbstractC7379Bg1
    /* renamed from: a */
    public final Object mo799a(Class cls) {
        String strM23026a = C6459my.m23026a(cls);
        if (strM23026a == null) {
            return this.f43214b.invoke(this.f43215c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM23026a));
    }
}
