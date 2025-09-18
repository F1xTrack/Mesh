package io.sentry.internal.modules;

import android.content.Context;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class f extends d {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public f(List list, ILogger iLogger) {
        super(iLogger);
        this.e = list;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() throws IOException {
        InputStream resourceAsStream;
        ILogger iLogger = this.a;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                } catch (IOException e) {
                    iLogger.d(EnumC5148n1.INFO, "Access to resources failed.", e);
                } catch (SecurityException e2) {
                    iLogger.d(EnumC5148n1.INFO, "Access to resources denied.", e2);
                }
                try {
                    if (resourceAsStream == null) {
                        iLogger.k(EnumC5148n1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } else {
                        TreeMap treeMapC = c(resourceAsStream);
                        resourceAsStream.close();
                        treeMap = treeMapC;
                    }
                    return treeMap;
                } catch (Throwable th) {
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            case 1:
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapC2 = c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapC2;
                    } finally {
                    }
                } catch (FileNotFoundException unused) {
                    iLogger.k(EnumC5148n1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e3) {
                    iLogger.d(EnumC5148n1.ERROR, "Error extracting modules.", e3);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map mapA = ((a) it.next()).a();
                    if (mapA != null) {
                        treeMap3.putAll(mapA);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = f.class.getClassLoader();
        this.e = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public f(Context context, ILogger iLogger) {
        super(iLogger);
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext != null ? applicationContext : context;
    }
}
