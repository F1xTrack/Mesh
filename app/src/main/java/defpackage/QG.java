package defpackage;

/* loaded from: classes.dex */
public final class QG extends YG implements Comparable {
    public final int e;
    public final int f;

    public QG(int i, C1272Qb1 c1272Qb1, int i2, TG tg, int i3) {
        super(i, c1272Qb1, i2);
        this.e = AbstractC7209tN0.s(i3, tg.w) ? 1 : 0;
        this.f = this.d.b();
    }

    @Override // defpackage.YG
    public final int a() {
        return this.e;
    }

    @Override // defpackage.YG
    public final /* bridge */ /* synthetic */ boolean b(YG yg) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((QG) obj).f);
    }
}
