package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.AbstractC8259yu;
import defpackage.MN;
import defpackage.O90;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C1 implements InterfaceC4754o1, InterfaceC4633j0 {
    public boolean a;
    public final Context b;
    public volatile InterfaceC4730n1 c;
    public final C4781p4 d;
    public final M1 e;
    public C4745ng f;
    public final C4449ba g;
    public final C4718md h;
    public final C4588h2 i;
    public final ICommonExecutor j;
    public final D1 k;
    public final A1 l;
    public final C4984xg m;
    public C4592h6 n;

    public C1(Context context, InterfaceC4730n1 interfaceC4730n1) {
        this(context, interfaceC4730n1, new C4710m5(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent, int i) {
        b(intent, i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void b(Intent intent) throws NumberFormatException {
        this.e.e(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("io.appmetrica.analytics.IAppMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i = Integer.parseInt(data.getQueryParameter("pid"));
                this.d.a(i, encodedAuthority, data.getQueryParameter("psid"));
                this.i.a(i);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void c(Intent intent) {
        M1 m1 = this.e;
        if (intent == null) {
            m1.getClass();
            return;
        }
        m1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            m1.a.a(action, Integer.valueOf(M1.a(intent)));
        }
        for (Map.Entry entry : m1.b.entrySet()) {
            if (((K1) entry.getValue()).a(intent)) {
                ((L1) entry.getKey()).a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void onConfigurationChanged(Configuration configuration) {
        C4667ka.C.s().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void onCreate() {
        if (this.a) {
            C4667ka.C.s().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            C4667ka c4667ka = C4667ka.C;
            synchronized (c4667ka) {
                c4667ka.B.initAsync();
                c4667ka.u.b(c4667ka.a);
                c4667ka.u.a(new fn(c4667ka.B));
                NetworkServiceLocator.init();
                c4667ka.i().a(c4667ka.q);
                c4667ka.B();
            }
            AbstractC4652jj.a.e();
            C4630il c4630il = C4667ka.C.u;
            C4583gl c4583glA = c4630il.a();
            C4583gl c4583glA2 = c4630il.a();
            Aj ajM = C4667ka.C.m();
            ajM.a(new C4748nj(new Kc(this.e)), c4583glA2);
            c4630il.a(ajM);
            ((Bk) C4667ka.C.x()).getClass();
            M1 m1 = this.e;
            m1.b.put(new B1(this), new I1(m1));
            C4667ka.C.j().init();
            S sV = C4667ka.C.v();
            Context context = this.b;
            sV.c = c4583glA;
            sV.b(context);
            D1 d1 = this.k;
            Context context2 = this.b;
            C4781p4 c4781p4 = this.d;
            d1.getClass();
            this.f = new C4745ng(context2, c4781p4, C4667ka.C.d.e(), new X9());
            AppMetrica.getReporter(this.b, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File crashesDirectory = FileUtils.getCrashesDirectory(this.b);
            if (crashesDirectory != null) {
                D1 d12 = this.k;
                A1 a1 = this.l;
                d12.getClass();
                this.n = new C4592h6(new FileObserverC4616i6(crashesDirectory, a1, new X9()), crashesDirectory, new C4639j6());
                this.j.execute(new RunnableC4648jf(crashesDirectory, this.l, W9.a(this.b)));
                C4592h6 c4592h6 = this.n;
                C4639j6 c4639j6 = c4592h6.c;
                File file = c4592h6.b;
                c4639j6.getClass();
                if (file != null) {
                    if (!file.exists()) {
                        file.mkdir();
                    } else if (!file.isDirectory() && file.delete()) {
                        file.mkdir();
                    }
                }
                c4592h6.a.startWatching();
            }
            C4718md c4718md = this.h;
            Context context3 = this.b;
            C4745ng c4745ng = this.f;
            c4718md.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c4718md.a.init(context3, new NativeCrashServiceConfig(absolutePath));
                C4670kd c4670kd = new C4670kd(c4745ng, new C4694ld(c4718md));
                c4718md.b = c4670kd;
                c4670kd.a(c4718md.a.getAllCrashes());
                NativeCrashServiceModule nativeCrashServiceModule = c4718md.a;
                C4670kd c4670kd2 = c4718md.b;
                if (c4670kd2 == null) {
                    O90.o("crashReporter");
                    throw null;
                }
                nativeCrashServiceModule.setDefaultCrashHandler(c4670kd2);
            }
            new M5(AbstractC8259yu.e(new RunnableC4864sg())).run();
            this.a = true;
        }
        C4667ka.C.i().a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void onDestroy() {
        C5027zb c5027zbI = C4667ka.C.i();
        synchronized (c5027zbI) {
            Iterator it = c5027zbI.c.iterator();
            while (it.hasNext()) {
                ((InterfaceC4939vj) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void pauseUserSession(Bundle bundle) {
        Re re;
        bundle.setClassLoader(Re.class.getClassLoader());
        String str = Re.c;
        try {
            re = (Re) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            re = null;
        }
        Integer asInteger = re != null ? re.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.i.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void reportData(int i, Bundle bundle) {
        this.m.getClass();
        List list = (List) C4667ka.C.v.a.get(Integer.valueOf(i));
        if (list == null) {
            list = MN.a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC4772oj) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void resumeUserSession(Bundle bundle) {
        Re re;
        bundle.setClassLoader(Re.class.getClassLoader());
        String str = Re.c;
        try {
            re = (Re) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            re = null;
        }
        Integer asInteger = re != null ? re.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.i.c(asInteger.intValue());
        }
    }

    public C1(Context context, InterfaceC4730n1 interfaceC4730n1, C4710m5 c4710m5) {
        this(context, interfaceC4730n1, new C4781p4(context, c4710m5), new M1(), C4449ba.d, C4667ka.h().c(), C4667ka.h().u().e(), new D1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent, int i, int i2) {
        b(intent, i2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent) {
        M1 m1 = this.e;
        if (intent != null) {
            m1.getClass();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                m1.a.a(action, Integer.valueOf(M1.a(intent)));
            }
            for (Map.Entry entry : m1.b.entrySet()) {
                if (((K1) entry.getValue()).a(intent)) {
                    ((L1) entry.getKey()).a(intent);
                }
            }
            return;
        }
        m1.getClass();
    }

    public C1(Context context, InterfaceC4730n1 interfaceC4730n1, C4781p4 c4781p4, M1 m1, C4449ba c4449ba, C4588h2 c4588h2, IHandlerExecutor iHandlerExecutor, D1 d1) {
        this.a = false;
        this.l = new A1(this);
        this.b = context;
        this.c = interfaceC4730n1;
        this.d = c4781p4;
        this.e = m1;
        this.g = c4449ba;
        this.i = c4588h2;
        this.j = iHandlerExecutor;
        this.k = d1;
        this.h = C4667ka.h().o();
        this.m = new C4984xg();
    }

    public final void b(Intent intent, int i) {
        Bundle extras;
        Y3 y3A;
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null && (y3A = Y3.a(this.b, (extras = intent.getExtras()))) != null) {
                T5 t5B = T5.b(extras);
                if (!(t5B.l() | t5B.m())) {
                    try {
                        C4745ng c4745ng = this.f;
                        C4518e4 c4518e4A = C4518e4.a(y3A);
                        D4 d4 = new D4(y3A);
                        c4745ng.c.a(c4518e4A, d4).a(t5B, d4);
                        c4745ng.c.a(c4518e4A.c.intValue(), c4518e4A.b, c4518e4A.d);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        ((C4682l1) this.c).a.stopSelfResult(i);
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        T5.b(bundle);
        C4745ng c4745ng = this.f;
        T5 t5B = T5.b(bundle);
        c4745ng.getClass();
        if (t5B.m()) {
            return;
        }
        c4745ng.b.execute(new Fg(c4745ng.a, t5B, bundle, c4745ng.c));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(InterfaceC4730n1 interfaceC4730n1) {
        this.c = interfaceC4730n1;
    }

    public final void a(File file) {
        C4745ng c4745ng = this.f;
        c4745ng.getClass();
        C4597hb c4597hb = new C4597hb();
        c4745ng.b.execute(new Cif(file, c4597hb, c4597hb, new C4649jg(c4745ng)));
    }
}
