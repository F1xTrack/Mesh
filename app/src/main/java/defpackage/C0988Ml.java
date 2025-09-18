package defpackage;

import java.lang.reflect.Field;

/* renamed from: Ml, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0988Ml extends AbstractC1222Pl implements InterfaceC1837Xi {
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988Ml(Field field, Object obj) {
        super(field, false);
        O90.f(field, "field");
        this.e = obj;
    }

    @Override // defpackage.AbstractC1222Pl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        return ((Field) this.a).get(this.e);
    }
}
