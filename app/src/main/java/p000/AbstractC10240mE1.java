package p000;

/* renamed from: mE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10240mE1 implements Cloneable {

    /* renamed from: a */
    public final EE1 f37583a;

    /* renamed from: b */
    public EE1 f37584b;

    public AbstractC10240mE1(EE1 ee1) {
        this.f37583a = ee1;
        if (ee1.m2099l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f37584b = (EE1) ee1.mo1649m(4);
    }

    /* renamed from: a */
    public final EE1 m22706a() {
        EE1 ee1M22707e = m22707e();
        if (ee1M22707e.m2098k()) {
            return ee1M22707e;
        }
        throw new GI1();
    }

    public final Object clone() {
        AbstractC10240mE1 abstractC10240mE1 = (AbstractC10240mE1) this.f37583a.mo1649m(5);
        abstractC10240mE1.f37584b = m22707e();
        return abstractC10240mE1;
    }

    /* renamed from: e */
    public final EE1 m22707e() {
        if (!this.f37584b.m2099l()) {
            return this.f37584b;
        }
        EE1 ee1 = this.f37584b;
        ee1.getClass();
        IH1.f4877c.m3806a(ee1.getClass()).mo6286a(ee1);
        ee1.m2096h();
        return this.f37584b;
    }

    /* renamed from: h */
    public final void m22708h() {
        if (this.f37584b.m2099l()) {
            return;
        }
        EE1 ee1 = (EE1) this.f37583a.mo1649m(4);
        IH1.f4877c.m3806a(ee1.getClass()).mo6288c(ee1, this.f37584b);
        this.f37584b = ee1;
    }
}
