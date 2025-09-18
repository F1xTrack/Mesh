package p000;

/* renamed from: T */
/* loaded from: classes.dex */
public final class C1195T extends Throwable {

    /* renamed from: a */
    public final /* synthetic */ int f11085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1195T(String str, int i) {
        super(str);
        this.f11085a = i;
    }

    /* renamed from: a */
    private final synchronized Throwable m7502a() {
        return this;
    }

    /* renamed from: b */
    private final synchronized Throwable m7503b() {
        return this;
    }

    /* renamed from: c */
    private final synchronized Throwable m7504c() {
        return this;
    }

    /* renamed from: d */
    private final synchronized Throwable m7505d() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f11085a) {
            case 0:
                m7503b();
                break;
            case 1:
                m7502a();
                break;
            case 2:
                m7504c();
                break;
            default:
                m7505d();
                break;
        }
        return this;
    }
}
