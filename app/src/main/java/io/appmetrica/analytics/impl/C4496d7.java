package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.d7 */
/* loaded from: classes2.dex */
public final class C4496d7 implements Converter {
    public final C4471c7 a;

    public C4496d7() {
        this(null, 1, null);
    }

    public final byte[] a(C4521e7 c4521e7) {
        return MessageNano.toByteArray(this.a.fromModel(c4521e7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((C4521e7) obj));
    }

    public C4496d7(C4471c7 c4471c7) {
        this.a = c4471c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:15:0x0002, B:17:0x000f), top: B:22:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4521e7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.n7 r0 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.n7 r2 = (io.appmetrica.analytics.impl.C4736n7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.n7 r2 = new io.appmetrica.analytics.impl.n7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.c7 r0 = r1.a
            io.appmetrica.analytics.impl.e7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4496d7.toModel(byte[]):io.appmetrica.analytics.impl.e7");
    }

    public /* synthetic */ C4496d7(C4471c7 c4471c7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4471c7(null, null, 3, null) : c4471c7);
    }
}
