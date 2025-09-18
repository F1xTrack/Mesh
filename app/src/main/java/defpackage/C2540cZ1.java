package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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
public final class C2540cZ1 extends AbstractC3985gY1 {
    public static int C1(RK1 rk1, String str) {
        for (int i = 0; i < ((SK1) rk1.b).v1(); i++) {
            if (str.equals(((SK1) rk1.b).c0(i).z())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle E1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            String strB = nk1.B();
            if (nk1.E()) {
                bundle.putDouble(strB, nk1.m());
            } else if (nk1.F()) {
                bundle.putFloat(strB, nk1.t());
            } else if (nk1.I()) {
                bundle.putString(strB, nk1.C());
            } else if (nk1.G()) {
                bundle.putLong(strB, nk1.y());
            }
        }
        return bundle;
    }

    public static Bundle F1(Map map, boolean z) {
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
                    arrayList2.add(F1((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static String I1(boolean z, boolean z2, boolean z3) {
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

    public static ArrayList J1(BitSet bitSet) {
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

    public static HashMap K1(Bundle bundle, boolean z) {
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
                                arrayList.add(K1((Bundle) parcelable, false));
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
                                arrayList.add(K1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(K1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static C8316zB1 M1(C4254hy1 c4254hy1) {
        Object obj;
        Bundle bundleF1 = F1(c4254hy1.c, true);
        String string = (!bundleF1.containsKey("_o") || (obj = bundleF1.get("_o")) == null) ? "app" : obj.toString();
        String strB = L22.b(c4254hy1.a, AbstractC6441pL1.a, AbstractC6441pL1.c);
        if (strB == null) {
            strB = c4254hy1.a;
        }
        return new C8316zB1(strB, new C6029nB1(bundleF1), string, c4254hy1.b);
    }

    public static NK1 O1(String str, KK1 kk1) {
        for (NK1 nk1 : kk1.B()) {
            if (nk1.B().equals(str)) {
                return nk1;
            }
        }
        return null;
    }

    public static AbstractC6271oS1 P1(AbstractC6271oS1 abstractC6271oS1, byte[] bArr) throws VS1 {
        BR1 br1C;
        BR1 br1 = BR1.a;
        if (br1 == null) {
            synchronized (BR1.class) {
                try {
                    br1C = BR1.a;
                    if (br1C == null) {
                        br1C = AbstractC6080nS1.c();
                        BR1.a = br1C;
                    }
                } finally {
                }
            }
            br1 = br1C;
        }
        if (br1 != null) {
            abstractC6271oS1.getClass();
            abstractC6271oS1.j(bArr, bArr.length, br1);
            return abstractC6271oS1;
        }
        abstractC6271oS1.getClass();
        abstractC6271oS1.j(bArr, bArr.length, BR1.b);
        return abstractC6271oS1;
    }

    public static void R1(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static void S1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void T1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(StringUtils.COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                S1(builder, str3, string, set);
            }
        }
    }

    public static void U1(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        R1(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void V1(StringBuilder sb, int i, String str, C7580vJ1 c7580vJ1) {
        String str2;
        if (c7580vJ1 == null) {
            return;
        }
        R1(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c7580vJ1.s()) {
            int iM = c7580vJ1.m();
            if (iM == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM == 2) {
                str2 = "LESS_THAN";
            } else if (iM == 3) {
                str2 = "GREATER_THAN";
            } else if (iM == 4) {
                str2 = "EQUAL";
            } else {
                if (iM != 5) {
                    throw null;
                }
                str2 = "BETWEEN";
            }
            U1(sb, i, "comparison_type", str2);
        }
        if (c7580vJ1.u()) {
            U1(sb, i, "match_as_float", Boolean.valueOf(c7580vJ1.r()));
        }
        if (c7580vJ1.t()) {
            U1(sb, i, "comparison_value", c7580vJ1.o());
        }
        if (c7580vJ1.w()) {
            U1(sb, i, "min_comparison_value", c7580vJ1.q());
        }
        if (c7580vJ1.v()) {
            U1(sb, i, "max_comparison_value", c7580vJ1.p());
        }
        R1(i, sb);
        sb.append("}\n");
    }

    public static void Y1(StringBuilder sb, String str, VK1 vk1) {
        if (vk1 == null) {
            return;
        }
        R1(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (vk1.p() != 0) {
            R1(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : vk1.B()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (vk1.v() != 0) {
            R1(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : vk1.D()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (vk1.m() != 0) {
            R1(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (IK1 ik1 : vk1.A()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(ik1.s() ? Integer.valueOf(ik1.m()) : null);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb.append(ik1.r() ? Long.valueOf(ik1.p()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (vk1.s() != 0) {
            R1(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (XK1 xk1 : vk1.C()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(xk1.t() ? Integer.valueOf(xk1.q()) : null);
                sb.append(": [");
                Iterator it = xk1.s().iterator();
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
        R1(3, sb);
        sb.append("}\n");
    }

    public static void Z1(JK1 jk1, String str, Long l) {
        List listQ = jk1.q();
        int i = 0;
        while (true) {
            if (i >= listQ.size()) {
                i = -1;
                break;
            } else if (str.equals(((NK1) listQ.get(i)).B())) {
                break;
            } else {
                i++;
            }
        }
        MK1 mk1A = NK1.A();
        mk1A.l(str);
        if (l instanceof Long) {
            mk1A.k(l.longValue());
        }
        if (i < 0) {
            jk1.k(mk1A);
        } else {
            jk1.i();
            KK1.s((KK1) jk1.b, i, (NK1) mk1A.e());
        }
    }

    public static boolean d2(OS1 os1, int i) {
        if (i < (os1.size() << 6)) {
            return ((1 << (i % 64)) & ((Long) os1.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable e2(String str, KK1 kk1) {
        NK1 nk1O1 = O1(str, kk1);
        if (nk1O1 == null) {
            return null;
        }
        if (nk1O1.I()) {
            return nk1O1.C();
        }
        if (nk1O1.G()) {
            return Long.valueOf(nk1O1.y());
        }
        if (nk1O1.E()) {
            return Double.valueOf(nk1O1.m());
        }
        if (nk1O1.w() > 0) {
            return h2((LS1) nk1O1.D());
        }
        return null;
    }

    public static boolean f2(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] h2(LS1 ls1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ls1.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            if (nk1 != null) {
                Bundle bundle = new Bundle();
                for (NK1 nk12 : nk1.D()) {
                    if (nk12.I()) {
                        bundle.putString(nk12.B(), nk12.C());
                    } else if (nk12.G()) {
                        bundle.putLong(nk12.B(), nk12.y());
                    } else if (nk12.E()) {
                        bundle.putDouble(nk12.B(), nk12.m());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        return false;
    }

    public final long D1(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        u1().v1();
        MessageDigest messageDigestI2 = C5910mZ1.I2();
        if (messageDigestI2 != null) {
            return C5910mZ1.D1(messageDigestI2.digest(bArr));
        }
        n().g.d("Failed to get MD5");
        return 0L;
    }

    public final Parcelable G1(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            n().g.d("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String H1(QK1 qk1) {
        String str;
        String str2;
        EK1 ek1G2;
        if (qk1 == null) {
            return "";
        }
        StringBuilder sbO = AbstractC8235ym.o("\nbatch {\n");
        if (qk1.A()) {
            U1(sbO, 0, "upload_subdomain", qk1.x());
        }
        if (qk1.z()) {
            U1(sbO, 0, "sgtm_join_id", qk1.w());
        }
        for (SK1 sk1 : qk1.y()) {
            if (sk1 != null) {
                R1(1, sbO);
                sbO.append("bundle {\n");
                if (sk1.B0()) {
                    U1(sbO, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(sk1.g1()));
                }
                TY1.b.get();
                C3386dP1 c3386dP1 = (C3386dP1) this.b;
                if (c3386dP1.g.E1(sk1.D(), IB1.H0) && sk1.E0()) {
                    U1(sbO, 1, "session_stitching_token", sk1.R());
                }
                U1(sbO, 1, "platform", sk1.P());
                if (sk1.w0()) {
                    U1(sbO, 1, "gmp_version", Long.valueOf(sk1.T1()));
                }
                if (sk1.R0()) {
                    U1(sbO, 1, "uploading_gmp_version", Long.valueOf(sk1.e2()));
                }
                if (sk1.u0()) {
                    U1(sbO, 1, "dynamite_version", Long.valueOf(sk1.M1()));
                }
                if (sk1.n0()) {
                    U1(sbO, 1, "config_version", Long.valueOf(sk1.E1()));
                }
                U1(sbO, 1, "gmp_app_id", sk1.m());
                U1(sbO, 1, "admob_app_id", sk1.C());
                U1(sbO, 1, "app_id", sk1.D());
                U1(sbO, 1, "app_version", sk1.G());
                if (sk1.j0()) {
                    U1(sbO, 1, "app_version_major", Integer.valueOf(sk1.b0()));
                }
                U1(sbO, 1, "firebase_instance_id", sk1.M());
                if (sk1.s0()) {
                    U1(sbO, 1, "dev_cert_hash", Long.valueOf(sk1.I1()));
                }
                U1(sbO, 1, "app_store", sk1.F());
                if (sk1.Q0()) {
                    U1(sbO, 1, "upload_timestamp_millis", Long.valueOf(sk1.d2()));
                }
                if (sk1.G0()) {
                    U1(sbO, 1, "start_timestamp_millis", Long.valueOf(sk1.Z1()));
                }
                if (sk1.v0()) {
                    U1(sbO, 1, "end_timestamp_millis", Long.valueOf(sk1.Q1()));
                }
                if (sk1.A0()) {
                    U1(sbO, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(sk1.X1()));
                }
                if (sk1.z0()) {
                    U1(sbO, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(sk1.V1()));
                }
                U1(sbO, 1, "app_instance_id", sk1.E());
                U1(sbO, 1, "resettable_device_id", sk1.Q());
                U1(sbO, 1, "ds_id", sk1.L());
                if (sk1.y0()) {
                    U1(sbO, 1, "limited_ad_tracking", Boolean.valueOf(sk1.Y()));
                }
                U1(sbO, 1, "os_version", sk1.O());
                U1(sbO, 1, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, sk1.K());
                U1(sbO, 1, "user_default_language", sk1.S());
                if (sk1.I0()) {
                    U1(sbO, 1, "time_zone_offset_minutes", Integer.valueOf(sk1.q1()));
                }
                if (sk1.m0()) {
                    U1(sbO, 1, "bundle_sequential_index", Integer.valueOf(sk1.J0()));
                }
                if (sk1.r0()) {
                    U1(sbO, 1, "delivery_index", Integer.valueOf(sk1.U0()));
                }
                if (sk1.D0()) {
                    U1(sbO, 1, "service_upload", Boolean.valueOf(sk1.Z()));
                }
                U1(sbO, 1, "health_monitor", sk1.N());
                if (sk1.C0()) {
                    U1(sbO, 1, "retry_counter", Integer.valueOf(sk1.l1()));
                }
                if (sk1.p0()) {
                    U1(sbO, 1, "consent_signals", sk1.I());
                }
                if (sk1.x0()) {
                    U1(sbO, 1, "is_dma_region", Boolean.valueOf(sk1.X()));
                }
                if (sk1.q0()) {
                    U1(sbO, 1, "core_platform_services", sk1.J());
                }
                if (sk1.o0()) {
                    U1(sbO, 1, "consent_diagnostics", sk1.H());
                }
                if (sk1.H0()) {
                    U1(sbO, 1, "target_os_version", Long.valueOf(sk1.b2()));
                }
                C7434uY1.a();
                if (c3386dP1.g.E1(sk1.D(), IB1.Q0)) {
                    U1(sbO, 1, "ad_services_version", Integer.valueOf(sk1.n()));
                    if (sk1.k0() && (ek1G2 = sk1.g2()) != null) {
                        R1(2, sbO);
                        sbO.append("attribution_eligibility_status {\n");
                        U1(sbO, 2, "eligible", Boolean.valueOf(ek1G2.w()));
                        U1(sbO, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(ek1G2.z()));
                        U1(sbO, 2, "pre_r", Boolean.valueOf(ek1G2.A()));
                        U1(sbO, 2, "r_extensions_too_old", Boolean.valueOf(ek1G2.B()));
                        U1(sbO, 2, "adservices_extension_too_old", Boolean.valueOf(ek1G2.u()));
                        U1(sbO, 2, "ad_storage_not_allowed", Boolean.valueOf(ek1G2.s()));
                        U1(sbO, 2, "measurement_manager_disabled", Boolean.valueOf(ek1G2.y()));
                        R1(2, sbO);
                        sbO.append("}\n");
                    }
                }
                if (sk1.a0()) {
                    BK1 bk1F2 = sk1.f2();
                    R1(2, sbO);
                    sbO.append("ad_campaign_info {\n");
                    if (bk1F2.M()) {
                        U1(sbO, 2, "deep_link_gclid", bk1F2.G());
                    }
                    if (bk1F2.L()) {
                        U1(sbO, 2, "deep_link_gbraid", bk1F2.F());
                    }
                    if (bk1F2.K()) {
                        U1(sbO, 2, "deep_link_gad_source", bk1F2.C());
                    }
                    if (bk1F2.N()) {
                        U1(sbO, 2, "deep_link_session_millis", Long.valueOf(bk1F2.m()));
                    }
                    if (bk1F2.R()) {
                        U1(sbO, 2, "market_referrer_gclid", bk1F2.J());
                    }
                    if (bk1F2.Q()) {
                        U1(sbO, 2, "market_referrer_gbraid", bk1F2.I());
                    }
                    if (bk1F2.P()) {
                        U1(sbO, 2, "market_referrer_gad_source", bk1F2.H());
                    }
                    if (bk1F2.O()) {
                        U1(sbO, 2, "market_referrer_click_millis", Long.valueOf(bk1F2.q()));
                    }
                    R1(2, sbO);
                    sbO.append("}\n");
                }
                if (sk1.l0()) {
                    U1(sbO, 1, "batching_timestamp_millis", Long.valueOf(sk1.A1()));
                }
                if (sk1.F0()) {
                    C2117aL1 c2117aL1I2 = sk1.i2();
                    R1(2, sbO);
                    sbO.append("sgtm_diagnostics {\n");
                    int iS = c2117aL1I2.s();
                    if (iS == 1) {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iS == 2) {
                        str = "GA_UPLOAD";
                    } else if (iS == 3) {
                        str = "SDK_CLIENT_UPLOAD";
                    } else if (iS == 4) {
                        str = "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        if (iS != 5) {
                            throw null;
                        }
                        str = "SDK_SERVICE_UPLOAD";
                    }
                    U1(sbO, 2, "upload_type", str);
                    U1(sbO, 2, "client_upload_eligibility", c2117aL1I2.q().name());
                    switch (c2117aL1I2.r()) {
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
                    U1(sbO, 2, "service_upload_eligibility", str2);
                    R1(2, sbO);
                    sbO.append("}\n");
                }
                LS1<C2498cL1> ls1V = sk1.V();
                EL1 el1 = c3386dP1.m;
                if (ls1V != null) {
                    for (C2498cL1 c2498cL1 : ls1V) {
                        if (c2498cL1 != null) {
                            R1(2, sbO);
                            sbO.append("user_property {\n");
                            U1(sbO, 2, "set_timestamp_millis", c2498cL1.E() ? Long.valueOf(c2498cL1.x()) : null);
                            U1(sbO, 2, "name", el1.g(c2498cL1.z()));
                            U1(sbO, 2, "string_value", c2498cL1.A());
                            U1(sbO, 2, "int_value", c2498cL1.D() ? Long.valueOf(c2498cL1.v()) : null);
                            U1(sbO, 2, "double_value", c2498cL1.B() ? Double.valueOf(c2498cL1.m()) : null);
                            R1(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                LS1<GK1> ls1T = sk1.T();
                if (ls1T != null) {
                    for (GK1 gk1 : ls1T) {
                        if (gk1 != null) {
                            R1(2, sbO);
                            sbO.append("audience_membership {\n");
                            if (gk1.v()) {
                                U1(sbO, 2, "audience_id", Integer.valueOf(gk1.m()));
                            }
                            if (gk1.w()) {
                                U1(sbO, 2, "new_audience", Boolean.valueOf(gk1.u()));
                            }
                            Y1(sbO, "current_data", gk1.s());
                            if (gk1.x()) {
                                Y1(sbO, "previous_data", gk1.t());
                            }
                            R1(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                LS1<KK1> ls1U = sk1.U();
                if (ls1U != null) {
                    for (KK1 kk1 : ls1U) {
                        if (kk1 != null) {
                            R1(2, sbO);
                            sbO.append("event {\n");
                            U1(sbO, 2, "name", el1.b(kk1.A()));
                            if (kk1.E()) {
                                U1(sbO, 2, "timestamp_millis", Long.valueOf(kk1.y()));
                            }
                            if (kk1.D()) {
                                U1(sbO, 2, "previous_timestamp_millis", Long.valueOf(kk1.x()));
                            }
                            if (kk1.C()) {
                                U1(sbO, 2, "count", Integer.valueOf(kk1.m()));
                            }
                            if (kk1.v() != 0) {
                                X1(sbO, 2, kk1.B());
                            }
                            R1(2, sbO);
                            sbO.append("}\n");
                        }
                    }
                }
                R1(1, sbO);
                sbO.append("}\n");
            }
        }
        sbO.append("} // End-of-batch\n");
        return sbO.toString();
    }

    public final List L1(OS1 os1, List list) {
        int i;
        ArrayList arrayList = new ArrayList(os1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                n().j.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    n().j.b(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
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

    public final KK1 N1(ZE ze) {
        JK1 jk1Z = KK1.z();
        jk1Z.i();
        KK1.p(ze.c, (KK1) jk1Z.b);
        C6029nB1 c6029nB1 = (C6029nB1) ze.g;
        c6029nB1.getClass();
        Bundle bundle = c6029nB1.a;
        for (String str : bundle.keySet()) {
            MK1 mk1A = NK1.A();
            mk1A.l(str);
            Object obj = bundle.get(str);
            Preconditions.checkNotNull(obj);
            a2(mk1A, obj);
            jk1Z.k(mk1A);
        }
        String str2 = (String) ze.f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            MK1 mk1A2 = NK1.A();
            mk1A2.l("_o");
            mk1A2.m(str2);
            jk1Z.l((NK1) mk1A2.e());
        }
        return (KK1) jk1Z.e();
    }

    public final C8382zX1 Q1(String str, RK1 rk1, JK1 jk1, String str2) {
        int iIndexOf;
        C7434uY1.a();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!c3386dP1.g.E1(str, IB1.Q0)) {
            return null;
        }
        long jCurrentTimeMillis = c3386dP1.n.currentTimeMillis();
        GJ1 gj1 = IB1.p0;
        C1263Py1 c1263Py1 = c3386dP1.g;
        String[] strArrSplit = c1263Py1.C1(str, gj1).split(StringUtils.COMMA);
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C3413dY1 c3413dY1 = this.c.j;
        String strQ1 = c3413dY1.y1().Q1(str);
        Uri.Builder builder = new Uri.Builder();
        C3386dP1 c3386dP12 = (C3386dP1) c3413dY1.b;
        builder.scheme(c3386dP12.g.C1(str, IB1.i0));
        boolean zIsEmpty = TextUtils.isEmpty(strQ1);
        C1263Py1 c1263Py12 = c3386dP12.g;
        if (zIsEmpty) {
            builder.authority(c1263Py12.C1(str, IB1.j0));
        } else {
            builder.authority(strQ1 + "." + c1263Py12.C1(str, IB1.j0));
        }
        builder.path(c1263Py12.C1(str, IB1.k0));
        S1(builder, "gmp_app_id", ((SK1) rk1.b).m(), setUnmodifiableSet);
        S1(builder, "gmp_version", "114010", setUnmodifiableSet);
        String strE = ((SK1) rk1.b).E();
        GJ1 gj12 = IB1.T0;
        if (c1263Py1.E1(str, gj12) && y1().R1(str)) {
            strE = "";
        }
        S1(builder, "app_instance_id", strE, setUnmodifiableSet);
        S1(builder, "rdid", ((SK1) rk1.b).Q(), setUnmodifiableSet);
        S1(builder, "bundle_id", rk1.Z(), setUnmodifiableSet);
        String strP = jk1.p();
        String strB = L22.b(strP, AbstractC6441pL1.c, AbstractC6441pL1.a);
        if (!TextUtils.isEmpty(strB)) {
            strP = strB;
        }
        S1(builder, "app_event_name", strP, setUnmodifiableSet);
        S1(builder, "app_version", String.valueOf(((SK1) rk1.b).b0()), setUnmodifiableSet);
        String strO = ((SK1) rk1.b).O();
        if (c1263Py1.E1(str, gj12) && y1().S1(str) && !TextUtils.isEmpty(strO) && (iIndexOf = strO.indexOf(".")) != -1) {
            strO = strO.substring(0, iIndexOf);
        }
        S1(builder, "os_version", strO, setUnmodifiableSet);
        S1(builder, "timestamp", String.valueOf(jk1.o()), setUnmodifiableSet);
        if (((SK1) rk1.b).Y()) {
            S1(builder, "lat", "1", setUnmodifiableSet);
        }
        S1(builder, "privacy_sandbox_version", String.valueOf(((SK1) rk1.b).n()), setUnmodifiableSet);
        S1(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        S1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        S1(builder, "request_uuid", str2, setUnmodifiableSet);
        List<NK1> listQ = jk1.q();
        Bundle bundle = new Bundle();
        for (NK1 nk1 : listQ) {
            String strB2 = nk1.B();
            if (nk1.E()) {
                bundle.putString(strB2, String.valueOf(nk1.m()));
            } else if (nk1.F()) {
                bundle.putString(strB2, String.valueOf(nk1.t()));
            } else if (nk1.I()) {
                bundle.putString(strB2, nk1.C());
            } else if (nk1.G()) {
                bundle.putString(strB2, String.valueOf(nk1.y()));
            }
        }
        T1(builder, c1263Py1.C1(str, IB1.o0).split("\\|"), bundle, setUnmodifiableSet);
        List<C2498cL1> listUnmodifiableList = Collections.unmodifiableList(((SK1) rk1.b).V());
        Bundle bundle2 = new Bundle();
        for (C2498cL1 c2498cL1 : listUnmodifiableList) {
            String strZ = c2498cL1.z();
            if (c2498cL1.B()) {
                bundle2.putString(strZ, String.valueOf(c2498cL1.m()));
            } else if (c2498cL1.C()) {
                bundle2.putString(strZ, String.valueOf(c2498cL1.r()));
            } else if (c2498cL1.F()) {
                bundle2.putString(strZ, c2498cL1.A());
            } else if (c2498cL1.D()) {
                bundle2.putString(strZ, String.valueOf(c2498cL1.v()));
            }
        }
        T1(builder, c1263Py1.C1(str, IB1.n0).split("\\|"), bundle2, setUnmodifiableSet);
        S1(builder, "dma", ((SK1) rk1.b).X() ? "1" : "0", setUnmodifiableSet);
        if (!((SK1) rk1.b).J().isEmpty()) {
            S1(builder, "dma_cps", ((SK1) rk1.b).J(), setUnmodifiableSet);
        }
        if (c1263Py1.E1(null, IB1.V0) && ((SK1) rk1.b).a0()) {
            BK1 bk1F2 = ((SK1) rk1.b).f2();
            if (!bk1F2.G().isEmpty()) {
                S1(builder, "dl_gclid", bk1F2.G(), setUnmodifiableSet);
            }
            if (!bk1F2.F().isEmpty()) {
                S1(builder, "dl_gbraid", bk1F2.F(), setUnmodifiableSet);
            }
            if (!bk1F2.C().isEmpty()) {
                S1(builder, "dl_gs", bk1F2.C(), setUnmodifiableSet);
            }
            if (bk1F2.m() > 0) {
                S1(builder, "dl_ss_ts", String.valueOf(bk1F2.m()), setUnmodifiableSet);
            }
            if (!bk1F2.J().isEmpty()) {
                S1(builder, "mr_gclid", bk1F2.J(), setUnmodifiableSet);
            }
            if (!bk1F2.I().isEmpty()) {
                S1(builder, "mr_gbraid", bk1F2.I(), setUnmodifiableSet);
            }
            if (!bk1F2.H().isEmpty()) {
                S1(builder, "mr_gs", bk1F2.H(), setUnmodifiableSet);
            }
            if (bk1F2.q() > 0) {
                S1(builder, "mr_click_ts", String.valueOf(bk1F2.q()), setUnmodifiableSet);
            }
        }
        return new C8382zX1(1, builder.build().toString(), jCurrentTimeMillis);
    }

    public final void W1(StringBuilder sb, int i, C7198tJ1 c7198tJ1) {
        String str;
        if (c7198tJ1 == null) {
            return;
        }
        R1(i, sb);
        sb.append("filter {\n");
        if (c7198tJ1.s()) {
            U1(sb, i, "complement", Boolean.valueOf(c7198tJ1.r()));
        }
        if (c7198tJ1.u()) {
            U1(sb, i, "param_name", ((C3386dP1) this.b).m.f(c7198tJ1.q()));
        }
        if (c7198tJ1.v()) {
            int i2 = i + 1;
            C8150yJ1 c8150yJ1P = c7198tJ1.p();
            if (c8150yJ1P != null) {
                R1(i2, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c8150yJ1P.u()) {
                    switch (c8150yJ1P.n()) {
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
                    U1(sb, i2, "match_type", str);
                }
                if (c8150yJ1P.t()) {
                    U1(sb, i2, "expression", c8150yJ1P.p());
                }
                if (c8150yJ1P.s()) {
                    U1(sb, i2, "case_sensitive", Boolean.valueOf(c8150yJ1P.r()));
                }
                if (c8150yJ1P.m() > 0) {
                    R1(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c8150yJ1P.q()) {
                        R1(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                R1(i2, sb);
                sb.append("}\n");
            }
        }
        if (c7198tJ1.t()) {
            V1(sb, i + 1, "number_filter", c7198tJ1.o());
        }
        R1(i, sb);
        sb.append("}\n");
    }

    public final void X1(StringBuilder sb, int i, LS1 ls1) {
        if (ls1 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = ls1.iterator();
        while (it.hasNext()) {
            NK1 nk1 = (NK1) it.next();
            if (nk1 != null) {
                R1(i2, sb);
                sb.append("param {\n");
                U1(sb, i2, "name", nk1.H() ? ((C3386dP1) this.b).m.f(nk1.B()) : null);
                U1(sb, i2, "string_value", nk1.I() ? nk1.C() : null);
                U1(sb, i2, "int_value", nk1.G() ? Long.valueOf(nk1.y()) : null);
                U1(sb, i2, "double_value", nk1.E() ? Double.valueOf(nk1.m()) : null);
                if (nk1.w() > 0) {
                    X1(sb, i2, (LS1) nk1.D());
                }
                R1(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void a2(MK1 mk1, Object obj) {
        Preconditions.checkNotNull(obj);
        mk1.i();
        NK1.z((NK1) mk1.b);
        mk1.i();
        NK1.u((NK1) mk1.b);
        mk1.i();
        NK1.s((NK1) mk1.b);
        mk1.i();
        NK1.x((NK1) mk1.b);
        if (obj instanceof String) {
            mk1.m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            mk1.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            mk1.i();
            NK1.n((NK1) mk1.b, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            n().g.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                MK1 mk1A = NK1.A();
                for (String str : bundle.keySet()) {
                    MK1 mk1A2 = NK1.A();
                    mk1A2.l(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        mk1A2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        mk1A2.m((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        mk1A2.i();
                        NK1.n((NK1) mk1A2.b, dDoubleValue2);
                    }
                    mk1A.i();
                    NK1.r((NK1) mk1A.b, (NK1) mk1A2.e());
                }
                if (((NK1) mk1A.b).w() > 0) {
                    arrayList.add((NK1) mk1A.e());
                }
            }
        }
        mk1.i();
        NK1.q((NK1) mk1.b, arrayList);
    }

    public final void b2(C2308bL1 c2308bL1, Object obj) {
        Preconditions.checkNotNull(obj);
        c2308bL1.i();
        C2498cL1.w((C2498cL1) c2308bL1.b);
        c2308bL1.i();
        C2498cL1.s((C2498cL1) c2308bL1.b);
        c2308bL1.i();
        C2498cL1.q((C2498cL1) c2308bL1.b);
        if (obj instanceof String) {
            c2308bL1.i();
            C2498cL1.u((C2498cL1) c2308bL1.b, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c2308bL1.i();
            C2498cL1.o((C2498cL1) c2308bL1.b, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                n().g.c(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            c2308bL1.i();
            C2498cL1.n((C2498cL1) c2308bL1.b, dDoubleValue);
        }
    }

    public final boolean c2(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(((C3386dP1) this.b).n.currentTimeMillis() - j) > j2;
    }

    public final byte[] g2(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            n().g.c(e, "Failed to gzip content");
            throw e;
        }
    }

    public final byte[] i2(byte[] bArr) throws IOException {
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
            n().g.c(e, "Failed to ungzip content");
            throw e;
        }
    }

    public final ArrayList j2() throws NumberFormatException {
        Context context = this.c.l.a;
        List list = IB1.a;
        C8162yN1 c8162yN1C = C8162yN1.c(context.getContentResolver(), AbstractC7022sO1.a("com.google.android.gms.measurement"), new DL0(2));
        Map mapEmptyMap = c8162yN1C == null ? Collections.emptyMap() : c8162yN1C.a();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) IB1.a0.a(null)).intValue();
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt((String) entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            n().j.c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    n().j.c(e, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
