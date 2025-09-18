package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* renamed from: tf0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11189tf0 extends AbstractC8360Ud0 implements InterfaceC10293mf0 {

    /* renamed from: m */
    public static final Object f43196m = new Object();

    /* renamed from: g */
    public final AbstractC10675pe0 f43197g;

    /* renamed from: h */
    public final String f43198h;

    /* renamed from: i */
    public final String f43199i;

    /* renamed from: j */
    public final Object f43200j;

    /* renamed from: k */
    public final Object f43201k;

    /* renamed from: l */
    public final AP0 f43202l;

    public AbstractC11189tf0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, EE0 ee0, Object obj) {
        this.f43197g = abstractC10675pe0;
        this.f43198h = str;
        this.f43199i = str2;
        this.f43200j = obj;
        this.f43201k = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C11061sf0(this, 1));
        this.f43202l = AbstractC11668xP1.m25850a(ee0, new C11061sf0(this, 0));
    }

    public final boolean equals(Object obj) {
        AbstractC11189tf0 abstractC11189tf0M2751c = AbstractC7589Fh1.m2751c(obj);
        return abstractC11189tf0M2751c != null && O90.m5963a(this.f43197g, abstractC11189tf0M2751c.f43197g) && O90.m5963a(this.f43198h, abstractC11189tf0M2751c.f43198h) && O90.m5963a(this.f43199i, abstractC11189tf0M2751c.f43199i) && O90.m5963a(this.f43200j, abstractC11189tf0M2751c.f43200j);
    }

    @Override // p000.InterfaceC8152Qd0
    public final String getName() {
        return this.f43198h;
    }

    public final int hashCode() {
        return this.f43199i.hashCode() + AbstractC1374Vq.m8586e(this.f43197g.hashCode() * 31, 31, this.f43198h);
    }

    @Override // p000.InterfaceC8152Qd0, p000.InterfaceC10931re0
    public final boolean isSuspend() {
        return false;
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: m */
    public final InterfaceC0615Jl mo8091m() {
        return mo10479v().mo8091m();
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: n */
    public final AbstractC10675pe0 mo8092n() {
        return this.f43197g;
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: o */
    public final InterfaceC0615Jl mo8093o() {
        mo10479v().getClass();
        return null;
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: s */
    public final boolean mo8097s() {
        return !O90.m5963a(this.f43200j, AbstractC7284zl.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: t */
    public final Member m24957t() {
        if (!mo8094p().mo1120Q()) {
            return null;
        }
        C0055As c0055As = AbstractC10527oU0.f39027a;
        S22 s22M23469b = AbstractC10527oU0.m23469b(mo8094p());
        if (s22M23469b instanceof C11441vd0) {
            C11441vd0 c11441vd0 = (C11441vd0) s22M23469b;
            C7424Cd0 c7424Cd0 = c11441vd0.f44453c;
            if ((c7424Cd0.f1496b & 16) == 16) {
                C7320Ad0 c7320Ad0 = c7424Cd0.f1501g;
                int i = c7320Ad0.f292b;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                int i2 = c7320Ad0.f293c;
                InterfaceC8392Ut0 interfaceC8392Ut0 = c11441vd0.f44454d;
                return this.f43197g.m23829m(interfaceC8392Ut0.getString(i2), interfaceC8392Ut0.getString(c7320Ad0.f294d));
            }
        }
        return (Field) this.f43201k.getValue();
    }

    public final String toString() {
        C6417mI c6417mI = QP0.f9616a;
        return QP0.m6684c(mo8094p());
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: u */
    public final CE0 mo8094p() {
        Object objInvoke = this.f43202l.invoke();
        O90.m5967e(objInvoke, "invoke(...)");
        return (CE0) objInvoke;
    }

    /* renamed from: v */
    public abstract AbstractC10677pf0 mo10479v();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC11189tf0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, Object obj) {
        this(abstractC10675pe0, str, str2, null, obj);
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(str, "name");
        O90.m5968f(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC11189tf0(AbstractC10675pe0 abstractC10675pe0, EE0 ee0) {
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(ee0, "descriptor");
        String strM7801b = ee0.getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        this(abstractC10675pe0, strM7801b, AbstractC10527oU0.m23469b(ee0).mo7168a(), ee0, AbstractC7284zl.NO_RECEIVER);
    }
}
