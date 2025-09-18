package com.my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class z {
    private final f0 a;

    private z(f0 f0Var) {
        this.a = f0Var;
    }

    public String a(Intent intent) {
        y2.a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            y2.a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                y2.a("DeeplinkHandler: intent data is null");
                return null;
            }
            y2.a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                y2.a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                y2.a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            y2.a("DeeplinkHandler: deeplink " + queryParameter);
            y2.a("DeeplinkHandler: clickId " + queryParameter2);
            this.a.a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            y2.b("DeeplinkHandler error: ", th);
            return null;
        }
    }

    public static z a(f0 f0Var) {
        return new z(f0Var);
    }
}
