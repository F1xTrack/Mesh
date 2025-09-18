package defpackage;

/* renamed from: Da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254Da extends Exception {
    public final /* synthetic */ int a;

    private final synchronized Throwable a() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 6:
                a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0254Da(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0254Da(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0254Da(Throwable th) {
        super(th);
        this.a = 7;
    }
}
