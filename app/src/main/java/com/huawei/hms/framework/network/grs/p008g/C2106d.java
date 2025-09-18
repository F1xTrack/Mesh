package com.huawei.hms.framework.network.grs.p008g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.p015rn.push.constants.Core;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.g.d */
/* loaded from: classes.dex */
public class C2106d {

    /* renamed from: o */
    private static final String f19068o = "d";

    /* renamed from: a */
    private Map<String, List<String>> f19069a;

    /* renamed from: b */
    private byte[] f19070b;

    /* renamed from: c */
    private int f19071c;

    /* renamed from: d */
    private long f19072d;

    /* renamed from: e */
    private long f19073e;

    /* renamed from: f */
    private long f19074f;

    /* renamed from: g */
    private String f19075g;

    /* renamed from: h */
    private int f19076h;

    /* renamed from: i */
    private int f19077i;

    /* renamed from: j */
    private String f19078j;

    /* renamed from: k */
    private long f19079k;

    /* renamed from: l */
    private String f19080l;

    /* renamed from: m */
    private Exception f19081m;

    /* renamed from: n */
    private String f19082n;

    public C2106d(int i, Map<String, List<String>> map, byte[] bArr, long j) throws NumberFormatException {
        this.f19076h = 2;
        this.f19077i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f19078j = "";
        this.f19079k = 0L;
        this.f19080l = "";
        this.f19071c = i;
        this.f19069a = map;
        this.f19070b = ByteBuffer.wrap(bArr).array();
        this.f19072d = j;
        m11808s();
    }

