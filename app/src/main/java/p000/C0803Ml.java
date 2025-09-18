package p000;

import java.lang.reflect.Field;

/* renamed from: Ml */
/* loaded from: classes2.dex */
public final class C0803Ml extends AbstractC0992Pl implements InterfaceC1492Xi {

    /* renamed from: e */
    public final Object f7319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803Ml(Field field, Object obj) {
        super(field, false);
        O90.m5968f(field, "field");
        this.f7319e = obj;
    }

    @Override // p000.AbstractC0992Pl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        return ((Field) this.f15104a).get(this.f7319e);
    }
}
