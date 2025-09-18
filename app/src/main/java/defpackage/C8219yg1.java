package defpackage;

import java.lang.reflect.Method;

/* renamed from: yg1 */
/* loaded from: classes.dex */
public final class C8219yg1 extends AbstractC0274Dg1 {
    public final /* synthetic */ Method b;

    public C8219yg1(Method method) {
        this.b = method;
    }

    @Override // defpackage.AbstractC0274Dg1
    public final Object a(Class cls) {
        String strO = ES1.o(cls);
        if (strO == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strO));
    }
}
