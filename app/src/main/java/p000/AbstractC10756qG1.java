package p000;

/* renamed from: qG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10756qG1 implements Cloneable, KI1 {

    /* renamed from: a */
    public final QG1 f40712a;

    /* renamed from: b */
    public QG1 f40713b;

    public AbstractC10756qG1(QG1 qg1) {
        this.f40712a = qg1;
        if (qg1.m6626k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f40713b = (QG1) qg1.mo180m(4, null);
    }

    @Override // p000.KI1
    /* renamed from: a */
    public final boolean mo4593a() {
        return QG1.m6621j(this.f40713b, false);
    }

    public final Object clone() {
        AbstractC10756qG1 abstractC10756qG1 = (AbstractC10756qG1) this.f40712a.mo180m(5, null);
        abstractC10756qG1.f40713b = mo1684h();
        return abstractC10756qG1;
    }

    /* renamed from: e */
    public final QG1 m23959e() {
        QG1 qg1Mo1684h = mo1684h();
        if (QG1.m6621j(qg1Mo1684h, true)) {
            return qg1Mo1684h;
        }
        throw new YL1();
    }

    /* renamed from: h */
    public QG1 mo1684h() {
        if (!this.f40713b.m6626k()) {
            return this.f40713b;
        }
        QG1 qg1 = this.f40713b;
        qg1.getClass();
        C9482gJ1.f27672c.m18426a(qg1.getClass()).mo7661a(qg1);
        qg1.m6624g();
        return this.f40713b;
    }

    /* renamed from: i */
    public /* bridge */ DD1 mo1685i() {
        return mo1684h();
    }

    /* renamed from: j */
    public final void m23960j() {
        if (this.f40713b.m6626k()) {
            return;
        }
        mo1686k();
    }

    /* renamed from: k */
    public void mo1686k() {
        QG1 qg1 = (QG1) this.f40712a.mo180m(4, null);
        C9482gJ1.f27672c.m18426a(qg1.getClass()).mo7663c(qg1, this.f40713b);
        this.f40713b = qg1;
    }
}
