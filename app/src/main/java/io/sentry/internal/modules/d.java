package io.sentry.internal.modules;

import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class d implements a {
    public static final Charset c = Charset.forName("UTF-8");
    public final ILogger a;
    public Map b = null;

    public d(ILogger iLogger) {
        this.a = iLogger;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.b = mapB;
        return mapB;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader;
        ILogger iLogger = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, c));
        } catch (IOException e) {
            iLogger.d(EnumC5148n1.ERROR, "Error extracting modules.", e);
        } catch (RuntimeException e2) {
            iLogger.c(EnumC5148n1.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                int iLastIndexOf = line.lastIndexOf(58);
                treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
            }
            iLogger.k(EnumC5148n1.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
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
