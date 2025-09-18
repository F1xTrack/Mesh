package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.rn.push.constants.Core;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static final String o = "d";
    private Map<String, List<String>> a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) throws NumberFormatException {
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.c = i;
        this.a = map;
        this.b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }

    private void p() {
        int i;
        if (m()) {
            Logger.i(o, "GRSSDK get httpcode{304} not any changed.");
            c(1);
            return;
        }
        if (!o()) {
            Logger.i(o, "GRSSDK parse server body all failed.");
            c(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                }
            } else if (jSONObject.has(Core.Event.Result.RESULT_CODE)) {
                i = jSONObject.getInt(Core.Event.Result.RESULT_CODE) == 0 ? 1 : 2;
            } else {
                Logger.e(o, "sth. wrong because server errorcode's key.");
                i = -1;
            }
            if (i != 1 && jSONObject.has("services")) {
                i = 0;
            }
            c(i);
            if (i == 1 || i == 0) {
                f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                b(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : ConnectionResult.RESOLUTION_REQUIRED);
                d(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e) {
            Logger.w(o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            c(2);
        }
    }

    private void q() throws NumberFormatException {
        if (o() || n() || m()) {
            Map<String, String> mapR = r();
            if (mapR.size() <= 0) {
                Logger.w(o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (o() || m()) {
                    b(mapR);
                    a(mapR);
                }
                if (n()) {
                    c(mapR);
                }
            } catch (JSONException e) {
                Logger.w(o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
    }

    private Map<String, String> r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.a;
        if (map2 == null || map2.size() <= 0) {
            Logger.v(o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map.put(key, it.next());
            }
        }
        return map;
    }

    private void s() throws NumberFormatException {
        q();
        p();
    }

    public String a() {
        return this.j;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.i;
    }

    public Exception d() {
        return this.m;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public String l() {
        return this.n;
    }

    public boolean m() {
        return this.c == 304;
    }

    public boolean n() {
        return this.c == 503;
    }

    public boolean o() {
        return this.c == 200;
    }

    public d(Exception exc, long j) {
        this.c = 0;
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    private void b(int i) {
        this.i = i;
    }

    private void c(int i) {
        this.h = i;
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.g = str;
    }

    public void a(int i) {
    }

    private void c(long j) {
        this.k = j;
    }

    public void a(long j) {
        this.f = j;
    }

    public void b(long j) {
        this.e = j;
    }

    private void c(String str) {
        this.j = str;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.n = str;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(o, "success get Etag from server");
                a(str3);
                return;
            } else {
                str = o;
                str2 = "The Response Heads Etag is Empty";
            }
        } else {
            str = o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.Map<java.lang.String, java.lang.String> r12) throws java.lang.NumberFormatException {
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
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: java.lang.NumberFormatException -> L41
            java.lang.String r8 = "Cache-Control value{%s}"
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L41
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.NumberFormatException -> L41
            r10[r0] = r9     // Catch: java.lang.NumberFormatException -> L41
            com.huawei.hms.framework.common.Logger.v(r12, r8, r10)     // Catch: java.lang.NumberFormatException -> L41
            goto Lb0
        L41:
            r12 = move-exception
            goto L45
        L43:
            r12 = move-exception
            r2 = r6
        L45:
            java.lang.String r8 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r9 = "getExpireTime addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.w(r8, r9, r12)
            goto Lb0
        L4d:
            java.lang.String r2 = "Expires"
            boolean r3 = r12.containsKey(r2)
            if (r3 == 0) goto La8
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r2
            java.lang.String r9 = "expires is{%s}"
            com.huawei.hms.framework.common.Logger.v(r3, r9, r8)
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
            java.lang.String r2 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r3 = "getExpireTime ParseException."
            com.huawei.hms.framework.common.Logger.w(r2, r3, r12)
            goto Laf
        La8:
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r2 = "response headers neither contains Cache-Control nor Expires."
            com.huawei.hms.framework.common.Logger.i(r12, r2)
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
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.String r0 = "convert expireTime{%s}"
            com.huawei.hms.framework.common.Logger.i(r12, r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.lang.String r12 = java.lang.String.valueOf(r0)
            r11.c(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.b(java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.util.Map<java.lang.String, java.lang.String> r6) throws java.lang.NumberFormatException {
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
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "getRetryAfter addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.w(r0, r1, r6)
        L21:
            r0 = 0
        L23:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r6 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "convert retry-afterTime{%s}"
            com.huawei.hms.framework.common.Logger.v(r6, r2, r3)
            r5.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.c(java.util.Map):void");
    }
}
