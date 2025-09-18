package com.huawei.hms.push;

import android.text.TextUtils;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.push.o */
/* loaded from: classes.dex */
public class C2229o {

    /* renamed from: B */
    private int f19430B;

    /* renamed from: D */
    private String f19432D;

    /* renamed from: b */
    private int f19436b;

    /* renamed from: c */
    private String f19437c;

    /* renamed from: d */
    private String f19438d;

    /* renamed from: l */
    private String f19446l;

    /* renamed from: m */
    private String f19447m;

    /* renamed from: n */
    private String f19448n;

    /* renamed from: o */
    private String f19449o;

    /* renamed from: p */
    private String f19450p;

    /* renamed from: r */
    private String f19452r;

    /* renamed from: s */
    private String f19453s;

    /* renamed from: z */
    private String f19460z;

    /* renamed from: a */
    private String f19435a = "";

    /* renamed from: e */
    private String f19439e = "";

    /* renamed from: f */
    private String f19440f = "";

    /* renamed from: g */
    private String f19441g = "";

    /* renamed from: h */
    private String f19442h = "";

    /* renamed from: i */
    private String f19443i = "";

    /* renamed from: j */
    private String f19444j = "";

    /* renamed from: k */
    private String f19445k = "";

    /* renamed from: q */
    private String f19451q = "";

    /* renamed from: t */
    private int f19454t = EnumC2225k.STYLE_DEFAULT.ordinal();

    /* renamed from: u */
    private String f19455u = "";

    /* renamed from: v */
    private String f19456v = "";

    /* renamed from: w */
    private String f19457w = "";

    /* renamed from: x */
    private int f19458x = 0;

    /* renamed from: y */
    private int f19459y = 0;

    /* renamed from: A */
    private String f19429A = "";

    /* renamed from: C */
    private String f19431C = "";

    /* renamed from: E */
    private String f19433E = "";

    /* renamed from: F */
    private String f19434F = "";

    public C2229o(byte[] bArr, byte[] bArr2) {
        Charset charset = C2227m.f19425a;
        this.f19452r = new String(bArr, charset);
        this.f19453s = new String(bArr2, charset);
    }

