package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import com.yandex.metrica.impl.p022ob.C3621tb;
import com.yandex.metrica.impl.p022ob.InterfaceC2603Fb;
import com.yandex.metrica.impl.p022ob.InterfaceC2615Fn;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ECommerceEvent implements InterfaceC2603Fb {

    /* renamed from: a */
    private static ECommerceEventProvider f20793a = new ECommerceEventProvider();

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f20793a.addCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return f20793a.beginCheckoutEvent(eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return f20793a.purchaseEvent(eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f20793a.removeCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return f20793a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return f20793a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return f20793a.showScreenEvent(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public abstract /* synthetic */ List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto();
}
