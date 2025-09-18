package p000;

import org.conscrypt.Conscrypt;

/* renamed from: vx */
/* loaded from: classes2.dex */
public abstract class AbstractC7044vx {
    /* renamed from: a */
    public static boolean m25531a() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    /* renamed from: b */
    public static boolean m25532b() {
        return C7170xx.f45912d;
    }
}
