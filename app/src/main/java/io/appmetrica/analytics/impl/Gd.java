package io.appmetrica.analytics.impl;

import defpackage.C7074sg;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes2.dex */
public final class Gd implements Converter {
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
                throw new C7074sg();
            }
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i) {
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
