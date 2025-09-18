package p000;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: Ke1 */
/* loaded from: classes.dex */
public abstract class AbstractC7843Ke1 {

    /* renamed from: a */
    public static final GZ1 f6246a;

    /* renamed from: b */
    public static final C0640K9 f6247b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f6246a = new C8103Pe1();
        } else if (i >= 28) {
            f6246a = new C8051Oe1();
        } else if (i >= 26) {
            f6246a = new C7999Ne1();
        } else if (i < 24 || C7947Me1.f7287c == null) {
            f6246a = new C7895Le1();
        } else {
            f6246a = new C7947Me1();
        }
        f6247b = new C0640K9(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m4696a(android.content.Context r16, p000.InterfaceC4122gX r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, p000.EQ1 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7843Ke1.m4696a(android.content.Context, gX, android.content.res.Resources, int, java.lang.String, int, int, EQ1, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m4697b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
