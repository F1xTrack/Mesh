package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import io.appmetrica.analytics.network.impl.AbstractC5674e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Request {

    /* renamed from: a */
    private final String f33073a;

    /* renamed from: b */
    private final String f33074b;

    /* renamed from: c */
    private final byte[] f33075c;

    /* renamed from: d */
    private final Map f33076d;

    public static class Builder {

        /* renamed from: a */
        private final String f33077a;

        /* renamed from: b */
        private String f33078b;

        /* renamed from: c */
        private byte[] f33079c = new byte[0];

        /* renamed from: d */
        private final HashMap f33080d = new HashMap();

        public Builder(String str) {
            this.f33077a = str;
        }

        public Builder addHeader(String str, String str2) {
            this.f33080d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f33077a, this.f33078b, this.f33079c, this.f33080d, 0);
        }

        public Builder post(byte[] bArr) {
            this.f33079c = bArr;
            return withMethod("POST");
        }

        public Builder withMethod(String str) {
            this.f33078b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i) {
        this(str, str2, bArr, map);
    }

    public byte[] getBody() {
        return this.f33075c;
    }

    public Map<String, String> getHeaders() {
        return this.f33076d;
    }

    public String getMethod() {
        return this.f33074b;
    }

    public String getUrl() {
        return this.f33073a;
    }

    public String toString() {
        return "Request{url=" + this.f33073a + ", method='" + this.f33074b + "', bodyLength=" + this.f33075c.length + ", headers=" + this.f33076d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f33073a = str;
        this.f33074b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f33075c = bArr;
        this.f33076d = AbstractC5674e.m21289a(map);
    }
}
