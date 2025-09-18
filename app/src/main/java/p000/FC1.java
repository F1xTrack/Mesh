package p000;

import java.util.Objects;

/* loaded from: classes.dex */
public final class FC1 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? C10880rE1.class : super.loadClass(str, z);
    }
}
