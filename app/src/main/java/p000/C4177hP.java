package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: hP */
/* loaded from: classes2.dex */
public final class C4177hP extends X01 {

    /* renamed from: b */
    public final InterfaceC8101Pd1 f28406b;

    /* renamed from: c */
    public final C3988eP f28407c;

    /* renamed from: d */
    public final EnumC6235jP f28408d;

    /* renamed from: e */
    public final List f28409e;

    /* renamed from: f */
    public final boolean f28410f;

    /* renamed from: g */
    public final String[] f28411g;

    /* renamed from: h */
    public final String f28412h;

    public C4177hP(InterfaceC8101Pd1 interfaceC8101Pd1, C3988eP c3988eP, EnumC6235jP enumC6235jP, List list, boolean z, String... strArr) {
        O90.m5968f(enumC6235jP, "kind");
        O90.m5968f(list, "arguments");
        O90.m5968f(strArr, "formatParams");
        this.f28406b = interfaceC8101Pd1;
        this.f28407c = c3988eP;
        this.f28408d = enumC6235jP;
        this.f28409e = list;
        this.f28410f = z;
        this.f28411g = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f28412h = String.format(enumC6235jP.f35142a, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        C7789Jd1.f5652b.getClass();
        return C7789Jd1.f5653c;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return this.f28406b;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return this.f28410f;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        return this;
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        return this;
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: T */
    public final AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return this;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        String[] strArr = this.f28411g;
        return new C4177hP(this.f28406b, this.f28407c, this.f28408d, this.f28409e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return this;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        return this.f28407c;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return this.f28409e;
    }
}
