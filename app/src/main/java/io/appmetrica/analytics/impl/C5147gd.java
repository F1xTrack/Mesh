package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;
import p000.AbstractC11077sn0;

/* renamed from: io.appmetrica.analytics.impl.gd */
/* loaded from: classes2.dex */
public final class C5147gd implements ProtobufConverter {

    /* renamed from: a */
    public static final C5122fd f31772a = new C5122fd();

    /* renamed from: b */
    public static final Map f31773b = AbstractC11077sn0.m24780h(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4965Z5 fromModel(C5222jd c5222jd) {
        C4965Z5 c4965z5 = new C4965Z5();
        c4965z5.f31156f = 1;
        C4941Y5 c4941y5 = new C4941Y5();
        c4941y5.f31094a = c5222jd.f31975a;
        C5040c6 c5040c6 = new C5040c6();
        Integer num = (Integer) f31773b.get(c5222jd.f31976b.f31933a);
        if (num != null) {
            c5040c6.f31356a = num.intValue();
        }
        String str = c5222jd.f31976b.f31934b;
        if (str == null) {
            str = "";
        }
        c5040c6.f31357b = str;
        c4941y5.f31095b = c5040c6;
        c4965z5.f31157g = c4941y5;
        return c4965z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C5222jd m20463a(C4965Z5 c4965z5) {
        throw new UnsupportedOperationException();
    }
}
