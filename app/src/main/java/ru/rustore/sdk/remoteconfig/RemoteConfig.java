package ru.rustore.sdk.remoteconfig;

import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC7222ym;
import p000.B51;
import p000.C11669xQ0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m22267d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfig;", "", "", "", "data", "Ljava/util/Map;", "sdk-public-remoteconfig_release"}, m22268k = 1, m22269mv = {1, 7, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RemoteConfig {
    private final Map<String, String> data;

    public RemoteConfig(Map map) {
        this.data = map;
    }

    /* renamed from: a */
    public final boolean m24540a(String str) {
        O90.m5968f(str, "key");
        return this.data.containsKey(str);
    }

    /* renamed from: b */
    public final boolean m24541b(String str) throws C11669xQ0 {
        O90.m5968f(str, "key");
        Map<String, String> map = this.data;
        O90.m5968f(map, "<this>");
        String str2 = map.get(str);
        if (O90.m5963a(str2, "true")) {
            return true;
        }
        if (O90.m5963a(str2, "false")) {
            return false;
        }
        throw new C11669xQ0("error getting the value by key: (" + str + ") as Boolean: (" + str2 + ')');
    }

    /* renamed from: c */
    public final double m24542c(String str) throws C11669xQ0 {
        O90.m5968f(str, "key");
        Map<String, String> map = this.data;
        O90.m5968f(map, "<this>");
        String str2 = map.get(str);
        Double dM491e = str2 != null ? B51.m491e(str2) : null;
        if (dM491e != null) {
            return dM491e.doubleValue();
        }
        throw new C11669xQ0("error getting the value by key: (" + str + ") as Double: (" + str2 + ')');
    }

    /* renamed from: d */
    public final String m24543d(String str) throws C11669xQ0 {
        O90.m5968f(str, "key");
        Map<String, String> map = this.data;
        O90.m5968f(map, "<this>");
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new C11669xQ0(AbstractC7222ym.m26234k("error getting the value by key: (", str, ") as String"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RemoteConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type ru.rustore.sdk.remoteconfig.RemoteConfig");
        return O90.m5963a(this.data, ((RemoteConfig) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }
}
