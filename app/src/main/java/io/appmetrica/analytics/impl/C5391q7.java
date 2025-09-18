package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.q7 */
/* loaded from: classes2.dex */
public final class C5391q7 implements ProtobufConverter {

    /* renamed from: a */
    public final C4518Gd f32435a;

    public C5391q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5366p7 fromModel(C5441s7 c5441s7) {
        C5366p7 c5366p7 = new C5366p7();
        Long l = c5441s7.f32535a;
        if (l != null) {
            c5366p7.f32387a = l.longValue();
        }
        Long l2 = c5441s7.f32536b;
        if (l2 != null) {
            c5366p7.f32388b = l2.longValue();
        }
        Boolean bool = c5441s7.f32537c;
        if (bool != null) {
            c5366p7.f32389c = this.f32435a.fromModel(bool).intValue();
        }
        return c5366p7;
    }

    public C5391q7(C4518Gd c4518Gd) {
        this.f32435a = c4518Gd;
    }

    public /* synthetic */ C5391q7(C4518Gd c4518Gd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4518Gd() : c4518Gd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5441s7 toModel(C5366p7 c5366p7) {
        C5366p7 c5366p72 = new C5366p7();
        long j = c5366p7.f32387a;
        Long lValueOf = Long.valueOf(j);
        if (j == c5366p72.f32387a) {
            lValueOf = null;
        }
        long j2 = c5366p7.f32388b;
        return new C5441s7(lValueOf, j2 != c5366p72.f32388b ? Long.valueOf(j2) : null, this.f32435a.m19441a(c5366p7.f32389c));
    }
}
