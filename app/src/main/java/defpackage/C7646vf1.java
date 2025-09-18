package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: vf1 */
/* loaded from: classes.dex */
public final class C7646vf1 extends AbstractC8026xf1 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final /* synthetic */ C8216yf1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7646vf1(C8216yf1 c8216yf1, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(i2);
        this.g = c8216yf1;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        MT1.a(i2, "updateLayout");
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MT1.c(this.a, "updateLayout");
        this.g.b.updateLayout(this.b, this.a, this.c, this.d, this.e, this.f);
    }
}
