package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: cl */
/* loaded from: classes.dex */
public final class C1867cl {

    /* renamed from: a */
    public final N01 f17721a;

    /* renamed from: b */
    public final long f17722b;

    /* renamed from: c */
    public final int f17723c;

    /* renamed from: d */
    public C3976eD f17724d;

    /* renamed from: e */
    public long f17725e;

    /* renamed from: f */
    public File f17726f;

    /* renamed from: g */
    public OutputStream f17727g;

    /* renamed from: h */
    public long f17728h;

    /* renamed from: i */
    public long f17729i;

    /* renamed from: j */
    public C8984cT0 f17730j;

    public C1867cl(N01 n01) {
        n01.getClass();
        this.f17721a = n01;
        this.f17722b = 5242880L;
        this.f17723c = 20480;
    }

    /* renamed from: a */
    public final void m10853a() throws IOException {
        OutputStream outputStream = this.f17727g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC7485Dh1.m1823h(this.f17727g);
            this.f17727g = null;
            File file = this.f17726f;
            this.f17726f = null;
            long j = this.f17728h;
            N01 n01 = this.f17721a;
            synchronized (n01) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    P01 p01M6194b = P01.m6194b(file, j, -9223372036854775807L, n01.f7455c);
                    p01M6194b.getClass();
                    C6383ll c6383llM6453q = n01.f7455c.m6453q(p01M6194b.f35353a);
                    c6383llM6453q.getClass();
                    YN1.m9281f(c6383llM6453q.m22539a(p01M6194b.f35354b, p01M6194b.f35355c));
                    long jM8582a = AbstractC1374Vq.m8582a(c6383llM6453q.f37282e);
                    if (jM8582a != -1) {
                        YN1.m9281f(p01M6194b.f35354b + p01M6194b.f35355c <= jM8582a);
                    }
                    if (n01.f7456d == null) {
                        n01.m5495b(p01M6194b);
                        n01.f7455c.m6446C();
                        n01.notifyAll();
                        return;
                    }
                    try {
                        n01.f7456d.m17567H(p01M6194b.f35355c, p01M6194b.f35358f, file.getName());
                        n01.m5495b(p01M6194b);
                        try {
                            n01.f7455c.m6446C();
                            n01.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new C1242Tk(e);
                        }
                    } catch (IOException e2) {
                        throw new C1242Tk(e2);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC7485Dh1.m1823h(this.f17727g);
            this.f17727g = null;
            File file2 = this.f17726f;
            this.f17726f = null;
            file2.delete();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m10854b(C3976eD c3976eD) {
        File fileM6195c;
        long j = c3976eD.f26601g;
        long jMin = j == -1 ? -1L : Math.min(j - this.f17729i, this.f17725e);
        N01 n01 = this.f17721a;
        String str = c3976eD.f26602h;
        int i = AbstractC7485Dh1.f2166a;
        long j2 = c3976eD.f26600f + this.f17729i;
        synchronized (n01) {
            try {
                n01.m5497d();
                C6383ll c6383llM6453q = n01.f7455c.m6453q(str);
                c6383llM6453q.getClass();
                YN1.m9281f(c6383llM6453q.m22539a(j2, jMin));
                if (!n01.f7453a.exists()) {
                    N01.m5493e(n01.f7453a);
                    n01.m5503l();
                }
                C9915ji0 c9915ji0 = n01.f7454b;
                if (jMin != -1) {
                    c9915ji0.m22093a(n01, jMin);
                } else {
                    c9915ji0.getClass();
                }
                File file = new File(n01.f7453a, Integer.toString(n01.f7458f.nextInt(10)));
                if (!file.exists()) {
                    N01.m5493e(file);
                }
                fileM6195c = P01.m6195c(file, c6383llM6453q.f37278a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17726f = fileM6195c;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f17726f);
        if (this.f17723c > 0) {
            C8984cT0 c8984cT0 = this.f17730j;
            if (c8984cT0 == null) {
                this.f17730j = new C8984cT0(fileOutputStream, this.f17723c);
            } else {
                c8984cT0.m10703a(fileOutputStream);
            }
            this.f17727g = this.f17730j;
        } else {
            this.f17727g = fileOutputStream;
        }
        this.f17728h = 0L;
    }
}
