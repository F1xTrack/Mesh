package p000;

import java.lang.reflect.Method;

/* renamed from: Ul */
/* loaded from: classes2.dex */
public final class C1306Ul extends AbstractC1243Tl implements InterfaceC1492Xi {

    /* renamed from: g */
    public final Object f12022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306Ul(Object obj, Method method) {
        super(method, false, 4);
        O90.m5968f(method, "method");
        this.f12022g = obj;
    }

    @Override // p000.AbstractC1243Tl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        return m7737e(objArr, this.f12022g);
    }
}
