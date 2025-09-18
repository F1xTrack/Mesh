package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: cZ1 */
/* loaded from: classes.dex */
public final class C8997cZ1 extends AbstractC9512gY1 {
    /* renamed from: C1 */
    public static int m10755C1(RK1 rk1, String str) {
        for (int i = 0; i < ((SK1) rk1.f39024b).m7358v1(); i++) {
            if (str.equals(((SK1) rk1.f39024b).m7333c0(i).m10690z())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E1 */
    public static Bundle m10756E1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            String strM5636B = nk1.m5636B();
            if (nk1.m5639E()) {
                bundle.putDouble(strM5636B, nk1.m5644m());
            } else if (nk1.m5640F()) {
                bundle.putFloat(strM5636B, nk1.m5645t());
            } else if (nk1.m5643I()) {
                bundle.putString(strM5636B, nk1.m5637C());
            } else if (nk1.m5641G()) {
                bundle.putLong(strM5636B, nk1.m5647y());
            }
        }
        return bundle;
    }

    /* renamed from: F1 */
    public static Bundle m10757F1(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(m10757F1((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* renamed from: I1 */
    public static String m10758I1(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: J1 */
    public static ArrayList m10759J1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: K1 */
    public static HashMap m10760K1(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m10760K1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m10760K1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m10760K1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* renamed from: M1 */
    public static C11894zB1 m10761M1(C9692hy1 c9692hy1) {
        Object obj;
        Bundle bundleM10757F1 = m10757F1(c9692hy1.f28703c, true);
        String string = (!bundleM10757F1.containsKey("_o") || (obj = bundleM10757F1.get("_o")) == null) ? "app" : obj.toString();
        String strM4896b = L22.m4896b(c9692hy1.f28701a, AbstractC10638pL1.f40027a, AbstractC10638pL1.f40029c);
        if (strM4896b == null) {
            strM4896b = c9692hy1.f28701a;
        }
        return new C11894zB1(strM4896b, new C10362nB1(bundleM10757F1), string, c9692hy1.f28702b);
    }

    /* renamed from: O1 */
    public static NK1 m10762O1(String str, KK1 kk1) {
        for (NK1 nk1 : kk1.m4607B()) {
            if (nk1.m5636B().equals(str)) {
                return nk1;
            }
        }
        return null;
    }

    /* renamed from: P1 */
    public static AbstractC10524oS1 m10763P1(AbstractC10524oS1 abstractC10524oS1, byte[] bArr) throws VS1 {
        BR1 br1M23147c;
        BR1 br1 = BR1.f818a;
        if (br1 == null) {
            synchronized (BR1.class) {
                try {
                    br1M23147c = BR1.f818a;
                    if (br1M23147c == null) {
                        br1M23147c = AbstractC10396nS1.m23147c();
                        BR1.f818a = br1M23147c;
                    }
                } finally {
                }
            }
            br1 = br1M23147c;
        }
        if (br1 != null) {
            abstractC10524oS1.getClass();
            abstractC10524oS1.m23415j(bArr, bArr.length, br1);
            return abstractC10524oS1;
        }
        abstractC10524oS1.getClass();
        abstractC10524oS1.m23415j(bArr, bArr.length, BR1.f819b);
        return abstractC10524oS1;
    }

    /* renamed from: R1 */
    public static void m10764R1(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: S1 */
    public static void m10765S1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: T1 */
    public static void m10766T1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(StringUtils.COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m10765S1(builder, str3, string, set);
            }
        }
    }

    /* renamed from: U1 */
    public static void m10767U1(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m10764R1(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: V1 */
    public static void m10768V1(StringBuilder sb, int i, String str, C11402vJ1 c11402vJ1) {
        String str2;
        if (c11402vJ1 == null) {
            return;
        }
        m10764R1(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c11402vJ1.m25394s()) {
            int iM25389m = c11402vJ1.m25389m();
            if (iM25389m == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM25389m == 2) {
                str2 = "LESS_THAN";
            } else if (iM25389m == 3) {
                str2 = "GREATER_THAN";
            } else if (iM25389m == 4) {
                str2 = "EQUAL";
            } else {
                if (iM25389m != 5) {
                    throw null;
                }
                str2 = "BETWEEN";
            }
            m10767U1(sb, i, "comparison_type", str2);
        }
        if (c11402vJ1.m25396u()) {
            m10767U1(sb, i, "match_as_float", Boolean.valueOf(c11402vJ1.m25393r()));
        }
        if (c11402vJ1.m25395t()) {
            m10767U1(sb, i, "comparison_value", c11402vJ1.m25390o());
        }
        if (c11402vJ1.m25398w()) {
            m10767U1(sb, i, "min_comparison_value", c11402vJ1.m25392q());
        }
        if (c11402vJ1.m25397v()) {
            m10767U1(sb, i, "max_comparison_value", c11402vJ1.m25391p());
        }
        m10764R1(i, sb);
        sb.append("}\n");
    }

    /* renamed from: Y1 */
    public static void m10769Y1(StringBuilder sb, String str, VK1 vk1) {
        if (vk1 == null) {
            return;
        }
        m10764R1(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (vk1.m8414p() != 0) {
            m10764R1(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : vk1.m8410B()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (vk1.m8416v() != 0) {
            m10764R1(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : vk1.m8412D()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (vk1.m8413m() != 0) {
            m10764R1(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (IK1 ik1 : vk1.m8409A()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(ik1.m3825s() ? Integer.valueOf(ik1.m3822m()) : null);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb.append(ik1.m3824r() ? Long.valueOf(ik1.m3823p()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (vk1.m8415s() != 0) {
            m10764R1(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (XK1 xk1 : vk1.m8411C()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(xk1.m8980t() ? Integer.valueOf(xk1.m8978q()) : null);
                sb.append(": [");
                Iterator it = xk1.m8979s().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m10764R1(3, sb);
        sb.append("}\n");
    }

    /* renamed from: Z1 */
    public static void m10770Z1(JK1 jk1, String str, Long l) {
        List listM4294q = jk1.m4294q();
        int i = 0;
        while (true) {
            if (i >= listM4294q.size()) {
                i = -1;
                break;
            } else if (str.equals(((NK1) listM4294q.get(i)).m5636B())) {
                break;
            } else {
                i++;
            }
        }
        MK1 mk1M5625A = NK1.m5625A();
        mk1M5625A.m5332l(str);
        if (l instanceof Long) {
            mk1M5625A.m5331k(l.longValue());
        }
        if (i < 0) {
            jk1.m4288k(mk1M5625A);
        } else {
            jk1.m23414i();
            KK1.m4601s((KK1) jk1.f39024b, i, (NK1) mk1M5625A.m23412e());
        }
    }

    /* renamed from: d2 */
    public static boolean m10771d2(OS1 os1, int i) {
        if (i < (os1.size() << 6)) {
            return ((1 << (i % 64)) & ((Long) os1.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    /* renamed from: e2 */
    public static Serializable m10772e2(String str, KK1 kk1) {
        NK1 nk1M10762O1 = m10762O1(str, kk1);
        if (nk1M10762O1 == null) {
            return null;
        }
        if (nk1M10762O1.m5643I()) {
            return nk1M10762O1.m5637C();
        }
        if (nk1M10762O1.m5641G()) {
            return Long.valueOf(nk1M10762O1.m5647y());
        }
        if (nk1M10762O1.m5639E()) {
            return Double.valueOf(nk1M10762O1.m5644m());
        }
        if (nk1M10762O1.m5646w() > 0) {
            return m10774h2((LS1) nk1M10762O1.m5638D());
        }
        return null;
    }

    /* renamed from: f2 */
    public static boolean m10773f2(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: h2 */
    public static Bundle[] m10774h2(LS1 ls1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ls1.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            if (nk1 != null) {
                Bundle bundle = new Bundle();
                for (NK1 nk12 : nk1.m5638D()) {
                    if (nk12.m5643I()) {
                        bundle.putString(nk12.m5636B(), nk12.m5637C());
                    } else if (nk12.m5641G()) {
                        bundle.putLong(nk12.m5636B(), nk12.m5647y());
                    } else if (nk12.m5639E()) {
                        bundle.putDouble(nk12.m5636B(), nk12.m5644m());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        return false;
    }

    /* renamed from: D1 */
    public final long m10775D1(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        m7852u1().mo7681v1();
        MessageDigest messageDigestM22843I2 = C10282mZ1.m22843I2();
        if (messageDigestM22843I2 != null) {
            return C10282mZ1.m22840D1(messageDigestM22843I2.digest(bArr));
        }
        mo6070n().f8378g.m24555d("Failed to get MD5");
        return 0L;
    }

    /* renamed from: G1 */
    public final Parcelable m10776G1(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            mo6070n().f8378g.m24555d("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* renamed from: H1 */
    public final String m10777H1(QK1 qk1) {
        String str;
        String str2;
        EK1 ek1M7338g2;
        if (qk1 == null) {
            return "";
        }
        StringBuilder sbM26238o = AbstractC7222ym.m26238o("\nbatch {\n");
        if (qk1.m6656A()) {
            m10767U1(sbM26238o, 0, "upload_subdomain", qk1.m6661x());
        }
        if (qk1.m6663z()) {
            m10767U1(sbM26238o, 0, "sgtm_join_id", qk1.m6660w());
        }
        for (SK1 sk1 : qk1.m6662y()) {
            if (sk1 != null) {
                m10764R1(1, sbM26238o);
                sbM26238o.append("bundle {\n");
                if (sk1.m7283B0()) {
                    m10767U1(sbM26238o, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(sk1.m7337g1()));
                }
                TY1.f11425b.get();
                C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
                if (c9110dP1.f26037g.m6511E1(sk1.m7286D(), IB1.f4743H0) && sk1.m7289E0()) {
                    m10767U1(sbM26238o, 1, "session_stitching_token", sk1.m7312R());
                }
                m10767U1(sbM26238o, 1, "platform", sk1.m7308P());
                if (sk1.m7359w0()) {
                    m10767U1(sbM26238o, 1, "gmp_version", Long.valueOf(sk1.m7318T1()));
                }
                if (sk1.m7313R0()) {
                    m10767U1(sbM26238o, 1, "uploading_gmp_version", Long.valueOf(sk1.m7335e2()));
                }
                if (sk1.m7356u0()) {
                    m10767U1(sbM26238o, 1, "dynamite_version", Long.valueOf(sk1.m7305M1()));
                }
                if (sk1.m7347n0()) {
                    m10767U1(sbM26238o, 1, "config_version", Long.valueOf(sk1.m7290E1()));
                }
                m10767U1(sbM26238o, 1, "gmp_app_id", sk1.m7344m());
                m10767U1(sbM26238o, 1, "admob_app_id", sk1.m7284C());
                m10767U1(sbM26238o, 1, "app_id", sk1.m7286D());
                m10767U1(sbM26238o, 1, "app_version", sk1.m7293G());
                if (sk1.m7340j0()) {
                    m10767U1(sbM26238o, 1, "app_version_major", Integer.valueOf(sk1.m7330b0()));
                }
                m10767U1(sbM26238o, 1, "firebase_instance_id", sk1.m7304M());
                if (sk1.m7354s0()) {
                    m10767U1(sbM26238o, 1, "dev_cert_hash", Long.valueOf(sk1.m7299I1()));
                }
                m10767U1(sbM26238o, 1, "app_store", sk1.m7291F());
                if (sk1.m7310Q0()) {
                    m10767U1(sbM26238o, 1, "upload_timestamp_millis", Long.valueOf(sk1.m7334d2()));
                }
                if (sk1.m7294G0()) {
                    m10767U1(sbM26238o, 1, "start_timestamp_millis", Long.valueOf(sk1.m7328Z1()));
                }
                if (sk1.m7357v0()) {
                    m10767U1(sbM26238o, 1, "end_timestamp_millis", Long.valueOf(sk1.m7311Q1()));
                }
                if (sk1.m7281A0()) {
                    m10767U1(sbM26238o, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(sk1.m7325X1()));
                }
                if (sk1.m7362z0()) {
                    m10767U1(sbM26238o, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(sk1.m7322V1()));
                }
                m10767U1(sbM26238o, 1, "app_instance_id", sk1.m7288E());
                m10767U1(sbM26238o, 1, "resettable_device_id", sk1.m7309Q());
                m10767U1(sbM26238o, 1, "ds_id", sk1.m7303L());
                if (sk1.m7361y0()) {
                    m10767U1(sbM26238o, 1, "limited_ad_tracking", Boolean.valueOf(sk1.m7326Y()));
                }
                m10767U1(sbM26238o, 1, "os_version", sk1.m7307O());
                m10767U1(sbM26238o, 1, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, sk1.m7302K());
                m10767U1(sbM26238o, 1, "user_default_language", sk1.m7314S());
                if (sk1.m7298I0()) {
                    m10767U1(sbM26238o, 1, "time_zone_offset_minutes", Integer.valueOf(sk1.m7352q1()));
                }
                if (sk1.m7345m0()) {
                    m10767U1(sbM26238o, 1, "bundle_sequential_index", Integer.valueOf(sk1.m7301J0()));
                }
                if (sk1.m7353r0()) {
                    m10767U1(sbM26238o, 1, "delivery_index", Integer.valueOf(sk1.m7320U0()));
                }
                if (sk1.m7287D0()) {
                    m10767U1(sbM26238o, 1, "service_upload", Boolean.valueOf(sk1.m7327Z()));
                }
                m10767U1(sbM26238o, 1, "health_monitor", sk1.m7306N());
                if (sk1.m7285C0()) {
                    m10767U1(sbM26238o, 1, "retry_counter", Integer.valueOf(sk1.m7343l1()));
                }
                if (sk1.m7350p0()) {
                    m10767U1(sbM26238o, 1, "consent_signals", sk1.m7297I());
                }
                if (sk1.m7360x0()) {
                    m10767U1(sbM26238o, 1, "is_dma_region", Boolean.valueOf(sk1.m7324X()));
                }
                if (sk1.m7351q0()) {
                    m10767U1(sbM26238o, 1, "core_platform_services", sk1.m7300J());
                }
                if (sk1.m7349o0()) {
                    m10767U1(sbM26238o, 1, "consent_diagnostics", sk1.m7295H());
                }
                if (sk1.m7296H0()) {
                    m10767U1(sbM26238o, 1, "target_os_version", Long.valueOf(sk1.m7332b2()));
                }
                C11304uY1.m25207a();
                if (c9110dP1.f26037g.m6511E1(sk1.m7286D(), IB1.f4761Q0)) {
                    m10767U1(sbM26238o, 1, "ad_services_version", Integer.valueOf(sk1.m7346n()));
                    if (sk1.m7341k0() && (ek1M7338g2 = sk1.m7338g2()) != null) {
                        m10764R1(2, sbM26238o);
                        sbM26238o.append("attribution_eligibility_status {\n");
                        m10767U1(sbM26238o, 2, "eligible", Boolean.valueOf(ek1M7338g2.m2140w()));
                        m10767U1(sbM26238o, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(ek1M7338g2.m2142z()));
                        m10767U1(sbM26238o, 2, "pre_r", Boolean.valueOf(ek1M7338g2.m2136A()));
                        m10767U1(sbM26238o, 2, "r_extensions_too_old", Boolean.valueOf(ek1M7338g2.m2137B()));
                        m10767U1(sbM26238o, 2, "adservices_extension_too_old", Boolean.valueOf(ek1M7338g2.m2139u()));
                        m10767U1(sbM26238o, 2, "ad_storage_not_allowed", Boolean.valueOf(ek1M7338g2.m2138s()));
                        m10767U1(sbM26238o, 2, "measurement_manager_disabled", Boolean.valueOf(ek1M7338g2.m2141y()));
                        m10764R1(2, sbM26238o);
                        sbM26238o.append("}\n");
                    }
                }
                if (sk1.m7329a0()) {
                    BK1 bk1M7336f2 = sk1.m7336f2();
                    m10764R1(2, sbM26238o);
                    sbM26238o.append("ad_campaign_info {\n");
                    if (bk1M7336f2.m638M()) {
                        m10767U1(sbM26238o, 2, "deep_link_gclid", bk1M7336f2.m632G());
                    }
                    if (bk1M7336f2.m637L()) {
                        m10767U1(sbM26238o, 2, "deep_link_gbraid", bk1M7336f2.m631F());
                    }
                    if (bk1M7336f2.m636K()) {
                        m10767U1(sbM26238o, 2, "deep_link_gad_source", bk1M7336f2.m630C());
                    }
                    if (bk1M7336f2.m639N()) {
                        m10767U1(sbM26238o, 2, "deep_link_session_millis", Long.valueOf(bk1M7336f2.m645m()));
                    }
                    if (bk1M7336f2.m643R()) {
                        m10767U1(sbM26238o, 2, "market_referrer_gclid", bk1M7336f2.m635J());
                    }
                    if (bk1M7336f2.m642Q()) {
                        m10767U1(sbM26238o, 2, "market_referrer_gbraid", bk1M7336f2.m634I());
                    }
                    if (bk1M7336f2.m641P()) {
                        m10767U1(sbM26238o, 2, "market_referrer_gad_source", bk1M7336f2.m633H());
                    }
                    if (bk1M7336f2.m640O()) {
                        m10767U1(sbM26238o, 2, "market_referrer_click_millis", Long.valueOf(bk1M7336f2.m646q()));
                    }
                    m10764R1(2, sbM26238o);
                    sbM26238o.append("}\n");
                }
                if (sk1.m7342l0()) {
                    m10767U1(sbM26238o, 1, "batching_timestamp_millis", Long.valueOf(sk1.m7282A1()));
                }
                if (sk1.m7292F0()) {
                    C8713aL1 c8713aL1M7339i2 = sk1.m7339i2();
                    m10764R1(2, sbM26238o);
                    sbM26238o.append("sgtm_diagnostics {\n");
                    int iM9713s = c8713aL1M7339i2.m9713s();
                    if (iM9713s == 1) {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM9713s == 2) {
                        str = "GA_UPLOAD";
                    } else if (iM9713s == 3) {
                        str = "SDK_CLIENT_UPLOAD";
                    } else if (iM9713s == 4) {
                        str = "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        if (iM9713s != 5) {
                            throw null;
                        }
                        str = "SDK_SERVICE_UPLOAD";
                    }
                    m10767U1(sbM26238o, 2, "upload_type", str);
                    m10767U1(sbM26238o, 2, "client_upload_eligibility", c8713aL1M7339i2.m9711q().name());
                    switch (c8713aL1M7339i2.m9712r()) {
                        case 1:
                            str2 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                            break;
                        case 2:
                            str2 = "SERVICE_UPLOAD_ELIGIBLE";
                            break;
                        case 3:
                            str2 = "NOT_IN_ROLLOUT";
                            break;
                        case 4:
                            str2 = "MISSING_SGTM_SETTINGS";
                            break;
                        case 5:
                            str2 = "MISSING_SGTM_PROXY_INFO";
                            break;
                        case 6:
                            str2 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                            break;
                        default:
                            throw null;
                    }
                    m10767U1(sbM26238o, 2, "service_upload_eligibility", str2);
                    m10764R1(2, sbM26238o);
                    sbM26238o.append("}\n");
                }
                LS1<C8969cL1> ls1M7321V = sk1.m7321V();
                EL1 el1 = c9110dP1.f26043m;
                if (ls1M7321V != null) {
                    for (C8969cL1 c8969cL1 : ls1M7321V) {
                        if (c8969cL1 != null) {
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("user_property {\n");
                            m10767U1(sbM26238o, 2, "set_timestamp_millis", c8969cL1.m10684E() ? Long.valueOf(c8969cL1.m10689x()) : null);
                            m10767U1(sbM26238o, 2, "name", el1.m2167g(c8969cL1.m10690z()));
                            m10767U1(sbM26238o, 2, "string_value", c8969cL1.m10680A());
                            m10767U1(sbM26238o, 2, "int_value", c8969cL1.m10683D() ? Long.valueOf(c8969cL1.m10688v()) : null);
                            m10767U1(sbM26238o, 2, "double_value", c8969cL1.m10681B() ? Double.valueOf(c8969cL1.m10686m()) : null);
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("}\n");
                        }
                    }
                }
                LS1<GK1> ls1M7316T = sk1.m7316T();
                if (ls1M7316T != null) {
                    for (GK1 gk1 : ls1M7316T) {
                        if (gk1 != null) {
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("audience_membership {\n");
                            if (gk1.m3038v()) {
                                m10767U1(sbM26238o, 2, "audience_id", Integer.valueOf(gk1.m3034m()));
                            }
                            if (gk1.m3039w()) {
                                m10767U1(sbM26238o, 2, "new_audience", Boolean.valueOf(gk1.m3037u()));
                            }
                            m10769Y1(sbM26238o, "current_data", gk1.m3035s());
                            if (gk1.m3040x()) {
                                m10769Y1(sbM26238o, "previous_data", gk1.m3036t());
                            }
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("}\n");
                        }
                    }
                }
                LS1<KK1> ls1M7319U = sk1.m7319U();
                if (ls1M7319U != null) {
                    for (KK1 kk1 : ls1M7319U) {
                        if (kk1 != null) {
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("event {\n");
                            m10767U1(sbM26238o, 2, "name", el1.m2163b(kk1.m4606A()));
                            if (kk1.m4610E()) {
                                m10767U1(sbM26238o, 2, "timestamp_millis", Long.valueOf(kk1.m4616y()));
                            }
                            if (kk1.m4609D()) {
                                m10767U1(sbM26238o, 2, "previous_timestamp_millis", Long.valueOf(kk1.m4615x()));
                            }
                            if (kk1.m4608C()) {
                                m10767U1(sbM26238o, 2, "count", Integer.valueOf(kk1.m4612m()));
                            }
                            if (kk1.m4614v() != 0) {
                                m10782X1(sbM26238o, 2, kk1.m4607B());
                            }
                            m10764R1(2, sbM26238o);
                            sbM26238o.append("}\n");
                        }
                    }
                }
                m10764R1(1, sbM26238o);
                sbM26238o.append("}\n");
            }
        }
        sbM26238o.append("} // End-of-batch\n");
        return sbM26238o.toString();
    }

    /* renamed from: L1 */
    public final List m10778L1(OS1 os1, List list) {
        int i;
        ArrayList arrayList = new ArrayList(os1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                mo6070n().f8381j.m24554c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    mo6070n().f8381j.m24553b(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: N1 */
    public final KK1 m10779N1(C1588ZE c1588ze) {
        JK1 jk1M4605z = KK1.m4605z();
        jk1M4605z.m23414i();
        KK1.m4598p(c1588ze.f14806c, (KK1) jk1M4605z.f39024b);
        C10362nB1 c10362nB1 = (C10362nB1) c1588ze.f14810g;
        c10362nB1.getClass();
        Bundle bundle = c10362nB1.f38167a;
        for (String str : bundle.keySet()) {
            MK1 mk1M5625A = NK1.m5625A();
            mk1M5625A.m5332l(str);
            Object obj = bundle.get(str);
            Preconditions.checkNotNull(obj);
            m10783a2(mk1M5625A, obj);
            jk1M4605z.m4288k(mk1M5625A);
        }
        String str2 = (String) c1588ze.f14809f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            MK1 mk1M5625A2 = NK1.m5625A();
            mk1M5625A2.m5332l("_o");
            mk1M5625A2.m5333m(str2);
            jk1M4605z.m4289l((NK1) mk1M5625A2.m23412e());
        }
        return (KK1) jk1M4605z.m23412e();
    }

    /* renamed from: Q1 */
    public final C11938zX1 m10780Q1(String str, RK1 rk1, JK1 jk1, String str2) {
        int iIndexOf;
        C11304uY1.m25207a();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!c9110dP1.f26037g.m6511E1(str, IB1.f4761Q0)) {
            return null;
        }
        long jCurrentTimeMillis = c9110dP1.f26044n.currentTimeMillis();
        GJ1 gj1 = IB1.f4817p0;
        C8143Py1 c8143Py1 = c9110dP1.f26037g;
        String[] strArrSplit = c8143Py1.m6509C1(str, gj1).split(StringUtils.COMMA);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C9128dY1 c9128dY1 = this.f5586c.f37132j;
        String strM5662Q1 = c9128dY1.m4345y1().m5662Q1(str);
        Uri.Builder builder = new Uri.Builder();
        C9110dP1 c9110dP12 = (C9110dP1) c9128dY1.f11615b;
        builder.scheme(c9110dP12.f26037g.m6509C1(str, IB1.f4803i0));
        boolean zIsEmpty = TextUtils.isEmpty(strM5662Q1);
        C8143Py1 c8143Py12 = c9110dP12.f26037g;
        if (zIsEmpty) {
            builder.authority(c8143Py12.m6509C1(str, IB1.f4805j0));
        } else {
            builder.authority(strM5662Q1 + "." + c8143Py12.m6509C1(str, IB1.f4805j0));
        }
        builder.path(c8143Py12.m6509C1(str, IB1.f4807k0));
        m10765S1(builder, "gmp_app_id", ((SK1) rk1.f39024b).m7344m(), setUnmodifiableSet);
        m10765S1(builder, "gmp_version", "114010", setUnmodifiableSet);
        String strM7288E = ((SK1) rk1.f39024b).m7288E();
        GJ1 gj12 = IB1.f4767T0;
        if (c8143Py1.m6511E1(str, gj12) && m4345y1().m5663R1(str)) {
            strM7288E = "";
        }
        m10765S1(builder, "app_instance_id", strM7288E, setUnmodifiableSet);
        m10765S1(builder, "rdid", ((SK1) rk1.f39024b).m7309Q(), setUnmodifiableSet);
        m10765S1(builder, "bundle_id", rk1.m6978Z(), setUnmodifiableSet);
        String strM4293p = jk1.m4293p();
        String strM4896b = L22.m4896b(strM4293p, AbstractC10638pL1.f40029c, AbstractC10638pL1.f40027a);
        if (!TextUtils.isEmpty(strM4896b)) {
            strM4293p = strM4896b;
        }
        m10765S1(builder, "app_event_name", strM4293p, setUnmodifiableSet);
        m10765S1(builder, "app_version", String.valueOf(((SK1) rk1.f39024b).m7330b0()), setUnmodifiableSet);
        String strM7307O = ((SK1) rk1.f39024b).m7307O();
        if (c8143Py1.m6511E1(str, gj12) && m4345y1().m5664S1(str) && !TextUtils.isEmpty(strM7307O) && (iIndexOf = strM7307O.indexOf(".")) != -1) {
            strM7307O = strM7307O.substring(0, iIndexOf);
        }
        m10765S1(builder, "os_version", strM7307O, setUnmodifiableSet);
        m10765S1(builder, "timestamp", String.valueOf(jk1.m4292o()), setUnmodifiableSet);
        if (((SK1) rk1.f39024b).m7326Y()) {
            m10765S1(builder, "lat", "1", setUnmodifiableSet);
        }
        m10765S1(builder, "privacy_sandbox_version", String.valueOf(((SK1) rk1.f39024b).m7346n()), setUnmodifiableSet);
        m10765S1(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        m10765S1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        m10765S1(builder, "request_uuid", str2, setUnmodifiableSet);
        List<NK1> listM4294q = jk1.m4294q();
        Bundle bundle = new Bundle();
        for (NK1 nk1 : listM4294q) {
            String strM5636B = nk1.m5636B();
            if (nk1.m5639E()) {
                bundle.putString(strM5636B, String.valueOf(nk1.m5644m()));
            } else if (nk1.m5640F()) {
                bundle.putString(strM5636B, String.valueOf(nk1.m5645t()));
            } else if (nk1.m5643I()) {
                bundle.putString(strM5636B, nk1.m5637C());
            } else if (nk1.m5641G()) {
                bundle.putString(strM5636B, String.valueOf(nk1.m5647y()));
            }
        }
        m10766T1(builder, c8143Py1.m6509C1(str, IB1.f4815o0).split("\\|"), bundle, setUnmodifiableSet);
        List<C8969cL1> listUnmodifiableList = Collections.unmodifiableList(((SK1) rk1.f39024b).m7321V());
        Bundle bundle2 = new Bundle();
        for (C8969cL1 c8969cL1 : listUnmodifiableList) {
            String strM10690z = c8969cL1.m10690z();
            if (c8969cL1.m10681B()) {
                bundle2.putString(strM10690z, String.valueOf(c8969cL1.m10686m()));
            } else if (c8969cL1.m10682C()) {
                bundle2.putString(strM10690z, String.valueOf(c8969cL1.m10687r()));
            } else if (c8969cL1.m10685F()) {
                bundle2.putString(strM10690z, c8969cL1.m10680A());
            } else if (c8969cL1.m10683D()) {
                bundle2.putString(strM10690z, String.valueOf(c8969cL1.m10688v()));
            }
        }
        m10766T1(builder, c8143Py1.m6509C1(str, IB1.f4813n0).split("\\|"), bundle2, setUnmodifiableSet);
        m10765S1(builder, "dma", ((SK1) rk1.f39024b).m7324X() ? "1" : "0", setUnmodifiableSet);
        if (!((SK1) rk1.f39024b).m7300J().isEmpty()) {
            m10765S1(builder, "dma_cps", ((SK1) rk1.f39024b).m7300J(), setUnmodifiableSet);
        }
        if (c8143Py1.m6511E1(null, IB1.f4771V0) && ((SK1) rk1.f39024b).m7329a0()) {
            BK1 bk1M7336f2 = ((SK1) rk1.f39024b).m7336f2();
            if (!bk1M7336f2.m632G().isEmpty()) {
                m10765S1(builder, "dl_gclid", bk1M7336f2.m632G(), setUnmodifiableSet);
            }
            if (!bk1M7336f2.m631F().isEmpty()) {
                m10765S1(builder, "dl_gbraid", bk1M7336f2.m631F(), setUnmodifiableSet);
            }
            if (!bk1M7336f2.m630C().isEmpty()) {
                m10765S1(builder, "dl_gs", bk1M7336f2.m630C(), setUnmodifiableSet);
            }
            if (bk1M7336f2.m645m() > 0) {
                m10765S1(builder, "dl_ss_ts", String.valueOf(bk1M7336f2.m645m()), setUnmodifiableSet);
            }
            if (!bk1M7336f2.m635J().isEmpty()) {
                m10765S1(builder, "mr_gclid", bk1M7336f2.m635J(), setUnmodifiableSet);
            }
            if (!bk1M7336f2.m634I().isEmpty()) {
                m10765S1(builder, "mr_gbraid", bk1M7336f2.m634I(), setUnmodifiableSet);
            }
            if (!bk1M7336f2.m633H().isEmpty()) {
                m10765S1(builder, "mr_gs", bk1M7336f2.m633H(), setUnmodifiableSet);
            }
            if (bk1M7336f2.m646q() > 0) {
                m10765S1(builder, "mr_click_ts", String.valueOf(bk1M7336f2.m646q()), setUnmodifiableSet);
            }
        }
        return new C11938zX1(1, builder.build().toString(), jCurrentTimeMillis);
    }

    /* renamed from: W1 */
    public final void m10781W1(StringBuilder sb, int i, C11146tJ1 c11146tJ1) {
        String str;
        if (c11146tJ1 == null) {
            return;
        }
        m10764R1(i, sb);
        sb.append("filter {\n");
        if (c11146tJ1.m24871s()) {
            m10767U1(sb, i, "complement", Boolean.valueOf(c11146tJ1.m24870r()));
        }
        if (c11146tJ1.m24873u()) {
            m10767U1(sb, i, "param_name", ((C9110dP1) this.f11615b).f26043m.m2166f(c11146tJ1.m24869q()));
        }
        if (c11146tJ1.m24874v()) {
            int i2 = i + 1;
            C11783yJ1 c11783yJ1M24868p = c11146tJ1.m24868p();
            if (c11783yJ1M24868p != null) {
                m10764R1(i2, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c11783yJ1M24868p.m26132u()) {
                    switch (c11783yJ1M24868p.m26126n()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        case 7:
                            str = "IN_LIST";
                            break;
                        default:
                            throw null;
                    }
                    m10767U1(sb, i2, "match_type", str);
                }
                if (c11783yJ1M24868p.m26131t()) {
                    m10767U1(sb, i2, "expression", c11783yJ1M24868p.m26127p());
                }
                if (c11783yJ1M24868p.m26130s()) {
                    m10767U1(sb, i2, "case_sensitive", Boolean.valueOf(c11783yJ1M24868p.m26129r()));
                }
                if (c11783yJ1M24868p.m26125m() > 0) {
                    m10764R1(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c11783yJ1M24868p.m26128q()) {
                        m10764R1(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m10764R1(i2, sb);
                sb.append("}\n");
            }
        }
        if (c11146tJ1.m24872t()) {
            m10768V1(sb, i + 1, "number_filter", c11146tJ1.m24867o());
        }
        m10764R1(i, sb);
        sb.append("}\n");
    }

    /* renamed from: X1 */
    public final void m10782X1(StringBuilder sb, int i, LS1 ls1) {
        if (ls1 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = ls1.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            if (nk1 != null) {
                m10764R1(i2, sb);
                sb.append("param {\n");
                m10767U1(sb, i2, "name", nk1.m5642H() ? ((C9110dP1) this.f11615b).f26043m.m2166f(nk1.m5636B()) : null);
                m10767U1(sb, i2, "string_value", nk1.m5643I() ? nk1.m5637C() : null);
                m10767U1(sb, i2, "int_value", nk1.m5641G() ? Long.valueOf(nk1.m5647y()) : null);
                m10767U1(sb, i2, "double_value", nk1.m5639E() ? Double.valueOf(nk1.m5644m()) : null);
                if (nk1.m5646w() > 0) {
                    m10782X1(sb, i2, (LS1) nk1.m5638D());
                }
                m10764R1(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: a2 */
    public final void m10783a2(MK1 mk1, Object obj) {
        Preconditions.checkNotNull(obj);
        mk1.m23414i();
        NK1.m5635z((NK1) mk1.f39024b);
        mk1.m23414i();
        NK1.m5632u((NK1) mk1.f39024b);
        mk1.m23414i();
        NK1.m5631s((NK1) mk1.f39024b);
        mk1.m23414i();
        NK1.m5634x((NK1) mk1.f39024b);
        if (obj instanceof String) {
            mk1.m5333m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            mk1.m5331k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            mk1.m23414i();
            NK1.m5626n((NK1) mk1.f39024b, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            mo6070n().f8378g.m24554c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                MK1 mk1M5625A = NK1.m5625A();
                for (String str : bundle.keySet()) {
                    MK1 mk1M5625A2 = NK1.m5625A();
                    mk1M5625A2.m5332l(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        mk1M5625A2.m5331k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        mk1M5625A2.m5333m((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        mk1M5625A2.m23414i();
                        NK1.m5626n((NK1) mk1M5625A2.f39024b, dDoubleValue2);
                    }
                    mk1M5625A.m23414i();
                    NK1.m5630r((NK1) mk1M5625A.f39024b, (NK1) mk1M5625A2.m23412e());
                }
                if (((NK1) mk1M5625A.f39024b).m5646w() > 0) {
                    arrayList.add((NK1) mk1M5625A.m23412e());
                }
            }
        }
        mk1.m23414i();
        NK1.m5629q((NK1) mk1.f39024b, arrayList);
    }

    /* renamed from: b2 */
    public final void m10784b2(C8841bL1 c8841bL1, Object obj) {
        Preconditions.checkNotNull(obj);
        c8841bL1.m23414i();
        C8969cL1.m10678w((C8969cL1) c8841bL1.f39024b);
        c8841bL1.m23414i();
        C8969cL1.m10675s((C8969cL1) c8841bL1.f39024b);
        c8841bL1.m23414i();
        C8969cL1.m10674q((C8969cL1) c8841bL1.f39024b);
        if (obj instanceof String) {
            c8841bL1.m23414i();
            C8969cL1.m10677u((C8969cL1) c8841bL1.f39024b, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c8841bL1.m23414i();
            C8969cL1.m10672o((C8969cL1) c8841bL1.f39024b, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                mo6070n().f8378g.m24554c(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            c8841bL1.m23414i();
            C8969cL1.m10671n((C8969cL1) c8841bL1.f39024b, dDoubleValue);
        }
    }

    /* renamed from: c2 */
    public final boolean m10785c2(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(((C9110dP1) this.f11615b).f26044n.currentTimeMillis() - j) > j2;
    }

    /* renamed from: g2 */
    public final byte[] m10786g2(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo6070n().f8378g.m24554c(e, "Failed to gzip content");
            throw e;
        }
    }

    /* renamed from: i2 */
    public final byte[] m10787i2(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            mo6070n().f8378g.m24554c(e, "Failed to ungzip content");
            throw e;
        }
    }

    /* renamed from: j2 */
    public final ArrayList m10788j2() throws NumberFormatException {
        Context context = this.f5586c.f37134l.f26031a;
        List list = IB1.f4780a;
        C11791yN1 c11791yN1M26145c = C11791yN1.m26145c(context.getContentResolver(), AbstractC11028sO1.m24733a("com.google.android.gms.measurement"), new DL0(2));
        Map mapEmptyMap = c11791yN1M26145c == null ? Collections.emptyMap() : c11791yN1M26145c.m26147a();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) IB1.f4781a0.m3028a(null)).intValue();
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt((String) entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            mo6070n().f8381j.m24554c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo6070n().f8381j.m24554c(e, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
