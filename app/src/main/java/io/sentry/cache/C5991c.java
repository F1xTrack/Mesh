package io.sentry.cache;

import io.sentry.C5759D1;
import io.sentry.C5792O1;
import io.sentry.C6022g1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5801S;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.util.C6170c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.C7655Go1;

/* renamed from: io.sentry.cache.c */
/* loaded from: classes2.dex */
public class C5991c implements InterfaceC5992d {

    /* renamed from: g */
    public static final Charset f34097g = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C5759D1 f34098a;

    /* renamed from: b */
    public final C6170c f34099b = new C6170c(new C7655Go1(5, this));

    /* renamed from: c */
    public final File f34100c;

    /* renamed from: d */
    public final int f34101d;

    /* renamed from: e */
    public final CountDownLatch f34102e;

    /* renamed from: f */
    public final WeakHashMap f34103f;

    public C5991c(C5759D1 c5759d1, String str, int i) {
        AbstractC6003a.m21735D(c5759d1, "SentryOptions is required.");
        this.f34098a = c5759d1;
        this.f34100c = new File(str);
        this.f34101d = i;
        this.f34103f = new WeakHashMap();
        this.f34102e = new CountDownLatch(1);
    }

    /* renamed from: b */
    public final File[] m21707b() {
        File file = this.f34100c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new C5990b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f34098a.getLogger().mo21407k(EnumC6069n1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    /* renamed from: d */
    public final synchronized File m21708d(C6042c c6042c) {
        String str;
        try {
            if (this.f34103f.containsKey(c6042c)) {
                str = (String) this.f34103f.get(c6042c);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.f34103f.put(c6042c, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.f34100c.getAbsolutePath(), str);
    }

    /* renamed from: h */
    public final C6042c m21709h(File file) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C6042c c6042cMo21459c = ((InterfaceC5801S) this.f34099b.m21880a()).mo21459c(bufferedInputStream);
                bufferedInputStream.close();
                return c6042cMo21459c;
            } finally {
            }
        } catch (IOException e) {
            this.f34098a.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.cache.InterfaceC5992d
    /* renamed from: h0 */
    public final void mo21710h0(C6042c c6042c) {
        AbstractC6003a.m21735D(c6042c, "Envelope is required.");
        File fileM21708d = m21708d(c6042c);
        boolean zExists = fileM21708d.exists();
        C5759D1 c5759d1 = this.f34098a;
        if (!zExists) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Envelope was not cached: %s", fileM21708d.getAbsolutePath());
            return;
        }
        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Discarding envelope from cache: %s", fileM21708d.getAbsolutePath());
        if (fileM21708d.delete()) {
            return;
        }
        c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete envelope: %s", fileM21708d.getAbsolutePath());
    }

    /* renamed from: i */
    public final C5792O1 m21711i(C6022g1 c6022g1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c6022g1.m21783d()), f34097g));
            try {
                C5792O1 c5792o1 = (C5792O1) ((InterfaceC5801S) this.f34099b.m21880a()).mo21458b(bufferedReader, C5792O1.class);
                bufferedReader.close();
                return c5792o1;
            } finally {
            }
        } catch (Throwable th) {
            this.f34098a.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() throws IOException {
        C5759D1 c5759d1 = this.f34098a;
        File[] fileArrM21707b = m21707b();
        ArrayList arrayList = new ArrayList(fileArrM21707b.length);
        for (File file : fileArrM21707b) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC5801S) this.f34099b.m21880a()).mo21459c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0231 A[PHI: r5 r6 r9
  0x0231: PHI (r5v5 java.io.File[]) = 
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v4 java.io.File[])
  (r5v10 java.io.File[])
 binds: [B:341:0x0043, B:343:0x0051, B:356:0x008a, B:363:0x009d, B:366:0x00a3, B:368:0x00a9, B:646:0x0231] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r6v34 int) = (r6v33 int), (r6v33 int), (r6v33 int), (r6v33 int), (r6v33 int), (r6v33 int), (r6v37 int) binds: [B:341:0x0043, B:343:0x0051, B:356:0x008a, B:363:0x009d, B:366:0x00a3, B:368:0x00a9, B:646:0x0231] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r9v18 java.io.File[]) = 
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v17 java.io.File[])
  (r9v20 java.io.File[])
 binds: [B:341:0x0043, B:343:0x0051, B:356:0x008a, B:363:0x009d, B:366:0x00a3, B:368:0x00a9, B:646:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x01a4 A[SYNTHETIC] */
    @Override // io.sentry.cache.InterfaceC5992d
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo21556j(io.sentry.internal.debugmeta.C6042c r24, io.sentry.C6193y r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.C5991c.mo21556j(io.sentry.internal.debugmeta.c, io.sentry.y):void");
    }

    /* renamed from: k */
    public final boolean m21712k() {
        C5759D1 c5759d1 = this.f34098a;
        try {
            return this.f34102e.await(c5759d1.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    /* renamed from: q */
    public final void m21713q(File file, C5792O1 c5792o1) {
        boolean zExists = file.exists();
        C5759D1 c5759d1 = this.f34098a;
        UUID uuid = c5792o1.f33351e;
        if (zExists) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f34097g));
                try {
                    ((InterfaceC5801S) this.f34099b.m21880a()).mo21461e(c5792o1, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Error writing Session to offline storage: %s", uuid);
        }
    }
}
