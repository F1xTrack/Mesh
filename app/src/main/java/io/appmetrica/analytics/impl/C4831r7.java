package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4831r7 implements Converter {
    public final C4808q7 a;

    public C4831r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C4855s7 c4855s7) {
        return MessageNano.toByteArray(this.a.fromModel(c4855s7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C4855s7) obj));
    }

    public C4831r7(C4808q7 c4808q7) {
        this.a = c4808q7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4855s7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.p7 r0 = new io.appmetrica.analytics.impl.p7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.p7 r2 = (io.appmetrica.analytics.impl.C4784p7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.p7 r2 = new io.appmetrica.analytics.impl.p7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.p7 r2 = new io.appmetrica.analytics.impl.p7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.q7 r0 = r1.a
            io.appmetrica.analytics.impl.s7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4831r7.toModel(byte[]):io.appmetrica.analytics.impl.s7");
    }

    public /* synthetic */ C4831r7(C4808q7 c4808q7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4808q7(null, 1, null) : c4808q7);
    }
}
