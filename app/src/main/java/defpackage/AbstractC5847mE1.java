package defpackage;

/* renamed from: mE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5847mE1 implements Cloneable {
    public final EE1 a;
    public EE1 b;

    public AbstractC5847mE1(EE1 ee1) {
        this.a = ee1;
        if (ee1.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (EE1) ee1.m(4);
    }

    public final EE1 a() {
        EE1 ee1E = e();
        if (ee1E.k()) {
            return ee1E;
        }
        throw new GI1();
    }

    public final Object clone() {
        AbstractC5847mE1 abstractC5847mE1 = (AbstractC5847mE1) this.a.m(5);
        abstractC5847mE1.b = e();
        return abstractC5847mE1;
    }

    public final EE1 e() {
        if (!this.b.l()) {
            return this.b;
        }
        EE1 ee1 = this.b;
        ee1.getClass();
        IH1.c.a(ee1.getClass()).a(ee1);
        ee1.h();
        return this.b;
    }

    public final void h() {
        if (this.b.l()) {
            return;
        }
        EE1 ee1 = (EE1) this.a.m(4);
        IH1.c.a(ee1.getClass()).c(ee1, this.b);
        this.b = ee1;
    }
}
