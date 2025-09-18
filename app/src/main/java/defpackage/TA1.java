package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class TA1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean b() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            MU.d();
            MU muD = MU.d();
            muD.a();
            context = muD.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        YN1.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ce A[PHI: r6
  0x00ce: PHI (r6v21 java.lang.String) = (r6v20 java.lang.String), (r6v32 java.lang.String) binds: [B:185:0x00b6, B:189:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Intent r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TA1.d(android.content.Intent):void");
    }

    public static void e(Bundle bundle, String str) {
        try {
            MU.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = C3513e41.L0(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            S3 s3 = (S3) MU.d().b(S3.class);
            if (s3 != null) {
                ((T3) s3).a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static C1325Qt0 f(byte[] bArr, int i, int i2) {
        int i3;
        int iG;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        C0848Kq c0848Kq = new C0848Kq(i + 2, bArr, i2, 2);
        int i12 = 4;
        c0848Kq.w(4);
        int iL = c0848Kq.l(3);
        c0848Kq.v();
        int iL2 = c0848Kq.l(2);
        boolean zK = c0848Kq.k();
        int iL3 = c0848Kq.l(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (c0848Kq.k()) {
                i13 |= 1 << i14;
            }
        }
        int[] iArr2 = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr2[i15] = c0848Kq.l(8);
        }
        int iL4 = c0848Kq.l(8);
        int i16 = 0;
        for (int i17 = 0; i17 < iL; i17++) {
            if (c0848Kq.k()) {
                i16 += 89;
            }
            if (c0848Kq.k()) {
                i16 += 8;
            }
        }
        c0848Kq.w(i16);
        if (iL > 0) {
            c0848Kq.w((8 - iL) * 2);
        }
        c0848Kq.p();
        int iP = c0848Kq.p();
        if (iP == 3) {
            c0848Kq.v();
        }
        int iP2 = c0848Kq.p();
        int iP3 = c0848Kq.p();
        if (c0848Kq.k()) {
            int iP4 = c0848Kq.p();
            int iP5 = c0848Kq.p();
            int iP6 = c0848Kq.p();
            int iP7 = c0848Kq.p();
            iP2 -= (iP4 + iP5) * ((iP == 1 || iP == 2) ? 2 : 1);
            iP3 -= (iP6 + iP7) * (iP == 1 ? 2 : 1);
        }
        int i18 = iP3;
        int i19 = iP2;
        int iP8 = c0848Kq.p();
        int iP9 = c0848Kq.p();
        int iP10 = c0848Kq.p();
        int iF = -1;
        int iMax = -1;
        for (int i20 = c0848Kq.k() ? 0 : iL; i20 <= iL; i20++) {
            c0848Kq.p();
            iMax = Math.max(c0848Kq.p(), iMax);
            c0848Kq.p();
        }
        c0848Kq.p();
        c0848Kq.p();
        c0848Kq.p();
        c0848Kq.p();
        c0848Kq.p();
        c0848Kq.p();
        if (c0848Kq.k() && c0848Kq.k()) {
            int i21 = 0;
            while (i21 < i12) {
                int i22 = 0;
                while (i22 < 6) {
                    if (c0848Kq.k()) {
                        int iMin = Math.min(64, 1 << ((i21 << 1) + i12));
                        if (i21 > 1) {
                            c0848Kq.q();
                        }
                        for (int i23 = 0; i23 < iMin; i23++) {
                            c0848Kq.q();
                        }
                    } else {
                        c0848Kq.p();
                    }
                    i22 += i21 == 3 ? 3 : 1;
                    i12 = 4;
                }
                i21++;
                i12 = 4;
            }
        }
        c0848Kq.w(2);
        if (c0848Kq.k()) {
            c0848Kq.w(8);
            c0848Kq.p();
            c0848Kq.p();
            c0848Kq.v();
        }
        int iP11 = c0848Kq.p();
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = 0;
        int i25 = -1;
        int i26 = -1;
        while (i24 < iP11) {
            if (i24 == 0 || !c0848Kq.k()) {
                i6 = iP11;
                i7 = iL3;
                i8 = i13;
                iArr = iArr2;
                i9 = iL4;
                i10 = iMax;
                int iP12 = c0848Kq.p();
                int iP13 = c0848Kq.p();
                iArr3 = new int[iP12];
                int i27 = 0;
                while (i27 < iP12) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (c0848Kq.p() + 1);
                    c0848Kq.v();
                    i27++;
                }
                iArrCopyOf = new int[iP13];
                int i28 = 0;
                while (i28 < iP13) {
                    iArrCopyOf[i28] = c0848Kq.p() + 1 + (i28 > 0 ? iArrCopyOf[i28 - 1] : 0);
                    c0848Kq.v();
                    i28++;
                }
                i25 = iP12;
                i11 = iP13;
            } else {
                i6 = iP11;
                int i29 = i25 + i26;
                int iP14 = (1 - ((c0848Kq.k() ? 1 : 0) * 2)) * (c0848Kq.p() + 1);
                i10 = iMax;
                int i30 = i29 + 1;
                i9 = iL4;
                boolean[] zArr = new boolean[i30];
                iArr = iArr2;
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (c0848Kq.k()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = c0848Kq.k();
                    }
                }
                int[] iArr4 = new int[i30];
                int[] iArr5 = new int[i30];
                int i32 = 0;
                for (int i33 = i26 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iP14;
                    if (i34 < 0 && zArr[i25 + i33]) {
                        iArr4[i32] = i34;
                        i32++;
                    }
                }
                if (iP14 < 0 && zArr[i29]) {
                    iArr4[i32] = iP14;
                    i32++;
                }
                i8 = i13;
                int i35 = i32;
                i7 = iL3;
                for (int i36 = 0; i36 < i25; i36++) {
                    int i37 = iArr3[i36] + iP14;
                    if (i37 < 0 && zArr[i36]) {
                        iArr4[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i35);
                int i38 = 0;
                for (int i39 = i25 - 1; i39 >= 0; i39--) {
                    int i40 = iArr3[i39] + iP14;
                    if (i40 > 0 && zArr[i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iP14 > 0 && zArr[i29]) {
                    iArr5[i38] = iP14;
                    i38++;
                }
                i11 = i38;
                for (int i41 = 0; i41 < i26; i41++) {
                    int i42 = iArrCopyOf[i41] + iP14;
                    if (i42 > 0 && zArr[i25 + i41]) {
                        iArr5[i11] = i42;
                        i11++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i11);
                iArr3 = iArrCopyOf2;
                i25 = i35;
            }
            i24++;
            i26 = i11;
            iP11 = i6;
            iMax = i10;
            iL4 = i9;
            iArr2 = iArr;
            i13 = i8;
            iL3 = i7;
        }
        int i43 = iL3;
        int i44 = i13;
        int[] iArr6 = iArr2;
        int i45 = iL4;
        int i46 = iMax;
        if (c0848Kq.k()) {
            int iP15 = c0848Kq.p();
            for (int i47 = 0; i47 < iP15; i47++) {
                c0848Kq.w(iP10 + 5);
            }
        }
        c0848Kq.w(2);
        float f = 1.0f;
        if (c0848Kq.k()) {
            if (c0848Kq.k()) {
                int iL5 = c0848Kq.l(8);
                if (iL5 == 255) {
                    int iL6 = c0848Kq.l(16);
                    int iL7 = c0848Kq.l(16);
                    if (iL6 != 0 && iL7 != 0) {
                        f = iL6 / iL7;
                    }
                } else if (iL5 < 17) {
                    f = b[iL5];
                } else {
                    NX.p("Unexpected aspect_ratio_idc value: ", iL5);
                }
            }
            if (c0848Kq.k()) {
                c0848Kq.v();
            }
            if (c0848Kq.k()) {
                c0848Kq.w(3);
                i5 = c0848Kq.k() ? 1 : 2;
                if (c0848Kq.k()) {
                    int iL8 = c0848Kq.l(8);
                    int iL9 = c0848Kq.l(8);
                    c0848Kq.w(8);
                    iF = C0470Fu.f(iL8);
                    iG = C0470Fu.g(iL9);
                } else {
                    iG = -1;
                }
            } else {
                i5 = -1;
                iG = -1;
            }
            if (c0848Kq.k()) {
                c0848Kq.p();
                c0848Kq.p();
            }
            c0848Kq.v();
            if (c0848Kq.k()) {
                i18 *= 2;
            }
            i4 = i5;
            i3 = i18;
        } else {
            i3 = i18;
            iG = -1;
            i4 = -1;
        }
        return new C1325Qt0(iL2, zK, i43, i44, iP8, iP9, iArr6, i45, i19, i3, f, i46, iF, i4, iG);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1481St0 g(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TA1.g(byte[], int, int):St0");
    }

    public static boolean h(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void i(C0848Kq c0848Kq) {
        int iP = c0848Kq.p() + 1;
        c0848Kq.w(8);
        for (int i = 0; i < iP; i++) {
            c0848Kq.p();
            c0848Kq.p();
            c0848Kq.v();
        }
        c0848Kq.w(20);
    }

    public static int j(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
