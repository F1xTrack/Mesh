package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import p000.C6937uF;
import p000.HS0;
import p000.IS0;

/* renamed from: com.my.tracker.obfuscated.k1 */
/* loaded from: classes2.dex */
public final class C2334k1 extends AbstractC2369t0 {

    /* renamed from: a */
    final MyTrackerConfig.OkHttpClientProvider f20007a;

    public C2334k1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f20007a = okHttpClientProvider;
    }

    @Override // com.p018my.tracker.obfuscated.AbstractC2369t0
    /* renamed from: a */
    public AbstractC2369t0.b mo13274a(String str) {
        HS0 hs0M1670h;
        AbstractC2369t0.b bVarM13499d = AbstractC2369t0.b.m13499d();
        HS0 hs0 = null;
        hs0 = null;
        try {
            AbstractC2391y2.m13568a("OkHttpGetRequest: send request to " + str);
            C6937uF c6937uF = new C6937uF(9, false);
            c6937uF.m25136G(str);
            try {
                c6937uF.m25130A("GET", null);
                hs0M1670h = this.f20007a.getOkHttpClient().m23580b(c6937uF.m25141o()).m1670h();
                try {
                    int i = hs0M1670h.f4298d;
                    if (i == 200) {
                        AbstractC2391y2.m13568a("OkHttpGetRequest: response successfully received");
                        bVarM13499d.f20123a = true;
                    } else {
                        AbstractC2391y2.m13568a("OkHttpGetRequest error: response code " + i);
                        bVarM13499d.f20123a = false;
                    }
                    if (i == 200) {
                        AbstractC2391y2.m13568a("OkHttpGetRequest: processing server response");
                        IS0 is0 = hs0M1670h.f4301g;
                        String strM3878x = is0 != null ? is0.m3878x() : null;
                        if (TextUtils.isEmpty(strM3878x)) {
                            AbstractC2391y2.m13568a("OkHttpGetRequest: response data is empty");
                        } else {
                            bVarM13499d.f20124b = strM3878x;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    hs0 = hs0M1670h;
                    try {
                        AbstractC2391y2.m13569a("OkHttpGetRequest error: error while sending data", th);
                        bVarM13499d.f20123a = false;
                        bVarM13499d.f20125c = "OkHttpGetRequest error: error while sending data";
                        if (hs0 != null) {
                            hs0M1670h = hs0;
                            hs0M1670h.close();
                        }
                        return bVarM13499d;
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
        hs0M1670h.close();
        return bVarM13499d;
    }
}
