package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.metrica.impl.ob.b */
/* loaded from: classes2.dex */
public final class C2639b {
    private final byte[] a;
    private final int b;
    private int c;

    /* renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class a extends IOException {
        public a(int i, int i2) {
            super(AbstractC8235ym.j("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", " limit ", i, i2, ")."));
        }
    }

    private C2639b(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static int a(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int b(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int c(int i, int i2) {
        return b(i2) + c(i);
    }

    public void d(int i) throws IOException {
        byte b = (byte) i;
        int i2 = this.c;
        if (i2 == this.b) {
            throw new a(this.c, this.b);
        }
        byte[] bArr = this.a;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public void e(int i, int i2) throws IOException {
        e(C2764g.a(i, 0));
        e((i2 << 1) ^ (i2 >> 31));
    }

    public void f(int i, int i2) throws IOException {
        e(C2764g.a(i, 0));
        e(i2);
    }

    public static int a(AbstractC2714e abstractC2714e) {
        int iA = abstractC2714e.a();
        abstractC2714e.a = iA;
        return b(iA) + iA;
    }

    public static int b(int i, long j) {
        return a(j) + c(i);
    }

    public void c(int i, long j) throws IOException {
        e(C2764g.a(i, 0));
        b(j);
    }

    public void e(int i, long j) throws IOException {
        e(C2764g.a(i, 0));
        b(j);
    }

    public static int b(int i, int i2) {
        return b((i2 >> 31) ^ (i2 << 1)) + c(i);
    }

    public void d(int i, int i2) throws IOException {
        e(C2764g.a(i, 0));
        if (i2 >= 0) {
            e(i2);
        } else {
            b(i2);
        }
    }

    public static C2639b a(byte[] bArr, int i, int i2) {
        return new C2639b(bArr, i, i2);
    }

    public static int c(int i) {
        return b(C2764g.a(i, 0));
    }

    public void e(int i) throws IOException {
        while ((i & (-128)) != 0) {
            d((i & 127) | 128);
            i >>>= 7;
        }
        d(i);
    }

    public static int a(int i, double d) {
        return c(i) + 8;
    }

    public void b(int i, boolean z) throws IOException {
        e(C2764g.a(i, 0));
        d(z ? 1 : 0);
    }

    public static int a(int i, long j) {
        return a(j) + c(i);
    }

    public void d(int i, long j) throws IOException {
        e(C2764g.a(i, 0));
        b((j >> 63) ^ (j << 1));
    }

    public void b(int i, byte[] bArr) throws IOException {
        e(C2764g.a(i, 2));
        e(bArr.length);
        a(bArr);
    }

    public static int a(int i, int i2) {
        return a(i2) + c(i);
    }

    public static int a(int i, boolean z) {
        return c(i) + 1;
    }

    public static int a(int i, String str) {
        return a(str) + c(i);
    }

    public void b(int i, double d) throws IOException {
        e(C2764g.a(i, 1));
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        d(((int) jDoubleToLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        d(((int) (jDoubleToLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int a(int i, AbstractC2714e abstractC2714e) {
        int iC = c(i);
        int iA = abstractC2714e.a();
        abstractC2714e.a = iA;
        return b(iA) + iA + iC;
    }

    public static int a(int i, byte[] bArr) {
        return b(bArr.length) + bArr.length + c(i);
    }

    public static int a(int i) {
        if (i >= 0) {
            return b(i);
        }
        return 10;
    }

    public static int a(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return b(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public void b(int i, AbstractC2714e abstractC2714e) throws IOException {
        e(C2764g.a(i, 2));
        if (abstractC2714e.a < 0) {
            abstractC2714e.a = abstractC2714e.a();
        }
        e(abstractC2714e.a);
        abstractC2714e.a(this);
    }

    public void a() {
        if (this.b - this.c != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        if (i - i2 >= length) {
            System.arraycopy(bArr, 0, this.a, i2, length);
            this.c += length;
            return;
        }
        throw new a(this.c, this.b);
    }

    public void b(int i, String str) throws IOException {
        e(C2764g.a(i, 2));
        byte[] bytes = str.getBytes("UTF-8");
        e(bytes.length);
        a(bytes);
    }

    public void a(int i, float f) throws IOException {
        e(C2764g.a(i, 5));
        int iFloatToIntBits = Float.floatToIntBits(f);
        d(iFloatToIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        d((iFloatToIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        d((iFloatToIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        d((iFloatToIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void b(long j) throws IOException {
        while (((-128) & j) != 0) {
            d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        d((int) j);
    }
}
