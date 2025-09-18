package p000;

/* renamed from: Da */
/* loaded from: classes.dex */
public final class C0226Da extends Exception {

    /* renamed from: a */
    public final /* synthetic */ int f2047a;

    /* renamed from: a */
    private final synchronized Throwable m1726a() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f2047a) {
            case 6:
                m1726a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0226Da(int i, String str, Throwable th) {
        super(str, th);
        this.f2047a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0226Da(String str, int i) {
        super(str);
        this.f2047a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0226Da(Throwable th) {
        super(th);
        this.f2047a = 7;
    }
}
