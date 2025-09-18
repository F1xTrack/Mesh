package io.sentry.internal.modules;

import android.content.Context;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.f */
/* loaded from: classes2.dex */
public final class C6050f extends AbstractC6048d {

    /* renamed from: d */
    public final /* synthetic */ int f34213d = 1;

    /* renamed from: e */
    public final Object f34214e;

    public C6050f(List list, ILogger iLogger) {
        super(iLogger);
        this.f34214e = list;
    }

    @Override // io.sentry.internal.modules.AbstractC6048d
    /* renamed from: b */
    public final Map mo21793b() throws IOException {
        InputStream resourceAsStream;
        ILogger iLogger = this.f34210a;
        Object obj = this.f34214e;
        switch (this.f34213d) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                } catch (IOException e) {
                    iLogger.mo21406d(EnumC6069n1.INFO, "Access to resources failed.", e);
                } catch (SecurityException e2) {
                    iLogger.mo21406d(EnumC6069n1.INFO, "Access to resources denied.", e2);
                }
                try {
                    if (resourceAsStream == null) {
                        iLogger.mo21407k(EnumC6069n1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } else {
                        TreeMap treeMapM21794c = m21794c(resourceAsStream);
                        resourceAsStream.close();
                        treeMap = treeMapM21794c;
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
                        TreeMap treeMapM21794c2 = m21794c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapM21794c2;
                    } finally {
                    }
                } catch (FileNotFoundException unused) {
                    iLogger.mo21407k(EnumC6069n1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e3) {
                    iLogger.mo21406d(EnumC6069n1.ERROR, "Error extracting modules.", e3);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map mapMo21792a = ((InterfaceC6045a) it.next()).mo21792a();
                    if (mapMo21792a != null) {
                        treeMap3.putAll(mapMo21792a);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6050f(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = C6050f.class.getClassLoader();
        this.f34214e = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public C6050f(Context context, ILogger iLogger) {
        super(iLogger);
        Context applicationContext = context.getApplicationContext();
        this.f34214e = applicationContext != null ? applicationContext : context;
    }
}
