package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import java.net.InetAddress;
import org.json.JSONObject;
import p000.RunnableC8176Qp0;

/* renamed from: com.my.tracker.obfuscated.z0 */
/* loaded from: classes2.dex */
public final class C2393z0 {

    /* renamed from: a */
    boolean f20168a = false;

    /* renamed from: b */
    private C2389y0 f20169b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m13578b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String str2;
        AbstractC2391y2.m13568a("Ipv4DataProvider: get IPv4 address");
        try {
            AbstractC2369t0.b bVarMo13274a = AbstractC2369t0.m13496a(okHttpClientProvider).mo13274a(str);
            if (bVarMo13274a.m13502c()) {
                String str3 = (String) bVarMo13274a.m13501b();
                if (TextUtils.isEmpty(str3)) {
                    str2 = "Ipv4DataProvider: empty response from server";
                } else {
                    String strOptString = new JSONObject(str3).optString("ip");
                    if (!TextUtils.isEmpty(strOptString)) {
                        AbstractC2391y2.m13568a("Ipv4DataProvider: IPv4 address is received " + strOptString);
                        this.f20169b = new C2389y0(InetAddress.getByName(strOptString).getAddress());
                        return;
                    }
                    str2 = "Ipv4DataProvider: IP is empty";
                }
            } else {
                str2 = "Ipv4DataProvider: unsuccessful response from server: " + bVarMo13274a.m13500a();
            }
            AbstractC2391y2.m13568a(str2);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Ipv4DataProvider: failed to get IPv4 address", th);
        }
    }

    /* renamed from: a */
    public C2389y0 m13580a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (!this.f20168a) {
            this.f20168a = true;
            AbstractC2340m.m13291b(new RunnableC8176Qp0(this, str, okHttpClientProvider, 27));
        }
        return this.f20169b;
    }
}
