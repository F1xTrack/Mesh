package p000;

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

    /* renamed from: a */
    public static final byte[] f11190a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f11191b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f11192c = new Object();

    /* renamed from: d */
    public static int[] f11193d = new int[10];

    /* renamed from: a */
    public static void m7611a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static boolean m7612b() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C0786MU.m5375d();
            C0786MU c0786muM5375d = C0786MU.m5375d();
            c0786muM5375d.m5379a();
            context = c0786muM5375d.f7174a;
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

    /* renamed from: c */
    public static int m7613c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        YN1.m9281f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m7611a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m7611a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m7611a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m7611a(zArr);
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7614d(android.content.Intent r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TA1.m7614d(android.content.Intent):void");
    }

    /* renamed from: e */
    public static void m7615e(Bundle bundle, String str) {
        try {
            C0786MU.m5375d();
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
            String str2 = C9196e41.m17829L0(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            InterfaceC1136S3 interfaceC1136S3 = (InterfaceC1136S3) C0786MU.m5375d().m5380b(InterfaceC1136S3.class);
            if (interfaceC1136S3 != null) {
                ((C1199T3) interfaceC1136S3).m7538a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: f */
    public static C8184Qt0 m7616f(byte[] bArr, int i, int i2) {
        int i3;
        int iM2821g;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        C0683Kq c0683Kq = new C0683Kq(i + 2, bArr, i2, 2);
        int i12 = 4;
        c0683Kq.m4763w(4);
        int iM4752l = c0683Kq.m4752l(3);
        c0683Kq.m4762v();
        int iM4752l2 = c0683Kq.m4752l(2);
        boolean zM4751k = c0683Kq.m4751k();
        int iM4752l3 = c0683Kq.m4752l(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (c0683Kq.m4751k()) {
                i13 |= 1 << i14;
            }
        }
        int[] iArr2 = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr2[i15] = c0683Kq.m4752l(8);
        }
        int iM4752l4 = c0683Kq.m4752l(8);
        int i16 = 0;
        for (int i17 = 0; i17 < iM4752l; i17++) {
            if (c0683Kq.m4751k()) {
                i16 += 89;
            }
            if (c0683Kq.m4751k()) {
                i16 += 8;
            }
        }
        c0683Kq.m4763w(i16);
        if (iM4752l > 0) {
            c0683Kq.m4763w((8 - iM4752l) * 2);
        }
        c0683Kq.m4756p();
        int iM4756p = c0683Kq.m4756p();
        if (iM4756p == 3) {
            c0683Kq.m4762v();
        }
        int iM4756p2 = c0683Kq.m4756p();
        int iM4756p3 = c0683Kq.m4756p();
        if (c0683Kq.m4751k()) {
            int iM4756p4 = c0683Kq.m4756p();
            int iM4756p5 = c0683Kq.m4756p();
            int iM4756p6 = c0683Kq.m4756p();
            int iM4756p7 = c0683Kq.m4756p();
            iM4756p2 -= (iM4756p4 + iM4756p5) * ((iM4756p == 1 || iM4756p == 2) ? 2 : 1);
            iM4756p3 -= (iM4756p6 + iM4756p7) * (iM4756p == 1 ? 2 : 1);
        }
        int i18 = iM4756p3;
        int i19 = iM4756p2;
        int iM4756p8 = c0683Kq.m4756p();
        int iM4756p9 = c0683Kq.m4756p();
        int iM4756p10 = c0683Kq.m4756p();
        int iM2820f = -1;
        int iMax = -1;
        for (int i20 = c0683Kq.m4751k() ? 0 : iM4752l; i20 <= iM4752l; i20++) {
            c0683Kq.m4756p();
            iMax = Math.max(c0683Kq.m4756p(), iMax);
            c0683Kq.m4756p();
        }
        c0683Kq.m4756p();
        c0683Kq.m4756p();
        c0683Kq.m4756p();
        c0683Kq.m4756p();
        c0683Kq.m4756p();
        c0683Kq.m4756p();
        if (c0683Kq.m4751k() && c0683Kq.m4751k()) {
            int i21 = 0;
            while (i21 < i12) {
                int i22 = 0;
                while (i22 < 6) {
                    if (c0683Kq.m4751k()) {
                        int iMin = Math.min(64, 1 << ((i21 << 1) + i12));
                        if (i21 > 1) {
                            c0683Kq.m4757q();
                        }
                        for (int i23 = 0; i23 < iMin; i23++) {
                            c0683Kq.m4757q();
                        }
                    } else {
                        c0683Kq.m4756p();
                    }
                    i22 += i21 == 3 ? 3 : 1;
                    i12 = 4;
                }
                i21++;
                i12 = 4;
            }
        }
        c0683Kq.m4763w(2);
        if (c0683Kq.m4751k()) {
            c0683Kq.m4763w(8);
            c0683Kq.m4756p();
            c0683Kq.m4756p();
            c0683Kq.m4762v();
        }
        int iM4756p11 = c0683Kq.m4756p();
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = 0;
        int i25 = -1;
        int i26 = -1;
        while (i24 < iM4756p11) {
            if (i24 == 0 || !c0683Kq.m4751k()) {
                i6 = iM4756p11;
                i7 = iM4752l3;
                i8 = i13;
                iArr = iArr2;
                i9 = iM4752l4;
                i10 = iMax;
                int iM4756p12 = c0683Kq.m4756p();
                int iM4756p13 = c0683Kq.m4756p();
                iArr3 = new int[iM4756p12];
                int i27 = 0;
                while (i27 < iM4756p12) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (c0683Kq.m4756p() + 1);
                    c0683Kq.m4762v();
                    i27++;
                }
                iArrCopyOf = new int[iM4756p13];
                int i28 = 0;
                while (i28 < iM4756p13) {
                    iArrCopyOf[i28] = c0683Kq.m4756p() + 1 + (i28 > 0 ? iArrCopyOf[i28 - 1] : 0);
                    c0683Kq.m4762v();
                    i28++;
                }
                i25 = iM4756p12;
                i11 = iM4756p13;
            } else {
                i6 = iM4756p11;
                int i29 = i25 + i26;
                int iM4756p14 = (1 - ((c0683Kq.m4751k() ? 1 : 0) * 2)) * (c0683Kq.m4756p() + 1);
                i10 = iMax;
                int i30 = i29 + 1;
                i9 = iM4752l4;
                boolean[] zArr = new boolean[i30];
                iArr = iArr2;
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (c0683Kq.m4751k()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = c0683Kq.m4751k();
                    }
                }
                int[] iArr4 = new int[i30];
                int[] iArr5 = new int[i30];
                int i32 = 0;
                for (int i33 = i26 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iM4756p14;
                    if (i34 < 0 && zArr[i25 + i33]) {
                        iArr4[i32] = i34;
                        i32++;
                    }
                }
                if (iM4756p14 < 0 && zArr[i29]) {
                    iArr4[i32] = iM4756p14;
                    i32++;
                }
                i8 = i13;
                int i35 = i32;
                i7 = iM4752l3;
                for (int i36 = 0; i36 < i25; i36++) {
                    int i37 = iArr3[i36] + iM4756p14;
                    if (i37 < 0 && zArr[i36]) {
                        iArr4[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i35);
                int i38 = 0;
                for (int i39 = i25 - 1; i39 >= 0; i39--) {
                    int i40 = iArr3[i39] + iM4756p14;
                    if (i40 > 0 && zArr[i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                if (iM4756p14 > 0 && zArr[i29]) {
                    iArr5[i38] = iM4756p14;
                    i38++;
                }
                i11 = i38;
                for (int i41 = 0; i41 < i26; i41++) {
                    int i42 = iArrCopyOf[i41] + iM4756p14;
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
            iM4756p11 = i6;
            iMax = i10;
            iM4752l4 = i9;
            iArr2 = iArr;
            i13 = i8;
            iM4752l3 = i7;
        }
        int i43 = iM4752l3;
        int i44 = i13;
        int[] iArr6 = iArr2;
        int i45 = iM4752l4;
        int i46 = iMax;
        if (c0683Kq.m4751k()) {
            int iM4756p15 = c0683Kq.m4756p();
            for (int i47 = 0; i47 < iM4756p15; i47++) {
                c0683Kq.m4763w(iM4756p10 + 5);
            }
        }
        c0683Kq.m4763w(2);
        float f = 1.0f;
        if (c0683Kq.m4751k()) {
            if (c0683Kq.m4751k()) {
                int iM4752l5 = c0683Kq.m4752l(8);
                if (iM4752l5 == 255) {
                    int iM4752l6 = c0683Kq.m4752l(16);
                    int iM4752l7 = c0683Kq.m4752l(16);
                    if (iM4752l6 != 0 && iM4752l7 != 0) {
                        f = iM4752l6 / iM4752l7;
                    }
                } else if (iM4752l5 < 17) {
                    f = f11191b[iM4752l5];
                } else {
                    AbstractC0852NX.m5767p("Unexpected aspect_ratio_idc value: ", iM4752l5);
                }
            }
            if (c0683Kq.m4751k()) {
                c0683Kq.m4762v();
            }
            if (c0683Kq.m4751k()) {
                c0683Kq.m4763w(3);
                i5 = c0683Kq.m4751k() ? 1 : 2;
                if (c0683Kq.m4751k()) {
                    int iM4752l8 = c0683Kq.m4752l(8);
                    int iM4752l9 = c0683Kq.m4752l(8);
                    c0683Kq.m4763w(8);
                    iM2820f = C0372Fu.m2820f(iM4752l8);
                    iM2821g = C0372Fu.m2821g(iM4752l9);
                } else {
                    iM2821g = -1;
                }
            } else {
                i5 = -1;
                iM2821g = -1;
            }
            if (c0683Kq.m4751k()) {
                c0683Kq.m4756p();
                c0683Kq.m4756p();
            }
            c0683Kq.m4762v();
            if (c0683Kq.m4751k()) {
                i18 *= 2;
            }
            i4 = i5;
            i3 = i18;
        } else {
            i3 = i18;
            iM2821g = -1;
            i4 = -1;
        }
        return new C8184Qt0(iM4752l2, zM4751k, i43, i44, iM4756p8, iM4756p9, iArr6, i45, i19, i3, f, i46, iM2820f, i4, iM2821g);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x025a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C8288St0 m7617g(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.TA1.m7617g(byte[], int, int):St0");
    }

    /* renamed from: h */
    public static boolean m7618h(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* renamed from: i */
    public static void m7619i(C0683Kq c0683Kq) {
        int iM4756p = c0683Kq.m4756p() + 1;
        c0683Kq.m4763w(8);
        for (int i = 0; i < iM4756p; i++) {
            c0683Kq.m4756p();
            c0683Kq.m4756p();
            c0683Kq.m4762v();
        }
        c0683Kq.m4763w(20);
    }

    /* renamed from: j */
    public static int m7620j(int i, byte[] bArr) {
        int i2;
        synchronized (f11192c) {
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
                    int[] iArr = f11193d;
                    if (iArr.length <= i4) {
                        f11193d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f11193d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f11193d[i7] - i6;
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
