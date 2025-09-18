package io.appmetrica.analytics.networktasks.internal;

import org.json.JSONObject;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class DefaultResponseParser {

    public static class Response {
        public final String mStatus;

        public Response(String str) {
            this.mStatus = str;
        }

        public String toString() {
            return AbstractC1374Vq.m8593l(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    return new Response(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
