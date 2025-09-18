package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C4566Id;
import io.appmetrica.analytics.impl.C5054ck;
import io.appmetrica.analytics.impl.C5104ek;
import io.appmetrica.analytics.impl.C5154gk;
import io.appmetrica.analytics.impl.C5587y3;
import io.appmetrica.analytics.impl.InterfaceC4974Ze;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ECommerceEvent implements InterfaceC4974Ze {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C5587y3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C4566Id(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C4566Id(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C5587y3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C5054ck(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C5104ek(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C5154gk(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4974Ze
    public abstract /* synthetic */ List toProto();
}
