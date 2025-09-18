package p000;

/* loaded from: classes.dex */
public final class SU1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10812a;

    /* renamed from: b */
    public final /* synthetic */ JU1 f10813b;

    public /* synthetic */ SU1(JU1 ju1, int i) {
        this.f10812a = i;
        this.f10813b = ju1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10812a) {
            case 0:
                JU1 ju1 = this.f10813b;
                ju1.f5549f = ju1.f5554k;
                break;
            default:
                this.f10813b.f5554k = null;
                break;
        }
    }
}
