package p000;

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
public final class C10282mZ1 extends SQ1 {

    /* renamed from: j */
    public static final String[] f37768j = {"firebase_", "google_", "ga_"};

    /* renamed from: k */
    public static final String[] f37769k = {"_err"};

    /* renamed from: d */
    public SecureRandom f37770d;

    /* renamed from: e */
    public final AtomicLong f37771e;

    /* renamed from: f */
    public int f37772f;

    /* renamed from: g */
    public C7446Co0 f37773g;

    /* renamed from: h */
    public Boolean f37774h;

    /* renamed from: i */
    public Integer f37775i;

    public C10282mZ1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f37775i = null;
        this.f37771e = new AtomicLong(0L);
    }

    /* renamed from: A2 */
    public static boolean m22837A2(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: C1 */
    public static long m22838C1(C10362nB1 c10362nB1) {
        long length = 0;
        if (c10362nB1 == null) {
            return 0L;
        }
        Bundle bundle = c10362nB1.f38167a;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            if (bundle.get(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    /* renamed from: C2 */
    public static boolean m22839C2(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: D1 */
    public static long m22840D1(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i = 0;
        Preconditions.checkState(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: D2 */
    public static int m22841D2(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    /* renamed from: H1 */
    public static Bundle m22842H1(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9898jZ1 c9898jZ1 = (C9898jZ1) it.next();
            String str = c9898jZ1.f35242e;
            String str2 = c9898jZ1.f35239b;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l = c9898jZ1.f35241d;
                if (l != null) {
                    bundle.putLong(str2, l.longValue());
                } else {
                    Double d = c9898jZ1.f35244g;
                    if (d != null) {
                        bundle.putDouble(str2, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: I2 */
    public static MessageDigest m22843I2() throws NoSuchAlgorithmException {
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

    /* renamed from: J1 */
    public static String m22844J1(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return AbstractC7222ym.m26232i(str.substring(0, str.offsetByCodePoints(0, i)), "...");
        }
        return null;
    }

    /* renamed from: M1 */
    public static void m22845M1(Bundle bundle, int i, String str, Object obj) {
        if (m22856r2(i, bundle)) {
            bundle.putString("_ev", m22844J1(40, str, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: Y1 */
    public static void m22846Y1(CU1 cu1, Bundle bundle, boolean z) {
        if (bundle == null || cu1 == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && cu1 == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = cu1.f1399a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = cu1.f1400b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", cu1.f1401c);
    }

    /* renamed from: Z1 */
    public static void m22847Z1(InterfaceC11050sZ1 interfaceC11050sZ1, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m22856r2(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC11050sZ1.mo23757c(str, "_err", bundle);
    }

    /* renamed from: c2 */
    public static boolean m22848c2(Context context) {
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

    /* renamed from: d2 */
    public static boolean m22849d2(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: e2 */
    public static boolean m22850e2(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: i2 */
    public static boolean m22851i2(String str, String str2, String str3, String str4) {
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

    /* renamed from: j2 */
    public static boolean m22852j2(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l2 */
    public static byte[] m22853l2(Parcelable parcelable) {
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

    /* renamed from: n2 */
    public static boolean m22854n2(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? m22857s2(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m22857s2(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: q2 */
    public static ArrayList m22855q2(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7571Ey1 c7571Ey1 = (C7571Ey1) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c7571Ey1.f2987a);
            bundle.putString("origin", c7571Ey1.f2988b);
            bundle.putLong("creation_timestamp", c7571Ey1.f2990d);
            bundle.putString("name", c7571Ey1.f2989c.f35239b);
            I22.m3736d(bundle, Preconditions.checkNotNull(c7571Ey1.f2989c.zza()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, c7571Ey1.f2991e);
            String str = c7571Ey1.f2992f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C11894zB1 c11894zB1 = c7571Ey1.f2993g;
            if (c11894zB1 != null) {
                bundle.putString("timed_out_event_name", c11894zB1.f46717a);
                C10362nB1 c10362nB1 = c11894zB1.f46718b;
                if (c10362nB1 != null) {
                    bundle.putBundle("timed_out_event_params", c10362nB1.m23098m0());
                }
            }
            bundle.putLong("trigger_timeout", c7571Ey1.f2994h);
            C11894zB1 c11894zB12 = c7571Ey1.f2995i;
            if (c11894zB12 != null) {
                bundle.putString("triggered_event_name", c11894zB12.f46717a);
                C10362nB1 c10362nB12 = c11894zB12.f46718b;
                if (c10362nB12 != null) {
                    bundle.putBundle("triggered_event_params", c10362nB12.m23098m0());
                }
            }
            bundle.putLong("triggered_timestamp", c7571Ey1.f2989c.f35240c);
            bundle.putLong("time_to_live", c7571Ey1.f2996j);
            C11894zB1 c11894zB13 = c7571Ey1.f2997k;
            if (c11894zB13 != null) {
                bundle.putString("expired_event_name", c11894zB13.f46717a);
                C10362nB1 c10362nB13 = c11894zB13.f46718b;
                if (c10362nB13 != null) {
                    bundle.putBundle("expired_event_params", c10362nB13.m23098m0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: r2 */
    public static boolean m22856r2(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* renamed from: s2 */
    public static boolean m22857s2(Context context, String str) {
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

    /* renamed from: x2 */
    public static boolean m22858x2(String str) {
        String str2 = (String) IB1.f4811m0.m3028a(null);
        return str2.equals("*") || Arrays.asList(str2.split(StringUtils.COMMA)).contains(str);
    }

    /* renamed from: A1 */
    public final int m22859A1(String str) {
        if (!m22893t2("event", str)) {
            return 2;
        }
        if (m22889k2("event", AbstractC10638pL1.f40027a, AbstractC10638pL1.f40028b, str)) {
            return !m22885b2(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0096  */
    /* renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m22860B1(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10282mZ1.m22860B1(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: B2 */
    public final int m22861B2() {
        if (this.f37775i == null) {
            this.f37775i = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(((C9110dP1) this.f11615b).f26031a) / 1000);
        }
        return this.f37775i.intValue();
    }

    /* renamed from: E1 */
    public final Bundle m22862E1(Uri uri) {
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
            mo6070n().f8381j.m24554c(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c5 A[RETURN] */
    /* renamed from: E2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m22863E2() {
        /*
            r10 = this;
            r10.mo7681v1()
            java.lang.Object r0 = r10.f11615b
            dP1 r0 = (p000.C9110dP1) r0
            jL1 r0 = r0.m17597j()
            java.lang.String r0 = r0.m22025C1()
            boolean r0 = m22858x2(r0)
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
            int r6 = p000.AbstractC0506I1.m3696a()
            r7 = 4
            if (r6 >= r7) goto L2d
            r6 = 8
            goto L4e
        L2d:
            if (r0 < r4) goto L3b
            int r0 = p000.AbstractC0506I1.m3696a()
            r4 = 3
            if (r0 <= r4) goto L3b
            int r0 = p000.AbstractC0506I1.m3716u()
            goto L3c
        L3b:
            r0 = r3
        L3c:
            GJ1 r4 = p000.IB1.f4799g0
            java.lang.Object r4 = r4.m3028a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r0 >= r4) goto L4d
            r6 = 16
            goto L4e
        L4d:
            r6 = r1
        L4e:
            java.lang.String r0 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r0 = r10.m22899z2(r0)
            if (r0 != 0) goto L59
            r8 = 2
            long r6 = r6 | r8
        L59:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            java.lang.Boolean r0 = r10.f37774h
            if (r0 != 0) goto Lb3
            Co0 r0 = r10.m22867G2()
            if (r0 != 0) goto L68
            goto Lb9
        L68:
            Jj0 r0 = r0.m1367b()
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
            r10.f37774h = r3     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
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
            OL1 r0 = r10.mo6070n()
            java.lang.String r4 = "Measurement manager api exception"
            rx r0 = r0.f8381j
            r0.m24554c(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.f37774h = r0
            r0 = r5
        La8:
            OL1 r3 = r10.mo6070n()
            java.lang.String r4 = "Measurement manager api status result"
            rx r3 = r3.f8386o
            r3.m24554c(r0, r4)
        Lb3:
            java.lang.Boolean r0 = r10.f37774h
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10282mZ1.m22863E2():long");
    }

    /* renamed from: F1 */
    public final Bundle m22864F1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM22892p2 = m22892p2(bundle.get(str), str);
                if (objM22892p2 == null) {
                    OL1 ol1Mo6070n = mo6070n();
                    ol1Mo6070n.f8383l.m24554c(((C9110dP1) this.f11615b).f26043m.m2166f(str), "Param value can't be null");
                } else {
                    m22875P1(str, bundle2, objM22892p2);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: F2 */
    public final long m22865F2() {
        long andIncrement;
        long j;
        if (this.f37771e.get() != 0) {
            synchronized (this.f37771e) {
                this.f37771e.compareAndSet(-1L, 1L);
                andIncrement = this.f37771e.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f37771e) {
            long jNextLong = new Random(System.nanoTime() ^ ((C9110dP1) this.f11615b).f26044n.currentTimeMillis()).nextLong();
            int i = this.f37772f + 1;
            this.f37772f = i;
            j = jNextLong + i;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006a  */
    /* renamed from: G1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m22866G1(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10282mZ1.m22866G1(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: G2 */
    public final C7446Co0 m22867G2() {
        if (this.f37773g == null) {
            Context context = ((C9110dP1) this.f11615b).f26031a;
            O90.m5968f(context, "context");
            int i = Build.VERSION.SDK_INT;
            C4029f3 c4029f3 = C4029f3.f27023a;
            if (i >= 30) {
                c4029f3.m18161a();
            }
            C11844yo0 c11844yo0 = (i >= 30 ? c4029f3.m18161a() : 0) >= 5 ? new C11844yo0(context) : null;
            this.f37773g = c11844yo0 != null ? new C7446Co0(c11844yo0) : null;
        }
        return this.f37773g;
    }

    /* renamed from: H2 */
    public final String m22868H2() {
        byte[] bArr = new byte[16];
        m22870J2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: I1 */
    public final Object m22869I1(int i, Object obj, boolean z, boolean z2) {
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
            return m22844J1(i, String.valueOf(obj), z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM22864F1 = m22864F1((Bundle) parcelable);
                if (!bundleM22864F1.isEmpty()) {
                    arrayList.add(bundleM22864F1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: J2 */
    public final SecureRandom m22870J2() {
        mo7681v1();
        if (this.f37770d == null) {
            this.f37770d = new SecureRandom();
        }
        return this.f37770d;
    }

    /* renamed from: K1 */
    public final C11894zB1 m22871K1(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m22859A1(str) != 0) {
            mo6070n().f8378g.m24554c(((C9110dP1) this.f11615b).f26043m.m2167g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM22866G1 = m22866G1(str, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleM22866G1 = m22864F1(bundleM22866G1);
        }
        Preconditions.checkNotNull(bundleM22866G1);
        return new C11894zB1(str, new C10362nB1(bundleM22866G1), str2, j);
    }

    /* renamed from: L1 */
    public final void m22872L1(C0974PT c0974pt, int i) {
        Iterator it = new TreeSet(((Bundle) c0974pt.f9081e).keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m22839C2(str) && (i2 = i2 + 1) > i) {
                String strM26230g = AbstractC7222ym.m26230g(i, "Event can't contain more than ", " params");
                OL1 ol1Mo6070n = mo6070n();
                C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
                String strM2163b = c9110dP1.f26043m.m2163b((String) c0974pt.f9079c);
                Bundle bundle = (Bundle) c0974pt.f9081e;
                ol1Mo6070n.f8380i.m24553b(strM2163b, c9110dP1.f26043m.m2162a(bundle), strM26230g);
                m22856r2(5, bundle);
                bundle.remove(str);
            }
        }
    }

    /* renamed from: N1 */
    public final void m22873N1(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8381j.m24554c(Long.valueOf(j2), "Params already contained engagement");
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: O1 */
    public final void m22874O1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                m7852u1().m22875P1(str, bundle, bundle2.get(str));
            }
        }
    }

    /* renamed from: P1 */
    public final void m22875P1(String str, Bundle bundle, Object obj) {
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
            mo6070n().f8383l.m24553b(((C9110dP1) this.f11615b).f26043m.m2166f(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0075  */
    /* renamed from: Q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22876Q1(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10282mZ1.m22876Q1(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    /* renamed from: R1 */
    public final void m22877R1(String str, InterfaceC11266uF1 interfaceC11266uF1) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning string value to wrapper");
        }
    }

    /* renamed from: S1 */
    public final void m22878S1(InterfaceC11266uF1 interfaceC11266uF1, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning int value to wrapper");
        }
    }

    /* renamed from: T1 */
    public final void m22879T1(InterfaceC11266uF1 interfaceC11266uF1, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning long value to wrapper");
        }
    }

    /* renamed from: U1 */
    public final void m22880U1(InterfaceC11266uF1 interfaceC11266uF1, Bundle bundle) {
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning bundle value to wrapper");
        }
    }

    /* renamed from: V1 */
    public final void m22881V1(InterfaceC11266uF1 interfaceC11266uF1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning bundle list to wrapper");
        }
    }

    /* renamed from: W1 */
    public final void m22882W1(InterfaceC11266uF1 interfaceC11266uF1, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning boolean value to wrapper");
        }
    }

    /* renamed from: X1 */
    public final void m22883X1(InterfaceC11266uF1 interfaceC11266uF1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning byte array to wrapper");
        }
    }

    /* renamed from: a2 */
    public final void m22884a2(Parcelable[] parcelableArr, int i) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (m22839C2(str) && !m22852j2(str, AbstractC9998kL1.f36438d) && (i2 = i2 + 1) > i) {
                    OL1 ol1Mo6070n = mo6070n();
                    String strM26230g = AbstractC7222ym.m26230g(i, "Param can't contain more than ", " item-scoped custom parameters");
                    C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
                    ol1Mo6070n.f8380i.m24553b(c9110dP1.f26043m.m2166f(str), c9110dP1.f26043m.m2162a(bundle), strM26230g);
                    m22856r2(28, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: b2 */
    public final boolean m22885b2(int i, String str, String str2) {
        if (str2 == null) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        OL1 ol1Mo6070n = mo6070n();
        ol1Mo6070n.f8380i.m24556e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* renamed from: f2 */
    public final boolean m22886f2(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = ((C9110dP1) this.f11615b).f26031a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            mo6070n().f8378g.m24554c(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    /* renamed from: g2 */
    public final boolean m22887g2(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!zIsEmpty) {
            Preconditions.checkNotNull(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c9110dP1.f26032b)) {
                OL1 ol1Mo6070n = mo6070n();
                ol1Mo6070n.f8380i.m24554c(OL1.m6026B1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(c9110dP1.f26032b)) {
                mo6070n().f8380i.m24555d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Preconditions.checkNotNull(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        OL1 ol1Mo6070n2 = mo6070n();
        ol1Mo6070n2.f8380i.m24554c(OL1.m6026B1(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    /* renamed from: h2 */
    public final boolean m22888h2(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                OL1 ol1Mo6070n = mo6070n();
                ol1Mo6070n.f8383l.m24556e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: k2 */
    public final boolean m22889k2(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be null. Type");
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f37768j;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                mo6070n().f8380i.m24553b(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m22852j2(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m22852j2(str2, strArr2)) {
            return true;
        }
        mo6070n().f8380i.m24553b(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* renamed from: m2 */
    public final boolean m22890m2(int i) {
        Boolean bool = ((C9110dP1) this.f11615b).m17601o().f17575f;
        if (m22861B2() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* renamed from: o2 */
    public final int m22891o2(String str) {
        if (!m22893t2("user property", str)) {
            return 6;
        }
        if (m22889k2("user property", AbstractC10766qL1.f40794a, null, str)) {
            return !m22885b2(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    /* renamed from: p2 */
    public final Object m22892p2(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (zEquals) {
            c9110dP1.f26037g.getClass();
            return m22869I1(Math.max(500, 256), obj, true, true);
        }
        if (m22837A2(str)) {
            c9110dP1.f26037g.getClass();
            iMax = Math.max(500, 256);
        } else {
            c9110dP1.f26037g.getClass();
        }
        return m22869I1(iMax, obj, false, true);
    }

    /* renamed from: t2 */
    public final boolean m22893t2(String str, String str2) {
        if (str2 == null) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            mo6070n().f8380i.m24553b(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo6070n().f8380i.m24553b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* renamed from: u2 */
    public final Object m22894u2(Object obj, String str) {
        return "_ldl".equals(str) ? m22869I1(m22841D2(str), obj, true, false) : m22869I1(m22841D2(str), obj, false, false);
    }

    /* renamed from: v2 */
    public final boolean m22895v2(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            mo6070n().f8378g.m24554c(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            mo6070n().f8378g.m24554c(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* renamed from: w2 */
    public final boolean m22896w2(String str, String str2) {
        if (str2 == null) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            mo6070n().f8380i.m24554c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            mo6070n().f8380i.m24553b(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo6070n().f8380i.m24553b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // p000.SQ1
    /* renamed from: y1 */
    public final boolean mo6035y1() {
        return true;
    }

    /* renamed from: y2 */
    public final boolean m22897y2(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C9110dP1) this.f11615b).f26037g.m6516x1("debug.firebase.analytics.app").equals(str);
    }

    /* renamed from: z1 */
    public final int m22898z1(Object obj, String str) {
        return "_ldl".equals(str) ? m22888h2("user property referrer", str, m22841D2(str), obj) : m22888h2("user property", str, m22841D2(str), obj) ? 0 : 7;
    }

    /* renamed from: z2 */
    public final boolean m22899z2(String str) {
        mo7681v1();
        if (Wrappers.packageManager(((C9110dP1) this.f11615b).f26031a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        mo6070n().f8385n.m24554c(str, "Permission not granted");
        return false;
    }
}
