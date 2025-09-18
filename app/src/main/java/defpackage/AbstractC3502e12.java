package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: e12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3502e12 {
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.C4103hA0 r20, defpackage.UV r21, int r22, defpackage.SV r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3502e12.a(hA0, UV, int, SV):boolean");
    }

    public static int b(int i, C4103hA0 c4103hA0) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c4103hA0.u() + 1;
            case 7:
                return c4103hA0.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static void c(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC7670vn1.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
