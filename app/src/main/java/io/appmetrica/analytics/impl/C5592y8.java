package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y8 */
/* loaded from: classes2.dex */
public class C5592y8 implements StateSerializer {

    /* renamed from: a */
    public final StateSerializer f32850a;

    /* renamed from: b */
    public final AESEncrypter f32851b;

    public C5592y8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f32850a = stateSerializer;
        this.f32851b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f32850a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f32851b.encrypt(this.f32850a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f32850a.toState(this.f32851b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
