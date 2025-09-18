package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* loaded from: classes2.dex */
public final class D0 implements Runnable {
    public static final Charset b = Charset.forName("UTF-8");
    public final D1 a;

    public D0(D1 d1) {
        this.a = d1;
    }

    public final Date a(File file) throws IOException {
        D1 d1 = this.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
            try {
                String line = bufferedReader.readLine();
                d1.getLogger().k(EnumC5148n1.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM = io.sentry.config.a.m(line);
                bufferedReader.close();
                return dateM;
            } finally {
            }
        } catch (IOException e) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            d1.getLogger().c(EnumC5148n1.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateA;
        D1 d1 = this.a;
        String cacheDirPath = d1.getCacheDirPath();
        if (cacheDirPath == null) {
            d1.getLogger().k(EnumC5148n1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!d1.isEnableAutoSessionTracking()) {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = d1.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).k()) {
            d1.getLogger().k(EnumC5148n1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.g;
        File file = new File(cacheDirPath, "previous_session.json");
        S serializer = d1.getSerializer();
        if (file.exists()) {
            d1.getLogger().k(EnumC5148n1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
                try {
                    O1 o1 = (O1) serializer.b(bufferedReader, O1.class);
                    if (o1 == null) {
                        d1.getLogger().k(EnumC5148n1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(d1.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            d1.getLogger().k(EnumC5148n1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateA = a(file2);
                            if (!file2.delete()) {
                                d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            o1.c(N1.Crashed, null, true, null);
                        } else {
                            dateA = null;
                        }
                        if (o1.n == null) {
                            o1.b(dateA);
                        }
                        E.a.y(new io.sentry.internal.debugmeta.c(null, d1.getSdkVersion(), C5127g1.b(serializer, o1)), new C5185y());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                d1.getLogger().d(EnumC5148n1.ERROR, "Error processing previous session.", th);
            }
            if (file.delete()) {
                return;
            }
            d1.getLogger().k(EnumC5148n1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
