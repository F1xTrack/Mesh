package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public class V9<T> implements W9<T> {
    private final W9<T> a;
    private final C2738en b;

    public V9(W9<T> w9, C2738en c2738en) {
        this.a = w9;
        this.b = c2738en;
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public byte[] a(T t) {
        try {
            return this.b.a(this.a.a((W9<T>) t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a(byte[] bArr) throws IOException {
        try {
            C2738en c2738en = this.b;
            c2738en.getClass();
            return this.a.a(c2738en.a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // com.yandex.metrica.impl.ob.W9
    public T a() {
        return this.a.a();
    }
}
