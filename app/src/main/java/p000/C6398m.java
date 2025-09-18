package p000;

import java.util.Arrays;

/* renamed from: m */
/* loaded from: classes.dex */
public final class C6398m {

    /* renamed from: b */
    public static final C6398m f37371b = new C6398m(0);

    /* renamed from: c */
    public static final C6398m f37372c = new C6398m(1);

    /* renamed from: d */
    public static final C6398m f37373d = new C6398m(2);

    /* renamed from: e */
    public static final C6398m f37374e = new C6398m(3);

    /* renamed from: f */
    public static final C6398m f37375f = new C6398m(4);

    /* renamed from: a */
    public final int f37376a;

    public C6398m(int i) {
        this.f37376a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6398m.class == obj.getClass() && this.f37376a == ((C6398m) obj).f37376a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37376a)});
    }
}
