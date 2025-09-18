package p000;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: kj */
/* loaded from: classes2.dex */
public final class C6318kj implements Closeable {

    /* renamed from: a */
    public C6507nj f36632a;

    /* renamed from: b */
    public boolean f36633b;

    /* renamed from: c */
    public JX0 f36634c;

    /* renamed from: e */
    public byte[] f36636e;

    /* renamed from: d */
    public long f36635d = -1;

    /* renamed from: f */
    public int f36637f = -1;

    /* renamed from: g */
    public int f36638g = -1;

    /* renamed from: a */
    public final void m22246a(long j) {
        C6507nj c6507nj = this.f36632a;
        if (c6507nj == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f36633b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = c6507nj.f38488b;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                JX0 jx0 = c6507nj.f38487a;
                O90.m5965c(jx0);
                JX0 jx02 = jx0.f5585g;
                O90.m5965c(jx02);
                int i = jx02.f5581c;
                long j4 = i - jx02.f5580b;
                if (j4 > j3) {
                    jx02.f5581c = i - ((int) j3);
                    break;
                } else {
                    c6507nj.f38487a = jx02.m4339a();
                    RX0.m7031a(jx02);
                    j3 -= j4;
                }
            }
            this.f36634c = null;
            this.f36635d = j;
            this.f36636e = null;
            this.f36637f = -1;
            this.f36638g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                JX0 jx0M23189n0 = c6507nj.m23189n0(i2);
                int iMin = (int) Math.min(j5, 8192 - jx0M23189n0.f5581c);
                int i3 = jx0M23189n0.f5581c + iMin;
                jx0M23189n0.f5581c = i3;
                j5 -= iMin;
                if (z) {
                    this.f36634c = jx0M23189n0;
                    this.f36635d = j2;
                    this.f36636e = jx0M23189n0.f5579a;
                    this.f36637f = i3 - iMin;
                    this.f36638g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        c6507nj.f38488b = j;
    }

    /* renamed from: c */
    public final int m22247c(long j) {
        C6507nj c6507nj = this.f36632a;
        if (c6507nj == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = c6507nj.f38488b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.f36634c = null;
                    this.f36635d = j;
                    this.f36636e = null;
                    this.f36637f = -1;
                    this.f36638g = -1;
                    return -1;
                }
                JX0 jx0 = c6507nj.f38487a;
                JX0 jx02 = this.f36634c;
                long j3 = 0;
                if (jx02 != null) {
                    long j4 = this.f36635d - (this.f36637f - jx02.f5580b);
                    if (j4 > j) {
                        j2 = j4;
                        jx02 = jx0;
                        jx0 = jx02;
                    } else {
                        j3 = j4;
                    }
                } else {
                    jx02 = jx0;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        O90.m5965c(jx02);
                        long j5 = (jx02.f5581c - jx02.f5580b) + j3;
                        if (j < j5) {
                            break;
                        }
                        jx02 = jx02.f5584f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        O90.m5965c(jx0);
                        jx0 = jx0.f5585g;
                        O90.m5965c(jx0);
                        j2 -= jx0.f5581c - jx0.f5580b;
                    }
                    jx02 = jx0;
                    j3 = j2;
                }
                if (this.f36633b) {
                    O90.m5965c(jx02);
                    if (jx02.f5582d) {
                        byte[] bArr = jx02.f5579a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        O90.m5967e(bArrCopyOf, "copyOf(this, size)");
                        JX0 jx03 = new JX0(bArrCopyOf, jx02.f5580b, jx02.f5581c, false, true);
                        if (c6507nj.f38487a == jx02) {
                            c6507nj.f38487a = jx03;
                        }
                        jx02.m4340b(jx03);
                        JX0 jx04 = jx03.f5585g;
                        O90.m5965c(jx04);
                        jx04.m4339a();
                        jx02 = jx03;
                    }
                }
                this.f36634c = jx02;
                this.f36635d = j;
                O90.m5965c(jx02);
                this.f36636e = jx02.f5579a;
                int i = jx02.f5580b + ((int) (j - j3));
                this.f36637f = i;
                int i2 = jx02.f5581c;
                this.f36638g = i2;
                return i2 - i;
            }
        }
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("offset=", j, " > size=");
        sbM26239p.append(c6507nj.f38488b);
        throw new ArrayIndexOutOfBoundsException(sbM26239p.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36632a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f36632a = null;
        this.f36634c = null;
        this.f36635d = -1L;
        this.f36636e = null;
        this.f36637f = -1;
        this.f36638g = -1;
    }
}
