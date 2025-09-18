package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: vf1 */
/* loaded from: classes.dex */
public final class C11446vf1 extends AbstractC11700xf1 {

    /* renamed from: b */
    public final int f44465b;

    /* renamed from: c */
    public final int f44466c;

    /* renamed from: d */
    public final int f44467d;

    /* renamed from: e */
    public final int f44468e;

    /* renamed from: f */
    public final int f44469f;

    /* renamed from: g */
    public final /* synthetic */ C11827yf1 f44470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11446vf1(C11827yf1 c11827yf1, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(i2);
        this.f44470g = c11827yf1;
        this.f44465b = i;
        this.f44466c = i3;
        this.f44467d = i4;
        this.f44468e = i5;
        this.f44469f = i6;
        MT1.m5370a(i2, "updateLayout");
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MT1.m5372c(this.f45729a, "updateLayout");
        this.f44470g.f46385b.updateLayout(this.f44465b, this.f45729a, this.f44466c, this.f44467d, this.f44468e, this.f44469f);
    }
}
