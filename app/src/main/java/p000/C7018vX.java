package p000;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: vX */
/* loaded from: classes.dex */
public final class C7018vX extends CookieHandler {

    /* renamed from: a */
    public CookieManager f44402a;

    /* renamed from: a */
    public final CookieManager m25429a() {
        if (this.f44402a == null) {
            try {
                this.f44402a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.f44402a;
    }

    @Override // java.net.CookieHandler
    public final Map get(URI uri, Map map) {
        CookieManager cookieManagerM25429a = m25429a();
        if (cookieManagerM25429a == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManagerM25429a.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public final void put(URI uri, Map map) {
        String string = uri.toString();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2"))) {
                List<String> list = (List) entry.getValue();
                CookieManager cookieManagerM25429a = m25429a();
                if (cookieManagerM25429a != null) {
                    for (String str2 : list) {
                        CookieManager cookieManagerM25429a2 = m25429a();
                        if (cookieManagerM25429a2 != null) {
                            cookieManagerM25429a2.setCookie(string, str2, null);
                        }
                    }
                    cookieManagerM25429a.flush();
                }
            }
        }
    }
}
