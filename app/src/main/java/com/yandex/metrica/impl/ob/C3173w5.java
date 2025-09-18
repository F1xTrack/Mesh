package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.w5 */
/* loaded from: classes2.dex */
public class C3173w5 extends AbstractC3068s5 {
    private final C2771g6 b;

    public C3173w5(C2744f4 c2744f4) {
        this(c2744f4, c2744f4.j());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        if (TextUtils.isEmpty(c2864k0.g())) {
            return false;
        }
        c2864k0.a(this.b.a(c2864k0.g()));
        return false;
    }

    public C3173w5(C2744f4 c2744f4, C2771g6 c2771g6) {
        super(c2744f4);
        this.b = c2771g6;
    }
}
