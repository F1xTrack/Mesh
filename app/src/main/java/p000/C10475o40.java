package p000;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: o40 */
/* loaded from: classes2.dex */
public final class C10475o40 {

    /* renamed from: a */
    public final int f38756a;

    /* renamed from: b */
    public final C9579h40 f38757b;

    /* renamed from: c */
    public long f38758c;

    /* renamed from: d */
    public long f38759d;

    /* renamed from: e */
    public long f38760e;

    /* renamed from: f */
    public long f38761f;

    /* renamed from: g */
    public final ArrayDeque f38762g;

    /* renamed from: h */
    public boolean f38763h;

    /* renamed from: i */
    public final C10219m40 f38764i;

    /* renamed from: j */
    public final C10091l40 f38765j;

    /* renamed from: k */
    public final C10347n40 f38766k;

    /* renamed from: l */
    public final C10347n40 f38767l;

    /* renamed from: m */
    public int f38768m;

    /* renamed from: n */
    public IOException f38769n;

    public C10475o40(int i, C9579h40 c9579h40, boolean z, boolean z2, K20 k20) {
        O90.m5968f(c9579h40, "connection");
        this.f38756a = i;
        this.f38757b = c9579h40;
        this.f38761f = c9579h40.f28230q.m230a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f38762g = arrayDeque;
        this.f38764i = new C10219m40(this, c9579h40.f28229p.m230a(), z2);
        this.f38765j = new C10091l40(this, z);
        this.f38766k = new C10347n40(this);
        this.f38767l = new C10347n40(this);
        if (k20 == null) {
            if (!m23336h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m23336h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(k20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23329a() {
        /*
            r2 = this;
            byte[] r0 = p000.AbstractC7433Ch1.f1577a
            monitor-enter(r2)
            m40 r0 = r2.f38764i     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f37461b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f37464e     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            l40 r0 = r2.f38765j     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f36858a     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f36860c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.m23337i()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.m23331c(r0, r1)
            goto L33
        L2a:
            if (r1 != 0) goto L33
            h40 r0 = r2.f38757b
            int r1 = r2.f38756a
            r0.m18716f(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10475o40.m23329a():void");
    }

    /* renamed from: b */
    public final void m23330b() throws IOException {
        C10091l40 c10091l40 = this.f38765j;
        if (c10091l40.f36860c) {
            throw new IOException("stream closed");
        }
        if (c10091l40.f36858a) {
            throw new IOException("stream finished");
        }
        if (this.f38768m != 0) {
            IOException iOException = this.f38769n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f38768m;
            AbstractC0852NX.m5763l(i);
            throw new C9710i51(i);
        }
    }

    /* renamed from: c */
    public final void m23331c(int i, IOException iOException) {
        AbstractC0852NX.m5764m(i, "rstStatusCode");
        if (m23332d(i, iOException)) {
            C9579h40 c9579h40 = this.f38757b;
            c9579h40.getClass();
            AbstractC0852NX.m5764m(i, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
            c9579h40.f28236w.m23603l(this.f38756a, i);
        }
    }

    /* renamed from: d */
    public final boolean m23332d(int i, IOException iOException) {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (this) {
            if (this.f38768m != 0) {
                return false;
            }
            this.f38768m = i;
            this.f38769n = iOException;
            notifyAll();
            if (this.f38764i.f37461b) {
                if (this.f38765j.f36858a) {
                    return false;
                }
            }
            this.f38757b.m18716f(this.f38756a);
            return true;
        }
    }

    /* renamed from: e */
    public final void m23333e(int i) {
        AbstractC0852NX.m5764m(i, "errorCode");
        if (m23332d(i, null)) {
            this.f38757b.m18720m(this.f38756a, i);
        }
    }

    /* renamed from: f */
    public final synchronized int m23334f() {
        return this.f38768m;
    }

    /* renamed from: g */
    public final C10091l40 m23335g() {
        synchronized (this) {
            if (!this.f38763h && !m23336h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f38765j;
    }

    /* renamed from: h */
    public final boolean m23336h() {
        boolean z = (this.f38756a & 1) == 1;
        this.f38757b.getClass();
        return true == z;
    }

    /* renamed from: i */
    public final synchronized boolean m23337i() {
        if (this.f38768m != 0) {
            return false;
        }
        C10219m40 c10219m40 = this.f38764i;
        if (c10219m40.f37461b || c10219m40.f37464e) {
            C10091l40 c10091l40 = this.f38765j;
            if (c10091l40.f36858a || c10091l40.f36860c) {
                if (this.f38763h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m23338j(K20 k20, boolean z) {
        boolean zM23337i;
        O90.m5968f(k20, "headers");
        byte[] bArr = AbstractC7433Ch1.f1577a;
        synchronized (this) {
            try {
                if (this.f38763h && z) {
                    this.f38764i.getClass();
                } else {
                    this.f38763h = true;
                    this.f38762g.add(k20);
                }
                if (z) {
                    this.f38764i.f37461b = true;
                }
                zM23337i = m23337i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM23337i) {
            return;
        }
        this.f38757b.m18716f(this.f38756a);
    }

    /* renamed from: k */
    public final synchronized void m23339k(int i) {
        AbstractC0852NX.m5764m(i, "errorCode");
        if (this.f38768m == 0) {
            this.f38768m = i;
            notifyAll();
        }
    }

    /* renamed from: l */
    public final void m23340l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
