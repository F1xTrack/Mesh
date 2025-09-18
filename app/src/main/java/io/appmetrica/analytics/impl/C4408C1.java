package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC7230yu;
import p000.C0779MN;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.C1 */
/* loaded from: classes2.dex */
public final class C4408C1 implements InterfaceC5335o1, InterfaceC5209j0 {

    /* renamed from: a */
    public boolean f29923a;

    /* renamed from: b */
    public final Context f29924b;

    /* renamed from: c */
    public volatile InterfaceC5310n1 f29925c;

    /* renamed from: d */
    public final C5363p4 f29926d;

    /* renamed from: e */
    public final C4650M1 f29927e;

    /* renamed from: f */
    public C5325ng f29928f;

    /* renamed from: g */
    public final C5019ba f29929g;

    /* renamed from: h */
    public final C5297md f29930h;

    /* renamed from: i */
    public final C5161h2 f29931i;

    /* renamed from: j */
    public final ICommonExecutor f29932j;

    /* renamed from: k */
    public final C4433D1 f29933k;

    /* renamed from: l */
    public final C4358A1 f29934l;

    /* renamed from: m */
    public final C5575xg f29935m;

    /* renamed from: n */
    public C5165h6 f29936n;

    public C4408C1(Context context, InterfaceC5310n1 interfaceC5310n1) {
        this(context, interfaceC5310n1, new C5289m5(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19250a(Intent intent, int i) {
        m19256b(intent, i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: b */
    public final void mo19255b(Intent intent) throws NumberFormatException {
        this.f29927e.m19620e(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("io.appmetrica.analytics.IAppMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i = Integer.parseInt(data.getQueryParameter("pid"));
                this.f29926d.m20902a(i, encodedAuthority, data.getQueryParameter("psid"));
                this.f29931i.m20478a(i);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: c */
    public final void mo19257c(Intent intent) {
        C4650M1 c4650m1 = this.f29927e;
        if (intent == null) {
            c4650m1.getClass();
            return;
        }
        c4650m1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c4650m1.f30455a.m20705a(action, Integer.valueOf(C4650M1.m19607a(intent)));
        }
        for (Map.Entry entry : c4650m1.f30456b.entrySet()) {
            if (((InterfaceC4602K1) entry.getValue()).mo19455a(intent)) {
                ((InterfaceC4626L1) entry.getKey()).mo2364a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void onConfigurationChanged(Configuration configuration) {
        C5244ka.f32038C.m20634s().m21132a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void onCreate() {
        if (this.f29923a) {
            C5244ka.f32038C.m20634s().m21132a(this.f29924b.getResources().getConfiguration());
        } else {
            this.f29929g.m20167b(this.f29924b);
            C5244ka c5244ka = C5244ka.f32038C;
            synchronized (c5244ka) {
                c5244ka.f32040B.initAsync();
                c5244ka.f32061u.m20580b(c5244ka.f32041a);
                c5244ka.f32061u.m20579a(new C5132fn(c5244ka.f32040B));
                NetworkServiceLocator.init();
                c5244ka.m20624i().m21236a(c5244ka.f32057q);
                c5244ka.m20616B();
            }
            AbstractC5228jj.f31988a.m20658e();
            C5205il c5205il = C5244ka.f32038C.f32061u;
            C5155gl c5155glM20578a = c5205il.m20578a();
            C5155gl c5155glM20578a2 = c5205il.m20578a();
            C4376Aj c4376AjM20628m = C5244ka.f32038C.m20628m();
            c4376AjM20628m.m19208a(new C5328nj(new C4613Kc(this.f29927e)), c5155glM20578a2);
            c5205il.m20579a(c4376AjM20628m);
            ((C4402Bk) C5244ka.f32038C.m20639x()).getClass();
            C4650M1 c4650m1 = this.f29927e;
            c4650m1.f30456b.put(new C4383B1(this), new C4554I1(c4650m1));
            C5244ka.f32038C.m20625j().init();
            C4791S c4791sM20637v = C5244ka.f32038C.m20637v();
            Context context = this.f29924b;
            c4791sM20637v.f30708c = c5155glM20578a;
            c4791sM20637v.mo19795b(context);
            C4433D1 c4433d1 = this.f29933k;
            Context context2 = this.f29924b;
            C5363p4 c5363p4 = this.f29926d;
            c4433d1.getClass();
            this.f29928f = new C5325ng(context2, c5363p4, C5244ka.f32038C.f32044d.m21142e(), new C4921X9());
            AppMetrica.getReporter(this.f29924b, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File crashesDirectory = FileUtils.getCrashesDirectory(this.f29924b);
            if (crashesDirectory != null) {
                C4433D1 c4433d12 = this.f29933k;
                C4358A1 c4358a1 = this.f29934l;
                c4433d12.getClass();
                this.f29936n = new C5165h6(new FileObserverC5190i6(crashesDirectory, c4358a1, new C4921X9()), crashesDirectory, new C5215j6());
                this.f29932j.execute(new RunnableC5224jf(crashesDirectory, this.f29934l, C4897W9.m19944a(this.f29924b)));
                C5165h6 c5165h6 = this.f29936n;
                C5215j6 c5215j6 = c5165h6.f31843c;
                File file = c5165h6.f31842b;
                c5215j6.getClass();
                if (file != null) {
                    if (!file.exists()) {
                        file.mkdir();
                    } else if (!file.isDirectory() && file.delete()) {
                        file.mkdir();
                    }
                }
                c5165h6.f31841a.startWatching();
            }
            C5297md c5297md = this.f29930h;
            Context context3 = this.f29924b;
            C5325ng c5325ng = this.f29928f;
            c5297md.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c5297md.f32200a.init(context3, new NativeCrashServiceConfig(absolutePath));
                C5247kd c5247kd = new C5247kd(c5325ng, new C5272ld(c5297md));
                c5297md.f32201b = c5247kd;
                c5247kd.m20646a(c5297md.f32200a.getAllCrashes());
                NativeCrashServiceModule nativeCrashServiceModule = c5297md.f32200a;
                C5247kd c5247kd2 = c5297md.f32201b;
                if (c5247kd2 == null) {
                    O90.m5977o("crashReporter");
                    throw null;
                }
                nativeCrashServiceModule.setDefaultCrashHandler(c5247kd2);
            }
            new RunnableC4654M5(AbstractC7230yu.m26274e(new RunnableC5450sg())).run();
            this.f29923a = true;
        }
        C5244ka.f32038C.m20624i().m21235a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void onDestroy() {
        C5620zb c5620zbM20624i = C5244ka.f32038C.m20624i();
        synchronized (c5620zbM20624i) {
            Iterator it = c5620zbM20624i.f32919c.iterator();
            while (it.hasNext()) {
                ((InterfaceC5528vj) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void pauseUserSession(Bundle bundle) {
        C4782Re c4782Re;
        bundle.setClassLoader(C4782Re.class.getClassLoader());
        String str = C4782Re.f30695c;
        try {
            c4782Re = (C4782Re) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c4782Re = null;
        }
        Integer asInteger = c4782Re != null ? c4782Re.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f29931i.m20479b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void reportData(int i, Bundle bundle) {
        this.f29935m.getClass();
        List list = (List) C5244ka.f32038C.f32062v.f32403a.get(Integer.valueOf(i));
        if (list == null) {
            list = C0779MN.f7117a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5353oj) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void resumeUserSession(Bundle bundle) {
        C4782Re c4782Re;
        bundle.setClassLoader(C4782Re.class.getClassLoader());
        String str = C4782Re.f30695c;
        try {
            c4782Re = (C4782Re) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c4782Re = null;
        }
        Integer asInteger = c4782Re != null ? c4782Re.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f29931i.m20480c(asInteger.intValue());
        }
    }

    public C4408C1(Context context, InterfaceC5310n1 interfaceC5310n1, C5289m5 c5289m5) {
        this(context, interfaceC5310n1, new C5363p4(context, c5289m5), new C4650M1(), C5019ba.f31313d, C5244ka.m20614h().m20619c(), C5244ka.m20614h().m20636u().m21142e(), new C4433D1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19251a(Intent intent, int i, int i2) {
        m19256b(intent, i2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19249a(Intent intent) {
        C4650M1 c4650m1 = this.f29927e;
        if (intent != null) {
            c4650m1.getClass();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                c4650m1.f30455a.m20705a(action, Integer.valueOf(C4650M1.m19607a(intent)));
            }
            for (Map.Entry entry : c4650m1.f30456b.entrySet()) {
                if (((InterfaceC4602K1) entry.getValue()).mo19455a(intent)) {
                    ((InterfaceC4626L1) entry.getKey()).mo2364a(intent);
                }
            }
            return;
        }
        c4650m1.getClass();
    }

    public C4408C1(Context context, InterfaceC5310n1 interfaceC5310n1, C5363p4 c5363p4, C4650M1 c4650m1, C5019ba c5019ba, C5161h2 c5161h2, IHandlerExecutor iHandlerExecutor, C4433D1 c4433d1) {
        this.f29923a = false;
        this.f29934l = new C4358A1(this);
        this.f29924b = context;
        this.f29925c = interfaceC5310n1;
        this.f29926d = c5363p4;
        this.f29927e = c4650m1;
        this.f29929g = c5019ba;
        this.f29931i = c5161h2;
        this.f29932j = iHandlerExecutor;
        this.f29933k = c4433d1;
        this.f29930h = C5244ka.m20614h().m20630o();
        this.f29935m = new C5575xg();
    }

    /* renamed from: b */
    public final void m19256b(Intent intent, int i) {
        Bundle extras;
        C4939Y3 c4939y3M20018a;
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null && (c4939y3M20018a = C4939Y3.m20018a(this.f29924b, (extras = intent.getExtras()))) != null) {
                C4821T5 c4821t5M19841b = C4821T5.m19841b(extras);
                if (!(c4821t5M19841b.m19867l() | c4821t5M19841b.m19868m())) {
                    try {
                        C5325ng c5325ng = this.f29928f;
                        C5088e4 c5088e4M20302a = C5088e4.m20302a(c4939y3M20018a);
                        C4436D4 c4436d4 = new C4436D4(c4939y3M20018a);
                        c5325ng.f32295c.m20901a(c5088e4M20302a, c4436d4).mo19487a(c4821t5M19841b, c4436d4);
                        c5325ng.f32295c.m20902a(c5088e4M20302a.f31526c.intValue(), c5088e4M20302a.f31525b, c5088e4M20302a.f31527d);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        ((C5260l1) this.f29925c).f32117a.stopSelfResult(i);
    }

    /* renamed from: a */
    public final void m19252a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C4821T5.m19841b(bundle);
        C5325ng c5325ng = this.f29928f;
        C4821T5 c4821t5M19841b = C4821T5.m19841b(bundle);
        c5325ng.getClass();
        if (c4821t5M19841b.m19868m()) {
            return;
        }
        c5325ng.f32294b.execute(new RunnableC4497Fg(c5325ng.f32293a, c4821t5M19841b, bundle, c5325ng.f32295c));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19253a(InterfaceC5310n1 interfaceC5310n1) {
        this.f29925c = interfaceC5310n1;
    }

    /* renamed from: a */
    public final void m19254a(File file) {
        C5325ng c5325ng = this.f29928f;
        c5325ng.getClass();
        C5170hb c5170hb = new C5170hb();
        c5325ng.f32294b.execute(new RunnableC5199if(file, c5170hb, c5170hb, new C5225jg(c5325ng)));
    }
}
