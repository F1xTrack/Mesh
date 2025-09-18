package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.t0;
import defpackage.C7375uF;
import defpackage.HS0;
import defpackage.IS0;

/* loaded from: classes2.dex */
public final class k1 extends t0 {
    final MyTrackerConfig.OkHttpClientProvider a;

    public k1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.a = okHttpClientProvider;
    }

    @Override // com.my.tracker.obfuscated.t0
    public t0.b a(String str) {
        HS0 hs0H;
        t0.b bVarD = t0.b.d();
        HS0 hs0 = null;
        hs0 = null;
        try {
            y2.a("OkHttpGetRequest: send request to " + str);
            C7375uF c7375uF = new C7375uF(9, false);
            c7375uF.G(str);
            try {
                c7375uF.A("GET", null);
                hs0H = this.a.getOkHttpClient().b(c7375uF.o()).h();
                try {
                    int i = hs0H.d;
                    if (i == 200) {
                        y2.a("OkHttpGetRequest: response successfully received");
                        bVarD.a = true;
                    } else {
                        y2.a("OkHttpGetRequest error: response code " + i);
                        bVarD.a = false;
                    }
                    if (i == 200) {
                        y2.a("OkHttpGetRequest: processing server response");
                        IS0 is0 = hs0H.g;
                        String strX = is0 != null ? is0.x() : null;
                        if (TextUtils.isEmpty(strX)) {
                            y2.a("OkHttpGetRequest: response data is empty");
                        } else {
                            bVarD.b = strX;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    hs0 = hs0H;
                    try {
                        y2.a("OkHttpGetRequest error: error while sending data", th);
                        bVarD.a = false;
                        bVarD.c = "OkHttpGetRequest error: error while sending data";
                        if (hs0 != null) {
                            hs0H = hs0;
                            hs0H.close();
                        }
                        return bVarD;
                    } catch (Throwable th2) {
                        if (hs0 != null) {
                            hs0.close();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        hs0H.close();
        return bVarD;
    }
}
