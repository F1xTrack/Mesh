package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import com.yandex.metrica.impl.p022ob.C3028Wc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.d2 */
/* loaded from: classes2.dex */
public final class C3196d2 {

    /* renamed from: a */
    private static Map<EnumC3772z6, Integer> f23202a;

    /* renamed from: b */
    private static SparseArray<EnumC3772z6> f23203b;

    /* renamed from: c */
    private static final Map<EnumC3377k1, Integer> f23204c;

    /* renamed from: d */
    private static final Map<EnumC3377k1, C3080Ye> f23205d;

    /* renamed from: e */
    public static final /* synthetic */ int f23206e = 0;

    /* renamed from: com.yandex.metrica.impl.ob.d2$a */
    public class a implements InterfaceC3443mf {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3443mf
        /* renamed from: a */
        public byte[] mo14848a(C3055Xe c3055Xe, C3367jh c3367jh) {
            if (!TextUtils.isEmpty(c3055Xe.f22787b)) {
                try {
                    C2608Fg c2608FgM14133a = C2608Fg.m14133a(Base64.decode(c3055Xe.f22787b, 0));
                    C3056Xf c3056Xf = new C3056Xf();
                    String str = c2608FgM14133a.f21216a;
                    c3056Xf.f22812b = str == null ? new byte[0] : str.getBytes();
                    c3056Xf.f22814d = c2608FgM14133a.f21217b;
                    c3056Xf.f22813c = c2608FgM14133a.f21218c;
                    int iOrdinal = c2608FgM14133a.f21219d.ordinal();
                    int i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 0;
                        }
                    }
                    c3056Xf.f22815e = i;
                    return AbstractC3219e.m15809a(c3056Xf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d2$b */
    public class b implements InterfaceC3105Ze {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3105Ze
        /* renamed from: a */
        public Integer mo15542a(C3055Xe c3055Xe) {
            return c3055Xe.f22796k;
        }
    }

    static {
        HashMap map = new HashMap();
        EnumC3772z6 enumC3772z6 = EnumC3772z6.FOREGROUND;
        map.put(enumC3772z6, 0);
        EnumC3772z6 enumC3772z62 = EnumC3772z6.BACKGROUND;
        map.put(enumC3772z62, 1);
        f23202a = Collections.unmodifiableMap(map);
        SparseArray<EnumC3772z6> sparseArray = new SparseArray<>();
        sparseArray.put(0, enumC3772z6);
        sparseArray.put(1, enumC3772z62);
        f23203b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_INIT;
        map2.put(enumC3377k1, 1);
        EnumC3377k1 enumC3377k12 = EnumC3377k1.EVENT_TYPE_REGULAR;
        map2.put(enumC3377k12, 4);
        EnumC3377k1 enumC3377k13 = EnumC3377k1.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC3377k13, 5);
        EnumC3377k1 enumC3377k14 = EnumC3377k1.EVENT_TYPE_ALIVE;
        map2.put(enumC3377k14, 7);
        EnumC3377k1 enumC3377k15 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        map2.put(enumC3377k15, 3);
        EnumC3377k1 enumC3377k16 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC3377k16, 26);
        EnumC3377k1 enumC3377k17 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC3377k17, 26);
        EnumC3377k1 enumC3377k18 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC3377k18, 26);
        EnumC3377k1 enumC3377k19 = EnumC3377k1.EVENT_TYPE_ANR;
        map2.put(enumC3377k19, 25);
        EnumC3377k1 enumC3377k110 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        map2.put(enumC3377k110, 3);
        EnumC3377k1 enumC3377k111 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC3377k111, 26);
        EnumC3377k1 enumC3377k112 = EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        map2.put(enumC3377k112, 3);
        EnumC3377k1 enumC3377k113 = EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC3377k113, 26);
        EnumC3377k1 enumC3377k114 = EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        map2.put(enumC3377k114, 26);
        EnumC3377k1 enumC3377k115 = EnumC3377k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC3377k115, 26);
        EnumC3377k1 enumC3377k116 = EnumC3377k1.EVENT_TYPE_EXCEPTION_USER;
        map2.put(enumC3377k116, 6);
        EnumC3377k1 enumC3377k117 = EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC3377k117, 27);
        EnumC3377k1 enumC3377k118 = EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC3377k118, 27);
        EnumC3377k1 enumC3377k119 = EnumC3377k1.EVENT_TYPE_IDENTITY;
        map2.put(enumC3377k119, 8);
        map2.put(EnumC3377k1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        EnumC3377k1 enumC3377k120 = EnumC3377k1.EVENT_TYPE_STATBOX;
        map2.put(enumC3377k120, 11);
        EnumC3377k1 enumC3377k121 = EnumC3377k1.EVENT_TYPE_SET_USER_INFO;
        map2.put(enumC3377k121, 12);
        EnumC3377k1 enumC3377k122 = EnumC3377k1.EVENT_TYPE_REPORT_USER_INFO;
        map2.put(enumC3377k122, 12);
        EnumC3377k1 enumC3377k123 = EnumC3377k1.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC3377k123, 13);
        EnumC3377k1 enumC3377k124 = EnumC3377k1.EVENT_TYPE_START;
        map2.put(enumC3377k124, 2);
        EnumC3377k1 enumC3377k125 = EnumC3377k1.EVENT_TYPE_APP_OPEN;
        map2.put(enumC3377k125, 16);
        EnumC3377k1 enumC3377k126 = EnumC3377k1.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC3377k126, 17);
        EnumC3377k1 enumC3377k127 = EnumC3377k1.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC3377k127, 18);
        EnumC3377k1 enumC3377k128 = EnumC3377k1.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC3377k128, 19);
        EnumC3377k1 enumC3377k129 = EnumC3377k1.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC3377k129, 20);
        EnumC3377k1 enumC3377k130 = EnumC3377k1.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC3377k130, 21);
        EnumC3377k1 enumC3377k131 = EnumC3377k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC3377k131, 40);
        EnumC3377k1 enumC3377k132 = EnumC3377k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC3377k132, 35);
        map2.put(EnumC3377k1.EVENT_TYPE_CLEANUP, 29);
        EnumC3377k1 enumC3377k133 = EnumC3377k1.EVENT_TYPE_VIEW_TREE;
        map2.put(enumC3377k133, 30);
        EnumC3377k1 enumC3377k134 = EnumC3377k1.EVENT_TYPE_RAW_VIEW_TREE;
        map2.put(enumC3377k134, 34);
        EnumC3377k1 enumC3377k135 = EnumC3377k1.EVENT_TYPE_STATBOX_EXP;
        map2.put(enumC3377k135, 36);
        EnumC3377k1 enumC3377k136 = EnumC3377k1.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC3377k136, 38);
        f23204c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C2955Te c2955Te = new C2955Te();
        C3030We c3030We = new C3030We();
        C2980Ue c2980Ue = new C2980Ue();
        C2881Qe c2881Qe = new C2881Qe();
        C3417lf c3417lf = new C3417lf();
        C3313hf c3313hf = new C3313hf();
        C3080Ye c3080YeM15507a = C3080Ye.m15486a().m15506a((InterfaceC3443mf) c3313hf).m15501a((InterfaceC3005Ve) c3313hf).m15507a();
        C3080Ye c3080YeM15507a2 = C3080Ye.m15486a().m15506a(c3030We).m15507a();
        C3080Ye c3080YeM15507a3 = C3080Ye.m15486a().m15506a(c2881Qe).m15507a();
        C3080Ye c3080YeM15507a4 = C3080Ye.m15486a().m15506a(c3417lf).m15507a();
        C3080Ye c3080YeM15507a5 = C3080Ye.m15486a().m15504a(c2955Te).m15507a();
        C3080Ye c3080YeM15507a6 = C3080Ye.m15486a().m15506a(new C3469nf()).m15507a();
        map3.put(enumC3377k12, c3080YeM15507a2);
        map3.put(enumC3377k13, C3080Ye.m15486a().m15506a(new a()).m15507a());
        map3.put(enumC3377k14, C3080Ye.m15486a().m15504a(c2955Te).m15506a(c2980Ue).m15503a(new C2905Re()).m15505a(new C2930Se()).m15507a());
        map3.put(enumC3377k110, c3080YeM15507a);
        map3.put(enumC3377k112, c3080YeM15507a);
        map3.put(enumC3377k111, c3080YeM15507a);
        map3.put(enumC3377k113, c3080YeM15507a);
        map3.put(enumC3377k114, c3080YeM15507a);
        map3.put(enumC3377k115, c3080YeM15507a);
        map3.put(enumC3377k116, c3080YeM15507a2);
        map3.put(enumC3377k117, c3080YeM15507a3);
        map3.put(enumC3377k118, c3080YeM15507a3);
        map3.put(enumC3377k119, C3080Ye.m15486a().m15506a(c3030We).m15501a(new C3183cf()).m15507a());
        map3.put(enumC3377k120, c3080YeM15507a2);
        map3.put(enumC3377k121, c3080YeM15507a2);
        map3.put(enumC3377k122, c3080YeM15507a2);
        map3.put(enumC3377k15, c3080YeM15507a2);
        map3.put(enumC3377k16, c3080YeM15507a3);
        map3.put(enumC3377k17, c3080YeM15507a3);
        map3.put(enumC3377k18, c3080YeM15507a3);
        map3.put(enumC3377k19, c3080YeM15507a3);
        map3.put(enumC3377k124, C3080Ye.m15486a().m15504a(new C2955Te()).m15506a(c2881Qe).m15507a());
        map3.put(EnumC3377k1.EVENT_TYPE_CUSTOM_EVENT, C3080Ye.m15486a().m15502a(new b()).m15507a());
        map3.put(enumC3377k125, c3080YeM15507a2);
        map3.put(enumC3377k127, c3080YeM15507a5);
        map3.put(enumC3377k128, c3080YeM15507a5);
        map3.put(enumC3377k129, c3080YeM15507a3);
        map3.put(enumC3377k130, c3080YeM15507a3);
        map3.put(enumC3377k131, c3080YeM15507a3);
        map3.put(enumC3377k132, c3080YeM15507a4);
        map3.put(enumC3377k133, c3080YeM15507a2);
        map3.put(enumC3377k134, c3080YeM15507a2);
        map3.put(enumC3377k1, c3080YeM15507a6);
        map3.put(enumC3377k126, c3080YeM15507a6);
        map3.put(enumC3377k123, c3080YeM15507a2);
        map3.put(enumC3377k135, c3080YeM15507a2);
        map3.put(enumC3377k136, c3080YeM15507a2);
        f23205d = Collections.unmodifiableMap(map3);
    }

    /* renamed from: a */
    public static C3006Vf.f m15726a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C3006Vf.f fVar = new C3006Vf.f();
        if (asLong != null) {
            fVar.f22613b = asLong.longValue();
            fVar.f22614c = C3323i.m16058a(asLong.longValue());
        }
        if (asLong2 != null) {
            fVar.f22615d = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f22616e = asBoolean.booleanValue();
        }
        return fVar;
    }

    /* renamed from: b */
    public static C2956Tf[] m15733b(JSONArray jSONArray) {
        try {
            C2956Tf[] c2956TfArr = new C2956Tf[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        c2956TfArr[i] = m15731b(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                    return c2956TfArr;
                }
            }
            return c2956TfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static C2956Tf m15731b(JSONObject jSONObject) {
        C2956Tf c2956Tf = new C2956Tf();
        int iOptInt = jSONObject.optInt("signal_strength", c2956Tf.f22389c);
        if (iOptInt != -1) {
            c2956Tf.f22389c = iOptInt;
        }
        c2956Tf.f22388b = jSONObject.optInt("cell_id", c2956Tf.f22388b);
        c2956Tf.f22390d = jSONObject.optInt("lac", c2956Tf.f22390d);
        c2956Tf.f22391e = jSONObject.optInt("country_code", c2956Tf.f22391e);
        c2956Tf.f22392f = jSONObject.optInt("operator_id", c2956Tf.f22392f);
        c2956Tf.f22393g = jSONObject.optString("operator_name", c2956Tf.f22393g);
        c2956Tf.f22394h = jSONObject.optBoolean("is_connected", c2956Tf.f22394h);
        c2956Tf.f22395i = jSONObject.optInt("cell_type", 0);
        c2956Tf.f22396j = jSONObject.optInt("pci", c2956Tf.f22396j);
        c2956Tf.f22397k = jSONObject.optLong("last_visible_time_offset", c2956Tf.f22397k);
        c2956Tf.f22398l = jSONObject.optInt("lte_rsrq", c2956Tf.f22398l);
        c2956Tf.f22399m = jSONObject.optInt("lte_rssnr", c2956Tf.f22399m);
        c2956Tf.f22401o = jSONObject.optInt("arfcn", c2956Tf.f22401o);
        c2956Tf.f22400n = jSONObject.optInt("lte_rssi", c2956Tf.f22400n);
        c2956Tf.f22402p = jSONObject.optInt("lte_bandwidth", c2956Tf.f22402p);
        c2956Tf.f22403q = jSONObject.optInt("lte_cqi", c2956Tf.f22403q);
        return c2956Tf;
    }

    /* renamed from: a */
    public static EnumC3772z6 m15729a(int i) {
        EnumC3772z6 enumC3772z6 = f23203b.get(i);
        return enumC3772z6 == null ? EnumC3772z6.FOREGROUND : enumC3772z6;
    }

    /* renamed from: a */
    public static C3031Wf[] m15730a(JSONArray jSONArray) {
        try {
            C3031Wf[] c3031WfArr = new C3031Wf[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    c3031WfArr[i] = m15727a(jSONArray.getJSONObject(i));
                } catch (Throwable unused) {
                    return c3031WfArr;
                }
            }
            return c3031WfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static C3031Wf m15727a(JSONObject jSONObject) {
        try {
            C3031Wf c3031Wf = new C3031Wf();
            c3031Wf.f22693b = jSONObject.getString("mac");
            c3031Wf.f22694c = jSONObject.getInt("signal_strength");
            c3031Wf.f22695d = jSONObject.getString("ssid");
            c3031Wf.f22696e = jSONObject.optBoolean("is_connected");
            c3031Wf.f22697f = jSONObject.optLong("last_visible_offset_seconds", 0L);
            return c3031Wf;
        } catch (Throwable unused) {
            C3031Wf c3031Wf2 = new C3031Wf();
            c3031Wf2.f22693b = jSONObject.optString("mac");
            return c3031Wf2;
        }
    }

    /* renamed from: a */
    public static int m15725a(EnumC3772z6 enumC3772z6) {
        Integer num = f23202a.get(enumC3772z6);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public static Integer m15732b(EnumC3377k1 enumC3377k1) {
        if (enumC3377k1 == null) {
            return null;
        }
        return f23204c.get(enumC3377k1);
    }

    /* renamed from: a */
    public static C3080Ye m15728a(EnumC3377k1 enumC3377k1) {
        C3080Ye c3080Ye = enumC3377k1 != null ? f23205d.get(enumC3377k1) : null;
        return c3080Ye == null ? C3080Ye.m15488b() : c3080Ye;
    }

    /* renamed from: a */
    public static int m15723a(C2766M.b.a aVar) {
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

    /* renamed from: a */
    public static int m15724a(C3028Wc.a aVar) {
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
