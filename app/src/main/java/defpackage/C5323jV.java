package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* renamed from: jV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5323jV extends GA0 {
    public static final C7533v4 c = C7533v4.d();
    public final C1952Yu0 a;
    public final Context b;

    public C5323jV(C1952Yu0 c1952Yu0, Context context) {
        this.b = context;
        this.a = c1952Yu0;
    }

    @Override // defpackage.GA0
    public final boolean a() {
        C1952Yu0 c1952Yu0 = this.a;
        String strS = c1952Yu0.S();
        boolean zIsEmpty = strS == null ? true : strS.trim().isEmpty();
        C7533v4 c7533v4 = c;
        if (zIsEmpty) {
            c7533v4.f();
            return false;
        }
        String strS2 = c1952Yu0.S();
        URI uriCreate = null;
        if (strS2 != null) {
            try {
                uriCreate = URI.create(strS2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                c7533v4.g("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uriCreate == null) {
            c7533v4.f();
            return false;
        }
        Context context = this.b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            C7533v4.d().a();
            if (WZ1.a == null) {
                WZ1.a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                for (String str : WZ1.a) {
                    if (!host.contains(str)) {
                    }
                }
                uriCreate.toString();
                c7533v4.f();
                return false;
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            c7533v4.f();
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            c7533v4.f();
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            c7533v4.f();
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            c7533v4.f();
            return false;
        }
        int iK = c1952Yu0.U() ? c1952Yu0.K() : 0;
        if (iK == 0 || iK == 1) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.V() && c1952Yu0.L() <= 0) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.W() && c1952Yu0.N() < 0) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.X() && c1952Yu0.O() < 0) {
            c7533v4.f();
            return false;
        }
        if (!c1952Yu0.T() || c1952Yu0.I() <= 0) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.Y() && c1952Yu0.P() < 0) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.a0() && c1952Yu0.R() < 0) {
            c7533v4.f();
            return false;
        }
        if (!c1952Yu0.Z() || c1952Yu0.Q() <= 0) {
            c7533v4.f();
            return false;
        }
        if (c1952Yu0.V()) {
            return true;
        }
        c7533v4.f();
        return false;
    }
}
