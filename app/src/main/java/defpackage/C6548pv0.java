package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: pv0 */
/* loaded from: classes2.dex */
public final class C6548pv0 implements InterfaceC5959mq {
    public final AbstractC6689qe1 a;
    public InterfaceC5908mZ b;
    public final C6548pv0 c;
    public final InterfaceC5925me1 d;
    public final Object e;

    public /* synthetic */ C6548pv0(AbstractC6689qe1 abstractC6689qe1, BI bi, C6548pv0 c6548pv0, InterfaceC5925me1 interfaceC5925me1, int i) {
        this(abstractC6689qe1, (i & 2) != 0 ? null : bi, (i & 4) != 0 ? null : c6548pv0, (i & 8) != 0 ? null : interfaceC5925me1);
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        Collection collection = (List) this.e.getValue();
        if (collection == null) {
            collection = MN.a;
        }
        return collection;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC5959mq
    public final AbstractC6689qe1 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6548pv0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C6548pv0 c6548pv0 = (C6548pv0) obj;
        C6548pv0 c6548pv02 = this.c;
        if (c6548pv02 == null) {
            c6548pv02 = this;
        }
        C6548pv0 c6548pv03 = c6548pv0.c;
        if (c6548pv03 != null) {
            c6548pv0 = c6548pv03;
        }
        return c6548pv02 == c6548pv0;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        AbstractC0663Ig0 abstractC0663Ig0B = this.a.b();
        O90.e(abstractC0663Ig0B, "getType(...)");
        return CZ1.f(abstractC0663Ig0B);
    }

    public final int hashCode() {
        C6548pv0 c6548pv0 = this.c;
        return c6548pv0 != null ? c6548pv0.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public C6548pv0(AbstractC6689qe1 abstractC6689qe1, InterfaceC5908mZ interfaceC5908mZ, C6548pv0 c6548pv0, InterfaceC5925me1 interfaceC5925me1) {
        O90.f(abstractC6689qe1, "projection");
        this.a = abstractC6689qe1;
        this.b = interfaceC5908mZ;
        this.c = c6548pv0;
        this.d = interfaceC5925me1;
        this.e = LB.c(EnumC4205hi0.b, new C6685qd0(13, this));
    }
}
