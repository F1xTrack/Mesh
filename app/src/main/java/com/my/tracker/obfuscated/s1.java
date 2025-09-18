package com.my.tracker.obfuscated;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public abstract class s1 {
    private static final Charset b = StandardCharsets.UTF_8;
    protected final OutputStream a;

    public s1(OutputStream outputStream) {
        this.a = outputStream;
    }

    public int a(int i, double d) {
        return b(i, 1) + a(d);
    }

    public int b(byte[] bArr) {
        this.a.write(bArr);
        return bArr.length;
    }

    private int b(int i, int i2) {
        return a((i << 3) | i2);
    }

    public int a(int i, float f) {
        return b(i, 5) + a(f);
    }

    private int b(int i) {
        return i < 0 ? a(i) : a(i);
    }

    public int a(int i, int i2) {
        return b(i, 0) + b(i2);
    }

    public int a(int i, long j) {
        return b(i, 0) + a(j);
    }

    public int a(int i, r rVar) throws IOException {
        if (rVar == null) {
            return 0;
        }
        int iB = b(i, 2);
        int iB2 = rVar.b();
        int iB3 = b(iB2) + iB2 + iB;
        rVar.a(this.a);
        return iB3;
    }

    public int a(int i, String str) {
        if (str == null) {
            return 0;
        }
        return b(i, 2) + a(str.getBytes(b));
    }

    public int a(int i, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return b(i, 2) + a(bArr);
    }

    private int a(byte[] bArr) throws IOException {
        int iB = b(bArr.length) + bArr.length;
        this.a.write(bArr);
        return iB;
    }

    public int a(int i, Map map, r rVar) {
        int iA = 0;
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                rVar.a();
                rVar.a(1, str);
                rVar.a(2, (String) map.get(str));
                if (rVar.b() > 0) {
                    iA += a(i, rVar);
                }
            }
        }
        return iA;
    }

    private int a(int i) throws IOException {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & (-128)) == 0) {
                this.a.write(i);
                return i2;
            }
            this.a.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    private int a(long j) throws IOException {
        int i = 0;
        while (true) {
            i++;
            if (((-128) & j) == 0) {
                this.a.write((int) j);
                return i;
            }
            this.a.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    public int a(int i, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int iA = 0;
        for (String str : strArr) {
            iA += a(i, str);
        }
        return iA;
    }

    private int a(double d) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        this.a.write(((int) jDoubleToRawLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write(((int) (jDoubleToRawLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 8;
    }

    private int a(float f) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        this.a.write(iFloatToRawIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((iFloatToRawIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((iFloatToRawIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.a.write((iFloatToRawIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 4;
    }
}
