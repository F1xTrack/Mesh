package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Nh implements W0, IPluginReporter {
    private final List<Jh> a = new ArrayList();
    private volatile W0 b;

    public class a implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(Nh nh, String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.d(this.a, this.b);
        }
    }

    public class b implements Jh {
        public b(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.sendEventsBuffer();
        }
    }

    public class c implements Jh {
        final /* synthetic */ C2996p7 a;

        public c(Nh nh, C2996p7 c2996p7) {
            this.a = c2996p7;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.a(this.a);
        }
    }

    public class d implements Jh {
        final /* synthetic */ String a;

        public d(Nh nh, String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportEvent(this.a);
        }
    }

    public class e implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public e(Nh nh, String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportEvent(this.a, this.b);
        }
    }

    public class f implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        public f(Nh nh, String str, Map map) {
            this.a = str;
            this.b = map;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportEvent(this.a, this.b);
        }
    }

    public class g implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ Throwable b;

        public g(Nh nh, String str, Throwable th) {
            this.a = str;
            this.b = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportError(this.a, this.b);
        }
    }

    public class h implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Throwable c;

        public h(Nh nh, String str, String str2, Throwable th) {
            this.a = str;
            this.b = str2;
            this.c = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportError(this.a, this.b, this.c);
        }
    }

    public class i implements Jh {
        final /* synthetic */ Throwable a;

        public i(Nh nh, Throwable th) {
            this.a = th;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportUnhandledException(this.a);
        }
    }

    public class j implements Jh {
        public j(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.resumeSession();
        }
    }

    public class k implements Jh {
        public k(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.pauseSession();
        }
    }

    public class l implements Jh {
        final /* synthetic */ String a;

        public l(Nh nh, String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.setUserProfileID(this.a);
        }
    }

    public class m implements Jh {
        final /* synthetic */ UserProfile a;

        public m(Nh nh, UserProfile userProfile) {
            this.a = userProfile;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportUserProfile(this.a);
        }
    }

    public class n implements Jh {
        final /* synthetic */ C2722e7 a;

        public n(Nh nh, C2722e7 c2722e7) {
            this.a = c2722e7;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.a(this.a);
        }
    }

    public class o implements Jh {
        final /* synthetic */ Revenue a;

        public o(Nh nh, Revenue revenue) {
            this.a = revenue;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportRevenue(this.a);
        }
    }

    public class p implements Jh {
        final /* synthetic */ ECommerceEvent a;

        public p(Nh nh, ECommerceEvent eCommerceEvent) {
            this.a = eCommerceEvent;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.reportECommerce(this.a);
        }
    }

    public class q implements Jh {
        final /* synthetic */ boolean a;

        public q(Nh nh, boolean z) {
            this.a = z;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.setStatisticsSending(this.a);
        }
    }

    public class r implements Jh {
        final /* synthetic */ PluginErrorDetails a;

        public r(Nh nh, PluginErrorDetails pluginErrorDetails) {
            this.a = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.getPluginExtension().reportUnhandledException(this.a);
        }
    }

    public class s implements Jh {
        final /* synthetic */ PluginErrorDetails a;
        final /* synthetic */ String b;

        public s(Nh nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.a = pluginErrorDetails;
            this.b = str;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.getPluginExtension().reportError(this.a, this.b);
        }
    }

    public class t implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ PluginErrorDetails c;

        public t(Nh nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.a = str;
            this.b = str2;
            this.c = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.getPluginExtension().reportError(this.a, this.b, this.c);
        }
    }

    public class u implements Jh {
        public u(Nh nh) {
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.b();
        }
    }

    public class v implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        public v(Nh nh, String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.a(this.a, this.b);
        }
    }

    public class w implements Jh {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public w(Nh nh, String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.yandex.metrica.impl.ob.Jh
        public void a(W0 w0) {
            w0.b(this.a, this.b);
        }
    }

    public synchronized void a(Context context) {
        try {
            this.b = C3030qg.a().a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Iterator<Jh> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(this.b);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void b() {
        a(new u(this));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void d(String str, String str2) {
        a(new a(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        a(new k(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        a(new p(this, eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        a(new g(this, str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        a(new d(this, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        a(new o(this, revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        a(new i(this, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        a(new m(this, userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        a(new j(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        a(new b(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        a(new q(this, z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        a(new l(this, str));
    }

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    public void b(String str, String str2) {
        a(new w(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        a(new h(this, str, str2, null));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        a(new e(this, str, str2));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        a(new r(this, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        a(new h(this, str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        a(new f(this, str, map));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        a(new s(this, pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2996p7 c2996p7) {
        a(new c(this, c2996p7));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        a(new t(this, str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2641b1
    public void a(C2722e7 c2722e7) {
        a(new n(this, c2722e7));
    }

    @Override // com.yandex.metrica.impl.ob.W0
    public void a(String str, JSONObject jSONObject) {
        a(new v(this, str, jSONObject));
    }

    private synchronized void a(Jh jh) {
        try {
            if (this.b == null) {
                this.a.add(jh);
            } else {
                jh.a(this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
