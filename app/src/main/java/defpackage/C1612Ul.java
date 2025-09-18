package defpackage;

import java.lang.reflect.Method;

/* renamed from: Ul, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1612Ul extends AbstractC1534Tl implements InterfaceC1837Xi {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612Ul(Object obj, Method method) {
        super(method, false, 4);
        O90.f(method, "method");
        this.g = obj;
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        return e(objArr, this.g);
    }
}
