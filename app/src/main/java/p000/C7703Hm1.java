package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.KotlinVersion;

/* renamed from: Hm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7703Hm1 implements Closeable {

    /* renamed from: a */
    public final C11790yN0 f4487a;

    /* renamed from: b */
    public final Random f4488b;

    /* renamed from: c */
    public final boolean f4489c;

    /* renamed from: d */
    public final boolean f4490d;

    /* renamed from: e */
    public final long f4491e;

    /* renamed from: f */
    public final C6507nj f4492f;

    /* renamed from: g */
    public final C6507nj f4493g;

    /* renamed from: h */
    public boolean f4494h;

    /* renamed from: i */
    public C10445nr0 f4495i;

    /* renamed from: j */
    public final byte[] f4496j;

    /* renamed from: k */
    public final C6318kj f4497k;

    public C7703Hm1(C11790yN0 c11790yN0, Random random, boolean z, boolean z2, long j) {
        O90.m5968f(c11790yN0, "sink");
        this.f4487a = c11790yN0;
        this.f4488b = random;
        this.f4489c = z;
        this.f4490d = z2;
        this.f4491e = j;
        this.f4492f = new C6507nj();
        this.f4493g = c11790yN0.f46237b;
        this.f4496j = new byte[4];
        this.f4497k = new C6318kj();
    }

    /* renamed from: a */
    public final void m3588a(C0551Ik c0551Ik, int i) throws IOException {
        if (this.f4494h) {
            throw new IOException("closed");
        }
        int iMo3983c = c0551Ik.mo3983c();
        if (iMo3983c > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C6507nj c6507nj = this.f4493g;
        c6507nj.m23195r0(i | 128);
        c6507nj.m23195r0(iMo3983c | 128);
        byte[] bArr = this.f4496j;
        O90.m5965c(bArr);
        this.f4488b.nextBytes(bArr);
        c6507nj.m23193p0(bArr);
        if (iMo3983c > 0) {
            long j = c6507nj.f38488b;
            c6507nj.m23191o0(c0551Ik);
            C6318kj c6318kj = this.f4497k;
            O90.m5965c(c6318kj);
            c6507nj.m23175D(c6318kj);
            c6318kj.m22247c(j);
            Z02.m9453e(c6318kj, bArr);
            c6318kj.close();
        }
        this.f4487a.flush();
    }

    /* renamed from: c */
    public final void m3589c(C0551Ik c0551Ik, int i) throws IOException {
        O90.m5968f(c0551Ik, "data");
        if (this.f4494h) {
            throw new IOException("closed");
        }
        C6507nj c6507nj = this.f4492f;
        c6507nj.m23191o0(c0551Ik);
        int i2 = i | 128;
        if (this.f4489c && c0551Ik.mo3983c() >= this.f4491e) {
            C10445nr0 c10445nr0 = this.f4495i;
            if (c10445nr0 == null) {
                c10445nr0 = new C10445nr0(this.f4490d, 0);
                this.f4495i = c10445nr0;
            }
            C6507nj c6507nj2 = c10445nr0.f38560c;
            if (c6507nj2.f38488b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c10445nr0.f38559b) {
                ((Deflater) c10445nr0.f38561d).reset();
            }
            long j = c6507nj.f38488b;
            C6813sH c6813sH = (C6813sH) c10445nr0.f38562e;
            c6813sH.mo2328c0(c6507nj, j);
            c6813sH.flush();
            C0551Ik c0551Ik2 = AbstractC10573or0.f39307a;
            long j2 = c6507nj2.f38488b;
            byte[] bArr = c0551Ik2.f5117a;
            long length = j2 - bArr.length;
            int length2 = bArr.length;
            if (length < 0 || length2 < 0 || j2 - length < length2 || bArr.length < length2) {
                c6507nj2.m23195r0(0);
                c6507nj.mo2328c0(c6507nj2, c6507nj2.f38488b);
                i2 = i | 192;
            } else {
                for (int i3 = 0; i3 < length2; i3++) {
                    if (c6507nj2.m23202x(i3 + length) != c0551Ik2.f5117a[i3]) {
                        c6507nj2.m23195r0(0);
                        break;
                    }
                }
                long j3 = c6507nj2.f38488b - 4;
                C6318kj c6318kjM23175D = c6507nj2.m23175D(AbstractC1240Ti.f11470a);
                try {
                    c6318kjM23175D.m22246a(j3);
                    AbstractC8729aT1.m9749a(c6318kjM23175D, null);
                    c6507nj.mo2328c0(c6507nj2, c6507nj2.f38488b);
                    i2 = i | 192;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC8729aT1.m9749a(c6318kjM23175D, th);
                        throw th2;
                    }
                }
            }
        }
        long j4 = c6507nj.f38488b;
        C6507nj c6507nj3 = this.f4493g;
        c6507nj3.m23195r0(i2);
        if (j4 <= 125) {
            c6507nj3.m23195r0(((int) j4) | 128);
        } else if (j4 <= 65535) {
            c6507nj3.m23195r0(254);
            c6507nj3.m23199v0((int) j4);
        } else {
            c6507nj3.m23195r0(KotlinVersion.MAX_COMPONENT_VALUE);
            JX0 jx0M23189n0 = c6507nj3.m23189n0(8);
            int i4 = jx0M23189n0.f5581c;
            byte[] bArr2 = jx0M23189n0.f5579a;
            bArr2[i4] = (byte) ((j4 >>> 56) & 255);
            bArr2[i4 + 1] = (byte) ((j4 >>> 48) & 255);
            bArr2[i4 + 2] = (byte) ((j4 >>> 40) & 255);
            bArr2[i4 + 3] = (byte) ((j4 >>> 32) & 255);
            bArr2[i4 + 4] = (byte) ((j4 >>> 24) & 255);
            bArr2[i4 + 5] = (byte) ((j4 >>> 16) & 255);
            bArr2[i4 + 6] = (byte) ((j4 >>> 8) & 255);
            bArr2[i4 + 7] = (byte) (255 & j4);
            jx0M23189n0.f5581c = i4 + 8;
            c6507nj3.f38488b += 8;
        }
        byte[] bArr3 = this.f4496j;
        O90.m5965c(bArr3);
        this.f4488b.nextBytes(bArr3);
        c6507nj3.m23193p0(bArr3);
        if (j4 > 0) {
            C6318kj c6318kj = this.f4497k;
            O90.m5965c(c6318kj);
            c6507nj.m23175D(c6318kj);
            c6318kj.m22247c(0L);
            Z02.m9453e(c6318kj, bArr3);
            c6318kj.close();
        }
        c6507nj3.mo2328c0(c6507nj, j4);
        C11790yN0 c11790yN0 = this.f4487a;
        if (c11790yN0.f46238c) {
            throw new IllegalStateException("closed");
        }
        C6507nj c6507nj4 = c11790yN0.f46237b;
        long j5 = c6507nj4.f38488b;
        if (j5 > 0) {
            c11790yN0.f46236a.mo2328c0(c6507nj4, j5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C10445nr0 c10445nr0 = this.f4495i;
        if (c10445nr0 != null) {
            c10445nr0.close();
        }
    }
}
