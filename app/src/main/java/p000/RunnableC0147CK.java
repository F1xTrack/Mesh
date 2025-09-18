package p000;

/* renamed from: CK */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0147CK implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1317a;

    /* renamed from: b */
    public final /* synthetic */ C7053w5 f1318b;

    public /* synthetic */ RunnableC0147CK(C7053w5 c7053w5, int i) {
        this.f1317a = i;
        this.f1318b = c7053w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1317a) {
            case 0:
                this.f1318b.invoke();
                break;
            case 1:
                this.f1318b.invoke();
                break;
            default:
                this.f1318b.invoke();
                break;
        }
    }
}
