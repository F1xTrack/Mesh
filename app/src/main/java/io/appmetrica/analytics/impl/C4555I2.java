package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import p000.AbstractC1374Vq;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.I2 */
/* loaded from: classes2.dex */
public class C4555I2 implements ExternalAttribution {

    /* renamed from: a */
    public final C5568x9 f30266a;

    public C4555I2(C5568x9 c5568x9) {
        this.f30266a = c5568x9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f30266a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(AbstractC4538H9.m19465a(this.f30266a.f32817a));
        sb.append("`value=`");
        return AbstractC1374Vq.m8593l(sb, new String(this.f30266a.f32818b, AbstractC7038vr.f44561a), "`)");
    }
}
