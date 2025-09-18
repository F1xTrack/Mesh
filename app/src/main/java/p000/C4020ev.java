package p000;

import java.util.Comparator;

/* renamed from: ev */
/* loaded from: classes.dex */
public final class C4020ev extends AbstractC4146gv {
    /* renamed from: f */
    public static AbstractC4146gv m18071f(int i) {
        return i < 0 ? AbstractC4146gv.f28082b : i > 0 ? AbstractC4146gv.f28083c : AbstractC4146gv.f28081a;
    }

    @Override // p000.AbstractC4146gv
    /* renamed from: a */
    public final AbstractC4146gv mo18072a(int i, int i2) {
        return m18071f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // p000.AbstractC4146gv
    /* renamed from: b */
    public final AbstractC4146gv mo18073b(Object obj, Object obj2, Comparator comparator) {
        return m18071f(comparator.compare(obj, obj2));
    }

    @Override // p000.AbstractC4146gv
    /* renamed from: c */
    public final AbstractC4146gv mo18074c(boolean z, boolean z2) {
        return m18071f(z == z2 ? 0 : z ? 1 : -1);
    }

    @Override // p000.AbstractC4146gv
    /* renamed from: d */
    public final AbstractC4146gv mo18075d(boolean z, boolean z2) {
        return m18071f(z2 == z ? 0 : z2 ? 1 : -1);
    }

    @Override // p000.AbstractC4146gv
    /* renamed from: e */
    public final int mo18076e() {
        return 0;
    }
}
