package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4559fl {
    public final ProtobufStateStorage a;
    public final sn b;

    public C4559fl(ProtobufStateStorage protobufStateStorage, sn snVar) {
        this.a = protobufStateStorage;
        this.b = snVar;
    }

    public C4559fl(Context context) {
        this(Rl.a(C4678kl.class).a(context), C4667ka.h().A().a());
    }
}
