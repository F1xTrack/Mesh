package defpackage;

import java.lang.reflect.Field;

/* renamed from: Ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1144Ol extends AbstractC1222Pl {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1144Ol(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }

    @Override // defpackage.AbstractC2002Zl
    public void c(Object[] objArr) {
        switch (this.e) {
            case 1:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                d(J8.o(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
