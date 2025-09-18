package io.appmetrica.analytics;

import java.util.Objects;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public final class StartupParamsItem {

    /* renamed from: a */
    private final String f29542a;

    /* renamed from: b */
    private final StartupParamsItemStatus f29543b;

    /* renamed from: c */
    private final String f29544c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f29542a = str;
        this.f29543b = startupParamsItemStatus;
        this.f29544c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f29542a, startupParamsItem.f29542a) && this.f29543b == startupParamsItem.f29543b && Objects.equals(this.f29544c, startupParamsItem.f29544c);
    }

    public String getErrorDetails() {
        return this.f29544c;
    }

    public String getId() {
        return this.f29542a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f29543b;
    }

    public int hashCode() {
        return Objects.hash(this.f29542a, this.f29543b, this.f29544c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f29542a);
        sb.append("', status=");
        sb.append(this.f29543b);
        sb.append(", errorDetails='");
        return AbstractC1374Vq.m8593l(sb, this.f29544c, "'}");
    }
}
