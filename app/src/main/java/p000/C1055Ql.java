package p000;

import java.lang.reflect.Field;

/* renamed from: Ql */
/* loaded from: classes2.dex */
public final class C1055Ql extends AbstractC1243Tl implements InterfaceC1492Xi {

    /* renamed from: g */
    public final Object f9760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055Ql(Field field, boolean z, Object obj) {
        super(field, z, false);
        O90.m5968f(field, "field");
        this.f9760g = obj;
    }

    @Override // p000.AbstractC1243Tl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        O90.m5968f(objArr, "args");
        mo6129c(objArr);
        ((Field) this.f15104a).set(this.f9760g, AbstractC0576J8.m4187n(objArr));
        return C8313Tf1.f11463a;
    }
}
