package p000;

/* renamed from: ML */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0777ML implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7096a;

    /* renamed from: b */
    public final /* synthetic */ C0903OL f7097b;

    /* renamed from: c */
    public final /* synthetic */ Object f7098c;

    public /* synthetic */ RunnableC0777ML(C0903OL c0903ol, InterfaceC0966PL interfaceC0966PL, int i) {
        this.f7096a = i;
        this.f7097b = c0903ol;
        this.f7098c = interfaceC0966PL;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [PL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [PL, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7096a) {
            case 0:
                C0903OL c0903ol = this.f7097b;
                this.f7098c.mo1084k0(c0903ol.f8364a, c0903ol.f8365b);
                break;
            case 1:
                C0903OL c0903ol2 = this.f7097b;
                this.f7098c.mo1030N(c0903ol2.f8364a, c0903ol2.f8365b);
                break;
            default:
                C0903OL c0903ol3 = this.f7097b;
                this.f7098c.mo1058b0(c0903ol3.f8364a, c0903ol3.f8365b);
                break;
        }
    }
}
