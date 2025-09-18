package p000;

import android.os.Build;
import android.os.UserManager;

/* renamed from: rN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10898rN1 {

    /* renamed from: a */
    public static UserManager f41633a;

    /* renamed from: b */
    public static volatile boolean f41634b = !m24324a();

    /* renamed from: a */
    public static boolean m24324a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
