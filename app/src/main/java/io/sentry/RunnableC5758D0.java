package io.sentry;

import io.sentry.cache.C5991c;
import io.sentry.cache.InterfaceC5992d;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* renamed from: io.sentry.D0 */
/* loaded from: classes2.dex */
public final class RunnableC5758D0 implements Runnable {

    /* renamed from: b */
    public static final Charset f33232b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C5759D1 f33233a;

    public RunnableC5758D0(C5759D1 c5759d1) {
        this.f33233a = c5759d1;
    }

    /* renamed from: a */
    public final Date m21381a(File file) throws IOException {
        C5759D1 c5759d1 = this.f33233a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f33232b));
            try {
                String line = bufferedReader.readLine();
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM21754m = AbstractC6003a.m21754m(line);
                bufferedReader.close();
                return dateM21754m;
            } finally {
            }
        } catch (IOException e) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateM21381a;
        C5759D1 c5759d1 = this.f33233a;
        String cacheDirPath = c5759d1.getCacheDirPath();
        if (cacheDirPath == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!c5759d1.isEnableAutoSessionTracking()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        InterfaceC5992d envelopeDiskCache = c5759d1.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C5991c) && !((C5991c) envelopeDiskCache).m21712k()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = C5991c.f34097g;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC5801S serializer = c5759d1.getSerializer();
        if (file.exists()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f33232b));
                try {
                    C5792O1 c5792o1 = (C5792O1) serializer.mo21458b(bufferedReader, C5792O1.class);
                    if (c5792o1 == null) {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(c5759d1.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateM21381a = m21381a(file2);
                            if (!file2.delete()) {
                                c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            c5792o1.m21455c(EnumC5789N1.Crashed, null, true, null);
                        } else {
                            dateM21381a = null;
                        }
                        if (c5792o1.f33360n == null) {
                            c5792o1.m21454b(dateM21381a);
                        }
                        C5760E.f33234a.mo21379y(new C6042c(null, c5759d1.getSdkVersion(), C6022g1.m21780b(serializer, c5792o1)), new C6193y());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error processing previous session.", th);
            }
            if (file.delete()) {
                return;
            }
            c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