    /* renamed from: a */
    private JSONObject m12473a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject);
        jSONObject2.put(NotificationConstants.GROUP, this.f19435a);
        jSONObject2.put("tag", this.f19429A);
        jSONObject2.put("autoCancel", this.f19458x);
        jSONObject2.put("visibility", this.f19459y);
        jSONObject2.put(RemoteMessageConst.Notification.WHEN, this.f19460z);
        return jSONObject2;
    }

    /* renamed from: b */
    private JSONObject m12475b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cmd", this.f19441g);
        jSONObject2.put(RemoteMessageConst.Notification.CONTENT, this.f19442h);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_ICON, this.f19443i);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, this.f19444j);
        jSONObject2.put("notifySummary", this.f19445k);
        jSONObject2.put(RemoteMessageConst.MessageBody.PARAM, jSONObject);
        return jSONObject2;
    }

    /* renamed from: c */
    private void m12476c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f19438d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i = 0; i < length; i++) {
                sb.append("0");
            }
            sb.append(string);
            this.f19438d = sb.toString();
        }
    }

    /* renamed from: d */
    private boolean m12477d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has(RemoteMessageConst.Notification.CLICK_ACTION)) {
            this.f19447m = jSONObject.getString(RemoteMessageConst.Notification.CLICK_ACTION);
        }
        if (jSONObject.has("intentUri")) {
            this.f19437c = jSONObject.getString("intentUri");
        }
        if (jSONObject.has("appPackageName")) {
            this.f19446l = jSONObject.getString("appPackageName");
            return true;
        }
        HMSLog.m12617d("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    /* renamed from: e */
    private boolean m12478e(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("msgId")) {
            HMSLog.m12622i("PushSelfShowLog", "msgId == null");
            return false;
        }
        Object obj = jSONObject.get("msgId");
        if (obj instanceof String) {
            this.f19439e = (String) obj;
            return true;
        }
        if (!(obj instanceof Integer)) {
            return true;
        }
        this.f19439e = String.valueOf(((Integer) obj).intValue());
        return true;
    }

    /* renamed from: f */
    private boolean m12479f(JSONObject jSONObject) throws JSONException {
        HMSLog.m12617d("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
            if (jSONObject2.has("style")) {
                this.f19454t = jSONObject2.getInt("style");
            }
            this.f19455u = jSONObject2.optString("bigTitle");
            this.f19456v = jSONObject2.optString("bigContent");
            this.f19433E = jSONObject2.optString("icon");
            return true;
        } catch (JSONException e) {
            HMSLog.m12622i("PushSelfShowLog", e.toString());
            return false;
        }
    }

    /* renamed from: g */
    private void m12480g(JSONObject jSONObject) {
        this.f19435a = jSONObject.optString(NotificationConstants.GROUP);
        HMSLog.m12617d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f19435a);
        this.f19458x = jSONObject.optInt("autoCancel", 1);
        HMSLog.m12617d("PushSelfShowLog", "autoCancel: " + this.f19458x);
        this.f19459y = jSONObject.optInt("visibility", 0);
        this.f19460z = jSONObject.optString(RemoteMessageConst.Notification.WHEN);
        this.f19429A = jSONObject.optString("tag");
    }

    /* renamed from: h */
    private boolean m12481h(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PARAM);
            if (jSONObject2.has("autoClear")) {
                this.f19436b = jSONObject2.getInt("autoClear");
            } else {
                this.f19436b = 0;
            }
            if (!"app".equals(this.f19441g) && !"cosa".equals(this.f19441g)) {
                if ("url".equals(this.f19441g)) {
                    m12484k(jSONObject2);
                    return true;
                }
                if (!"rp".equals(this.f19441g)) {
                    return true;
                }
                m12483j(jSONObject2);
                return true;
            }
            m12477d(jSONObject2);
            return true;
        } catch (Exception e) {
            HMSLog.m12621e("PushSelfShowLog", "ParseParam error ", e);
            return false;
        }
    }

    /* renamed from: i */
    private boolean m12482i(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(RemoteMessageConst.MessageBody.PS_CONTENT)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
            this.f19441g = jSONObject2.getString("cmd");
            this.f19442h = jSONObject2.optString(RemoteMessageConst.Notification.CONTENT);
            this.f19443i = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f19444j = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f19445k = jSONObject2.optString("notifySummary");
            this.f19432D = jSONObject2.optString("ticker");
            if ((!jSONObject2.has(RemoteMessageConst.MessageBody.NOTIFY_DETAIL) || m12479f(jSONObject2)) && jSONObject2.has(RemoteMessageConst.MessageBody.PARAM)) {
                return m12481h(jSONObject2);
            }
        }
        return false;
    }

    /* renamed from: j */
    private boolean m12483j(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("appPackageName")) {
            this.f19446l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.m12617d("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.f19449o = jSONObject.getString("rpl");
        this.f19450p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f19451q = jSONObject.getString("rpct");
        return true;
    }

    /* renamed from: k */
    private boolean m12484k(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("url")) {
            HMSLog.m12617d("PushSelfShowLog", "url is null");
            return false;
        }
        this.f19448n = jSONObject.getString("url");
        if (jSONObject.has("appPackageName")) {
            this.f19446l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            return true;
        }
        this.f19449o = jSONObject.getString("rpl");
        this.f19450p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f19451q = jSONObject.getString("rpct");
        return true;
    }

    /* renamed from: q */
    private JSONObject m12485q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", this.f19454t);
        jSONObject.put("bigTitle", this.f19455u);
        jSONObject.put("bigContent", this.f19456v);
        jSONObject.put("bigPic", this.f19457w);
        return jSONObject;
    }

    /* renamed from: u */
    private JSONObject m12486u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.f19436b);
        jSONObject.put("url", this.f19448n);
        jSONObject.put("rpl", this.f19449o);
        jSONObject.put("rpt", this.f19450p);
        jSONObject.put("rpct", this.f19451q);
        jSONObject.put("appPackageName", this.f19446l);
        jSONObject.put(RemoteMessageConst.Notification.CLICK_ACTION, this.f19447m);
        jSONObject.put("intentUri", this.f19437c);
        return jSONObject;
    }

    /* renamed from: l */
    public String m12499l() {
        return this.f19433E;
    }

    /* renamed from: m */
    public String m12500m() {
        return this.f19437c;
    }

    /* renamed from: n */
    public byte[] m12501n() {
        try {
            return m12473a(m12474a(m12475b(m12486u()), m12485q())).toString().getBytes(C2227m.f19425a);
        } catch (JSONException e) {
            HMSLog.m12621e("PushSelfShowLog", "getMsgData failed JSONException:", e);
            return new byte[0];
        }
    }

    /* renamed from: o */
    public String m12502o() {
        HMSLog.m12617d("PushSelfShowLog", "msgId =" + this.f19439e);
        return this.f19439e;
    }

    /* renamed from: p */
    public String m12503p() {
        return this.f19429A;
    }

    /* renamed from: r */
    public int m12504r() {
        return this.f19430B;
    }

    /* renamed from: s */
    public String m12505s() {
        return this.f19445k;
    }

    /* renamed from: t */
    public String m12506t() {
        return this.f19444j;
    }

    /* renamed from: v */
    public int m12507v() {
        return this.f19454t;
    }

    /* renamed from: w */
    public String m12508w() {
        return this.f19432D;
    }

    /* renamed from: x */
    public byte[] m12509x() {
        return this.f19453s.getBytes(C2227m.f19425a);
    }

    /* renamed from: y */
    public boolean m12510y() throws JSONException {
        try {
            if (TextUtils.isEmpty(this.f19452r)) {
                HMSLog.m12617d("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.f19452r);
            m12480g(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
            if (!m12478e(jSONObject2)) {
                return false;
            }
            this.f19440f = jSONObject2.optString("dispPkgName");
            m12476c(jSONObject2);
            this.f19430B = jSONObject2.optInt(RemoteMessageConst.Notification.NOTIFY_ID, -1);
            this.f19431C = jSONObject2.optString("data");
            this.f19434F = jSONObject2.optString("analyticInfo");
            return m12482i(jSONObject2);
        } catch (JSONException unused) {
            HMSLog.m12617d("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e) {
            HMSLog.m12617d("PushSelfShowLog", e.toString());
            return false;
        }
    }

    /* renamed from: a */
    private JSONObject m12474a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f19440f);
        jSONObject3.put("msgId", this.f19439e);
        jSONObject3.put("ap", this.f19438d);
        jSONObject3.put(RemoteMessageConst.Notification.NOTIFY_ID, this.f19430B);
        jSONObject3.put(RemoteMessageConst.MessageBody.PS_CONTENT, jSONObject);
        jSONObject3.put(RemoteMessageConst.MessageBody.NOTIFY_DETAIL, jSONObject2);
        jSONObject3.put("ticker", this.f19432D);
        jSONObject3.put("data", this.f19431C);
        return jSONObject3;
    }

    /* renamed from: b */
    public String m12489b() {
        return this.f19434F;
    }

    /* renamed from: d */
    public int m12491d() {
        return this.f19458x;
    }

    /* renamed from: g */
    public String m12494g() {
        return this.f19455u;
    }

    /* renamed from: e */
    public int m12492e() {
        return this.f19436b;
    }

    /* renamed from: f */
    public String m12493f() {
        return this.f19456v;
    }

    /* renamed from: j */
    public String m12497j() {
        return this.f19440f;
    }

    /* renamed from: c */
    public String m12490c() {
        return this.f19446l;
    }

    /* renamed from: k */
    public String m12498k() {
        return this.f19435a;
    }

    /* renamed from: h */
    public String m12495h() {
        return this.f19441g;
    }

    /* renamed from: i */
    public String m12496i() {
        return this.f19442h;
    }

    /* renamed from: a */
    public String m12487a() {
        return this.f19447m;
    }

    /* renamed from: a */
    public void m12488a(int i) {
        this.f19430B = i;
    }
}
