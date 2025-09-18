package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: hP */
/* loaded from: classes2.dex */
public final class C4147hP extends X01 {
    public final InterfaceC1200Pd1 b;
    public final C3574eP c;
    public final EnumC5305jP d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String h;

    public C4147hP(InterfaceC1200Pd1 interfaceC1200Pd1, C3574eP c3574eP, EnumC5305jP enumC5305jP, List list, boolean z, String... strArr) {
        O90.f(enumC5305jP, "kind");
        O90.f(list, "arguments");
        O90.f(strArr, "formatParams");
        this.b = interfaceC1200Pd1;
        this.c = c3574eP;
        this.d = enumC5305jP;
        this.e = list;
        this.f = z;
        this.g = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.h = String.format(enumC5305jP.a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        C0733Jd1.b.getClass();
        return C0733Jd1.c;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC1200Pd1 E() {
        return this.b;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final boolean G() {
        return this.f;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.X01, defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return this;
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        String[] strArr = this.g;
        return new C4147hP(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return this;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        return this.c;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return this.e;
    }
}
