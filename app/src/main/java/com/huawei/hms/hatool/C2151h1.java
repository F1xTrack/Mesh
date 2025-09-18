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

/* renamed from: com.huawei.hms.hatool.h1 */
/* loaded from: classes.dex */
public class C2151h1 implements InterfaceC2172o1 {

    /* renamed from: a */
    private List<C2133b1> f19198a;

    /* renamed from: b */
    private AbstractC2159k0 f19199b;

    /* renamed from: c */
    private AbstractC2183t0 f19200c;

    /* renamed from: d */
    private InterfaceC2172o1 f19201d;

    /* renamed from: e */
    private String f19202e = "";

    /* renamed from: f */
    private String f19203f;

    public C2151h1(String str) {
        this.f19203f = str;
    }

    @Override // com.huawei.hms.hatool.InterfaceC2172o1
    /* renamed from: a */
    public JSONObject mo11930a() throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        List<C2133b1> list = this.f19198a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f19199b == null || this.f19200c == null || this.f19201d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f19199b.mo11930a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectMo11930a = this.f19201d.mo11930a();
            jSONObjectMo11930a.put("properties", this.f19200c.mo11930a());
            try {
                jSONObjectMo11930a.put("events_global_properties", new JSONObject(this.f19202e));
            } catch (JSONException unused) {
                jSONObjectMo11930a.put("events_global_properties", this.f19202e);
            }
            jSONObject2.put("events_common", jSONObjectMo11930a);
            JSONArray jSONArray = new JSONArray();
            Iterator<C2133b1> it = this.f19198a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo11930a2 = it.next().mo11930a();
                if (jSONObjectMo11930a2 != null) {
                    jSONArray.put(jSONObjectMo11930a2);
                } else {
                    C2186v.m12275e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String strM12132a = C2167n.m12132a(C2160k1.m12092a(jSONObject2.toString().getBytes("UTF-8")), this.f19203f);
                if (TextUtils.isEmpty(strM12132a)) {
                    C2186v.m12275e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put("event", strM12132a);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        C2186v.m12275e("hmsSdk", str);
        return null;
    }

    /* renamed from: a */
    public void m12043a(AbstractC2159k0 abstractC2159k0) {
        this.f19199b = abstractC2159k0;
    }

    /* renamed from: a */
    public void m12044a(C2161l c2161l) {
        this.f19201d = c2161l;
    }

    /* renamed from: a */
    public void m12045a(AbstractC2183t0 abstractC2183t0) {
        this.f19200c = abstractC2183t0;
    }

    /* renamed from: a */
    public void m12046a(String str) {
        if (str != null) {
            this.f19202e = str;
        }
    }

    /* renamed from: a */
    public void m12047a(List<C2133b1> list) {
        this.f19198a = list;
    }
}
