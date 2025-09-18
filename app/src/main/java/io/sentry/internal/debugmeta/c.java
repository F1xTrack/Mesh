package io.sentry.internal.debugmeta;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.C5115c1;
import io.sentry.C5127g1;
import io.sentry.C5177v0;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.protocol.r;
import io.sentry.protocol.t;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class c implements a, ILogger {
    public final /* synthetic */ int a = 5;
    public final Object b;
    public final Object c;

    public c(String str, HashMap map) {
        io.sentry.config.a.D(str, "url is required");
        try {
            this.b = URI.create(str).toURL();
            this.c = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() throws IOException {
        InputStream inputStreamOpenStream;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ILogger iLogger = (ILogger) obj2;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) obj).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                        } catch (RuntimeException e) {
                            iLogger.c(EnumC5148n1.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                        try {
                            Properties properties = new Properties();
                            properties.load(inputStreamOpenStream);
                            arrayList.add(properties);
                            iLogger.k(EnumC5148n1.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                            }
                        } catch (Throwable th) {
                            if (inputStreamOpenStream != null) {
                                try {
                                    inputStreamOpenStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                            break;
                        }
                    }
                } catch (IOException e2) {
                    iLogger.c(EnumC5148n1.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                iLogger.k(EnumC5148n1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                ILogger iLogger2 = (ILogger) obj2;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) obj).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException e3) {
                    iLogger2.c(EnumC5148n1.INFO, e3, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e4) {
                    iLogger2.d(EnumC5148n1.ERROR, "Error getting Proguard UUIDs.", e4);
                    return null;
                } catch (RuntimeException e5) {
                    iLogger2.c(EnumC5148n1.ERROR, e5, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    public ArrayList b(Map map, ArrayList arrayList, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z2 = (thread == threadCurrentThread && !z) || (arrayList != null && arrayList.contains(Long.valueOf(thread.getId())));
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            z zVar = new z();
            zVar.c = thread2.getName();
            zVar.b = Integer.valueOf(thread2.getPriority());
            zVar.a = Long.valueOf(thread2.getId());
            zVar.g = Boolean.valueOf(thread2.isDaemon());
            zVar.d = thread2.getState().name();
            zVar.e = Boolean.valueOf(z2);
            ArrayList arrayListA = ((I1) this.b).a(stackTraceElementArr, false);
            if (((D1) this.c).isAttachStacktrace() && arrayListA != null && !arrayListA.isEmpty()) {
                y yVar = new y(arrayListA);
                yVar.c = Boolean.TRUE;
                zVar.i = yVar;
            }
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5148n1 enumC5148n1, Throwable th, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.b;
        if (iLogger == null || !l(enumC5148n1)) {
            return;
        }
        iLogger.c(enumC5148n1, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void d(EnumC5148n1 enumC5148n1, String str, Throwable th) {
        ILogger iLogger = (ILogger) this.b;
        if (iLogger == null || !l(enumC5148n1)) {
            return;
        }
        iLogger.d(enumC5148n1, str, th);
    }

    public Properties e() throws IOException {
        String str = (String) this.b;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } finally {
            }
        } catch (IOException e) {
            ((C5177v0) this.c).c(EnumC5148n1.ERROR, e, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    @Override // io.sentry.ILogger
    public void k(EnumC5148n1 enumC5148n1, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.b;
        if (iLogger == null || !l(enumC5148n1)) {
            return;
        }
        iLogger.k(enumC5148n1, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean l(EnumC5148n1 enumC5148n1) {
        D1 d1 = (D1) this.c;
        return enumC5148n1 != null && d1.isDebug() && enumC5148n1.ordinal() >= d1.getDiagnosticLevel().ordinal();
    }

    public c(String str, C5177v0 c5177v0) {
        this.b = str;
        this.c = c5177v0;
    }

    public c(D1 d1, ILogger iLogger) {
        io.sentry.config.a.D(d1, "SentryOptions is required.");
        this.c = d1;
        this.b = iLogger;
    }

    public c(ILogger iLogger) {
        ClassLoader classLoader = c.class.getClassLoader();
        this.b = iLogger;
        this.c = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public c(Context context, ILogger iLogger) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.b = iLogger;
    }

    public c(C5115c1 c5115c1, Collection collection) {
        io.sentry.config.a.D(c5115c1, "SentryEnvelopeHeader is required.");
        this.b = c5115c1;
        io.sentry.config.a.D(collection, "SentryEnvelope items are required.");
        this.c = collection;
    }

    public c(I1 i1, D1 d1) {
        this.b = i1;
        io.sentry.config.a.D(d1, "The SentryOptions is required");
        this.c = d1;
    }

    public c(t tVar, r rVar, C5127g1 c5127g1) {
        this.b = new C5115c1(tVar, rVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c5127g1);
        this.c = arrayList;
    }
}
