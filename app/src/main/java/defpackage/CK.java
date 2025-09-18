package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class CK implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7726w5 b;

    public /* synthetic */ CK(C7726w5 c7726w5, int i) {
        this.a = i;
        this.b = c7726w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
