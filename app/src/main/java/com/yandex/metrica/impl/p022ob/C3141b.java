package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.b */
/* loaded from: classes2.dex */
public final class C3141b {

    /* renamed from: a */
    private final byte[] f23075a;

    /* renamed from: b */
    private final int f23076b;

    /* renamed from: c */
    private int f23077c;

    /* renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class a extends IOException {
        public a(int i, int i2) {
            super(AbstractC7222ym.m26233j("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", " limit ", i, i2, ")."));
        }
    }

    private C3141b(byte[] bArr, int i, int i2) {
        this.f23075a = bArr;
        this.f23077c = i;
        this.f23076b = i + i2;
    }

    /* renamed from: a */
    public static int m15634a(long j) {
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

    /* renamed from: b */
    public static int m15638b(int i) {
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

    /* renamed from: c */
    public static int m15642c(int i, int i2) {
        return m15638b(i2) + m15641c(i);
    }

    /* renamed from: d */
    public void m15653d(int i) throws IOException {
        byte b = (byte) i;
        int i2 = this.f23077c;
        if (i2 == this.f23076b) {
            throw new a(this.f23077c, this.f23076b);
        }
        byte[] bArr = this.f23075a;
        this.f23077c = i2 + 1;
        bArr[i2] = b;
    }

    /* renamed from: e */
    public void m15657e(int i, int i2) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15656e((i2 << 1) ^ (i2 >> 31));
    }

    /* renamed from: f */
    public void m15659f(int i, int i2) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15656e(i2);
    }

    /* renamed from: a */
    public static int m15635a(AbstractC3219e abstractC3219e) {
        int iMo14341a = abstractC3219e.mo14341a();
        abstractC3219e.f23283a = iMo14341a;
        return m15638b(iMo14341a) + iMo14341a;
    }

    /* renamed from: b */
    public static int m15640b(int i, long j) {
        return m15634a(j) + m15641c(i);
    }

    /* renamed from: c */
    public void m15652c(int i, long j) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15651b(j);
    }

    /* renamed from: e */
    public void m15658e(int i, long j) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15651b(j);
    }

    /* renamed from: b */
    public static int m15639b(int i, int i2) {
        return m15638b((i2 >> 31) ^ (i2 << 1)) + m15641c(i);
    }

    /* renamed from: d */
    public void m15654d(int i, int i2) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        if (i2 >= 0) {
            m15656e(i2);
        } else {
            m15651b(i2);
        }
    }

    /* renamed from: a */
    public static C3141b m15637a(byte[] bArr, int i, int i2) {
        return new C3141b(bArr, i, i2);
    }

    /* renamed from: c */
    public static int m15641c(int i) {
        return m15638b(C3271g.m15951a(i, 0));
    }

    /* renamed from: e */
    public void m15656e(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m15653d((i & 127) | 128);
            i >>>= 7;
        }
        m15653d(i);
    }

    /* renamed from: a */
    public static int m15627a(int i, double d) {
        return m15641c(i) + 8;
    }

    /* renamed from: b */
    public void m15649b(int i, boolean z) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15653d(z ? 1 : 0);
    }

    /* renamed from: a */
    public static int m15629a(int i, long j) {
        return m15634a(j) + m15641c(i);
    }

    /* renamed from: d */
    public void m15655d(int i, long j) throws IOException {
        m15656e(C3271g.m15951a(i, 0));
        m15651b((j >> 63) ^ (j << 1));
    }

    /* renamed from: b */
    public void m15650b(int i, byte[] bArr) throws IOException {
        m15656e(C3271g.m15951a(i, 2));
        m15656e(bArr.length);
        m15645a(bArr);
    }

    /* renamed from: a */
    public static int m15628a(int i, int i2) {
        return m15626a(i2) + m15641c(i);
    }

    /* renamed from: a */
    public static int m15632a(int i, boolean z) {
        return m15641c(i) + 1;
    }

    /* renamed from: a */
    public static int m15631a(int i, String str) {
        return m15636a(str) + m15641c(i);
    }

    /* renamed from: b */
    public void m15646b(int i, double d) throws IOException {
        m15656e(C3271g.m15951a(i, 1));
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        m15653d(((int) jDoubleToLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d(((int) (jDoubleToLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: a */
    public static int m15630a(int i, AbstractC3219e abstractC3219e) {
        int iM15641c = m15641c(i);
        int iMo14341a = abstractC3219e.mo14341a();
        abstractC3219e.f23283a = iMo14341a;
        return m15638b(iMo14341a) + iMo14341a + iM15641c;
    }

    /* renamed from: a */
    public static int m15633a(int i, byte[] bArr) {
        return m15638b(bArr.length) + bArr.length + m15641c(i);
    }

    /* renamed from: a */
    public static int m15626a(int i) {
        if (i >= 0) {
            return m15638b(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m15636a(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m15638b(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public void m15647b(int i, AbstractC3219e abstractC3219e) throws IOException {
        m15656e(C3271g.m15951a(i, 2));
        if (abstractC3219e.f23283a < 0) {
            abstractC3219e.f23283a = abstractC3219e.mo14341a();
        }
        m15656e(abstractC3219e.f23283a);
        abstractC3219e.mo14343a(this);
    }

    /* renamed from: a */
    public void m15643a() {
        if (this.f23076b - this.f23077c != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public void m15645a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f23076b;
        int i2 = this.f23077c;
        if (i - i2 >= length) {
            System.arraycopy(bArr, 0, this.f23075a, i2, length);
            this.f23077c += length;
            return;
        }
        throw new a(this.f23077c, this.f23076b);
    }

    /* renamed from: b */
    public void m15648b(int i, String str) throws IOException {
        m15656e(C3271g.m15951a(i, 2));
        byte[] bytes = str.getBytes("UTF-8");
        m15656e(bytes.length);
        m15645a(bytes);
    }

    /* renamed from: a */
    public void m15644a(int i, float f) throws IOException {
        m15656e(C3271g.m15951a(i, 5));
        int iFloatToIntBits = Float.floatToIntBits(f);
        m15653d(iFloatToIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d((iFloatToIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d((iFloatToIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        m15653d((iFloatToIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public void m15651b(long j) throws IOException {
        while (((-128) & j) != 0) {
            m15653d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m15653d((int) j);
    }
}
