package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.facebook.react.bridge.ReadableArray;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public abstract class GM1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double m3048a(double r8, double r10, double r12, java.lang.String r14) {
        /*
            r0 = 2
            r1 = 0
            java.lang.String r14 = r14.trim()
            int r2 = r14.length()
            r3 = 1
            int r4 = r2 + (-1)
            if (r2 == 0) goto Lcb
            java.lang.String r5 = "normal"
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L19
            goto Lcb
        L19:
            int r5 = r14.codePointAt(r4)
            r6 = 37
            if (r5 != r6) goto L32
            java.lang.String r10 = r14.substring(r1, r4)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            double r10 = r10.doubleValue()
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 / r12
            double r10 = r10 * r8
            return r10
        L32:
            int r8 = r2 + (-2)
            if (r8 <= 0) goto Lc2
            java.lang.String r9 = r14.substring(r8)
            r9.getClass()
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case 3178: goto L89;
                case 3240: goto L7e;
                case 3365: goto L75;
                case 3488: goto L6a;
                case 3571: goto L5f;
                case 3588: goto L54;
                case 3592: goto L49;
                default: goto L47;
            }
        L47:
            r0 = r6
            goto L93
        L49:
            java.lang.String r0 = "px"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L52
            goto L47
        L52:
            r0 = 6
            goto L93
        L54:
            java.lang.String r0 = "pt"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L5d
            goto L47
        L5d:
            r0 = 5
            goto L93
        L5f:
            java.lang.String r0 = "pc"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L68
            goto L47
        L68:
            r0 = 4
            goto L93
        L6a:
            java.lang.String r0 = "mm"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L73
            goto L47
        L73:
            r0 = 3
            goto L93
        L75:
            java.lang.String r3 = "in"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L93
            goto L47
        L7e:
            java.lang.String r0 = "em"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L87
            goto L47
        L87:
            r0 = r3
            goto L93
        L89:
            java.lang.String r0 = "cm"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L92
            goto L47
        L92:
            r0 = r1
        L93:
            switch(r0) {
                case 0: goto Lad;
                case 1: goto L9c;
                case 2: goto La7;
                case 3: goto La1;
                case 4: goto L9e;
                case 5: goto L9a;
                case 6: goto L98;
                default: goto L96;
            }
        L96:
            r12 = r4
            goto Lb3
        L98:
            r2 = r8
            goto L96
        L9a:
            r12 = 4608308318706860032(0x3ff4000000000000, double:1.25)
        L9c:
            r2 = r8
            goto Lb3
        L9e:
            r12 = 4624633867356078080(0x402e000000000000, double:15.0)
            goto L9c
        La1:
            r12 = 4615161236842447043(0x400c58b1572580c3, double:3.543307)
            goto L9c
        La7:
            r12 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L9c
        Lad:
            r12 = 4630183578586017914(0x4041b76ed677707a, double:35.43307)
            goto L9c
        Lb3:
            java.lang.String r8 = r14.substring(r1, r2)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            double r8 = r8.doubleValue()
            double r8 = r8 * r12
        Lc0:
            double r8 = r8 * r10
            return r8
        Lc2:
            java.lang.Double r8 = java.lang.Double.valueOf(r14)
            double r8 = r8.doubleValue()
            goto Lc0
        Lcb:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.GM1.m3048a(double, double, double, java.lang.String):double");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static double m3049b(C11931zU0 c11931zU0, double d, double d2, double d3) {
        double d4;
        if (c11931zU0 == null) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        int i = AbstractC11772yE0.f46147a[c11931zU0.f46848b.ordinal()];
        double d5 = c11931zU0.f46847a;
        switch (i) {
            case 1:
            case 2:
                d3 = 1.0d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 3:
                d4 = (d5 / 100.0d) * d;
                break;
            case 4:
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 5:
                d3 /= 2.0d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 6:
                d3 = 35.43307d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 7:
                d3 = 3.543307d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 8:
                d3 = 90.0d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 9:
                d3 = 1.25d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            case 10:
                d3 = 15.0d;
                d5 *= d3;
                d4 = d5 * d2;
                break;
            default:
                d4 = d5 * d2;
                break;
        }
        return d4 + ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: c */
    public static ResolveInfo m3050c(Context context) {
        O90.m5968f(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
    }

    /* renamed from: d */
    public static ResolveInfo m3051d(Context context) {
        O90.m5968f(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    /* renamed from: e */
    public static String m3052e(InterfaceC1072R2 interfaceC1072R2) {
        if (interfaceC1072R2 instanceof C0884O2) {
            return "image/*";
        }
        if (interfaceC1072R2 instanceof C1010Q2) {
            return "video/*";
        }
        if (interfaceC1072R2 instanceof C0947P2) {
            return "image/*";
        }
        if (interfaceC1072R2 instanceof C0821N2) {
            return null;
        }
        throw new C6838sg();
    }

    /* renamed from: f */
    public static int m3053f(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }
}
