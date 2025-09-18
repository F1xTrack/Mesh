package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.t0;
import defpackage.RunnableC1313Qp0;
import java.net.InetAddress;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z0 {
    boolean a = false;
    private y0 b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String str2;
        y2.a("Ipv4DataProvider: get IPv4 address");
        try {
            t0.b bVarA = t0.a(okHttpClientProvider).a(str);
            if (bVarA.c()) {
                String str3 = (String) bVarA.b();
                if (TextUtils.isEmpty(str3)) {
                    str2 = "Ipv4DataProvider: empty response from server";
                } else {
                    String strOptString = new JSONObject(str3).optString("ip");
                    if (!TextUtils.isEmpty(strOptString)) {
                        y2.a("Ipv4DataProvider: IPv4 address is received " + strOptString);
                        this.b = new y0(InetAddress.getByName(strOptString).getAddress());
                        return;
                    }
                    str2 = "Ipv4DataProvider: IP is empty";
                }
            } else {
                str2 = "Ipv4DataProvider: unsuccessful response from server: " + bVarA.a();
            }
            y2.a(str2);
        } catch (Throwable th) {
            y2.b("Ipv4DataProvider: failed to get IPv4 address", th);
        }
    }

    public y0 a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (!this.a) {
            this.a = true;
            m.b(new RunnableC1313Qp0(this, str, okHttpClientProvider, 27));
        }
        return this.b;
    }
}
