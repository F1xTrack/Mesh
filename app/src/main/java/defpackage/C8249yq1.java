package defpackage;

import com.vk.push.common.AppInfo;
import com.vk.push.core.push.RegisterForPushesResult;

/* renamed from: yq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8249yq1 {
    public final RegisterForPushesResult a;
    public final AppInfo b;

    public C8249yq1(RegisterForPushesResult registerForPushesResult, AppInfo appInfo) {
        O90.f(appInfo, "host");
        this.a = registerForPushesResult;
        this.b = appInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8249yq1)) {
            return false;
        }
        C8249yq1 c8249yq1 = (C8249yq1) obj;
        return this.a == c8249yq1.a && O90.a(this.b, c8249yq1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterResult(innerResult=" + this.a + ", host=" + this.b + ')';
    }
}
