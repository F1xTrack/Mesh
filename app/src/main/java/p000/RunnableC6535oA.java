package p000;

/* renamed from: oA */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6535oA implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38842a;

    /* renamed from: b */
    public final /* synthetic */ C6663qA f38843b;

    /* renamed from: c */
    public final /* synthetic */ long f38844c;

    /* renamed from: d */
    public final /* synthetic */ String f38845d;

    public /* synthetic */ RunnableC6535oA(C6663qA c6663qA, long j, String str, int i) {
        this.f38842a = i;
        this.f38843b = c6663qA;
        this.f38844c = j;
        this.f38845d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38842a) {
            case 0:
                C6663qA c6663qA = this.f38843b;
                ((ExecutorC1584ZA) c6663qA.f40653p.f41679c).m9502a(new RunnableC6535oA(c6663qA, this.f38844c, this.f38845d, 1));
                break;
            default:
                C6409mA c6409mA = this.f38843b.f40645h;
                C1521YA c1521ya = (C1521YA) c6409mA.f37540n;
                if (c1521ya == null || !c1521ya.f14185e.get()) {
                    ((InterfaceC0030AT) ((C4238iN) c6409mA.f37535i).f29114c).mo145t(this.f38844c, this.f38845d);
                    break;
                }
                break;
        }
    }
}
