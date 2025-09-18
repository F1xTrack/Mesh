package defpackage;

/* renamed from: qG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6617qG1 implements Cloneable, KI1 {
    public final QG1 a;
    public QG1 b;

    public AbstractC6617qG1(QG1 qg1) {
        this.a = qg1;
        if (qg1.k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (QG1) qg1.m(4, null);
    }

    @Override // defpackage.KI1
    public final boolean a() {
        return QG1.j(this.b, false);
    }

    public final Object clone() {
        AbstractC6617qG1 abstractC6617qG1 = (AbstractC6617qG1) this.a.m(5, null);
        abstractC6617qG1.b = h();
        return abstractC6617qG1;
    }

    public final QG1 e() {
        QG1 qg1H = h();
        if (QG1.j(qg1H, true)) {
            return qg1H;
        }
        throw new YL1();
    }

    public QG1 h() {
        if (!this.b.k()) {
            return this.b;
        }
        QG1 qg1 = this.b;
        qg1.getClass();
        C3940gJ1.c.a(qg1.getClass()).a(qg1);
        qg1.g();
        return this.b;
    }

    public /* bridge */ DD1 i() {
        return h();
    }

    public final void j() {
        if (this.b.k()) {
            return;
        }
        k();
    }

    public void k() {
        QG1 qg1 = (QG1) this.a.m(4, null);
        C3940gJ1.c.a(qg1.getClass()).c(qg1, this.b);
        this.b = qg1;
    }
}
