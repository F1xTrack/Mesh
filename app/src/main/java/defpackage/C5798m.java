package defpackage;

import java.util.Arrays;

/* renamed from: m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5798m {
    public static final C5798m b = new C5798m(0);
    public static final C5798m c = new C5798m(1);
    public static final C5798m d = new C5798m(2);
    public static final C5798m e = new C5798m(3);
    public static final C5798m f = new C5798m(4);
    public final int a;

    public C5798m(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5798m.class == obj.getClass() && this.a == ((C5798m) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
