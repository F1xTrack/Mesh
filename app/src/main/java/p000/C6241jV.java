package p000;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* renamed from: jV */
/* loaded from: classes.dex */
public final class C6241jV extends GA0 {

    /* renamed from: c */
    public static final C6989v4 f35161c = C6989v4.m25319d();

    /* renamed from: a */
    public final C8602Yu0 f35162a;

    /* renamed from: b */
    public final Context f35163b;

    public C6241jV(C8602Yu0 c8602Yu0, Context context) {
        this.f35163b = context;
        this.f35162a = c8602Yu0;
    }

    @Override // p000.GA0
    /* renamed from: a */
    public final boolean mo2939a() {
        C8602Yu0 c8602Yu0 = this.f35162a;
        String strM9414S = c8602Yu0.m9414S();
        boolean zIsEmpty = strM9414S == null ? true : strM9414S.trim().isEmpty();
        C6989v4 c6989v4 = f35161c;
        if (zIsEmpty) {
            c6989v4.m25324f();
            return false;
        }
        String strM9414S2 = c8602Yu0.m9414S();
        URI uriCreate = null;
        if (strM9414S2 != null) {
            try {
                uriCreate = URI.create(strM9414S2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                c6989v4.m25325g("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uriCreate == null) {
            c6989v4.m25324f();
            return false;
        }
        Context context = this.f35163b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            C6989v4.m25319d().m25320a();
            if (WZ1.f13264a == null) {
                WZ1.f13264a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                for (String str : WZ1.f13264a) {
                    if (!host.contains(str)) {
                    }
                }
                uriCreate.toString();
                c6989v4.m25324f();
                return false;
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            c6989v4.m25324f();
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            c6989v4.m25324f();
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            c6989v4.m25324f();
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            c6989v4.m25324f();
            return false;
        }
        int iM9406K = c8602Yu0.m9416U() ? c8602Yu0.m9406K() : 0;
        if (iM9406K == 0 || iM9406K == 1) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9417V() && c8602Yu0.m9407L() <= 0) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9418W() && c8602Yu0.m9409N() < 0) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9419X() && c8602Yu0.m9410O() < 0) {
            c6989v4.m25324f();
            return false;
        }
        if (!c8602Yu0.m9415T() || c8602Yu0.m9405I() <= 0) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9420Y() && c8602Yu0.m9411P() < 0) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9422a0() && c8602Yu0.m9413R() < 0) {
            c6989v4.m25324f();
            return false;
        }
        if (!c8602Yu0.m9421Z() || c8602Yu0.m9412Q() <= 0) {
            c6989v4.m25324f();
            return false;
        }
        if (c8602Yu0.m9417V()) {
            return true;
        }
        c6989v4.m25324f();
        return false;
    }
}
