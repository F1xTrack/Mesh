package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: tQ */
/* loaded from: classes.dex */
public final class C6885tQ {

    /* renamed from: a */
    public final int f43059a;

    /* renamed from: b */
    public final int f43060b;

    /* renamed from: c */
    public final long f43061c;

    /* renamed from: d */
    public final byte[] f43062d;

    public C6885tQ(byte[] bArr, int i, int i2) {
        this(-1L, i, i2, bArr);
    }

    /* renamed from: a */
    public static C6885tQ m24919a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C7137xQ.f45602c0);
        return new C6885tQ(bytes, 2, bytes.length);
    }

    /* renamed from: b */
    public static C6885tQ m24920b(long j, ByteOrder byteOrder) {
        return m24921c(new long[]{j}, byteOrder);
    }

    /* renamed from: c */
    public static C6885tQ m24921c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7137xQ.f45593T[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new C6885tQ(byteBufferWrap.array(), 4, jArr.length);
    }

    /* renamed from: d */
    public static C6885tQ m24922d(C7011vQ[] c7011vQArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7137xQ.f45593T[5] * c7011vQArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C7011vQ c7011vQ : c7011vQArr) {
            byteBufferWrap.putInt((int) c7011vQ.f44371a);
            byteBufferWrap.putInt((int) c7011vQ.f44372b);
        }
        return new C6885tQ(byteBufferWrap.array(), 5, c7011vQArr.length);
    }

    /* renamed from: e */
    public static C6885tQ m24923e(int i, ByteOrder byteOrder) {
        return m24924f(new int[]{i}, byteOrder);
    }

    /* renamed from: f */
    public static C6885tQ m24924f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7137xQ.f45593T[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new C6885tQ(byteBufferWrap.array(), 3, iArr.length);
    }

    /* renamed from: g */
    public final double m24925g(ByteOrder byteOrder) throws Throwable {
        Object objM24928j = m24928j(byteOrder);
        if (objM24928j == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM24928j instanceof String) {
            return Double.parseDouble((String) objM24928j);
        }
        if (objM24928j instanceof long[]) {
            if (((long[]) objM24928j).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM24928j instanceof int[]) {
            if (((int[]) objM24928j).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM24928j instanceof double[]) {
            double[] dArr = (double[]) objM24928j;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM24928j instanceof C7011vQ[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C7011vQ[] c7011vQArr = (C7011vQ[]) objM24928j;
        if (c7011vQArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C7011vQ c7011vQ = c7011vQArr[0];
        return c7011vQ.f44371a / c7011vQ.f44372b;
    }

    /* renamed from: h */
    public final int m24926h(ByteOrder byteOrder) throws Throwable {
        Object objM24928j = m24928j(byteOrder);
        if (objM24928j == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM24928j instanceof String) {
            return Integer.parseInt((String) objM24928j);
        }
        if (objM24928j instanceof long[]) {
            long[] jArr = (long[]) objM24928j;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM24928j instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM24928j;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* renamed from: i */
    public final String m24927i(ByteOrder byteOrder) throws Throwable {
        Object objM24928j = m24928j(byteOrder);
        if (objM24928j == null) {
            return null;
        }
        if (objM24928j instanceof String) {
            return (String) objM24928j;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM24928j instanceof long[]) {
            long[] jArr = (long[]) objM24928j;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (objM24928j instanceof int[]) {
            int[] iArr = (int[]) objM24928j;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (objM24928j instanceof double[]) {
            double[] dArr = (double[]) objM24928j;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(objM24928j instanceof C7011vQ[])) {
            return null;
        }
        C7011vQ[] c7011vQArr = (C7011vQ[]) objM24928j;
        while (i < c7011vQArr.length) {
            sb.append(c7011vQArr[i].f44371a);
            sb.append('/');
            sb.append(c7011vQArr[i].f44372b);
            i++;
            if (i != c7011vQArr.length) {
                sb.append(StringUtils.COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:213|(2:215|(2:216|(2:218|(2:303|220)(1:221))(2:302|222)))|223|(2:225|(6:305|227|233|277|234|235)(3:228|(2:230|307)(2:231|306)|232))|304|233|277|234|235) */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.io.Serializable, vQ[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.Serializable, vQ[]] */
    /* JADX WARN: Type inference failed for: r13v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v24, types: [double[], java.io.Serializable] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m24928j(java.nio.ByteOrder r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6885tQ.m24928j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C7137xQ.f45592S[this.f43059a]);
        sb.append(", data length:");
        return AbstractC1374Vq.m8591j(sb, this.f43062d.length, ")");
    }

    public C6885tQ(long j, int i, int i2, byte[] bArr) {
        this.f43059a = i;
        this.f43060b = i2;
        this.f43061c = j;
        this.f43062d = bArr;
    }
}
