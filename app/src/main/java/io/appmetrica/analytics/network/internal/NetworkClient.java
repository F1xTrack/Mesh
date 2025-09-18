package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.C5672c;
import io.appmetrica.analytics.network.impl.C5673d;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class NetworkClient {

    /* renamed from: a */
    private final Integer f33061a;

    /* renamed from: b */
    private final Integer f33062b;

    /* renamed from: c */
    private final SSLSocketFactory f33063c;

    /* renamed from: d */
    private final Boolean f33064d;

    /* renamed from: e */
    private final Boolean f33065e;

    /* renamed from: f */
    private final int f33066f;

    public static class Builder {

        /* renamed from: a */
        private Integer f33067a;

        /* renamed from: b */
        private Integer f33068b;

        /* renamed from: c */
        private SSLSocketFactory f33069c;

        /* renamed from: d */
        private Boolean f33070d;

        /* renamed from: e */
        private Boolean f33071e;

        /* renamed from: f */
        private Integer f33072f;

        public NetworkClient build() {
            return new NetworkClient(this.f33067a, this.f33068b, this.f33069c, this.f33070d, this.f33071e, this.f33072f, 0);
        }

        public Builder withConnectTimeout(int i) {
            this.f33067a = Integer.valueOf(i);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z) {
            this.f33071e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxResponseSize(int i) {
            this.f33072f = Integer.valueOf(i);
            return this;
        }

        public Builder withReadTimeout(int i) {
            this.f33068b = Integer.valueOf(i);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f33069c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z) {
            this.f33070d = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f33061a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f33065e;
    }

    public int getMaxResponseSize() {
        return this.f33066f;
    }

    public Integer getReadTimeout() {
        return this.f33062b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f33063c;
    }

    public Boolean getUseCaches() {
        return this.f33064d;
    }

    public Call newCall(Request request) {
        return new C5672c(this, request, new C5673d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkClient{connectTimeout=");
        sb.append(this.f33061a);
        sb.append(", readTimeout=");
        sb.append(this.f33062b);
        sb.append(", sslSocketFactory=");
        sb.append(this.f33063c);
        sb.append(", useCaches=");
        sb.append(this.f33064d);
        sb.append(", instanceFollowRedirects=");
        sb.append(this.f33065e);
        sb.append(", maxResponseSize=");
        return AbstractC7222ym.m26235l(sb, this.f33066f, '}');
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f33061a = num;
        this.f33062b = num2;
        this.f33063c = sSLSocketFactory;
        this.f33064d = bool;
        this.f33065e = bool2;
        this.f33066f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
