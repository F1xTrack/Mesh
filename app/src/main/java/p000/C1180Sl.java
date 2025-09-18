package p000;

import java.lang.reflect.Field;

/* renamed from: Sl */
/* loaded from: classes2.dex */
public final class C1180Sl extends AbstractC1243Tl {

    /* renamed from: g */
    public final /* synthetic */ int f10966g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1180Sl(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.f10966g = i;
    }

    @Override // p000.AbstractC1243Tl, p000.AbstractC1621Zl
    /* renamed from: c */
    public void mo6129c(Object[] objArr) {
        switch (this.f10966g) {
            case 1:
                O90.m5968f(objArr, "args");
                super.mo6129c(objArr);
                m9585d(AbstractC0576J8.m4188o(objArr));
                break;
            default:
                super.mo6129c(objArr);
                break;
        }
    }
}
