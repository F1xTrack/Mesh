package defpackage;

import org.conscrypt.Conscrypt;

/* renamed from: vx */
/* loaded from: classes2.dex */
public abstract class AbstractC7698vx {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static boolean b() {
        return C8078xx.d;
    }
}