    /* renamed from: p */
    private void m11805p() {
        int i;
        if (m11826m()) {
            Logger.m11685i(f19068o, "GRSSDK get httpcode{304} not any changed.");
            m11798c(1);
            return;
        }
        if (!m11828o()) {
            Logger.m11685i(f19068o, "GRSSDK parse server body all failed.");
            m11798c(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f19070b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                }
            } else if (jSONObject.has(Core.Event.Result.RESULT_CODE)) {
                i = jSONObject.getInt(Core.Event.Result.RESULT_CODE) == 0 ? 1 : 2;
            } else {
                Logger.m11682e(f19068o, "sth. wrong because server errorcode's key.");
                i = -1;
            }
            if (i != 1 && jSONObject.has("services")) {
                i = 0;
            }
            m11798c(i);
            if (i == 1 || i == 0) {
                m11804f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                m11803e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                m11796b(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : ConnectionResult.RESOLUTION_REQUIRED);
                m11802d(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e) {
            Logger.m11691w(f19068o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            m11798c(2);
        }
    }

    /* renamed from: q */
    private void m11806q() throws NumberFormatException {
        if (m11828o() || m11827n() || m11826m()) {
            Map<String, String> mapM11807r = m11807r();
            if (mapM11807r.size() <= 0) {
                Logger.m11689w(f19068o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (m11828o() || m11826m()) {
                    m11797b(mapM11807r);
                    m11795a(mapM11807r);
                }
                if (m11827n()) {
                    m11801c(mapM11807r);
                }
            } catch (JSONException e) {
                Logger.m11691w(f19068o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
    }

    /* renamed from: r */
    private Map<String, String> m11807r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.f19069a;
        if (map2 == null || map2.size() <= 0) {
            Logger.m11687v(f19068o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry<String, List<String>> entry : this.f19069a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map.put(key, it.next());
            }
        }
        return map;
    }

    /* renamed from: s */
    private void m11808s() throws NumberFormatException {
        m11806q();
        m11805p();
    }

    /* renamed from: a */
    public String m11809a() {
        return this.f19078j;
    }

    /* renamed from: b */
    public int m11813b() {
        return this.f19071c;
    }

    /* renamed from: c */
    public int m11816c() {
        return this.f19077i;
    }

    /* renamed from: d */
    public Exception m11817d() {
        return this.f19081m;
    }

    /* renamed from: e */
    public String m11818e() {
        return this.f19080l;
    }

    /* renamed from: f */
    public int m11819f() {
        return this.f19076h;
    }

    /* renamed from: g */
    public long m11820g() {
        return this.f19074f;
    }

    /* renamed from: h */
    public long m11821h() {
        return this.f19073e;
    }

    /* renamed from: i */
    public long m11822i() {
        return this.f19072d;
    }

    /* renamed from: j */
    public String m11823j() {
        return this.f19075g;
    }

    /* renamed from: k */
    public long m11824k() {
        return this.f19079k;
    }

    /* renamed from: l */
    public String m11825l() {
        return this.f19082n;
    }

    /* renamed from: m */
    public boolean m11826m() {
        return this.f19071c == 304;
    }

    /* renamed from: n */
    public boolean m11827n() {
        return this.f19071c == 503;
    }

    /* renamed from: o */
    public boolean m11828o() {
        return this.f19071c == 200;
    }

    public C2106d(Exception exc, long j) {
        this.f19071c = 0;
        this.f19076h = 2;
        this.f19077i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f19078j = "";
        this.f19079k = 0L;
        this.f19080l = "";
        this.f19081m = exc;
        this.f19072d = j;
    }

    /* renamed from: b */
    private void m11796b(int i) {
        this.f19077i = i;
    }

    /* renamed from: c */
    private void m11798c(int i) {
        this.f19076h = i;
    }

    /* renamed from: d */
    private void m11802d(String str) {
    }

    /* renamed from: e */
    private void m11803e(String str) {
    }

    /* renamed from: f */
    private void m11804f(String str) {
        this.f19075g = str;
    }

    /* renamed from: a */
    public void m11810a(int i) {
    }

    /* renamed from: c */
    private void m11799c(long j) {
        this.f19079k = j;
    }

    /* renamed from: a */
    public void m11811a(long j) {
        this.f19074f = j;
    }

    /* renamed from: b */
    public void m11814b(long j) {
        this.f19073e = j;
    }

    /* renamed from: c */
    private void m11800c(String str) {
        this.f19078j = str;
    }

    /* renamed from: a */
    public void m11812a(String str) {
        this.f19080l = str;
    }

    /* renamed from: b */
    public void m11815b(String str) {
        this.f19082n = str;
    }

    /* renamed from: a */
    private void m11795a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.m11685i(f19068o, "success get Etag from server");
                m11812a(str3);
                return;
            } else {
                str = f19068o;
                str2 = "The Response Heads Etag is Empty";
            }
        } else {
            str = f19068o;
            str2 = "Response Heads has not Etag";
        }
        Logger.m11685i(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11797b(java.util.Map<java.lang.String, java.lang.String> r12) throws java.lang.NumberFormatException {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "Cache-Control"
            boolean r3 = r12.containsKey(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            if (r3 == 0) goto L4d
            java.lang.Object r12 = r12.get(r2)
            java.lang.String r12 = (java.lang.String) r12
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto Laf
            java.lang.String r2 = "max-age="
            boolean r3 = r12.contains(r2)
            if (r3 == 0) goto Laf
            int r2 = r12.indexOf(r2)     // Catch: java.lang.NumberFormatException -> L43
            int r2 = r2 + 8
            java.lang.String r12 = r12.substring(r2)     // Catch: java.lang.NumberFormatException -> L43
            long r2 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L43
            java.lang.String r12 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o     // Catch: java.lang.NumberFormatException -> L41
            java.lang.String r8 = "Cache-Control value{%s}"
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L41
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.NumberFormatException -> L41
            r10[r0] = r9     // Catch: java.lang.NumberFormatException -> L41
            com.huawei.hms.framework.common.Logger.m11688v(r12, r8, r10)     // Catch: java.lang.NumberFormatException -> L41
            goto Lb0
        L41:
            r12 = move-exception
            goto L45
        L43:
            r12 = move-exception
            r2 = r6
        L45:
            java.lang.String r8 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.String r9 = "getExpireTime addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.m11690w(r8, r9, r12)
            goto Lb0
        L4d:
            java.lang.String r2 = "Expires"
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto La8
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r2
            java.lang.String r9 = "expires is{%s}"
            com.huawei.hms.framework.common.Logger.m11688v(r3, r9, r8)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r9 = "EEE, d MMM yyyy HH:mm:ss 'GMT'"
            r3.<init>(r9, r8)
            java.lang.String r8 = "Date"
            boolean r9 = r12.containsKey(r8)
            if (r9 == 0) goto L7e
            java.lang.Object r12 = r12.get(r8)
            java.lang.String r12 = (java.lang.String) r12
            goto L7f
        L7e:
            r12 = 0
        L7f:
            java.util.Date r2 = r3.parse(r2)     // Catch: java.text.ParseException -> L8f
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch: java.text.ParseException -> L8f
            if (r8 == 0) goto L91
            java.util.Date r12 = new java.util.Date     // Catch: java.text.ParseException -> L8f
            r12.<init>()     // Catch: java.text.ParseException -> L8f
            goto L95
        L8f:
            r12 = move-exception
            goto La0
        L91:
            java.util.Date r12 = r3.parse(r12)     // Catch: java.text.ParseException -> L8f
        L95:
            long r2 = r2.getTime()     // Catch: java.text.ParseException -> L8f
            long r8 = r12.getTime()     // Catch: java.text.ParseException -> L8f
            long r2 = r2 - r8
            long r2 = r2 / r4
            goto Lb0
        La0:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.String r3 = "getExpireTime ParseException."
            com.huawei.hms.framework.common.Logger.m11690w(r2, r3, r12)
            goto Laf
        La8:
            java.lang.String r12 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.String r2 = "response headers neither contains Cache-Control nor Expires."
            com.huawei.hms.framework.common.Logger.m11685i(r12, r2)
        Laf:
            r2 = r6
        Lb0:
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 <= 0) goto Lbb
            r6 = 2592000(0x278d00, double:1.280618E-317)
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 <= 0) goto Lbe
        Lbb:
            r2 = 86400(0x15180, double:4.26873E-319)
        Lbe:
            long r2 = r2 * r4
            java.lang.String r12 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.String r0 = "convert expireTime{%s}"
            com.huawei.hms.framework.common.Logger.m11686i(r12, r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.lang.String r12 = java.lang.String.valueOf(r0)
            r11.m11800c(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p008g.C2106d.m11797b(java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11801c(java.util.Map<java.lang.String, java.lang.String> r6) throws java.lang.NumberFormatException {
        /*
            r5 = this;
            java.lang.String r0 = "Retry-After"
            boolean r1 = r6.containsKey(r0)
            if (r1 == 0) goto L21
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L21
            long r0 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L19
            goto L23
        L19:
            r6 = move-exception
            java.lang.String r0 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.String r1 = "getRetryAfter addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.m11690w(r0, r1, r6)
        L21:
            r0 = 0
        L23:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r6 = com.huawei.hms.framework.network.grs.p008g.C2106d.f19068o
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "convert retry-afterTime{%s}"
            com.huawei.hms.framework.common.Logger.m11688v(r6, r2, r3)
            r5.m11799c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p008g.C2106d.m11801c(java.util.Map):void");
    }
}
