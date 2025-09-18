package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2980og implements IPluginReporter {
    private final C3259zg a;
    private final com.yandex.metrica.v b;
    private final InterfaceExecutorC3086sn c;
    private final Ym<W0> d;

    /* renamed from: com.yandex.metrica.impl.ob.og$a */
    public class a implements Runnable {
        final /* synthetic */ PluginErrorDetails a;

        public a(PluginErrorDetails pluginErrorDetails) {
            this.a = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2980og.a(C2980og.this).reportUnhandledException(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$b */
    public class b implements Runnable {
        final /* synthetic */ PluginErrorDetails a;
        final /* synthetic */ String b;

        public b(PluginErrorDetails pluginErrorDetails, String str) {
            this.a = pluginErrorDetails;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2980og.a(C2980og.this).reportError(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$c */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ PluginErrorDetails c;

        public c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.a = str;
            this.b = str2;
            this.c = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2980og.a(C2980og.this).reportError(this.a, this.b, this.c);
        }
    }

    public C2980og(C3259zg c3259zg, com.yandex.metrica.v vVar, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Ym<W0> ym) {
        this.a = c3259zg;
        this.b = vVar;
        this.c = interfaceExecutorC3086sn;
        this.d = ym;
    }

    public static IPluginReporter a(C2980og c2980og) {
        return c2980og.d.a().getPluginExtension();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (this.a.a(pluginErrorDetails, str)) {
            this.b.getClass();
            ((C3061rn) this.c).execute(new b(pluginErrorDetails, str));
        }
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.a.reportUnhandledException(pluginErrorDetails);
        this.b.getClass();
        ((C3061rn) this.c).execute(new a(pluginErrorDetails));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a.reportError(str, str2, pluginErrorDetails);
        this.b.getClass();
        ((C3061rn) this.c).execute(new c(str, str2, pluginErrorDetails));
    }
}
