package defpackage;

/* renamed from: lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5762lo extends Throwable {
    public final String a;
    public final String b;
    public final String c;

    public AbstractC5762lo(String str, String str2, String str3, Throwable th) {
        O90.f(str3, "message");
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("/");
        super(AbstractC7209tN0.z(sb, str2, "] ", str3), th);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }
}
