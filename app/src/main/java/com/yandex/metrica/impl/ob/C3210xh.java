package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.C0160Bu1;
import defpackage.C0942Lv1;
import defpackage.C1095Nu1;
import defpackage.InterfaceC0703It1;
import defpackage.InterfaceC5400ju1;
import defpackage.InterfaceC7694vv1;
import defpackage.InterfaceC7878wt1;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3210xh {
    private final L0 a;

    /* renamed from: com.yandex.metrica.impl.ob.xh$a */
    public class a {
        public a() {
        }

        public File getCrashesDirectory(Context context) {
            return C3210xh.this.a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C3210xh.this.a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$b */
    public class b {
        public b(C3210xh c3210xh) {
        }

        public String getDeviceType(Context context) {
            com.yandex.metrica.q qVarA = P0.i().p().a().a();
            if (qVarA == null) {
                return null;
            }
            return qVarA.a;
        }

        public String getVersion(Context context) {
            return U2.a(context, context.getPackageName());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$c */
    public class c {
        public c() {
        }

        public File getCrashesDirectory(Context context) {
            return C3210xh.this.a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C3210xh.this.a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C3210xh() {
        this(new L0());
    }

    public InterfaceC5400ju1 b(Context context) {
        C0942Lv1 c0942Lv1;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new a();
                InterfaceExecutorC3086sn interfaceExecutorC3086snG = P0.i().s().g();
                new b(this);
                c0942Lv1 = new C0942Lv1(context, interfaceExecutorC3086snG);
            } catch (Throwable unused) {
            }
        } else {
            c0942Lv1 = null;
        }
        return c0942Lv1 == null ? new C3130uh() : c0942Lv1;
    }

    public C3210xh(L0 l0) {
        this.a = l0;
    }

    public InterfaceC0703It1 a(Context context) {
        C1095Nu1 c1095Nu1;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new c();
                c1095Nu1 = new C1095Nu1(context);
            } catch (Throwable unused) {
            }
        } else {
            c1095Nu1 = null;
        }
        return c1095Nu1 == null ? new C3105th() : c1095Nu1;
    }

    public InterfaceC7878wt1 a(InterfaceC7694vv1 interfaceC7694vv1, String str, boolean z) {
        C0160Bu1 c0160Bu1;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                c0160Bu1 = new C0160Bu1(str, z);
            } catch (Throwable unused) {
            }
        } else {
            c0160Bu1 = null;
        }
        return c0160Bu1 == null ? new C3080sh() : c0160Bu1;
    }
}
