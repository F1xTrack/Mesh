package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Hb {
    public final String a;
    public final List<String> b;
    public final String c;
    public final Map<String, String> d;

    public Hb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), U2.a((Collection) eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), U2.c(eCommerceScreen.getPayload()));
    }

    public String toString() {
        return "ScreenWrapper{name='" + this.a + "', categoriesPath=" + this.b + ", searchQuery='" + this.c + "', payload=" + this.d + '}';
    }

    public Hb(String str, List<String> list, String str2, Map<String, String> map) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = map;
    }
}
