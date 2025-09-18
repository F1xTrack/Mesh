package defpackage;

/* renamed from: oA */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6215oA implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6597qA b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ RunnableC6215oA(C6597qA c6597qA, long j, String str, int i) {
        this.a = i;
        this.b = c6597qA;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C6597qA c6597qA = this.b;
                ((ZA) c6597qA.p.c).a(new RunnableC6215oA(c6597qA, this.c, this.d, 1));
                break;
            default:
                C5833mA c5833mA = this.b.h;
                YA ya = (YA) c5833mA.n;
                if (ya == null || !ya.e.get()) {
                    ((AT) ((C4332iN) c5833mA.i).c).t(this.c, this.d);
                    break;
                }
                break;
        }
    }
}
