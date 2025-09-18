package defpackage;

import java.lang.reflect.Method;

/* renamed from: tg1 */
/* loaded from: classes2.dex */
public final class C7267tg1 extends AbstractC0118Bg1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public C7267tg1(Object obj, Method method) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.AbstractC0118Bg1
    public final Object a(Class cls) {
        String strA = C5983my.a(cls);
        if (strA == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
