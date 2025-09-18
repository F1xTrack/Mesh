package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Hb */
/* loaded from: classes2.dex */
public class C2653Hb {

    /* renamed from: a */
    public final String f21355a;

    /* renamed from: b */
    public final List<String> f21356b;

    /* renamed from: c */
    public final String f21357c;

    /* renamed from: d */
    public final Map<String, String> f21358d;

    public C2653Hb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), C2968U2.m15234a((Collection) eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), C2968U2.m15251c(eCommerceScreen.getPayload()));
    }

    public String toString() {
        return "ScreenWrapper{name='" + this.f21355a + "', categoriesPath=" + this.f21356b + ", searchQuery='" + this.f21357c + "', payload=" + this.f21358d + '}';
    }

    public C2653Hb(String str, List<String> list, String str2, Map<String, String> map) {
        this.f21355a = str;
        this.f21356b = list;
        this.f21357c = str2;
        this.f21358d = map;
    }
}
