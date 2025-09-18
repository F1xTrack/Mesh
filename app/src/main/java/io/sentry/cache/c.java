package io.sentry.cache;

import defpackage.C0532Go1;
import io.sentry.C5127g1;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.O1;
import io.sentry.S;
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

/* loaded from: classes2.dex */
public class c implements d {
    public static final Charset g = Charset.forName("UTF-8");
    public final D1 a;
    public final io.sentry.util.c b = new io.sentry.util.c(new C0532Go1(5, this));
    public final File c;
    public final int d;
    public final CountDownLatch e;
    public final WeakHashMap f;

    public c(D1 d1, String str, int i) {
        io.sentry.config.a.D(d1, "SentryOptions is required.");
        this.a = d1;
        this.c = new File(str);
        this.d = i;
        this.f = new WeakHashMap();
        this.e = new CountDownLatch(1);
    }

    public final File[] b() {
        File file = this.c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.a.getLogger().k(EnumC5148n1.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final synchronized File d(io.sentry.internal.debugmeta.c cVar) {
        String str;
        try {
            if (this.f.containsKey(cVar)) {
                str = (String) this.f.get(cVar);
            } else {
                String str2 = UUID.randomUUID() + ".envelope";
                this.f.put(cVar, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.c.getAbsolutePath(), str);
    }

    public final io.sentry.internal.debugmeta.c h(File file) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarC = ((S) this.b.a()).c(bufferedInputStream);
                bufferedInputStream.close();
                return cVarC;
            } finally {
            }
        } catch (IOException e) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.cache.d
    public final void h0(io.sentry.internal.debugmeta.c cVar) {
        io.sentry.config.a.D(cVar, "Envelope is required.");
        File fileD = d(cVar);
        boolean zExists = fileD.exists();
        D1 d1 = this.a;
        if (!zExists) {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Envelope was not cached: %s", fileD.getAbsolutePath());
            return;
        }
        d1.getLogger().k(EnumC5148n1.DEBUG, "Discarding envelope from cache: %s", fileD.getAbsolutePath());
        if (fileD.delete()) {
            return;
        }
        d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete envelope: %s", fileD.getAbsolutePath());
    }

    public final O1 i(C5127g1 c5127g1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c5127g1.d()), g));
            try {
                O1 o1 = (O1) ((S) this.b.a()).b(bufferedReader, O1.class);
                bufferedReader.close();
                return o1;
            } finally {
            }
        } catch (Throwable th) {
            this.a.getLogger().d(EnumC5148n1.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() throws IOException {
        D1 d1 = this.a;
        File[] fileArrB = b();
        ArrayList arrayList = new ArrayList(fileArrB.length);
        for (File file : fileArrB) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((S) this.b.a()).c(bufferedInputStream));
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
                d1.getLogger().k(EnumC5148n1.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                d1.getLogger().d(EnumC5148n1.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
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
    @Override // io.sentry.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(io.sentry.internal.debugmeta.c r24, io.sentry.C5185y r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.c.j(io.sentry.internal.debugmeta.c, io.sentry.y):void");
    }

    public final boolean k() {
        D1 d1 = this.a;
        try {
            return this.e.await(d1.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            d1.getLogger().k(EnumC5148n1.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void q(File file, O1 o1) {
        boolean zExists = file.exists();
        D1 d1 = this.a;
        UUID uuid = o1.e;
        if (zExists) {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, g));
                try {
                    ((S) this.b.a()).e(o1, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            d1.getLogger().c(EnumC5148n1.ERROR, th, "Error writing Session to offline storage: %s", uuid);
        }
    }
}
