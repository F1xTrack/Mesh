package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fg */
/* loaded from: classes2.dex */
public final class C5125fg extends AbstractC5200ig {
    public C5125fg(C5139g5 c5139g5) {
        super(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        String value = c4821t5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C5482tn c5482tn = this.f31942a.f31743v;
            synchronized (c5482tn) {
                c5482tn.m21102c(c5482tn.m21099b() + 1);
            }
            if (!m20391a(jSONObject.optString("link"))) {
                return false;
            }
            c4821t5.f30774n = Boolean.TRUE;
            m20392b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m20392b() {
        C5482tn c5482tn = this.f31942a.f31743v;
        synchronized (c5482tn) {
            c5482tn.m21096a(c5482tn.m21095a() + 1);
        }
        this.f31942a.m20435z();
        C4561I8 c4561i8 = this.f31942a.f31734m;
        if (c4561i8.f30278c == null) {
            c4561i8.m19496a();
        }
        C4609K8 c4609k8 = c4561i8.f30278c;
        c4609k8.getClass();
        c4609k8.f30392b = new HashSet();
        c4609k8.f30394d = 0;
        C4609K8 c4609k82 = c4561i8.f30278c;
        c4609k82.f30391a = true;
        C4681N8 c4681n8 = c4561i8.f30277b;
        IBinaryDataHelper iBinaryDataHelper = c4681n8.f30506c;
        C4657M8 c4657m8 = c4681n8.f30505b;
        c4681n8.f30504a.getClass();
        C5393q9 c5393q9M19595a = C4633L8.m19595a(c4609k82);
        c4657m8.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c5393q9M19595a));
    }

    /* renamed from: a */
    public final boolean m20391a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C5286m2 c5286m2 = this.f31942a.m20429t().f31807z;
                    for (String str2 : queryParameter.split(ContainerUtils.FIELD_DELIMITER)) {
                        int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (iIndexOf >= 0 && m20390a(Uri.decode(str2.substring(0, iIndexOf)), Uri.decode(str2.substring(iIndexOf + 1)), c5286m2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m20390a(String str, String str2, C5286m2 c5286m2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c5286m2 == null) {
            return false;
        }
        for (Pair pair : c5286m2.f32164a) {
            if (AbstractC5182hn.m20512a(pair.first, str) && ((obj = pair.second) == null || ((C5261l2) obj).f32118a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
