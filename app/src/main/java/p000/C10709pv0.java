package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: pv0 */
/* loaded from: classes2.dex */
public final class C10709pv0 implements InterfaceC6451mq {

    /* renamed from: a */
    public final AbstractC10804qe1 f40434a;

    /* renamed from: b */
    public InterfaceC6434mZ f40435b;

    /* renamed from: c */
    public final C10709pv0 f40436c;

    /* renamed from: d */
    public final InterfaceC10292me1 f40437d;

    /* renamed from: e */
    public final Object f40438e;

    public /* synthetic */ C10709pv0(AbstractC10804qe1 abstractC10804qe1, C0082BI c0082bi, C10709pv0 c10709pv0, InterfaceC10292me1 interfaceC10292me1, int i) {
        this(abstractC10804qe1, (i & 2) != 0 ? null : c0082bi, (i & 4) != 0 ? null : c10709pv0, (i & 8) != 0 ? null : interfaceC10292me1);
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        Collection collection = (List) this.f40438e.getValue();
        if (collection == null) {
            collection = C0779MN.f7117a;
        }
        return collection;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return false;
    }

    @Override // p000.InterfaceC6451mq
    /* renamed from: d */
    public final AbstractC10804qe1 mo22969d() {
        return this.f40434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10709pv0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C10709pv0 c10709pv0 = (C10709pv0) obj;
        C10709pv0 c10709pv02 = this.f40436c;
        if (c10709pv02 == null) {
            c10709pv02 = this;
        }
        C10709pv0 c10709pv03 = c10709pv0.f40436c;
        if (c10709pv03 != null) {
            c10709pv0 = c10709pv03;
        }
        return c10709pv02 == c10709pv0;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = this.f40434a.mo24038b();
        O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
        return CZ1.m1230f(abstractC7742Ig0Mo24038b);
    }

    public final int hashCode() {
        C10709pv0 c10709pv0 = this.f40436c;
        return c10709pv0 != null ? c10709pv0.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f40434a + ')';
    }

    public C10709pv0(AbstractC10804qe1 abstractC10804qe1, InterfaceC6434mZ interfaceC6434mZ, C10709pv0 c10709pv0, InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(abstractC10804qe1, "projection");
        this.f40434a = abstractC10804qe1;
        this.f40435b = interfaceC6434mZ;
        this.f40436c = c10709pv0;
        this.f40437d = interfaceC10292me1;
        this.f40438e = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C10801qd0(13, this));
    }
}
