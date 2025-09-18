package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes2.dex */
class Ik {
    private final Ek a;
    private final Ck b;

    public Ik(Context context) {
        this(new Ek(context), new Ck());
    }

    public EnumC3239yl a(Activity activity, Il il) {
        if (il == null) {
            return EnumC3239yl.NULL_UI_ACCESS_CONFIG;
        }
        if (!il.a) {
            return EnumC3239yl.UI_PARING_FEATURE_DISABLED;
        }
        C2662bm c2662bm = il.e;
        return c2662bm == null ? EnumC3239yl.NULL_UI_PARSING_CONFIG : this.a.a(activity, c2662bm) ? EnumC3239yl.FORBIDDEN_FOR_APP : this.b.a(activity, il.e) ? EnumC3239yl.FORBIDDEN_FOR_ACTIVITY : EnumC3239yl.OK;
    }

    public Ik(Ek ek, Ck ck) {
        this.a = ek;
        this.b = ck;
    }
}
