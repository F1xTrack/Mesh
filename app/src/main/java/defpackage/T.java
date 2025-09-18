package defpackage;

/* loaded from: classes.dex */
public final class T extends Throwable {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(String str, int i) {
        super(str);
        this.a = i;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                b();
                break;
            case 1:
                a();
                break;
            case 2:
                c();
                break;
            default:
                d();
                break;
        }
        return this;
    }
}
