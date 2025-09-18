package defpackage;

import java.lang.reflect.Method;

/* renamed from: wg1 */
/* loaded from: classes.dex */
public final class C7839wg1 extends AbstractC0274Dg1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public C7839wg1(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.AbstractC0274Dg1
    public final Object a(Class cls) {
        String strO = ES1.o(cls);
        if (strO == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strO));
    }
}
