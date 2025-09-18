package io.sentry.internal.debugmeta;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.C5759D1;
import io.sentry.C5774I1;
import io.sentry.C5987c1;
import io.sentry.C6022g1;
import io.sentry.C6180v0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import io.sentry.protocol.C6109y;
import io.sentry.protocol.C6110z;
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

/* renamed from: io.sentry.internal.debugmeta.c */
/* loaded from: classes2.dex */
public final class C6042c implements InterfaceC6040a, ILogger {

    /* renamed from: a */
    public final /* synthetic */ int f34197a = 5;

    /* renamed from: b */
    public final Object f34198b;

    /* renamed from: c */
    public final Object f34199c;

    public C6042c(String str, HashMap map) {
        AbstractC6003a.m21735D(str, "url is required");
        try {
            this.f34198b = URI.create(str).toURL();
            this.f34199c = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC6040a
    /* renamed from: a */
    public List mo21789a() throws IOException {
        InputStream inputStreamOpenStream;
        Object obj = this.f34199c;
        Object obj2 = this.f34198b;
        switch (this.f34197a) {
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
                            iLogger.mo21405c(EnumC6069n1.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                        try {
                            Properties properties = new Properties();
                            properties.load(inputStreamOpenStream);
                            arrayList.add(properties);
                            iLogger.mo21407k(EnumC6069n1.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
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
                    iLogger.mo21405c(EnumC6069n1.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                iLogger.mo21407k(EnumC6069n1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
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
                    iLogger2.mo21405c(EnumC6069n1.INFO, e3, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e4) {
                    iLogger2.mo21406d(EnumC6069n1.ERROR, "Error getting Proguard UUIDs.", e4);
                    return null;
                } catch (RuntimeException e5) {
                    iLogger2.mo21405c(EnumC6069n1.ERROR, e5, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    /* renamed from: b */
    public ArrayList m21790b(Map map, ArrayList arrayList, boolean z) {
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
            C6110z c6110z = new C6110z();
            c6110z.f34489c = thread2.getName();
            c6110z.f34488b = Integer.valueOf(thread2.getPriority());
            c6110z.f34487a = Long.valueOf(thread2.getId());
            c6110z.f34493g = Boolean.valueOf(thread2.isDaemon());
            c6110z.f34490d = thread2.getState().name();
            c6110z.f34491e = Boolean.valueOf(z2);
            ArrayList arrayListM21402a = ((C5774I1) this.f34198b).m21402a(stackTraceElementArr, false);
            if (((C5759D1) this.f34199c).isAttachStacktrace() && arrayListM21402a != null && !arrayListM21402a.isEmpty()) {
                C6109y c6109y = new C6109y(arrayListM21402a);
                c6109y.f34485c = Boolean.TRUE;
                c6110z.f34495i = c6109y;
            }
            arrayList2.add(c6110z);
        }
        return arrayList2;
    }

    @Override // io.sentry.ILogger
    /* renamed from: c */
    public void mo21405c(EnumC6069n1 enumC6069n1, Throwable th, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f34198b;
        if (iLogger == null || !mo21408l(enumC6069n1)) {
            return;
        }
        iLogger.mo21405c(enumC6069n1, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    /* renamed from: d */
    public void mo21406d(EnumC6069n1 enumC6069n1, String str, Throwable th) {
        ILogger iLogger = (ILogger) this.f34198b;
        if (iLogger == null || !mo21408l(enumC6069n1)) {
            return;
        }
        iLogger.mo21406d(enumC6069n1, str, th);
    }

    /* renamed from: e */
    public Properties m21791e() throws IOException {
        String str = (String) this.f34198b;
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
            ((C6180v0) this.f34199c).mo21405c(EnumC6069n1.ERROR, e, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    @Override // io.sentry.ILogger
    /* renamed from: k */
    public void mo21407k(EnumC6069n1 enumC6069n1, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f34198b;
        if (iLogger == null || !mo21408l(enumC6069n1)) {
            return;
        }
        iLogger.mo21407k(enumC6069n1, str, objArr);
    }

    @Override // io.sentry.ILogger
    /* renamed from: l */
    public boolean mo21408l(EnumC6069n1 enumC6069n1) {
        C5759D1 c5759d1 = (C5759D1) this.f34199c;
        return enumC6069n1 != null && c5759d1.isDebug() && enumC6069n1.ordinal() >= c5759d1.getDiagnosticLevel().ordinal();
    }

    public C6042c(String str, C6180v0 c6180v0) {
        this.f34198b = str;
        this.f34199c = c6180v0;
    }

    public C6042c(C5759D1 c5759d1, ILogger iLogger) {
        AbstractC6003a.m21735D(c5759d1, "SentryOptions is required.");
        this.f34199c = c5759d1;
        this.f34198b = iLogger;
    }

    public C6042c(ILogger iLogger) {
        ClassLoader classLoader = C6042c.class.getClassLoader();
        this.f34198b = iLogger;
        this.f34199c = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public C6042c(Context context, ILogger iLogger) {
        Context applicationContext = context.getApplicationContext();
        this.f34199c = applicationContext != null ? applicationContext : context;
        this.f34198b = iLogger;
    }

    public C6042c(C5987c1 c5987c1, Collection collection) {
        AbstractC6003a.m21735D(c5987c1, "SentryEnvelopeHeader is required.");
        this.f34198b = c5987c1;
        AbstractC6003a.m21735D(collection, "SentryEnvelope items are required.");
        this.f34199c = collection;
    }

    public C6042c(C5774I1 c5774i1, C5759D1 c5759d1) {
        this.f34198b = c5774i1;
        AbstractC6003a.m21735D(c5759d1, "The SentryOptions is required");
        this.f34199c = c5759d1;
    }

    public C6042c(C6104t c6104t, C6102r c6102r, C6022g1 c6022g1) {
        this.f34198b = new C5987c1(c6104t, c6102r, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c6022g1);
        this.f34199c = arrayList;
    }
}
