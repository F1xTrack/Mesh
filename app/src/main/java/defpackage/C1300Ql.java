package defpackage;

import java.lang.reflect.Field;

/* renamed from: Ql, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1300Ql extends AbstractC1534Tl implements InterfaceC1837Xi {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300Ql(Field field, boolean z, Object obj) {
        super(field, z, false);
        O90.f(field, "field");
        this.g = obj;
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        O90.f(objArr, "args");
        c(objArr);
        ((Field) this.a).set(this.g, J8.n(objArr));
        return C1518Tf1.a;
    }
}
