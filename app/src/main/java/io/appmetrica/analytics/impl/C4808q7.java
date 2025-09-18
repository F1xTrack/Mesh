package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4808q7 implements ProtobufConverter {
    public final Gd a;

    public C4808q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4784p7 fromModel(C4855s7 c4855s7) {
        C4784p7 c4784p7 = new C4784p7();
        Long l = c4855s7.a;
        if (l != null) {
            c4784p7.a = l.longValue();
        }
        Long l2 = c4855s7.b;
        if (l2 != null) {
            c4784p7.b = l2.longValue();
        }
        Boolean bool = c4855s7.c;
        if (bool != null) {
            c4784p7.c = this.a.fromModel(bool).intValue();
        }
        return c4784p7;
    }

    public C4808q7(Gd gd) {
        this.a = gd;
    }

    public /* synthetic */ C4808q7(Gd gd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Gd() : gd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4855s7 toModel(C4784p7 c4784p7) {
        C4784p7 c4784p72 = new C4784p7();
        long j = c4784p7.a;
        Long lValueOf = Long.valueOf(j);
        if (j == c4784p72.a) {
            lValueOf = null;
        }
        long j2 = c4784p7.b;
        return new C4855s7(lValueOf, j2 != c4784p72.b ? Long.valueOf(j2) : null, this.a.a(c4784p7.c));
    }
}
