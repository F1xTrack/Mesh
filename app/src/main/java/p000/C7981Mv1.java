package p000;

import android.app.Application;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.HostInfoProvider;
import com.p019vk.push.common.ads.PushAdsProvider;
import com.p019vk.push.common.clientid.ClientIdCallback;
import java.util.List;

/* renamed from: Mv1 */
/* loaded from: classes2.dex */
public final class C7981Mv1 {

    /* renamed from: a */
    public final Application f7395a;

    /* renamed from: b */
    public final String f7396b;

    /* renamed from: c */
    public final ClientIdCallback f7397c;

    /* renamed from: d */
    public final C4042fG f7398d;

    /* renamed from: e */
    public final HostInfoProvider f7399e;

    /* renamed from: f */
    public final HostInfoProvider f7400f;

    /* renamed from: g */
    public final AppInfo f7401g;

    /* renamed from: h */
    public final List f7402h;

    /* renamed from: i */
    public final boolean f7403i;

    /* renamed from: j */
    public final String f7404j;

    /* renamed from: k */
    public final PushAdsProvider f7405k;

    public C7981Mv1(Application application, String str, ClientIdCallback clientIdCallback, C4042fG c4042fG, HostInfoProvider hostInfoProvider, HostInfoProvider hostInfoProvider2, AppInfo appInfo, List list, boolean z, String str2, PushAdsProvider pushAdsProvider) {
        O90.m5968f(c4042fG, "logger");
        O90.m5968f(appInfo, "default");
        this.f7395a = application;
        this.f7396b = str;
        this.f7397c = clientIdCallback;
        this.f7398d = c4042fG;
        this.f7399e = hostInfoProvider;
        this.f7400f = hostInfoProvider2;
        this.f7401g = appInfo;
        this.f7402h = list;
        this.f7403i = z;
        this.f7404j = str2;
        this.f7405k = pushAdsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.vk.push.common.HostInfoProvider] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.vk.push.common.HostInfoProvider] */
    /* renamed from: a */
    public static C7981Mv1 m5478a(C7981Mv1 c7981Mv1, C7295zw c7295zw, C1339VH c1339vh, AppInfo appInfo, List list, int i) {
        Application application = c7981Mv1.f7395a;
        C7295zw c7295zw2 = (i & 64) != 0 ? c7981Mv1.f7399e : c7295zw;
        C1339VH c1339vh2 = (i & 128) != 0 ? c7981Mv1.f7400f : c1339vh;
        AppInfo appInfo2 = (i & 256) != 0 ? c7981Mv1.f7401g : appInfo;
        List list2 = (i & 512) != 0 ? c7981Mv1.f7402h : list;
        String str = c7981Mv1.f7396b;
        C4042fG c4042fG = c7981Mv1.f7398d;
        O90.m5968f(c4042fG, "logger");
        O90.m5968f(appInfo2, "default");
        O90.m5968f(list2, "providers");
        return new C7981Mv1(application, str, c7981Mv1.f7397c, c4042fG, c7295zw2, c1339vh2, appInfo2, list2, c7981Mv1.f7403i, c7981Mv1.f7404j, c7981Mv1.f7405k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7981Mv1)) {
            return false;
        }
        C7981Mv1 c7981Mv1 = (C7981Mv1) obj;
        if (!this.f7395a.equals(c7981Mv1.f7395a) || !this.f7396b.equals(c7981Mv1.f7396b) || !O90.m5963a(this.f7397c, c7981Mv1.f7397c) || !O90.m5963a(this.f7398d, c7981Mv1.f7398d)) {
            return false;
        }
        C0779MN c0779mn = C0779MN.f7117a;
        return c0779mn.equals(c0779mn) && c0779mn.equals(c0779mn) && O90.m5963a(this.f7399e, c7981Mv1.f7399e) && O90.m5963a(this.f7400f, c7981Mv1.f7400f) && O90.m5963a(this.f7401g, c7981Mv1.f7401g) && this.f7402h.equals(c7981Mv1.f7402h) && this.f7403i == c7981Mv1.f7403i && this.f7404j.equals(c7981Mv1.f7404j) && O90.m5963a(this.f7405k, c7981Mv1.f7405k);
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(this.f7395a.hashCode() * 31, 31, this.f7396b);
        ClientIdCallback clientIdCallback = this.f7397c;
        int iHashCode = (((((this.f7398d.hashCode() + ((iM8586e + (clientIdCallback == null ? 0 : clientIdCallback.hashCode())) * 31)) * 31) + 1) * 31) + 1) * 31;
        HostInfoProvider hostInfoProvider = this.f7399e;
        int iHashCode2 = (iHashCode + (hostInfoProvider == null ? 0 : hostInfoProvider.hashCode())) * 31;
        HostInfoProvider hostInfoProvider2 = this.f7400f;
        int iHashCode3 = (this.f7402h.hashCode() + ((this.f7401g.hashCode() + ((iHashCode2 + (hostInfoProvider2 == null ? 0 : hostInfoProvider2.hashCode())) * 31)) * 31)) * 31;
        boolean z = this.f7403i;
        int iM8586e2 = AbstractC1374Vq.m8586e((iHashCode3 + (z ? 1 : z ? 1 : 0)) * 31, 31, this.f7404j);
        PushAdsProvider pushAdsProvider = this.f7405k;
        return iM8586e2 + (pushAdsProvider != null ? pushAdsProvider.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsConfig(application=");
        sb.append(this.f7395a);
        sb.append(", projectId=");
        sb.append(this.f7396b);
        sb.append(", clientIdCallback=");
        sb.append(this.f7397c);
        sb.append(", logger=");
        sb.append(this.f7398d);
        sb.append(", additionalAuthProviders=");
        C0779MN c0779mn = C0779MN.f7117a;
        sb.append(c0779mn);
        sb.append(", additionalPushProviders=");
        sb.append(c0779mn);
        sb.append(", hostInfoProvider=");
        sb.append(this.f7399e);
        sb.append(", topicHostInfoProvider=");
        sb.append(this.f7400f);
        sb.append(", default=");
        sb.append(this.f7401g);
        sb.append(", providers=");
        sb.append(this.f7402h);
        sb.append(", testModeEnabled=");
        sb.append(this.f7403i);
        sb.append(", sdkType=");
        sb.append(this.f7404j);
        sb.append(", pushAdsProvider=");
        sb.append(this.f7405k);
        sb.append(')');
        return sb.toString();
    }
}
