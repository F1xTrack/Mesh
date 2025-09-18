package p000;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: Zj */
/* loaded from: classes2.dex */
public final class C1619Zj {
    /* renamed from: a */
    public static InputStream m9583a(String str) {
        O90.m5968f(str, "path");
        ClassLoader classLoader = C1619Zj.class.getClassLoader();
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
