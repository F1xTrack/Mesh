package defpackage;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: vX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7620vX extends CookieHandler {
    public CookieManager a;

    public final CookieManager a() {
        if (this.a == null) {
            try {
                this.a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.a;
    }

    @Override // java.net.CookieHandler
    public final Map get(URI uri, Map map) {
        CookieManager cookieManagerA = a();
        if (cookieManagerA == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManagerA.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public final void put(URI uri, Map map) {
        String string = uri.toString();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2"))) {
                List<String> list = (List) entry.getValue();
                CookieManager cookieManagerA = a();
                if (cookieManagerA != null) {
                    for (String str2 : list) {
                        CookieManager cookieManagerA2 = a();
                        if (cookieManagerA2 != null) {
                            cookieManagerA2.setCookie(string, str2, null);
                        }
                    }
                    cookieManagerA.flush();
                }
            }
        }
    }
}
