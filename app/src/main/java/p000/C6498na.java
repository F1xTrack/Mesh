package p000;

/* renamed from: na */
/* loaded from: classes.dex */
public final class C6498na {

    /* renamed from: d */
    public static final C6498na f38376d = new C6435ma().m22900a();

    /* renamed from: a */
    public final boolean f38377a;

    /* renamed from: b */
    public final boolean f38378b;

    /* renamed from: c */
    public final boolean f38379c;

    public C6498na(C6435ma c6435ma) {
        this.f38377a = c6435ma.f37776a;
        this.f38378b = c6435ma.f37777b;
        this.f38379c = c6435ma.f37778c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6498na.class != obj.getClass()) {
            return false;
        }
        C6498na c6498na = (C6498na) obj;
        return this.f38377a == c6498na.f38377a && this.f38378b == c6498na.f38378b && this.f38379c == c6498na.f38379c;
    }

    public final int hashCode() {
        return ((this.f38377a ? 1 : 0) << 2) + ((this.f38378b ? 1 : 0) << 1) + (this.f38379c ? 1 : 0);
    }
}
