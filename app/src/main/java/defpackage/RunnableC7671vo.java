package defpackage;

/* renamed from: vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7671vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7861wo b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC7671vo(C7861wo c7861wo, String str, int i) {
        this.a = i;
        this.b = c7861wo;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.onCameraAvailable(this.c);
                break;
            default:
                this.b.b.onCameraUnavailable(this.c);
                break;
        }
    }
}
