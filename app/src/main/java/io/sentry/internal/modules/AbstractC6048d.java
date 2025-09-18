package io.sentry.internal.modules;

import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.d */
/* loaded from: classes2.dex */
public abstract class AbstractC6048d implements InterfaceC6045a {

    /* renamed from: c */
    public static final Charset f34209c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final ILogger f34210a;

    /* renamed from: b */
    public Map f34211b = null;

    public AbstractC6048d(ILogger iLogger) {
        this.f34210a = iLogger;
    }

    @Override // io.sentry.internal.modules.InterfaceC6045a
    /* renamed from: a */
    public final Map mo21792a() {
        Map map = this.f34211b;
        if (map != null) {
            return map;
        }
        Map mapMo21793b = mo21793b();
        this.f34211b = mapMo21793b;
        return mapMo21793b;
    }

    /* renamed from: b */
    public abstract Map mo21793b();

    /* renamed from: c */
    public final TreeMap m21794c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader;
        ILogger iLogger = this.f34210a;
        TreeMap treeMap = new TreeMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f34209c));
        } catch (IOException e) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Error extracting modules.", e);
        } catch (RuntimeException e2) {
            iLogger.mo21405c(EnumC6069n1.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                int iLastIndexOf = line.lastIndexOf(58);
                treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
            }
            iLogger.mo21407k(EnumC6069n1.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
            bufferedReader.close();
            return treeMap;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
