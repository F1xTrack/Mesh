package p000;

/* renamed from: QG */
/* loaded from: classes.dex */
public final class C1024QG extends AbstractC1527YG implements Comparable {

    /* renamed from: e */
    public final int f9551e;

    /* renamed from: f */
    public final int f9552f;

    public C1024QG(int i, C8149Qb1 c8149Qb1, int i2, C1212TG c1212tg, int i3) {
        super(i, c8149Qb1, i2);
        this.f9551e = AbstractC11153tN0.m24907s(i3, c1212tg.f11268w) ? 1 : 0;
        this.f9552f = this.f14218d.m24021b();
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: a */
    public final int mo6282a() {
        return this.f9551e;
    }

    @Override // p000.AbstractC1527YG
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo6283b(AbstractC1527YG abstractC1527YG) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f9552f, ((C1024QG) obj).f9552f);
    }
}
