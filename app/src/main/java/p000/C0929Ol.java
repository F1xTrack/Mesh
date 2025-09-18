package p000;

import java.lang.reflect.Field;

/* renamed from: Ol */
/* loaded from: classes2.dex */
public final class C0929Ol extends AbstractC0992Pl {

    /* renamed from: e */
    public final /* synthetic */ int f8595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0929Ol(Field field, boolean z, int i) {
        super(field, z);
        this.f8595e = i;
    }

    @Override // p000.AbstractC1621Zl
    /* renamed from: c */
    public void mo6129c(Object[] objArr) {
        switch (this.f8595e) {
            case 1:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                m9585d(AbstractC0576J8.m4188o(objArr));
                break;
            default:
                super.mo6129c(objArr);
                break;
        }
    }
}
