package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4866si {
    public final String a;
    public final List b;
    public final String c;
    public final Map d;

    public C4866si(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.a + "', categoriesPath=" + this.b + ", searchQuery='" + this.c + "', payload=" + this.d + '}';
    }

    public C4866si(String str, String str2, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = map;
    }
}
