package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: Zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1996Zj {
    public static InputStream a(String str) {
        O90.f(str, "path");
        ClassLoader classLoader = C1996Zj.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
    }
}
