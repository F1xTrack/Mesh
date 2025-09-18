package p000;

/* renamed from: xh */
/* loaded from: classes.dex */
public final class RunnableC7154xh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45736a;

    /* renamed from: b */
    public final /* synthetic */ int f45737b;

    /* renamed from: c */
    public final /* synthetic */ CharSequence f45738c;

    /* renamed from: d */
    public final /* synthetic */ C0359Fh f45739d;

    public /* synthetic */ RunnableC7154xh(C0359Fh c0359Fh, int i, CharSequence charSequence, int i2) {
        this.f45736a = i2;
        this.f45739d = c0359Fh;
        this.f45737b = i;
        this.f45738c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45736a) {
            case 0:
                C0988Ph c0988Ph = this.f45739d.f3389b;
                if (c0988Ph.f9228e == null) {
                    c0988Ph.f9228e = new C0736Lh();
                }
                c0988Ph.f9228e.mo2211a(this.f45737b, this.f45738c);
                break;
            default:
                this.f45739d.m2744w(this.f45737b, this.f45738c);
                break;
        }
    }
}
