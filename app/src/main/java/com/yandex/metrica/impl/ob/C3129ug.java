package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3129ug {
    private final InterfaceExecutorC3086sn a;
    private final C3104tg b;
    private final C2930mg c;
    private final C3234yg d;
    private final com.yandex.metrica.v e;

    /* renamed from: com.yandex.metrica.impl.ob.ug$a */
    public static final class a implements Runnable {
        final /* synthetic */ PluginErrorDetails b;
        final /* synthetic */ String c;

        public a(PluginErrorDetails pluginErrorDetails, String str) {
            this.b = pluginErrorDetails;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3129ug.a(C3129ug.this).getPluginExtension().reportError(this.b, this.c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$b */
    public static final class b implements Runnable {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ PluginErrorDetails d;

        public b(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.b = str;
            this.c = str2;
            this.d = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3129ug.a(C3129ug.this).getPluginExtension().reportError(this.b, this.c, this.d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$c */
    public static final class c implements Runnable {
        final /* synthetic */ PluginErrorDetails b;

        public c(PluginErrorDetails pluginErrorDetails) {
            this.b = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3129ug.a(C3129ug.this).getPluginExtension().reportUnhandledException(this.b);
        }
    }

    public C3129ug(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3104tg c3104tg, C2930mg c2930mg, C3234yg c3234yg, com.yandex.metrica.v vVar) {
        this.a = interfaceExecutorC3086sn;
        this.b = c3104tg;
        this.c = c2930mg;
        this.d = c3234yg;
        this.e = vVar;
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        this.c.a(null);
        this.d.a().reportUnhandledException(pluginErrorDetails);
        com.yandex.metrica.v vVar = this.e;
        O90.c(pluginErrorDetails);
        vVar.getClass();
        ((C3061rn) this.a).execute(new c(pluginErrorDetails));
    }

    public C3129ug(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(interfaceExecutorC3086sn, new C3104tg());
    }

    private C3129ug(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3104tg c3104tg) {
        this(interfaceExecutorC3086sn, c3104tg, new C2930mg(c3104tg), new C3234yg(), new com.yandex.metrica.v(c3104tg, new X2()));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        this.c.a(null);
        if (this.d.a().a(pluginErrorDetails, str)) {
            com.yandex.metrica.v vVar = this.e;
            O90.c(pluginErrorDetails);
            vVar.getClass();
            ((C3061rn) this.a).execute(new a(pluginErrorDetails, str));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.c.a(null);
        this.d.a().reportError(str, str2, pluginErrorDetails);
        com.yandex.metrica.v vVar = this.e;
        O90.c(str);
        vVar.getClass();
        ((C3061rn) this.a).execute(new b(str, str2, pluginErrorDetails));
    }

    public static final U0 a(C3129ug c3129ug) {
        c3129ug.b.getClass();
        C2892l3 c2892l3K = C2892l3.k();
        O90.c(c2892l3K);
        C3089t1 c3089t1D = c2892l3K.d();
        O90.c(c3089t1D);
        U0 u0B = c3089t1D.b();
        O90.e(u0B, "provider.peekInitialized…erProvider!!.mainReporter");
        return u0B;
    }
}
