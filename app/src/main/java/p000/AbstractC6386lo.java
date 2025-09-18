package p000;

/* renamed from: lo */
/* loaded from: classes2.dex */
public abstract class AbstractC6386lo extends Throwable {

    /* renamed from: a */
    public final String f37292a;

    /* renamed from: b */
    public final String f37293b;

    /* renamed from: c */
    public final String f37294c;

    public AbstractC6386lo(String str, String str2, String str3, Throwable th) {
        O90.m5968f(str3, "message");
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("/");
        super(AbstractC11153tN0.m24914z(sb, str2, "] ", str3), th);
        this.f37292a = str;
        this.f37293b = str2;
        this.f37294c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f37294c;
    }
}
