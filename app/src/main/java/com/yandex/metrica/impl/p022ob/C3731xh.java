package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.EnumC3798q;
import java.io.File;
import p000.C7407Bu1;
import p000.C7929Lv1;
import p000.C8031Nu1;
import p000.InterfaceC11478vv1;
import p000.InterfaceC11601wt1;
import p000.InterfaceC7769It1;
import p000.InterfaceC9940ju1;

/* renamed from: com.yandex.metrica.impl.ob.xh */
/* loaded from: classes2.dex */
public class C3731xh {

    /* renamed from: a */
    private final C2742L0 f25250a;

    /* renamed from: com.yandex.metrica.impl.ob.xh$a */
    public class a {
        public a() {
        }

        public File getCrashesDirectory(Context context) {
            return C3731xh.this.f25250a.m14500a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C3731xh.this.f25250a.m14500a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$b */
    public class b {
        public b(C3731xh c3731xh) {
        }

        public String getDeviceType(Context context) {
            EnumC3798q enumC3798qM17108a = C2842P0.m14728i().m14745p().m17210a().m17108a();
            if (enumC3798qM17108a == null) {
                return null;
            }
            return enumC3798qM17108a.f25518a;
        }

        public String getVersion(Context context) {
            return C2968U2.m15230a(context, context.getPackageName());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$c */
    public class c {
        public c() {
        }

        public File getCrashesDirectory(Context context) {
            return C3731xh.this.f25250a.m14500a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C3731xh.this.f25250a.m14500a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C3731xh() {
        this(new C2742L0());
    }

    /* renamed from: b */
    public InterfaceC9940ju1 m17188b(Context context) {
        C7929Lv1 c7929Lv1;
        if (C2494B2.m13908a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new a();
                InterfaceExecutorC3607sn interfaceExecutorC3607snM17355g = C2842P0.m14728i().m14748s().m17355g();
                new b(this);
                c7929Lv1 = new C7929Lv1(context, interfaceExecutorC3607snM17355g);
            } catch (Throwable unused) {
            }
        } else {
            c7929Lv1 = null;
        }
        return c7929Lv1 == null ? new C3653uh() : c7929Lv1;
    }

    public C3731xh(C2742L0 c2742l0) {
        this.f25250a = c2742l0;
    }

    /* renamed from: a */
    public InterfaceC7769It1 m17186a(Context context) {
        C8031Nu1 c8031Nu1;
        if (C2494B2.m13908a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new c();
                c8031Nu1 = new C8031Nu1(context);
            } catch (Throwable unused) {
            }
        } else {
            c8031Nu1 = null;
        }
        return c8031Nu1 == null ? new C3627th() : c8031Nu1;
    }

    /* renamed from: a */
    public InterfaceC11601wt1 m17187a(InterfaceC11478vv1 interfaceC11478vv1, String str, boolean z) {
        C7407Bu1 c7407Bu1;
        if (C2494B2.m13908a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                c7407Bu1 = new C7407Bu1(str, z);
            } catch (Throwable unused) {
            }
        } else {
            c7407Bu1 = null;
        }
        return c7407Bu1 == null ? new C3601sh() : c7407Bu1;
    }
}
