package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class L40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ M40 b;

    public /* synthetic */ L40(M40 m40, int i) {
        this.a = i;
        this.b = m40;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                M40 m40 = this.b;
                O90.f(m40, "this$0");
                m40.a.d();
                break;
            case 1:
                M40 m402 = this.b;
                O90.f(m402, "this$0");
                m402.a.b();
                break;
            default:
                M40 m403 = this.b;
                O90.f(m403, "this$0");
                m403.a.c();
                break;
        }
    }
}
