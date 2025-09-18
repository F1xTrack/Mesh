package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.ContainerUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fg */
/* loaded from: classes2.dex */
public final class C4554fg extends AbstractC4625ig {
    public C4554fg(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        String value = t5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            tn tnVar = this.a.v;
            synchronized (tnVar) {
                tnVar.c(tnVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            t5.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        tn tnVar = this.a.v;
        synchronized (tnVar) {
            tnVar.a(tnVar.a() + 1);
        }
        this.a.z();
        I8 i8 = this.a.m;
        if (i8.c == null) {
            i8.a();
        }
        K8 k8 = i8.c;
        k8.getClass();
        k8.b = new HashSet();
        k8.d = 0;
        K8 k82 = i8.c;
        k82.a = true;
        N8 n8 = i8.b;
        IBinaryDataHelper iBinaryDataHelper = n8.c;
        M8 m8 = n8.b;
        n8.a.getClass();
        C4810q9 c4810q9A = L8.a(k82);
        m8.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c4810q9A));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C4707m2 c4707m2 = this.a.t().z;
                    for (String str2 : queryParameter.split(ContainerUtils.FIELD_DELIMITER)) {
                        int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (iIndexOf >= 0 && a(Uri.decode(str2.substring(0, iIndexOf)), Uri.decode(str2.substring(iIndexOf + 1)), c4707m2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C4707m2 c4707m2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c4707m2 == null) {
            return false;
        }
        for (Pair pair : c4707m2.a) {
            if (hn.a(pair.first, str) && ((obj = pair.second) == null || ((C4683l2) obj).a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
