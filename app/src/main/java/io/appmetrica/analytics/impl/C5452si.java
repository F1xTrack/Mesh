package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.si */
/* loaded from: classes2.dex */
public final class C5452si {

    /* renamed from: a */
    public final String f32571a;

    /* renamed from: b */
    public final List f32572b;

    /* renamed from: c */
    public final String f32573c;

    /* renamed from: d */
    public final Map f32574d;

    public C5452si(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f32571a + "', categoriesPath=" + this.f32572b + ", searchQuery='" + this.f32573c + "', payload=" + this.f32574d + '}';
    }

    public C5452si(String str, String str2, List list, Map map) {
        this.f32571a = str;
        this.f32572b = list;
        this.f32573c = str2;
        this.f32574d = map;
    }
}
