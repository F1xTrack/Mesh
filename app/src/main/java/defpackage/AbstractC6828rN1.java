package defpackage;

import android.os.Build;
import android.os.UserManager;

/* renamed from: rN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6828rN1 {
    public static UserManager a;
    public static volatile boolean b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
