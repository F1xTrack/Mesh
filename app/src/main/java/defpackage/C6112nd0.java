package defpackage;

import java.util.Arrays;

/* renamed from: nd0 */
/* loaded from: classes2.dex */
public final class C6112nd0 extends AbstractC7268th {
    public static final C6112nd0 g;
    public static final C6112nd0 h;
    public final boolean f;

    static {
        C6112nd0 c6112nd0 = new C6112nd0(new int[]{1, 9, 0}, false);
        g = c6112nd0;
        int i = c6112nd0.c;
        int i2 = c6112nd0.b;
        h = (i2 == 1 && i == 9) ? new C6112nd0(new int[]{2, 0, 0}, false) : new C6112nd0(new int[]{i2, i + 1, 0}, false);
        new C6112nd0(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6112nd0(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        O90.f(iArr, "versionArray");
        this.f = z;
    }

    public final boolean b(C6112nd0 c6112nd0) {
        O90.f(c6112nd0, "metadataVersionFromLanguageVersion");
        C6112nd0 c6112nd02 = g;
        int i = this.b;
        int i2 = this.c;
        if (i == 2 && i2 == 0 && c6112nd02.b == 1 && c6112nd02.c == 8) {
            return true;
        }
        if (!this.f) {
            c6112nd02 = h;
        }
        c6112nd02.getClass();
        int i3 = c6112nd0.b;
        int i4 = c6112nd02.b;
        if (i4 > i3 || (i4 >= i3 && c6112nd02.c > c6112nd0.c)) {
            c6112nd0 = c6112nd02;
        }
        boolean z = false;
        if ((i == 1 && i2 == 0) || i == 0) {
            return false;
        }
        int i5 = c6112nd0.b;
        if (i > i5 || (i >= i5 && i2 > c6112nd0.c)) {
            z = true;
        }
        return !z;
    }
}
