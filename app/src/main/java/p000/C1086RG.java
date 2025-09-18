package p000;

/* renamed from: RG */
/* loaded from: classes.dex */
public final class C1086RG implements Comparable {

    /* renamed from: a */
    public final boolean f10098a;

    /* renamed from: b */
    public final boolean f10099b;

    public C1086RG(C6686qX c6686qX, int i) {
        this.f10098a = (c6686qX.f40966e & 1) != 0;
        this.f10099b = AbstractC11153tN0.m24907s(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1086RG c1086rg = (C1086RG) obj;
        return AbstractC4146gv.f28081a.mo18074c(this.f10099b, c1086rg.f10099b).mo18074c(this.f10098a, c1086rg.f10098a).mo18076e();
    }
}
