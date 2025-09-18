package defpackage;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: Ke1 */
/* loaded from: classes.dex */
public abstract class AbstractC0814Ke1 {
    public static final GZ1 a;
    public static final K9 b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new C1203Pe1();
        } else if (i >= 28) {
            a = new C1125Oe1();
        } else if (i >= 26) {
            a = new C1047Ne1();
        } else if (i < 24 || C0969Me1.c == null) {
            a = new C0892Le1();
        } else {
            a = new C0969Me1();
        }
        b = new K9(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, defpackage.InterfaceC3980gX r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.EQ1 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0814Ke1.a(android.content.Context, gX, android.content.res.Resources, int, java.lang.String, int, int, EQ1, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
