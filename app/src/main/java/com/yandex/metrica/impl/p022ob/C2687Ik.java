package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Ik */
/* loaded from: classes2.dex */
class C2687Ik {

    /* renamed from: a */
    private final C2587Ek f21446a;

    /* renamed from: b */
    private final C2537Ck f21447b;

    public C2687Ik(Context context) {
        this(new C2587Ek(context), new C2537Ck());
    }

    /* renamed from: a */
    public EnumC3761yl m14367a(Activity activity, C2688Il c2688Il) {
        if (c2688Il == null) {
            return EnumC3761yl.NULL_UI_ACCESS_CONFIG;
        }
        if (!c2688Il.f21448a) {
            return EnumC3761yl.UI_PARING_FEATURE_DISABLED;
        }
        C3164bm c3164bm = c2688Il.f21452e;
        return c3164bm == null ? EnumC3761yl.NULL_UI_PARSING_CONFIG : this.f21446a.m17195a(activity, c3164bm) ? EnumC3761yl.FORBIDDEN_FOR_APP : this.f21447b.m17195a(activity, c2688Il.f21452e) ? EnumC3761yl.FORBIDDEN_FOR_ACTIVITY : EnumC3761yl.OK;
    }

    public C2687Ik(C2587Ek c2587Ek, C2537Ck c2537Ck) {
        this.f21446a = c2587Ek;
        this.f21447b = c2537Ck;
    }
}
