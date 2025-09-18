package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import defpackage.LB;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class K8 {
    private final Map<String, I8> a = new LinkedHashMap();
    private final Lazy b = LB.b(new a());
    private final Context c;

    public static final class a extends AbstractC1676Vg0 implements InterfaceC5908mZ {
        public a() {
            super(0);
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return new H8(K8.this.c, new L0());
        }
    }

    public K8(Context context) {
        this.c = context;
    }

    public final H8 a() {
        return (H8) this.b.getValue();
    }

    public final synchronized I8 a(String str) {
        I8 i8;
        String strValueOf = String.valueOf(str);
        i8 = this.a.get(strValueOf);
        if (i8 == null) {
            i8 = new I8(this.c, strValueOf, new L0());
            this.a.put(strValueOf, i8);
        }
        return i8;
    }
}
