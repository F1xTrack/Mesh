package com.yandex.metrica.impl.p022ob;

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

/* renamed from: com.yandex.metrica.impl.ob.Nh */
/* loaded from: classes2.dex */
public class C2809Nh implements InterfaceC3016W0, IPluginReporter {

    /* renamed from: a */
    private final List<InterfaceC2709Jh> f21781a = new ArrayList();

    /* renamed from: b */
    private volatile InterfaceC3016W0 f21782b;

    /* renamed from: com.yandex.metrica.impl.ob.Nh$a */
    public class a implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21783a;

        /* renamed from: b */
        final /* synthetic */ String f21784b;

        public a(C2809Nh c2809Nh, String str, String str2) {
            this.f21783a = str;
            this.f21784b = str2;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo13935d(this.f21783a, this.f21784b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$b */
    public class b implements InterfaceC2709Jh {
        public b(C2809Nh c2809Nh) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$c */
    public class c implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ C3513p7 f21785a;

        public c(C2809Nh c2809Nh, C3513p7 c3513p7) {
            this.f21785a = c3513p7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo14377a(this.f21785a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$d */
    public class d implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21786a;

        public d(C2809Nh c2809Nh, String str) {
            this.f21786a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportEvent(this.f21786a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$e */
    public class e implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21787a;

        /* renamed from: b */
        final /* synthetic */ String f21788b;

        public e(C2809Nh c2809Nh, String str, String str2) {
            this.f21787a = str;
            this.f21788b = str2;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportEvent(this.f21787a, this.f21788b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$f */
    public class f implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21789a;

        /* renamed from: b */
        final /* synthetic */ Map f21790b;

        public f(C2809Nh c2809Nh, String str, Map map) {
            this.f21789a = str;
            this.f21790b = map;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportEvent(this.f21789a, this.f21790b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$g */
    public class g implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21791a;

        /* renamed from: b */
        final /* synthetic */ Throwable f21792b;

        public g(C2809Nh c2809Nh, String str, Throwable th) {
            this.f21791a = str;
            this.f21792b = th;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportError(this.f21791a, this.f21792b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$h */
    public class h implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21793a;

        /* renamed from: b */
        final /* synthetic */ String f21794b;

        /* renamed from: c */
        final /* synthetic */ Throwable f21795c;

        public h(C2809Nh c2809Nh, String str, String str2, Throwable th) {
            this.f21793a = str;
            this.f21794b = str2;
            this.f21795c = th;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportError(this.f21793a, this.f21794b, this.f21795c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$i */
    public class i implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ Throwable f21796a;

        public i(C2809Nh c2809Nh, Throwable th) {
            this.f21796a = th;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportUnhandledException(this.f21796a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$j */
    public class j implements InterfaceC2709Jh {
        public j(C2809Nh c2809Nh) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$k */
    public class k implements InterfaceC2709Jh {
        public k(C2809Nh c2809Nh) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$l */
    public class l implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21797a;

        public l(C2809Nh c2809Nh, String str) {
            this.f21797a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.setUserProfileID(this.f21797a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$m */
    public class m implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ UserProfile f21798a;

        public m(C2809Nh c2809Nh, UserProfile userProfile) {
            this.f21798a = userProfile;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportUserProfile(this.f21798a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$n */
    public class n implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ C3227e7 f21799a;

        public n(C2809Nh c2809Nh, C3227e7 c3227e7) {
            this.f21799a = c3227e7;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo14375a(this.f21799a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$o */
    public class o implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ Revenue f21800a;

        public o(C2809Nh c2809Nh, Revenue revenue) {
            this.f21800a = revenue;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportRevenue(this.f21800a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$p */
    public class p implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f21801a;

        public p(C2809Nh c2809Nh, ECommerceEvent eCommerceEvent) {
            this.f21801a = eCommerceEvent;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.reportECommerce(this.f21801a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$q */
    public class q implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ boolean f21802a;

        public q(C2809Nh c2809Nh, boolean z) {
            this.f21802a = z;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.setStatisticsSending(this.f21802a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$r */
    public class r implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f21803a;

        public r(C2809Nh c2809Nh, PluginErrorDetails pluginErrorDetails) {
            this.f21803a = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.getPluginExtension().reportUnhandledException(this.f21803a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$s */
    public class s implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f21804a;

        /* renamed from: b */
        final /* synthetic */ String f21805b;

        public s(C2809Nh c2809Nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.f21804a = pluginErrorDetails;
            this.f21805b = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.getPluginExtension().reportError(this.f21804a, this.f21805b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$t */
    public class t implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21806a;

        /* renamed from: b */
        final /* synthetic */ String f21807b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f21808c;

        public t(C2809Nh c2809Nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f21806a = str;
            this.f21807b = str2;
            this.f21808c = pluginErrorDetails;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.getPluginExtension().reportError(this.f21806a, this.f21807b, this.f21808c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$u */
    public class u implements InterfaceC2709Jh {
        public u(C2809Nh c2809Nh) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo14381b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$v */
    public class v implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21809a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f21810b;

        public v(C2809Nh c2809Nh, String str, JSONObject jSONObject) {
            this.f21809a = str;
            this.f21810b = jSONObject;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo14379a(this.f21809a, this.f21810b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$w */
    public class w implements InterfaceC2709Jh {

        /* renamed from: a */
        final /* synthetic */ String f21811a;

        /* renamed from: b */
        final /* synthetic */ String f21812b;

        public w(C2809Nh c2809Nh, String str, String str2) {
            this.f21811a = str;
            this.f21812b = str2;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2709Jh
        /* renamed from: a */
        public void mo14444a(InterfaceC3016W0 interfaceC3016W0) {
            interfaceC3016W0.mo13934b(this.f21811a, this.f21812b);
        }
    }

    /* renamed from: a */
    public synchronized void m14648a(Context context) {
        try {
            this.f21782b = C3548qg.m16620a().m16624a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Iterator<InterfaceC2709Jh> it = this.f21781a.iterator();
            while (it.hasNext()) {
                it.next().mo14444a(this.f21782b);
            }
            this.f21781a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: b */
    public void mo14381b() {
        m14647a(new u(this));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: d */
    public void mo13935d(String str, String str2) {
        m14647a(new a(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        m14647a(new k(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        m14647a(new p(this, eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, Throwable th) {
        m14647a(new g(this, str, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str) {
        m14647a(new d(this, str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(Revenue revenue) {
        m14647a(new o(this, revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(Throwable th) {
        m14647a(new i(this, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(UserProfile userProfile) {
        m14647a(new m(this, userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        m14647a(new j(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        m14647a(new b(this));
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
        m14647a(new q(this, z));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(String str) {
        m14647a(new l(this, str));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0, com.yandex.metrica.InterfaceC3800s
    /* renamed from: b */
    public void mo13934b(String str, String str2) {
        m14647a(new w(this, str, str2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2) {
        m14647a(new h(this, str, str2, null));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, String str2) {
        m14647a(new e(this, str, str2));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        m14647a(new r(this, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(String str, String str2, Throwable th) {
        m14647a(new h(this, str, str2, th));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(String str, Map<String, Object> map) {
        m14647a(new f(this, str, map));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        m14647a(new s(this, pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14377a(C3513p7 c3513p7) {
        m14647a(new c(this, c3513p7));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        m14647a(new t(this, str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3143b1
    /* renamed from: a */
    public void mo14375a(C3227e7 c3227e7) {
        m14647a(new n(this, c3227e7));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3016W0
    /* renamed from: a */
    public void mo14379a(String str, JSONObject jSONObject) {
        m14647a(new v(this, str, jSONObject));
    }

    /* renamed from: a */
    private synchronized void m14647a(InterfaceC2709Jh interfaceC2709Jh) {
        try {
            if (this.f21782b == null) {
                this.f21781a.add(interfaceC2709Jh);
            } else {
                interfaceC2709Jh.mo14444a(this.f21782b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
