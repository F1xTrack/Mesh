package defpackage;

import java.lang.reflect.Method;

/* renamed from: ug1 */
/* loaded from: classes.dex */
public final class C7458ug1 extends AbstractC0274Dg1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public C7458ug1(Object obj, Method method) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.AbstractC0274Dg1
    public final Object a(Class cls) {
        String strO = ES1.o(cls);
        if (strO == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strO));
    }
}
