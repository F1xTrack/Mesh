package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: mZ1 */
/* loaded from: classes.dex */
public final class C5910mZ1 extends SQ1 {
    public static final String[] j = {"firebase_", "google_", "ga_"};
    public static final String[] k = {"_err"};
    public SecureRandom d;
    public final AtomicLong e;
    public int f;
    public C0219Co0 g;
    public Boolean h;
    public Integer i;

    public C5910mZ1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.i = null;
        this.e = new AtomicLong(0L);
    }

    public static boolean A2(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long C1(C6029nB1 c6029nB1) {
        long length = 0;
        if (c6029nB1 == null) {
            return 0L;
        }
        Bundle bundle = c6029nB1.a;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            if (bundle.get(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    public static boolean C2(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long D1(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i;
            i += 8;
        }
        return j2;
    }

    public static int D2(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public static Bundle H1(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5337jZ1 c5337jZ1 = (C5337jZ1) it.next();
            String str = c5337jZ1.e;
            String str2 = c5337jZ1.b;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l = c5337jZ1.d;
                if (l != null) {
                    bundle.putLong(str2, l.longValue());
                } else {
                    Double d = c5337jZ1.g;
                    if (d != null) {
                        bundle.putDouble(str2, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest I2() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String J1(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return AbstractC8235ym.i(str.substring(0, str.offsetByCodePoints(0, i)), "...");
        }
        return null;
    }

    public static void M1(Bundle bundle, int i, String str, Object obj) {
        if (r2(i, bundle)) {
            bundle.putString("_ev", J1(40, str, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void Y1(CU1 cu1, Bundle bundle, boolean z) {
        if (bundle == null || cu1 == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && cu1 == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = cu1.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = cu1.b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", cu1.c);
    }

    public static void Z1(InterfaceC7055sZ1 interfaceC7055sZ1, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        r2(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC7055sZ1.c(str, "_err", bundle);
    }

    public static boolean c2(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean d2(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean e2(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean i2(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean j2(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] l2(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean n2(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? s2(context, "com.google.android.gms.measurement.AppMeasurementJobService") : s2(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static ArrayList q2(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0406Ey1 c0406Ey1 = (C0406Ey1) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0406Ey1.a);
            bundle.putString("origin", c0406Ey1.b);
            bundle.putLong("creation_timestamp", c0406Ey1.d);
            bundle.putString("name", c0406Ey1.c.b);
            I22.d(bundle, Preconditions.checkNotNull(c0406Ey1.c.zza()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, c0406Ey1.e);
            String str = c0406Ey1.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C8316zB1 c8316zB1 = c0406Ey1.g;
            if (c8316zB1 != null) {
                bundle.putString("timed_out_event_name", c8316zB1.a);
                C6029nB1 c6029nB1 = c8316zB1.b;
                if (c6029nB1 != null) {
                    bundle.putBundle("timed_out_event_params", c6029nB1.m0());
                }
            }
            bundle.putLong("trigger_timeout", c0406Ey1.h);
            C8316zB1 c8316zB12 = c0406Ey1.i;
            if (c8316zB12 != null) {
                bundle.putString("triggered_event_name", c8316zB12.a);
                C6029nB1 c6029nB12 = c8316zB12.b;
                if (c6029nB12 != null) {
                    bundle.putBundle("triggered_event_params", c6029nB12.m0());
                }
            }
            bundle.putLong("triggered_timestamp", c0406Ey1.c.c);
            bundle.putLong("time_to_live", c0406Ey1.j);
            C8316zB1 c8316zB13 = c0406Ey1.k;
            if (c8316zB13 != null) {
                bundle.putString("expired_event_name", c8316zB13.a);
                C6029nB1 c6029nB13 = c8316zB13.b;
                if (c6029nB13 != null) {
                    bundle.putBundle("expired_event_params", c6029nB13.m0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean r2(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean s2(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean x2(String str) {
        String str2 = (String) IB1.m0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(StringUtils.COMMA)).contains(str);
    }

    public final int A1(String str) {
        if (!t2("event", str)) {
            return 2;
        }
        if (k2("event", AbstractC6441pL1.a, AbstractC6441pL1.b, str)) {
            return !b2(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int B1(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5910mZ1.B1(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int B2() {
        if (this.i == null) {
            this.i = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(((C3386dP1) this.b).a) / 1000);
        }
        return this.i.intValue();
    }

    public final Bundle E1(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(RemoteMessageConst.Notification.CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            n().j.c(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long E2() {
        /*
            r10 = this;
            r10.v1()
            java.lang.Object r0 = r10.b
            dP1 r0 = (defpackage.C3386dP1) r0
            jL1 r0 = r0.j()
            java.lang.String r0 = r0.C1()
            boolean r0 = x2(r0)
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 30
            r5 = 0
            if (r0 >= r4) goto L23
            r6 = 4
            goto L4e
        L23:
            int r6 = defpackage.I1.a()
            r7 = 4
            if (r6 >= r7) goto L2d
            r6 = 8
            goto L4e
        L2d:
            if (r0 < r4) goto L3b
            int r0 = defpackage.I1.a()
            r4 = 3
            if (r0 <= r4) goto L3b
            int r0 = defpackage.I1.u()
            goto L3c
        L3b:
            r0 = r3
        L3c:
            GJ1 r4 = defpackage.IB1.g0
            java.lang.Object r4 = r4.a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r0 >= r4) goto L4d
            r6 = 16
            goto L4e
        L4d:
            r6 = r1
        L4e:
            java.lang.String r0 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r0 = r10.z2(r0)
            if (r0 != 0) goto L59
            r8 = 2
            long r6 = r6 | r8
        L59:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            java.lang.Boolean r0 = r10.h
            if (r0 != 0) goto Lb3
            Co0 r0 = r10.G2()
            if (r0 != 0) goto L68
            goto Lb9
        L68:
            Jj0 r0 = r0.b()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = r0.get(r8, r4)     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            if (r0 == 0) goto L8a
            int r4 = r0.intValue()     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            r5 = 1
            if (r4 != r5) goto L8a
            r3 = r5
            goto L8a
        L81:
            r3 = move-exception
        L82:
            r5 = r0
            goto L98
        L84:
            r3 = move-exception
            goto L82
        L86:
            r3 = move-exception
            goto L82
        L88:
            r3 = move-exception
            goto L82
        L8a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            r10.h = r3     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            goto La8
        L91:
            r3 = move-exception
            goto L98
        L93:
            r3 = move-exception
            goto L98
        L95:
            r3 = move-exception
            goto L98
        L97:
            r3 = move-exception
        L98:
            OL1 r0 = r10.n()
            java.lang.String r4 = "Measurement manager api exception"
            rx r0 = r0.j
            r0.c(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.h = r0
            r0 = r5
        La8:
            OL1 r3 = r10.n()
            java.lang.String r4 = "Measurement manager api status result"
            rx r3 = r3.o
            r3.c(r0, r4)
        Lb3:
            java.lang.Boolean r0 = r10.h
            boolean r3 = r0.booleanValue()
        Lb9:
            if (r3 != 0) goto Lbe
            r3 = 64
            long r6 = r6 | r3
        Lbe:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc5
            r0 = 1
            return r0
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5910mZ1.E2():long");
    }

    public final Bundle F1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objP2 = p2(bundle.get(str), str);
                if (objP2 == null) {
                    OL1 ol1N = n();
                    ol1N.l.c(((C3386dP1) this.b).m.f(str), "Param value can't be null");
                } else {
                    P1(str, bundle2, objP2);
                }
            }
        }
        return bundle2;
    }

    public final long F2() {
        long andIncrement;
        long j2;
        if (this.e.get() != 0) {
            synchronized (this.e) {
                this.e.compareAndSet(-1L, 1L);
                andIncrement = this.e.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.e) {
            long jNextLong = new Random(System.nanoTime() ^ ((C3386dP1) this.b).n.currentTimeMillis()).nextLong();
            int i = this.f + 1;
            this.f = i;
            j2 = jNextLong + i;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle G1(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5910mZ1.G1(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final C0219Co0 G2() {
        if (this.g == null) {
            Context context = ((C3386dP1) this.b).a;
            O90.f(context, "context");
            int i = Build.VERSION.SDK_INT;
            C3698f3 c3698f3 = C3698f3.a;
            if (i >= 30) {
                c3698f3.a();
            }
            C8242yo0 c8242yo0 = (i >= 30 ? c3698f3.a() : 0) >= 5 ? new C8242yo0(context) : null;
            this.g = c8242yo0 != null ? new C0219Co0(c8242yo0) : null;
        }
        return this.g;
    }

    public final String H2() {
        byte[] bArr = new byte[16];
        J2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object I1(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return J1(i, String.valueOf(obj), z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleF1 = F1((Bundle) parcelable);
                if (!bundleF1.isEmpty()) {
                    arrayList.add(bundleF1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom J2() {
        v1();
        if (this.d == null) {
            this.d = new SecureRandom();
        }
        return this.d;
    }

    public final C8316zB1 K1(String str, Bundle bundle, String str2, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (A1(str) != 0) {
            n().g.c(((C3386dP1) this.b).m.g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleG1 = G1(str, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleG1 = F1(bundleG1);
        }
        Preconditions.checkNotNull(bundleG1);
        return new C8316zB1(str, new C6029nB1(bundleG1), str2, j2);
    }

    public final void L1(PT pt, int i) {
        Iterator it = new TreeSet(((Bundle) pt.e).keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (C2(str) && (i2 = i2 + 1) > i) {
                String strG = AbstractC8235ym.g(i, "Event can't contain more than ", " params");
                OL1 ol1N = n();
                C3386dP1 c3386dP1 = (C3386dP1) this.b;
                String strB = c3386dP1.m.b((String) pt.c);
                Bundle bundle = (Bundle) pt.e;
                ol1N.i.b(strB, c3386dP1.m.a(bundle), strG);
                r2(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void N1(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            OL1 ol1N = n();
            ol1N.j.c(Long.valueOf(j3), "Params already contained engagement");
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void O1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                u1().P1(str, bundle, bundle2.get(str));
            }
        }
    }

    public final void P1(String str, Bundle bundle, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            n().l.b(((C3386dP1) this.b).m.f(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q1(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5910mZ1.Q1(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void R1(String str, InterfaceC7377uF1 interfaceC7377uF1) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning string value to wrapper");
        }
    }

    public final void S1(InterfaceC7377uF1 interfaceC7377uF1, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning int value to wrapper");
        }
    }

    public final void T1(InterfaceC7377uF1 interfaceC7377uF1, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning long value to wrapper");
        }
    }

    public final void U1(InterfaceC7377uF1 interfaceC7377uF1, Bundle bundle) {
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning bundle value to wrapper");
        }
    }

    public final void V1(InterfaceC7377uF1 interfaceC7377uF1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning bundle list to wrapper");
        }
    }

    public final void W1(InterfaceC7377uF1 interfaceC7377uF1, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning boolean value to wrapper");
        }
    }

    public final void X1(InterfaceC7377uF1 interfaceC7377uF1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC7377uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C3386dP1) this.b).i;
            C3386dP1.e(ol1);
            ol1.j.c(e, "Error returning byte array to wrapper");
        }
    }

    public final void a2(Parcelable[] parcelableArr, int i) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (C2(str) && !j2(str, AbstractC5486kL1.d) && (i2 = i2 + 1) > i) {
                    OL1 ol1N = n();
                    String strG = AbstractC8235ym.g(i, "Param can't contain more than ", " item-scoped custom parameters");
                    C3386dP1 c3386dP1 = (C3386dP1) this.b;
                    ol1N.i.b(c3386dP1.m.f(str), c3386dP1.m.a(bundle), strG);
                    r2(28, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean b2(int i, String str, String str2) {
        if (str2 == null) {
            n().i.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        OL1 ol1N = n();
        ol1N.i.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean f2(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = ((C3386dP1) this.b).a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            n().g.c(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean g2(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!zIsEmpty) {
            Preconditions.checkNotNull(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c3386dP1.b)) {
                OL1 ol1N = n();
                ol1N.i.c(OL1.B1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(c3386dP1.b)) {
                n().i.d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Preconditions.checkNotNull(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        OL1 ol1N2 = n();
        ol1N2.i.c(OL1.B1(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean h2(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                OL1 ol1N = n();
                ol1N.l.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean k2(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            n().i.c(str, "Name is required and can't be null. Type");
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = j;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                n().i.b(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !j2(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && j2(str2, strArr2)) {
            return true;
        }
        n().i.b(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean m2(int i) {
        Boolean bool = ((C3386dP1) this.b).o().f;
        if (B2() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int o2(String str) {
        if (!t2("user property", str)) {
            return 6;
        }
        if (k2("user property", AbstractC6632qL1.a, null, str)) {
            return !b2(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object p2(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (zEquals) {
            c3386dP1.g.getClass();
            return I1(Math.max(500, 256), obj, true, true);
        }
        if (A2(str)) {
            c3386dP1.g.getClass();
            iMax = Math.max(500, 256);
        } else {
            c3386dP1.g.getClass();
        }
        return I1(iMax, obj, false, true);
    }

    public final boolean t2(String str, String str2) {
        if (str2 == null) {
            n().i.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            n().i.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            n().i.b(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                n().i.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object u2(Object obj, String str) {
        return "_ldl".equals(str) ? I1(D2(str), obj, true, false) : I1(D2(str), obj, false, false);
    }

    public final boolean v2(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            n().g.c(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            n().g.c(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean w2(String str, String str2) {
        if (str2 == null) {
            n().i.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            n().i.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            n().i.b(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                n().i.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // defpackage.SQ1
    public final boolean y1() {
        return true;
    }

    public final boolean y2(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C3386dP1) this.b).g.x1("debug.firebase.analytics.app").equals(str);
    }

    public final int z1(Object obj, String str) {
        return "_ldl".equals(str) ? h2("user property referrer", str, D2(str), obj) : h2("user property", str, D2(str), obj) ? 0 : 7;
    }

    public final boolean z2(String str) {
        v1();
        if (Wrappers.packageManager(((C3386dP1) this.b).a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        n().n.c(str, "Permission not granted");
        return false;
    }
}
