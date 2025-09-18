package io.appmetrica.analytics.impl;

import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Sk */
/* loaded from: classes2.dex */
public final class C4812Sk implements NetworkResponseHandler {

    /* renamed from: a */
    public final C4980Zk f30749a;

    /* renamed from: b */
    public final C5287m3 f30750b;

    public C4812Sk() {
        this(new C4980Zk(), new C5287m3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5105el handle(ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC5182hn.m20513a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f30750b.m20696a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C4980Zk c4980Zk = this.f30749a;
                c4980Zk.getClass();
                C5105el c5105el = new C5105el();
                try {
                    c4980Zk.f31224i.getClass();
                    C4995ab c4995ab = new C4995ab(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c4995ab.optJSONObject(AnalyticsBaseParamsConstantsKt.DEVICE_ID);
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c5105el.f31621h = strOptString2;
                    c5105el.f31622i = strOptString;
                    c4980Zk.m20094a(c5105el, c4995ab);
                    c5105el.f31614a = 2;
                } catch (Throwable unused) {
                    c5105el = new C5105el();
                    c5105el.f31614a = 1;
                }
                if (2 == c5105el.f31614a) {
                    return c5105el;
                }
            }
        }
        return null;
    }

    public C4812Sk(C4980Zk c4980Zk, C5287m3 c5287m3) {
        this.f30749a = c4980Zk;
        this.f30750b = c5287m3;
    }
}
