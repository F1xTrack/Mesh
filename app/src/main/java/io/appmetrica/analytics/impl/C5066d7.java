package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.d7 */
/* loaded from: classes2.dex */
public final class C5066d7 implements Converter {

    /* renamed from: a */
    public final C5041c7 f31470a;

    public C5066d7() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public final byte[] m20269a(C5091e7 c5091e7) {
        return MessageNano.toByteArray(this.f31470a.fromModel(c5091e7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f31470a.fromModel((C5091e7) obj));
    }

    public C5066d7(C5041c7 c5041c7) {
        this.f31470a = c5041c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:15:0x0002, B:17:0x000f), top: B:22:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5091e7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.n7 r0 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.n7 r2 = (io.appmetrica.analytics.impl.C5316n7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.c7 r0 = r1.f31470a
            io.appmetrica.analytics.impl.e7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5066d7.toModel(byte[]):io.appmetrica.analytics.impl.e7");
    }

    public /* synthetic */ C5066d7(C5041c7 c5041c7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5041c7(null, null, 3, null) : c5041c7);
    }
}
