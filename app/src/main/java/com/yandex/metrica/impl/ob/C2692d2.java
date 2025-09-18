package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Vf;
import com.yandex.metrica.impl.ob.Wc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.d2 */
/* loaded from: classes2.dex */
public final class C2692d2 {
    private static Map<EnumC3249z6, Integer> a;
    private static SparseArray<EnumC3249z6> b;
    private static final Map<EnumC2865k1, Integer> c;
    private static final Map<EnumC2865k1, Ye> d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: com.yandex.metrica.impl.ob.d2$a */
    public class a implements InterfaceC2929mf {
        @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
        public byte[] a(Xe xe, C2856jh c2856jh) {
            if (!TextUtils.isEmpty(xe.b)) {
                try {
                    Fg fgA = Fg.a(Base64.decode(xe.b, 0));
                    Xf xf = new Xf();
                    String str = fgA.a;
                    xf.b = str == null ? new byte[0] : str.getBytes();
                    xf.d = fgA.b;
                    xf.c = fgA.c;
                    int iOrdinal = fgA.d.ordinal();
                    int i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 0;
                        }
                    }
                    xf.e = i;
                    return AbstractC2714e.a(xf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d2$b */
    public class b implements Ze {
        @Override // com.yandex.metrica.impl.ob.Ze
        public Integer a(Xe xe) {
            return xe.k;
        }
    }

    static {
        HashMap map = new HashMap();
        EnumC3249z6 enumC3249z6 = EnumC3249z6.FOREGROUND;
        map.put(enumC3249z6, 0);
        EnumC3249z6 enumC3249z62 = EnumC3249z6.BACKGROUND;
        map.put(enumC3249z62, 1);
        a = Collections.unmodifiableMap(map);
        SparseArray<EnumC3249z6> sparseArray = new SparseArray<>();
        sparseArray.put(0, enumC3249z6);
        sparseArray.put(1, enumC3249z62);
        b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_INIT;
        map2.put(enumC2865k1, 1);
        EnumC2865k1 enumC2865k12 = EnumC2865k1.EVENT_TYPE_REGULAR;
        map2.put(enumC2865k12, 4);
        EnumC2865k1 enumC2865k13 = EnumC2865k1.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC2865k13, 5);
        EnumC2865k1 enumC2865k14 = EnumC2865k1.EVENT_TYPE_ALIVE;
        map2.put(enumC2865k14, 7);
        EnumC2865k1 enumC2865k15 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        map2.put(enumC2865k15, 3);
        EnumC2865k1 enumC2865k16 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC2865k16, 26);
        EnumC2865k1 enumC2865k17 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC2865k17, 26);
        EnumC2865k1 enumC2865k18 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC2865k18, 26);
        EnumC2865k1 enumC2865k19 = EnumC2865k1.EVENT_TYPE_ANR;
        map2.put(enumC2865k19, 25);
        EnumC2865k1 enumC2865k110 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        map2.put(enumC2865k110, 3);
        EnumC2865k1 enumC2865k111 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC2865k111, 26);
        EnumC2865k1 enumC2865k112 = EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        map2.put(enumC2865k112, 3);
        EnumC2865k1 enumC2865k113 = EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC2865k113, 26);
        EnumC2865k1 enumC2865k114 = EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        map2.put(enumC2865k114, 26);
        EnumC2865k1 enumC2865k115 = EnumC2865k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC2865k115, 26);
        EnumC2865k1 enumC2865k116 = EnumC2865k1.EVENT_TYPE_EXCEPTION_USER;
        map2.put(enumC2865k116, 6);
        EnumC2865k1 enumC2865k117 = EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC2865k117, 27);
        EnumC2865k1 enumC2865k118 = EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC2865k118, 27);
        EnumC2865k1 enumC2865k119 = EnumC2865k1.EVENT_TYPE_IDENTITY;
        map2.put(enumC2865k119, 8);
        map2.put(EnumC2865k1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        EnumC2865k1 enumC2865k120 = EnumC2865k1.EVENT_TYPE_STATBOX;
        map2.put(enumC2865k120, 11);
        EnumC2865k1 enumC2865k121 = EnumC2865k1.EVENT_TYPE_SET_USER_INFO;
        map2.put(enumC2865k121, 12);
        EnumC2865k1 enumC2865k122 = EnumC2865k1.EVENT_TYPE_REPORT_USER_INFO;
        map2.put(enumC2865k122, 12);
        EnumC2865k1 enumC2865k123 = EnumC2865k1.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC2865k123, 13);
        EnumC2865k1 enumC2865k124 = EnumC2865k1.EVENT_TYPE_START;
        map2.put(enumC2865k124, 2);
        EnumC2865k1 enumC2865k125 = EnumC2865k1.EVENT_TYPE_APP_OPEN;
        map2.put(enumC2865k125, 16);
        EnumC2865k1 enumC2865k126 = EnumC2865k1.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC2865k126, 17);
        EnumC2865k1 enumC2865k127 = EnumC2865k1.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC2865k127, 18);
        EnumC2865k1 enumC2865k128 = EnumC2865k1.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC2865k128, 19);
        EnumC2865k1 enumC2865k129 = EnumC2865k1.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC2865k129, 20);
        EnumC2865k1 enumC2865k130 = EnumC2865k1.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC2865k130, 21);
        EnumC2865k1 enumC2865k131 = EnumC2865k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC2865k131, 40);
        EnumC2865k1 enumC2865k132 = EnumC2865k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC2865k132, 35);
        map2.put(EnumC2865k1.EVENT_TYPE_CLEANUP, 29);
        EnumC2865k1 enumC2865k133 = EnumC2865k1.EVENT_TYPE_VIEW_TREE;
        map2.put(enumC2865k133, 30);
        EnumC2865k1 enumC2865k134 = EnumC2865k1.EVENT_TYPE_RAW_VIEW_TREE;
        map2.put(enumC2865k134, 34);
        EnumC2865k1 enumC2865k135 = EnumC2865k1.EVENT_TYPE_STATBOX_EXP;
        map2.put(enumC2865k135, 36);
        EnumC2865k1 enumC2865k136 = EnumC2865k1.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC2865k136, 38);
        c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        Te te = new Te();
        We we = new We();
        Ue ue = new Ue();
        Qe qe = new Qe();
        C2904lf c2904lf = new C2904lf();
        C2805hf c2805hf = new C2805hf();
        Ye yeA = Ye.a().a((InterfaceC2929mf) c2805hf).a((Ve) c2805hf).a();
        Ye yeA2 = Ye.a().a(we).a();
        Ye yeA3 = Ye.a().a(qe).a();
        Ye yeA4 = Ye.a().a(c2904lf).a();
        Ye yeA5 = Ye.a().a(te).a();
        Ye yeA6 = Ye.a().a(new C2954nf()).a();
        map3.put(enumC2865k12, yeA2);
        map3.put(enumC2865k13, Ye.a().a(new a()).a());
        map3.put(enumC2865k14, Ye.a().a(te).a(ue).a(new Re()).a(new Se()).a());
        map3.put(enumC2865k110, yeA);
        map3.put(enumC2865k112, yeA);
        map3.put(enumC2865k111, yeA);
        map3.put(enumC2865k113, yeA);
        map3.put(enumC2865k114, yeA);
        map3.put(enumC2865k115, yeA);
        map3.put(enumC2865k116, yeA2);
        map3.put(enumC2865k117, yeA3);
        map3.put(enumC2865k118, yeA3);
        map3.put(enumC2865k119, Ye.a().a(we).a(new C2680cf()).a());
        map3.put(enumC2865k120, yeA2);
        map3.put(enumC2865k121, yeA2);
        map3.put(enumC2865k122, yeA2);
        map3.put(enumC2865k15, yeA2);
        map3.put(enumC2865k16, yeA3);
        map3.put(enumC2865k17, yeA3);
        map3.put(enumC2865k18, yeA3);
        map3.put(enumC2865k19, yeA3);
        map3.put(enumC2865k124, Ye.a().a(new Te()).a(qe).a());
        map3.put(EnumC2865k1.EVENT_TYPE_CUSTOM_EVENT, Ye.a().a(new b()).a());
        map3.put(enumC2865k125, yeA2);
        map3.put(enumC2865k127, yeA5);
        map3.put(enumC2865k128, yeA5);
        map3.put(enumC2865k129, yeA3);
        map3.put(enumC2865k130, yeA3);
        map3.put(enumC2865k131, yeA3);
        map3.put(enumC2865k132, yeA4);
        map3.put(enumC2865k133, yeA2);
        map3.put(enumC2865k134, yeA2);
        map3.put(enumC2865k1, yeA6);
        map3.put(enumC2865k126, yeA6);
        map3.put(enumC2865k123, yeA2);
        map3.put(enumC2865k135, yeA2);
        map3.put(enumC2865k136, yeA2);
        d = Collections.unmodifiableMap(map3);
    }

    public static Vf.f a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        Vf.f fVar = new Vf.f();
        if (asLong != null) {
            fVar.b = asLong.longValue();
            fVar.c = C2814i.a(asLong.longValue());
        }
        if (asLong2 != null) {
            fVar.d = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.e = asBoolean.booleanValue();
        }
        return fVar;
    }

    public static Tf[] b(JSONArray jSONArray) {
        try {
            Tf[] tfArr = new Tf[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        tfArr[i] = b(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                    return tfArr;
                }
            }
            return tfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Tf b(JSONObject jSONObject) {
        Tf tf = new Tf();
        int iOptInt = jSONObject.optInt("signal_strength", tf.c);
        if (iOptInt != -1) {
            tf.c = iOptInt;
        }
        tf.b = jSONObject.optInt("cell_id", tf.b);
        tf.d = jSONObject.optInt("lac", tf.d);
        tf.e = jSONObject.optInt("country_code", tf.e);
        tf.f = jSONObject.optInt("operator_id", tf.f);
        tf.g = jSONObject.optString("operator_name", tf.g);
        tf.h = jSONObject.optBoolean("is_connected", tf.h);
        tf.i = jSONObject.optInt("cell_type", 0);
        tf.j = jSONObject.optInt("pci", tf.j);
        tf.k = jSONObject.optLong("last_visible_time_offset", tf.k);
        tf.l = jSONObject.optInt("lte_rsrq", tf.l);
        tf.m = jSONObject.optInt("lte_rssnr", tf.m);
        tf.o = jSONObject.optInt("arfcn", tf.o);
        tf.n = jSONObject.optInt("lte_rssi", tf.n);
        tf.p = jSONObject.optInt("lte_bandwidth", tf.p);
        tf.q = jSONObject.optInt("lte_cqi", tf.q);
        return tf;
    }

    public static EnumC3249z6 a(int i) {
        EnumC3249z6 enumC3249z6 = b.get(i);
        return enumC3249z6 == null ? EnumC3249z6.FOREGROUND : enumC3249z6;
    }

    public static Wf[] a(JSONArray jSONArray) {
        try {
            Wf[] wfArr = new Wf[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    wfArr[i] = a(jSONArray.getJSONObject(i));
                } catch (Throwable unused) {
                    return wfArr;
                }
            }
            return wfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Wf a(JSONObject jSONObject) {
        try {
            Wf wf = new Wf();
            wf.b = jSONObject.getString("mac");
            wf.c = jSONObject.getInt("signal_strength");
            wf.d = jSONObject.getString("ssid");
            wf.e = jSONObject.optBoolean("is_connected");
            wf.f = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return wf;
        } catch (Throwable unused) {
            Wf wf2 = new Wf();
            wf2.b = jSONObject.optString("mac");
            return wf2;
        }
    }

    public static int a(EnumC3249z6 enumC3249z6) {
        Integer num = a.get(enumC3249z6);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Integer b(EnumC2865k1 enumC2865k1) {
        if (enumC2865k1 == null) {
            return null;
        }
        return c.get(enumC2865k1);
    }

    public static Ye a(EnumC2865k1 enumC2865k1) {
        Ye ye = enumC2865k1 != null ? d.get(enumC2865k1) : null;
        return ye == null ? Ye.b() : ye;
    }

    public static int a(M.b.a aVar) {
        int iOrdinal = aVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static int a(Wc.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
