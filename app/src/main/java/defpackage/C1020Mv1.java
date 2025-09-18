package defpackage;

import android.app.Application;
import com.vk.push.common.AppInfo;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.ads.PushAdsProvider;
import com.vk.push.common.clientid.ClientIdCallback;
import java.util.List;

/* renamed from: Mv1 */
/* loaded from: classes2.dex */
public final class C1020Mv1 {
    public final Application a;
    public final String b;
    public final ClientIdCallback c;
    public final C3738fG d;
    public final HostInfoProvider e;
    public final HostInfoProvider f;
    public final AppInfo g;
    public final List h;
    public final boolean i;
    public final String j;
    public final PushAdsProvider k;

    public C1020Mv1(Application application, String str, ClientIdCallback clientIdCallback, C3738fG c3738fG, HostInfoProvider hostInfoProvider, HostInfoProvider hostInfoProvider2, AppInfo appInfo, List list, boolean z, String str2, PushAdsProvider pushAdsProvider) {
        O90.f(c3738fG, "logger");
        O90.f(appInfo, "default");
        this.a = application;
        this.b = str;
        this.c = clientIdCallback;
        this.d = c3738fG;
        this.e = hostInfoProvider;
        this.f = hostInfoProvider2;
        this.g = appInfo;
        this.h = list;
        this.i = z;
        this.j = str2;
        this.k = pushAdsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.vk.push.common.HostInfoProvider] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.vk.push.common.HostInfoProvider] */
    public static C1020Mv1 a(C1020Mv1 c1020Mv1, C8455zw c8455zw, VH vh, AppInfo appInfo, List list, int i) {
        Application application = c1020Mv1.a;
        C8455zw c8455zw2 = (i & 64) != 0 ? c1020Mv1.e : c8455zw;
        VH vh2 = (i & 128) != 0 ? c1020Mv1.f : vh;
        AppInfo appInfo2 = (i & 256) != 0 ? c1020Mv1.g : appInfo;
        List list2 = (i & 512) != 0 ? c1020Mv1.h : list;
        String str = c1020Mv1.b;
        C3738fG c3738fG = c1020Mv1.d;
        O90.f(c3738fG, "logger");
        O90.f(appInfo2, "default");
        O90.f(list2, "providers");
        return new C1020Mv1(application, str, c1020Mv1.c, c3738fG, c8455zw2, vh2, appInfo2, list2, c1020Mv1.i, c1020Mv1.j, c1020Mv1.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020Mv1)) {
            return false;
        }
        C1020Mv1 c1020Mv1 = (C1020Mv1) obj;
        if (!this.a.equals(c1020Mv1.a) || !this.b.equals(c1020Mv1.b) || !O90.a(this.c, c1020Mv1.c) || !O90.a(this.d, c1020Mv1.d)) {
            return false;
        }
        MN mn = MN.a;
        return mn.equals(mn) && mn.equals(mn) && O90.a(this.e, c1020Mv1.e) && O90.a(this.f, c1020Mv1.f) && O90.a(this.g, c1020Mv1.g) && this.h.equals(c1020Mv1.h) && this.i == c1020Mv1.i && this.j.equals(c1020Mv1.j) && O90.a(this.k, c1020Mv1.k);
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b);
        ClientIdCallback clientIdCallback = this.c;
        int iHashCode = (((((this.d.hashCode() + ((iE + (clientIdCallback == null ? 0 : clientIdCallback.hashCode())) * 31)) * 31) + 1) * 31) + 1) * 31;
        HostInfoProvider hostInfoProvider = this.e;
        int iHashCode2 = (iHashCode + (hostInfoProvider == null ? 0 : hostInfoProvider.hashCode())) * 31;
        HostInfoProvider hostInfoProvider2 = this.f;
        int iHashCode3 = (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode2 + (hostInfoProvider2 == null ? 0 : hostInfoProvider2.hashCode())) * 31)) * 31)) * 31;
        boolean z = this.i;
        int iE2 = AbstractC1705Vq.e((iHashCode3 + (z ? 1 : z ? 1 : 0)) * 31, 31, this.j);
        PushAdsProvider pushAdsProvider = this.k;
        return iE2 + (pushAdsProvider != null ? pushAdsProvider.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsConfig(application=");
        sb.append(this.a);
        sb.append(", projectId=");
        sb.append(this.b);
        sb.append(", clientIdCallback=");
        sb.append(this.c);
        sb.append(", logger=");
        sb.append(this.d);
        sb.append(", additionalAuthProviders=");
        MN mn = MN.a;
        sb.append(mn);
        sb.append(", additionalPushProviders=");
        sb.append(mn);
        sb.append(", hostInfoProvider=");
        sb.append(this.e);
        sb.append(", topicHostInfoProvider=");
        sb.append(this.f);
        sb.append(", default=");
        sb.append(this.g);
        sb.append(", providers=");
        sb.append(this.h);
        sb.append(", testModeEnabled=");
        sb.append(this.i);
        sb.append(", sdkType=");
        sb.append(this.j);
        sb.append(", pushAdsProvider=");
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }
}
