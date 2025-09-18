package p000;

import com.p019vk.push.common.AppInfo;
import com.p019vk.push.core.push.RegisterForPushesResult;

/* renamed from: yq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11849yq1 {

    /* renamed from: a */
    public final RegisterForPushesResult f46507a;

    /* renamed from: b */
    public final AppInfo f46508b;

    public C11849yq1(RegisterForPushesResult registerForPushesResult, AppInfo appInfo) {
        O90.m5968f(appInfo, "host");
        this.f46507a = registerForPushesResult;
        this.f46508b = appInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11849yq1)) {
            return false;
        }
        C11849yq1 c11849yq1 = (C11849yq1) obj;
        return this.f46507a == c11849yq1.f46507a && O90.m5963a(this.f46508b, c11849yq1.f46508b);
    }

    public final int hashCode() {
        return this.f46508b.hashCode() + (this.f46507a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterResult(innerResult=" + this.f46507a + ", host=" + this.f46508b + ')';
    }
}
