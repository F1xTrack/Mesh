package defpackage;

import java.lang.reflect.Method;

/* renamed from: xg1 */
/* loaded from: classes2.dex */
public final class C8029xg1 extends AbstractC0118Bg1 {
    public final /* synthetic */ Method b;

    public C8029xg1(Method method) {
        this.b = method;
    }

    @Override // defpackage.AbstractC0118Bg1
    public final Object a(Class cls) {
        String strA = C5983my.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
