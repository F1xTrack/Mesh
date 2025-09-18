package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class I90 extends C0823Kh1 {
    public static final Pattern p = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    public final double[] h;
    public final Object i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public C0823Kh1 n;
    public Object o;

    public I90(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("inputRange");
        int size = array.size();
        double[] dArr = new double[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = array.getDouble(i2);
        }
        this.h = dArr;
        ReadableArray array2 = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.j = 2;
            int size2 = array2.size();
            int[] iArr = new int[size2];
            while (i < size2) {
                iArr[i] = array2.getInt(i);
                i++;
            }
            this.i = iArr;
            this.k = null;
        } else {
            if (array2.getType(0) == ReadableType.String) {
                this.j = 3;
                int size3 = array2.size();
                double[][] dArr2 = new double[size3][];
                String string = array2.getString(0);
                Pattern pattern = p;
                Matcher matcher = pattern.matcher(string);
                ArrayList arrayList = new ArrayList();
                while (matcher.find()) {
                    arrayList.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                int size4 = arrayList.size();
                double[] dArr3 = new double[size4];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    dArr3[i3] = ((Double) arrayList.get(i3)).doubleValue();
                }
                dArr2[0] = dArr3;
                for (int i4 = 1; i4 < size3; i4++) {
                    double[] dArr4 = new double[size4];
                    Matcher matcher2 = pattern.matcher(array2.getString(i4));
                    for (int i5 = 0; matcher2.find() && i5 < size4; i5++) {
                        dArr4[i5] = Double.parseDouble(matcher2.group());
                    }
                    dArr2[i4] = dArr4;
                }
                this.i = dArr2;
                this.k = array2.getString(0);
            } else {
                this.j = 1;
                int size5 = array2.size();
                double[] dArr5 = new double[size5];
                while (i < size5) {
                    dArr5[i] = array2.getDouble(i);
                    i++;
                }
                this.i = dArr5;
                this.k = null;
            }
        }
        this.l = readableMap.getString("extrapolateLeft");
        this.m = readableMap.getString("extrapolateRight");
    }

    public static int g(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double h(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = r24
            r2 = 2
            java.lang.String r3 = "clamp"
            r4 = 1
            java.lang.String r5 = "identity"
            r6 = 0
            java.lang.String r7 = "extend"
            r8 = -1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r10 = "Invalid extrapolation type "
            if (r9 >= 0) goto L4c
            r23.getClass()
            int r11 = r23.hashCode()
            switch(r11) {
                case -1289044198: goto L32;
                case -135761730: goto L29;
                case 94742715: goto L20;
                default: goto L1e;
            }
        L1e:
            r11 = r8
            goto L3a
        L20:
            boolean r11 = r0.equals(r3)
            if (r11 != 0) goto L27
            goto L1e
        L27:
            r11 = r2
            goto L3a
        L29:
            boolean r11 = r0.equals(r5)
            if (r11 != 0) goto L30
            goto L1e
        L30:
            r11 = r4
            goto L3a
        L32:
            boolean r11 = r0.equals(r7)
            if (r11 != 0) goto L39
            goto L1e
        L39:
            r11 = r6
        L3a:
            switch(r11) {
                case 0: goto L4c;
                case 1: goto L4b;
                case 2: goto L49;
                default: goto L3d;
            }
        L3d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r2 = "for left extrapolation"
            java.lang.String r0 = defpackage.AbstractC8235ym.k(r10, r0, r2)
            r1.<init>(r0)
            throw r1
        L49:
            r11 = r15
            goto L4d
        L4b:
            return r13
        L4c:
            r11 = r13
        L4d:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto L88
            r24.getClass()
            int r0 = r24.hashCode()
            switch(r0) {
                case -1289044198: goto L6d;
                case -135761730: goto L64;
                case 94742715: goto L5d;
                default: goto L5b;
            }
        L5b:
            r2 = r8
            goto L75
        L5d:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L75
            goto L5b
        L64:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L6b
            goto L5b
        L6b:
            r2 = r4
            goto L75
        L6d:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L74
            goto L5b
        L74:
            r2 = r6
        L75:
            switch(r2) {
                case 0: goto L88;
                case 1: goto L87;
                case 2: goto L84;
                default: goto L78;
            }
        L78:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r2 = "for right extrapolation"
            java.lang.String r1 = defpackage.AbstractC8235ym.k(r10, r1, r2)
            r0.<init>(r1)
            throw r0
        L84:
            r11 = r17
            goto L88
        L87:
            return r11
        L88:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto L8d
            return r19
        L8d:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L95
            if (r9 > 0) goto L94
            return r19
        L94:
            return r21
        L95:
            double r0 = r21 - r19
            double r11 = r11 - r15
            double r11 = r11 * r0
            double r0 = r17 - r15
            double r11 = r11 / r0
            double r11 = r11 + r19
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I90.h(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    @Override // defpackage.T4
    public final void a(T4 t4) {
        if (this.n != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(t4 instanceof C0823Kh1)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.n = (C0823Kh1) t4;
    }

    @Override // defpackage.T4
    public final void b(T4 t4) {
        if (t4 != this.n) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.n = null;
    }

    @Override // defpackage.C0823Kh1, defpackage.T4
    public final String c() {
        return "InterpolationAnimatedNode[" + this.d + "] super: " + super.c();
    }

    @Override // defpackage.T4
    public final void d() {
        C0823Kh1 c0823Kh1 = this.n;
        if (c0823Kh1 == null) {
            return;
        }
        double dF = c0823Kh1.f();
        int iX = AbstractC8235ym.x(this.j);
        Object obj = this.i;
        double[] dArr = this.h;
        if (iX == 0) {
            double[] dArr2 = (double[]) obj;
            int iG = g(dF, dArr);
            int i = iG + 1;
            this.e = h(dF, dArr[iG], dArr[i], dArr2[iG], dArr2[i], this.l, this.m);
            return;
        }
        if (iX == 1) {
            int[] iArr = (int[]) obj;
            int iG2 = g(dF, dArr);
            int iB = iArr[iG2];
            int i2 = iG2 + 1;
            int i3 = iArr[i2];
            if (iB != i3) {
                double d = dArr[iG2];
                double d2 = dArr[i2];
                if (d != d2) {
                    iB = AbstractC0937Lu.b(iB, (float) ((dF - d) / (d2 - d)), i3);
                } else if (dF > d) {
                    iB = i3;
                }
            }
            this.o = Integer.valueOf(iB);
            return;
        }
        if (iX != 2) {
            return;
        }
        double[][] dArr3 = (double[][]) obj;
        int iG3 = g(dF, dArr);
        String str = this.k;
        StringBuffer stringBuffer = new StringBuffer(str.length());
        Matcher matcher = p.matcher(str);
        int i4 = 0;
        while (matcher.find()) {
            double[] dArr4 = dArr3[iG3];
            if (i4 >= dArr4.length) {
                break;
            }
            int i5 = iG3 + 1;
            double d3 = dF;
            double[][] dArr5 = dArr3;
            Matcher matcher2 = matcher;
            int i6 = i4;
            double d4 = dF;
            StringBuffer stringBuffer2 = stringBuffer;
            double[] dArr6 = dArr;
            double dH = h(d3, dArr[iG3], dArr[i5], dArr4[i4], dArr3[i5][i4], this.l, this.m);
            int i7 = (int) dH;
            matcher2.appendReplacement(stringBuffer2, ((double) i7) != dH ? Double.toString(dH) : Integer.toString(i7));
            i4 = i6 + 1;
            matcher = matcher2;
            stringBuffer = stringBuffer2;
            dArr = dArr6;
            dF = d4;
            dArr3 = dArr5;
        }
        StringBuffer stringBuffer3 = stringBuffer;
        matcher.appendTail(stringBuffer3);
        this.o = stringBuffer3.toString();
    }

    @Override // defpackage.C0823Kh1
    public final Object e() {
        return this.o;
    }
}
