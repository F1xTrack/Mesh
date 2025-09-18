package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.C3803v;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.og */
/* loaded from: classes2.dex */
public class C3496og implements IPluginReporter {

    /* renamed from: a */
    private final C3782zg f24378a;

    /* renamed from: b */
    private final C3803v f24379b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f24380c;

    /* renamed from: d */
    private final InterfaceC3088Ym<InterfaceC3016W0> f24381d;

    /* renamed from: com.yandex.metrica.impl.ob.og$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f24382a;

        public a(PluginErrorDetails pluginErrorDetails) {
            this.f24382a = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3496og.m16543a(C3496og.this).reportUnhandledException(this.f24382a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f24384a;

        /* renamed from: b */
        final /* synthetic */ String f24385b;

        public b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f24384a = pluginErrorDetails;
            this.f24385b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3496og.m16543a(C3496og.this).reportError(this.f24384a, this.f24385b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f24387a;

        /* renamed from: b */
        final /* synthetic */ String f24388b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f24389c;

        public c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f24387a = str;
            this.f24388b = str2;
            this.f24389c = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3496og.m16543a(C3496og.this).reportError(this.f24387a, this.f24388b, this.f24389c);
        }
    }

    public C3496og(C3782zg c3782zg, C3803v c3803v, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC3088Ym<InterfaceC3016W0> interfaceC3088Ym) {
        this.f24378a = c3782zg;
        this.f24379b = c3803v;
        this.f24380c = interfaceExecutorC3607sn;
        this.f24381d = interfaceC3088Ym;
    }

    /* renamed from: a */
    public static IPluginReporter m16543a(C3496og c3496og) {
        return c3496og.f24381d.mo15519a().getPluginExtension();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (this.f24378a.m17329a(pluginErrorDetails, str)) {
            this.f24379b.getClass();
            ((C3581rn) this.f24380c).execute(new b(pluginErrorDetails, str));
        }
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f24378a.reportUnhandledException(pluginErrorDetails);
        this.f24379b.getClass();
        ((C3581rn) this.f24380c).execute(new a(pluginErrorDetails));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f24378a.reportError(str, str2, pluginErrorDetails);
        this.f24379b.getClass();
        ((C3581rn) this.f24380c).execute(new c(str, str2, pluginErrorDetails));
    }
}
