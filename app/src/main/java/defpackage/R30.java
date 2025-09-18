package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class R30 {
    public static final I20[] a;
    public static final Map b;

    static {
        I20 i20 = new I20(I20.i, "");
        C0674Ik c0674Ik = I20.f;
        I20 i202 = new I20(c0674Ik, "GET");
        I20 i203 = new I20(c0674Ik, "POST");
        C0674Ik c0674Ik2 = I20.g;
        I20 i204 = new I20(c0674Ik2, "/");
        I20 i205 = new I20(c0674Ik2, "/index.html");
        C0674Ik c0674Ik3 = I20.h;
        I20 i206 = new I20(c0674Ik3, "http");
        I20 i207 = new I20(c0674Ik3, "https");
        C0674Ik c0674Ik4 = I20.e;
        I20[] i20Arr = {i20, i202, i203, i204, i205, i206, i207, new I20(c0674Ik4, "200"), new I20(c0674Ik4, "204"), new I20(c0674Ik4, "206"), new I20(c0674Ik4, "304"), new I20(c0674Ik4, "400"), new I20(c0674Ik4, "404"), new I20(c0674Ik4, "500"), new I20("accept-charset", ""), new I20("accept-encoding", "gzip, deflate"), new I20("accept-language", ""), new I20("accept-ranges", ""), new I20("accept", ""), new I20("access-control-allow-origin", ""), new I20("age", ""), new I20("allow", ""), new I20("authorization", ""), new I20("cache-control", ""), new I20("content-disposition", ""), new I20("content-encoding", ""), new I20("content-language", ""), new I20("content-length", ""), new I20("content-location", ""), new I20("content-range", ""), new I20("content-type", ""), new I20("cookie", ""), new I20(NotificationConstants.DATE, ""), new I20("etag", ""), new I20("expect", ""), new I20("expires", ""), new I20("from", ""), new I20("host", ""), new I20("if-match", ""), new I20("if-modified-since", ""), new I20("if-none-match", ""), new I20("if-range", ""), new I20("if-unmodified-since", ""), new I20("last-modified", ""), new I20("link", ""), new I20("location", ""), new I20("max-forwards", ""), new I20("proxy-authenticate", ""), new I20("proxy-authorization", ""), new I20("range", ""), new I20("referer", ""), new I20("refresh", ""), new I20("retry-after", ""), new I20("server", ""), new I20("set-cookie", ""), new I20("strict-transport-security", ""), new I20("transfer-encoding", ""), new I20("user-agent", ""), new I20("vary", ""), new I20("via", ""), new I20("www-authenticate", "")};
        a = i20Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(i20Arr[i].a)) {
                linkedHashMap.put(i20Arr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        O90.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        b = mapUnmodifiableMap;
    }

    public static void a(C0674Ik c0674Ik) throws IOException {
        O90.f(c0674Ik, "name");
        int iC = c0674Ik.c();
        for (int i = 0; i < iC; i++) {
            byte bF = c0674Ik.f(i);
            if (65 <= bF && bF < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0674Ik.k()));
            }
        }
    }
}
