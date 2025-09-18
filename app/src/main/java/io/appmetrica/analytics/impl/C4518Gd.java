package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.Gd */
/* loaded from: classes2.dex */
public final class C4518Gd implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i;
        if (bool == null) {
            i = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            i = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new C6838sg();
            }
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return m19441a(((Number) obj).intValue());
    }

    /* renamed from: a */
    public final Boolean m19441a(int i) {
        if (i != -1) {
            if (i == 0) {
                return Boolean.FALSE;
            }
            if (i == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
