package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.l0 */
/* loaded from: classes.dex */
public class C2162l0 {

    /* renamed from: a */
    private String f19238a;

    /* renamed from: b */
    private String f19239b;

    /* renamed from: c */
    private String f19240c;

    /* renamed from: d */
    private List<C2133b1> f19241d;

    /* renamed from: e */
    private String f19242e;

    public C2162l0(String str, String str2, String str3, List<C2133b1> list, String str4) {
        this.f19238a = str;
        this.f19239b = str2;
        this.f19240c = str3;
        this.f19241d = list;
        this.f19242e = str4;
    }

    /* renamed from: a */
    private String m12099a(String str, String str2) {
        String str3;
        String strM11910f = AbstractC2130a1.m11910f(str, str2);
        if (TextUtils.isEmpty(strM11910f)) {
            C2186v.m12266a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", strM11910f);
    }

    /* renamed from: b */
    private void m12101b() {
        if (C2135c0.m11945a(AbstractC2177q0.m12197i(), "backup_event", 5242880)) {
            C2186v.m12273d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray jSONArrayM12102c = m12102c();
        String strM12140a = AbstractC2169n1.m12140a(this.f19238a, this.f19239b, this.f19242e);
        C2186v.m12271c("hmsSdk", "Update data cached into backup,spKey: " + strM12140a);
        C2137d.m11960b(AbstractC2177q0.m12197i(), "backup_event", strM12140a, jSONArrayM12102c.toString());
    }

    /* renamed from: c */
    private JSONArray m12102c() {
        JSONArray jSONArray = new JSONArray();
        Iterator<C2133b1> it = this.f19241d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().m11937d());
            } catch (JSONException unused) {
                C2186v.m12271c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    private C2151h1 m12103d() {
        return C2158k.m12076a(this.f19241d, this.f19238a, this.f19239b, this.f19242e, this.f19240c);
    }

    /* renamed from: a */
    public void m12104a() {
        InterfaceRunnableC2146g c2139d1;
        C2132b0 c2132b0M11928c;
        String str;
        String strM12099a = m12099a(this.f19238a, this.f19239b);
        if (!TextUtils.isEmpty(strM12099a) || "preins".equals(this.f19239b)) {
            if (!"_hms_config_tag".equals(this.f19238a) && !"_openness_config_tag".equals(this.f19238a)) {
                m12101b();
            }
            C2151h1 c2151h1M12103d = m12103d();
            if (c2151h1M12103d != null) {
                byte[] bArrM12100a = m12100a(c2151h1M12103d);
                if (bArrM12100a.length == 0) {
                    str = "request body is empty";
                } else {
                    c2139d1 = new C2143f(bArrM12100a, strM12099a, this.f19238a, this.f19239b, this.f19242e, this.f19241d);
                    c2132b0M11928c = C2132b0.m11927b();
                }
            } else {
                c2139d1 = new C2139d1(this.f19241d, this.f19238a, this.f19242e, this.f19239b);
                c2132b0M11928c = C2132b0.m11928c();
            }
            c2132b0M11928c.m11929a(c2139d1);
            return;
        }
        str = "collectUrl is empty";
        C2186v.m12275e("hmsSdk", str);
    }

    /* renamed from: a */
    private byte[] m12100a(C2151h1 c2151h1) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        try {
            JSONObject jSONObjectMo11930a = c2151h1.mo11930a();
            if (jSONObjectMo11930a != null) {
                return C2160k1.m12092a(jSONObjectMo11930a.toString().getBytes("UTF-8"));
            }
            C2186v.m12275e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            C2186v.m12275e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            C2186v.m12275e("hmsSdk", str);
            return new byte[0];
        }
    }
}
