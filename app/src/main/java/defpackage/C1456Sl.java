package defpackage;

import java.lang.reflect.Field;

/* renamed from: Sl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1456Sl extends AbstractC1534Tl {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1456Sl(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.AbstractC2002Zl
    public void c(Object[] objArr) {
        switch (this.g) {
            case 1:
                O90.f(objArr, "args");
                super.c(objArr);
                d(J8.o(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
