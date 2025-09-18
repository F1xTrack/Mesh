package com.p018my.tracker.obfuscated;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.KotlinVersion;

/* renamed from: com.my.tracker.obfuscated.s1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2366s1 {

    /* renamed from: b */
    private static final Charset f20121b = StandardCharsets.UTF_8;

    /* renamed from: a */
    protected final OutputStream f20122a;

    public AbstractC2366s1(OutputStream outputStream) {
        this.f20122a = outputStream;
    }

    /* renamed from: a */
    public int m13482a(int i, double d) {
        return m13481b(i, 1) + m13475a(d);
    }

    /* renamed from: b */
    public int m13491b(byte[] bArr) {
        this.f20122a.write(bArr);
        return bArr.length;
    }

    /* renamed from: b */
    private int m13481b(int i, int i2) {
        return m13477a((i << 3) | i2);
    }

    /* renamed from: a */
    public int m13483a(int i, float f) {
        return m13481b(i, 5) + m13476a(f);
    }

    /* renamed from: b */
    private int m13480b(int i) {
        return i < 0 ? m13478a(i) : m13477a(i);
    }

    /* renamed from: a */
    public int m13484a(int i, int i2) {
        return m13481b(i, 0) + m13480b(i2);
    }

    /* renamed from: a */
    public int m13485a(int i, long j) {
        return m13481b(i, 0) + m13478a(j);
    }

    /* renamed from: a */
    public int m13486a(int i, C2360r c2360r) throws IOException {
        if (c2360r == null) {
            return 0;
        }
        int iM13481b = m13481b(i, 2);
        int iM13460b = c2360r.m13460b();
        int iM13480b = m13480b(iM13460b) + iM13460b + iM13481b;
        c2360r.m13459a(this.f20122a);
        return iM13480b;
    }

    /* renamed from: a */
    public int m13487a(int i, String str) {
        if (str == null) {
            return 0;
        }
        return m13481b(i, 2) + m13479a(str.getBytes(f20121b));
    }

    /* renamed from: a */
    public int m13489a(int i, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return m13481b(i, 2) + m13479a(bArr);
    }

    /* renamed from: a */
    private int m13479a(byte[] bArr) throws IOException {
        int iM13480b = m13480b(bArr.length) + bArr.length;
        this.f20122a.write(bArr);
        return iM13480b;
    }

    /* renamed from: a */
    public int m13488a(int i, Map map, C2360r c2360r) {
        int iM13486a = 0;
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c2360r.m13458a();
                c2360r.m13487a(1, str);
                c2360r.m13487a(2, (String) map.get(str));
                if (c2360r.m13460b() > 0) {
                    iM13486a += m13486a(i, c2360r);
                }
            }
        }
        return iM13486a;
    }

    /* renamed from: a */
    private int m13477a(int i) throws IOException {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & (-128)) == 0) {
                this.f20122a.write(i);
                return i2;
            }
            this.f20122a.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    /* renamed from: a */
    private int m13478a(long j) throws IOException {
        int i = 0;
        while (true) {
            i++;
            if (((-128) & j) == 0) {
                this.f20122a.write((int) j);
                return i;
            }
            this.f20122a.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    /* renamed from: a */
    public int m13490a(int i, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int iM13487a = 0;
        for (String str : strArr) {
            iM13487a += m13487a(i, str);
        }
        return iM13487a;
    }

    /* renamed from: a */
    private int m13475a(double d) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        this.f20122a.write(((int) jDoubleToRawLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write(((int) (jDoubleToRawLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 8;
    }

    /* renamed from: a */
    private int m13476a(float f) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        this.f20122a.write(iFloatToRawIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write((iFloatToRawIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write((iFloatToRawIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f20122a.write((iFloatToRawIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 4;
    }
}
