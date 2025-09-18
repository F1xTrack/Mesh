package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.C3803v;
import com.yandex.metrica.plugins.PluginErrorDetails;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.ug */
/* loaded from: classes2.dex */
public final class C3652ug {

    /* renamed from: a */
    private final InterfaceExecutorC3607sn f24915a;

    /* renamed from: b */
    private final C3626tg f24916b;

    /* renamed from: c */
    private final C3444mg f24917c;

    /* renamed from: d */
    private final C3756yg f24918d;

    /* renamed from: e */
    private final C3803v f24919e;

    /* renamed from: com.yandex.metrica.impl.ob.ug$a */
    public static final class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f24921b;

        /* renamed from: c */
        final /* synthetic */ String f24922c;

        public a(PluginErrorDetails pluginErrorDetails, String str) {
            this.f24921b = pluginErrorDetails;
            this.f24922c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3652ug.m16921a(C3652ug.this).getPluginExtension().reportError(this.f24921b, this.f24922c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$b */
    public static final class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f24924b;

        /* renamed from: c */
        final /* synthetic */ String f24925c;

        /* renamed from: d */
        final /* synthetic */ PluginErrorDetails f24926d;

        public b(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f24924b = str;
            this.f24925c = str2;
            this.f24926d = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3652ug.m16921a(C3652ug.this).getPluginExtension().reportError(this.f24924b, this.f24925c, this.f24926d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$c */
    public static final class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ PluginErrorDetails f24928b;

        public c(PluginErrorDetails pluginErrorDetails) {
            this.f24928b = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3652ug.m16921a(C3652ug.this).getPluginExtension().reportUnhandledException(this.f24928b);
        }
    }

    public C3652ug(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3626tg c3626tg, C3444mg c3444mg, C3756yg c3756yg, C3803v c3803v) {
        this.f24915a = interfaceExecutorC3607sn;
        this.f24916b = c3626tg;
        this.f24917c = c3444mg;
        this.f24918d = c3756yg;
        this.f24919e = c3803v;
    }

    /* renamed from: a */
    public final void m16922a(PluginErrorDetails pluginErrorDetails) {
        this.f24917c.mo14391a(null);
        this.f24918d.m13862a().reportUnhandledException(pluginErrorDetails);
        C3803v c3803v = this.f24919e;
        O90.m5965c(pluginErrorDetails);
        c3803v.getClass();
        ((C3581rn) this.f24915a).execute(new c(pluginErrorDetails));
    }

    public C3652ug(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(interfaceExecutorC3607sn, new C3626tg());
    }

    private C3652ug(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3626tg c3626tg) {
        this(interfaceExecutorC3607sn, c3626tg, new C3444mg(c3626tg), new C3756yg(), new C3803v(c3626tg, new C3043X2()));
    }

    /* renamed from: a */
    public final void m16923a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f24917c.mo14391a(null);
        if (this.f24918d.m13862a().m17329a(pluginErrorDetails, str)) {
            C3803v c3803v = this.f24919e;
            O90.m5965c(pluginErrorDetails);
            c3803v.getClass();
            ((C3581rn) this.f24915a).execute(new a(pluginErrorDetails, str));
        }
    }

    /* renamed from: a */
    public final void m16924a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f24917c.mo14391a(null);
        this.f24918d.m13862a().reportError(str, str2, pluginErrorDetails);
        C3803v c3803v = this.f24919e;
        O90.m5965c(str);
        c3803v.getClass();
        ((C3581rn) this.f24915a).execute(new b(str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public static final InterfaceC2966U0 m16921a(C3652ug c3652ug) {
        c3652ug.f24916b.getClass();
        C3405l3 c3405l3M16363k = C3405l3.m16363k();
        O90.m5965c(c3405l3M16363k);
        C3611t1 c3611t1M16375d = c3405l3M16363k.m16375d();
        O90.m5965c(c3611t1M16375d);
        InterfaceC2966U0 interfaceC2966U0M16807b = c3611t1M16375d.m16807b();
        O90.m5967e(interfaceC2966U0M16807b, "provider.peekInitialized…erProvider!!.mainReporter");
        return interfaceC2966U0M16807b;
    }
}
