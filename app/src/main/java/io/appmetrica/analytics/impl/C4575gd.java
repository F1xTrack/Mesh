package io.appmetrica.analytics.impl;

import defpackage.AbstractC7096sn0;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4575gd implements ProtobufConverter {
    public static final C4551fd a = new C4551fd();
    public static final Map b = AbstractC7096sn0.h(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(C4646jd c4646jd) {
        Z5 z5 = new Z5();
        z5.f = 1;
        Y5 y5 = new Y5();
        y5.a = c4646jd.a;
        C4470c6 c4470c6 = new C4470c6();
        Integer num = (Integer) b.get(c4646jd.b.a);
        if (num != null) {
            c4470c6.a = num.intValue();
        }
        String str = c4646jd.b.b;
        if (str == null) {
            str = "";
        }
        c4470c6.b = str;
        y5.b = c4470c6;
        z5.g = y5;
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final C4646jd a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
