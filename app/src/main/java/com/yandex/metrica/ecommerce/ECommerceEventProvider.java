package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p022ob.C2478Ab;
import com.yandex.metrica.impl.p022ob.C2503Bb;
import com.yandex.metrica.impl.p022ob.C2528Cb;
import com.yandex.metrica.impl.p022ob.C2578Eb;
import com.yandex.metrica.impl.p022ob.C2628Gb;
import com.yandex.metrica.impl.p022ob.C2653Hb;
import com.yandex.metrica.impl.p022ob.C2678Ib;
import com.yandex.metrica.impl.p022ob.C2703Jb;
import com.yandex.metrica.impl.p022ob.C2728Kb;
import com.yandex.metrica.impl.p022ob.C3309hb;
import com.yandex.metrica.impl.p022ob.C3439mb;
import com.yandex.metrica.impl.p022ob.C3673vb;
import com.yandex.metrica.impl.p022ob.C3699wb;
import com.yandex.metrica.impl.p022ob.C3725xb;
import com.yandex.metrica.impl.p022ob.C3777zb;

/* loaded from: classes2.dex */
public class ECommerceEventProvider {
    public ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C3777zb(4, new C2478Ab(eCommerceCartItem), new C3309hb());
    }

    public ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C2503Bb(6, new C2528Cb(eCommerceOrder), new C3439mb());
    }

    public ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C2503Bb(7, new C2528Cb(eCommerceOrder), new C3439mb());
    }

    public ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C3777zb(5, new C2478Ab(eCommerceCartItem), new C3309hb());
    }

    public ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C2678Ib(new C2578Eb(eCommerceProduct), new C2653Hb(eCommerceScreen), new C3673vb());
    }

    public ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C2703Jb(new C2578Eb(eCommerceProduct), eCommerceReferrer == null ? null : new C2628Gb(eCommerceReferrer), new C3699wb());
    }

    public ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C2728Kb(new C2653Hb(eCommerceScreen), new C3725xb());
    }
}
