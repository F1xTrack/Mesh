package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: tQ */
/* loaded from: classes.dex */
public final class C7217tQ {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public C7217tQ(byte[] bArr, int i, int i2) {
        this(-1L, i, i2, bArr);
    }

    public static C7217tQ a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C7979xQ.c0);
        return new C7217tQ(bytes, 2, bytes.length);
    }

    public static C7217tQ b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static C7217tQ c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7979xQ.T[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new C7217tQ(byteBufferWrap.array(), 4, jArr.length);
    }

    public static C7217tQ d(C7599vQ[] c7599vQArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7979xQ.T[5] * c7599vQArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C7599vQ c7599vQ : c7599vQArr) {
            byteBufferWrap.putInt((int) c7599vQ.a);
            byteBufferWrap.putInt((int) c7599vQ.b);
        }
        return new C7217tQ(byteBufferWrap.array(), 5, c7599vQArr.length);
    }

    public static C7217tQ e(int i, ByteOrder byteOrder) {
        return f(new int[]{i}, byteOrder);
    }

    public static C7217tQ f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7979xQ.T[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new C7217tQ(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double g(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            if (((long[]) objJ).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            if (((int[]) objJ).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof C7599vQ[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C7599vQ[] c7599vQArr = (C7599vQ[]) objJ;
        if (c7599vQArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C7599vQ c7599vQ = c7599vQArr[0];
        return c7599vQ.a / c7599vQ.b;
    }

    public final int h(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }
        if (!(objJ instanceof C7599vQ[])) {
            return null;
        }
        C7599vQ[] c7599vQArr = (C7599vQ[]) objJ;
        while (i < c7599vQArr.length) {
            sb.append(c7599vQArr[i].a);
            sb.append('/');
            sb.append(c7599vQArr[i].b);
            i++;
            if (i != c7599vQArr.length) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable j(java.nio.ByteOrder r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7217tQ.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C7979xQ.S[this.a]);
        sb.append(", data length:");
        return AbstractC1705Vq.j(sb, this.d.length, ")");
    }

    public C7217tQ(long j, int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
