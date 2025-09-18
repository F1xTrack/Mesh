package io.appmetrica.analytics.impl;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Sk implements NetworkResponseHandler {
    public final Zk a;
    public final C4708m3 b;

    public Sk() {
        this(new Zk(), new C4708m3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4535el handle(ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!hn.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Zk zk = this.a;
                zk.getClass();
                C4535el c4535el = new C4535el();
                try {
                    zk.i.getClass();
                    C4425ab c4425ab = new C4425ab(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c4425ab.optJSONObject(AnalyticsBaseParamsConstantsKt.DEVICE_ID);
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c4535el.h = strOptString2;
                    c4535el.i = strOptString;
                    zk.a(c4535el, c4425ab);
                    c4535el.a = 2;
                } catch (Throwable unused) {
                    c4535el = new C4535el();
                    c4535el.a = 1;
                }
                if (2 == c4535el.a) {
                    return c4535el;
                }
            }
        }
        return null;
    }

    public Sk(Zk zk, C4708m3 c4708m3) {
        this.a = zk;
        this.b = c4708m3;
    }
}
