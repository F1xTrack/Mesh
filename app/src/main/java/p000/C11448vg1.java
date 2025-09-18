package p000;

import java.lang.reflect.Method;

/* renamed from: vg1 */
/* loaded from: classes2.dex */
public final class C11448vg1 extends AbstractC7379Bg1 {

    /* renamed from: b */
    public final /* synthetic */ Method f44488b;

    /* renamed from: c */
    public final /* synthetic */ int f44489c;

    public C11448vg1(int i, Method method) {
        this.f44488b = method;
        this.f44489c = i;
    }

    @Override // p000.AbstractC7379Bg1
    /* renamed from: a */
    public final Object mo799a(Class cls) {
        String strM23026a = C6459my.m23026a(cls);
        if (strM23026a == null) {
            return this.f44488b.invoke(null, cls, Integer.valueOf(this.f44489c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM23026a));
    }
}
