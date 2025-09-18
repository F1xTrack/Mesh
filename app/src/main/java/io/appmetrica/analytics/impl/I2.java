package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes2.dex */
public class I2 implements ExternalAttribution {
    public final C4977x9 a;

    public I2(C4977x9 c4977x9) {
        this.a = c4977x9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(H9.a(this.a.a));
        sb.append("`value=`");
        return AbstractC1705Vq.l(sb, new String(this.a.b, AbstractC7680vr.a), "`)");
    }
}
