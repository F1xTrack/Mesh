package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class R30 {

    /* renamed from: a */
    public static final I20[] f9967a;

    /* renamed from: b */
    public static final Map f9968b;

    static {
        I20 i20 = new I20(I20.f4666i, "");
        C0551Ik c0551Ik = I20.f4663f;
        I20 i202 = new I20(c0551Ik, "GET");
        I20 i203 = new I20(c0551Ik, "POST");
        C0551Ik c0551Ik2 = I20.f4664g;
        I20 i204 = new I20(c0551Ik2, "/");
        I20 i205 = new I20(c0551Ik2, "/index.html");
        C0551Ik c0551Ik3 = I20.f4665h;
        I20 i206 = new I20(c0551Ik3, "http");
        I20 i207 = new I20(c0551Ik3, "https");
        C0551Ik c0551Ik4 = I20.f4662e;
        I20[] i20Arr = {i20, i202, i203, i204, i205, i206, i207, new I20(c0551Ik4, "200"), new I20(c0551Ik4, "204"), new I20(c0551Ik4, "206"), new I20(c0551Ik4, "304"), new I20(c0551Ik4, "400"), new I20(c0551Ik4, "404"), new I20(c0551Ik4, "500"), new I20("accept-charset", ""), new I20("accept-encoding", "gzip, deflate"), new I20("accept-language", ""), new I20("accept-ranges", ""), new I20("accept", ""), new I20("access-control-allow-origin", ""), new I20("age", ""), new I20("allow", ""), new I20("authorization", ""), new I20("cache-control", ""), new I20("content-disposition", ""), new I20("content-encoding", ""), new I20("content-language", ""), new I20("content-length", ""), new I20("content-location", ""), new I20("content-range", ""), new I20("content-type", ""), new I20("cookie", ""), new I20(NotificationConstants.DATE, ""), new I20("etag", ""), new I20("expect", ""), new I20("expires", ""), new I20("from", ""), new I20("host", ""), new I20("if-match", ""), new I20("if-modified-since", ""), new I20("if-none-match", ""), new I20("if-range", ""), new I20("if-unmodified-since", ""), new I20("last-modified", ""), new I20("link", ""), new I20("location", ""), new I20("max-forwards", ""), new I20("proxy-authenticate", ""), new I20("proxy-authorization", ""), new I20("range", ""), new I20("referer", ""), new I20("refresh", ""), new I20("retry-after", ""), new I20("server", ""), new I20("set-cookie", ""), new I20("strict-transport-security", ""), new I20("transfer-encoding", ""), new I20("user-agent", ""), new I20("vary", ""), new I20("via", ""), new I20("www-authenticate", "")};
        f9967a = i20Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(i20Arr[i].f4667a)) {
                linkedHashMap.put(i20Arr[i].f4667a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        O90.m5967e(mapUnmodifiableMap, "unmodifiableMap(result)");
        f9968b = mapUnmodifiableMap;
    }

    /* renamed from: a */
    public static void m6889a(C0551Ik c0551Ik) throws IOException {
        O90.m5968f(c0551Ik, "name");
        int iMo3983c = c0551Ik.mo3983c();
        for (int i = 0; i < iMo3983c; i++) {
            byte bMo3986f = c0551Ik.mo3986f(i);
            if (65 <= bMo3986f && bMo3986f < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0551Ik.m3991k()));
            }
        }
    }
}
