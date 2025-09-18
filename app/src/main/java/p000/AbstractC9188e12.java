package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: e12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9188e12 {
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m17817a(p000.C9591hA0 r20, p000.C1290UV r21, int r22, p000.C1164SV r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9188e12.m17817a(hA0, UV, int, SV):boolean");
    }

    /* renamed from: b */
    public static int m17818b(int i, C9591hA0 c9591hA0) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c9591hA0.m18763u() + 1;
            case 7:
                return c9591hA0.m18735A() + 1;
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

    /* renamed from: c */
    public static void m17819c(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC11462vn1.m25489a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
