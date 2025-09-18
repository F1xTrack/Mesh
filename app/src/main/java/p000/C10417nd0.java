package p000;

import java.util.Arrays;

/* renamed from: nd0 */
/* loaded from: classes2.dex */
public final class C10417nd0 extends AbstractC6902th {

    /* renamed from: g */
    public static final C10417nd0 f38414g;

    /* renamed from: h */
    public static final C10417nd0 f38415h;

    /* renamed from: f */
    public final boolean f38416f;

    static {
        C10417nd0 c10417nd0 = new C10417nd0(new int[]{1, 9, 0}, false);
        f38414g = c10417nd0;
        int i = c10417nd0.f43218c;
        int i2 = c10417nd0.f43217b;
        f38415h = (i2 == 1 && i == 9) ? new C10417nd0(new int[]{2, 0, 0}, false) : new C10417nd0(new int[]{i2, i + 1, 0}, false);
        new C10417nd0(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10417nd0(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        O90.m5968f(iArr, "versionArray");
        this.f38416f = z;
    }

    /* renamed from: b */
    public final boolean m23155b(C10417nd0 c10417nd0) {
        O90.m5968f(c10417nd0, "metadataVersionFromLanguageVersion");
        C10417nd0 c10417nd02 = f38414g;
        int i = this.f43217b;
        int i2 = this.f43218c;
        if (i == 2 && i2 == 0 && c10417nd02.f43217b == 1 && c10417nd02.f43218c == 8) {
            return true;
        }
        if (!this.f38416f) {
            c10417nd02 = f38415h;
        }
        c10417nd02.getClass();
        int i3 = c10417nd0.f43217b;
        int i4 = c10417nd02.f43217b;
        if (i4 > i3 || (i4 >= i3 && c10417nd02.f43218c > c10417nd0.f43218c)) {
            c10417nd0 = c10417nd02;
        }
        boolean z = false;
        if ((i == 1 && i2 == 0) || i == 0) {
            return false;
        }
        int i5 = c10417nd0.f43217b;
        if (i > i5 || (i >= i5 && i2 > c10417nd0.f43218c)) {
            z = true;
        }
        return !z;
    }
}
