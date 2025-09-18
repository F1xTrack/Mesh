package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* renamed from: tf0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7263tf0 extends AbstractC1589Ud0 implements InterfaceC5927mf0 {
    public static final Object m = new Object();
    public final AbstractC6497pe0 g;
    public final String h;
    public final String i;
    public final Object j;
    public final Object k;
    public final AP0 l;

    public AbstractC7263tf0(AbstractC6497pe0 abstractC6497pe0, String str, String str2, EE0 ee0, Object obj) {
        this.g = abstractC6497pe0;
        this.h = str;
        this.i = str2;
        this.j = obj;
        this.k = LB.c(EnumC4205hi0.b, new C7072sf0(this, 1));
        this.l = AbstractC7978xP1.a(ee0, new C7072sf0(this, 0));
    }

    public final boolean equals(Object obj) {
        AbstractC7263tf0 abstractC7263tf0C = AbstractC0433Fh1.c(obj);
        return abstractC7263tf0C != null && O90.a(this.g, abstractC7263tf0C.g) && O90.a(this.h, abstractC7263tf0C.h) && O90.a(this.i, abstractC7263tf0C.i) && O90.a(this.j, abstractC7263tf0C.j);
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final String getName() {
        return this.h;
    }

    public final int hashCode() {
        return this.i.hashCode() + AbstractC1705Vq.e(this.g.hashCode() * 31, 31, this.h);
    }

    @Override // defpackage.InterfaceC1277Qd0, defpackage.InterfaceC6878re0
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl m() {
        return v().m();
    }

    @Override // defpackage.AbstractC1589Ud0
    public final AbstractC6497pe0 n() {
        return this.g;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl o() {
        v().getClass();
        return null;
    }

    @Override // defpackage.AbstractC1589Ud0
    public final boolean s() {
        return !O90.a(this.j, AbstractC8422zl.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Member t() {
        if (!p().Q()) {
            return null;
        }
        C0074As c0074As = AbstractC6276oU0.a;
        S22 s22B = AbstractC6276oU0.b(p());
        if (s22B instanceof C7639vd0) {
            C7639vd0 c7639vd0 = (C7639vd0) s22B;
            C0186Cd0 c0186Cd0 = c7639vd0.c;
            if ((c0186Cd0.b & 16) == 16) {
                C0030Ad0 c0030Ad0 = c0186Cd0.g;
                int i = c0030Ad0.b;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                int i2 = c0030Ad0.c;
                InterfaceC1637Ut0 interfaceC1637Ut0 = c7639vd0.d;
                return this.g.m(interfaceC1637Ut0.getString(i2), interfaceC1637Ut0.getString(c0030Ad0.d));
            }
        }
        return (Field) this.k.getValue();
    }

    public final String toString() {
        C5857mI c5857mI = QP0.a;
        return QP0.c(p());
    }

    @Override // defpackage.AbstractC1589Ud0
    /* renamed from: u */
    public final CE0 p() {
        Object objInvoke = this.l.invoke();
        O90.e(objInvoke, "invoke(...)");
        return (CE0) objInvoke;
    }

    public abstract AbstractC6500pf0 v();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC7263tf0(AbstractC6497pe0 abstractC6497pe0, String str, String str2, Object obj) {
        this(abstractC6497pe0, str, str2, null, obj);
        O90.f(abstractC6497pe0, "container");
        O90.f(str, "name");
        O90.f(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7263tf0(AbstractC6497pe0 abstractC6497pe0, EE0 ee0) {
        O90.f(abstractC6497pe0, "container");
        O90.f(ee0, "descriptor");
        String strB = ee0.getName().b();
        O90.e(strB, "asString(...)");
        this(abstractC6497pe0, strB, AbstractC6276oU0.b(ee0).a(), ee0, AbstractC8422zl.NO_RECEIVER);
    }
}
