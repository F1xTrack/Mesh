package defpackage;

import java.lang.reflect.Method;

/* renamed from: vg1 */
/* loaded from: classes2.dex */
public final class C7649vg1 extends AbstractC0118Bg1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public C7649vg1(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.AbstractC0118Bg1
    public final Object a(Class cls) {
        String strA = C5983my.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
