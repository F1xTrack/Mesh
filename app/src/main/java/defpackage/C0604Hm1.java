package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.KotlinVersion;

/* renamed from: Hm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0604Hm1 implements Closeable {
    public final C8161yN0 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final C6129nj f;
    public final C6129nj g;
    public boolean h;
    public C6154nr0 i;
    public final byte[] j;
    public final C5556kj k;

    public C0604Hm1(C8161yN0 c8161yN0, Random random, boolean z, boolean z2, long j) {
        O90.f(c8161yN0, "sink");
        this.a = c8161yN0;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = new C6129nj();
        this.g = c8161yN0.b;
        this.j = new byte[4];
        this.k = new C5556kj();
    }

    public final void a(C0674Ik c0674Ik, int i) throws IOException {
        if (this.h) {
            throw new IOException("closed");
        }
        int iC = c0674Ik.c();
        if (iC > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C6129nj c6129nj = this.g;
        c6129nj.r0(i | 128);
        c6129nj.r0(iC | 128);
        byte[] bArr = this.j;
        O90.c(bArr);
        this.b.nextBytes(bArr);
        c6129nj.p0(bArr);
        if (iC > 0) {
            long j = c6129nj.b;
            c6129nj.o0(c0674Ik);
            C5556kj c5556kj = this.k;
            O90.c(c5556kj);
            c6129nj.D(c5556kj);
            c5556kj.c(j);
            Z02.e(c5556kj, bArr);
            c5556kj.close();
        }
        this.a.flush();
    }

    public final void c(C0674Ik c0674Ik, int i) throws IOException {
        O90.f(c0674Ik, "data");
        if (this.h) {
            throw new IOException("closed");
        }
        C6129nj c6129nj = this.f;
        c6129nj.o0(c0674Ik);
        int i2 = i | 128;
        if (this.c && c0674Ik.c() >= this.e) {
            C6154nr0 c6154nr0 = this.i;
            if (c6154nr0 == null) {
                c6154nr0 = new C6154nr0(this.d, 0);
                this.i = c6154nr0;
            }
            C6129nj c6129nj2 = c6154nr0.c;
            if (c6129nj2.b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (c6154nr0.b) {
                ((Deflater) c6154nr0.d).reset();
            }
            long j = c6129nj.b;
            C6999sH c6999sH = (C6999sH) c6154nr0.e;
            c6999sH.c0(c6129nj, j);
            c6999sH.flush();
            C0674Ik c0674Ik2 = AbstractC6345or0.a;
            long j2 = c6129nj2.b;
            byte[] bArr = c0674Ik2.a;
            long length = j2 - bArr.length;
            int length2 = bArr.length;
            if (length < 0 || length2 < 0 || j2 - length < length2 || bArr.length < length2) {
                c6129nj2.r0(0);
                c6129nj.c0(c6129nj2, c6129nj2.b);
                i2 = i | 192;
            } else {
                for (int i3 = 0; i3 < length2; i3++) {
                    if (c6129nj2.x(i3 + length) != c0674Ik2.a[i3]) {
                        c6129nj2.r0(0);
                        break;
                    }
                }
                long j3 = c6129nj2.b - 4;
                C5556kj c5556kjD = c6129nj2.D(AbstractC1525Ti.a);
                try {
                    c5556kjD.a(j3);
                    AbstractC2141aT1.a(c5556kjD, null);
                    c6129nj.c0(c6129nj2, c6129nj2.b);
                    i2 = i | 192;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2141aT1.a(c5556kjD, th);
                        throw th2;
                    }
                }
            }
        }
        long j4 = c6129nj.b;
        C6129nj c6129nj3 = this.g;
        c6129nj3.r0(i2);
        if (j4 <= 125) {
            c6129nj3.r0(((int) j4) | 128);
        } else if (j4 <= 65535) {
            c6129nj3.r0(254);
            c6129nj3.v0((int) j4);
        } else {
            c6129nj3.r0(KotlinVersion.MAX_COMPONENT_VALUE);
            JX0 jx0N0 = c6129nj3.n0(8);
            int i4 = jx0N0.c;
            byte[] bArr2 = jx0N0.a;
            bArr2[i4] = (byte) ((j4 >>> 56) & 255);
            bArr2[i4 + 1] = (byte) ((j4 >>> 48) & 255);
            bArr2[i4 + 2] = (byte) ((j4 >>> 40) & 255);
            bArr2[i4 + 3] = (byte) ((j4 >>> 32) & 255);
            bArr2[i4 + 4] = (byte) ((j4 >>> 24) & 255);
            bArr2[i4 + 5] = (byte) ((j4 >>> 16) & 255);
            bArr2[i4 + 6] = (byte) ((j4 >>> 8) & 255);
            bArr2[i4 + 7] = (byte) (255 & j4);
            jx0N0.c = i4 + 8;
            c6129nj3.b += 8;
        }
        byte[] bArr3 = this.j;
        O90.c(bArr3);
        this.b.nextBytes(bArr3);
        c6129nj3.p0(bArr3);
        if (j4 > 0) {
            C5556kj c5556kj = this.k;
            O90.c(c5556kj);
            c6129nj.D(c5556kj);
            c5556kj.c(0L);
            Z02.e(c5556kj, bArr3);
            c5556kj.close();
        }
        c6129nj3.c0(c6129nj, j4);
        C8161yN0 c8161yN0 = this.a;
        if (c8161yN0.c) {
            throw new IllegalStateException("closed");
        }
        C6129nj c6129nj4 = c8161yN0.b;
        long j5 = c6129nj4.b;
        if (j5 > 0) {
            c8161yN0.a.c0(c6129nj4, j5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C6154nr0 c6154nr0 = this.i;
        if (c6154nr0 != null) {
            c6154nr0.close();
        }
    }
}
