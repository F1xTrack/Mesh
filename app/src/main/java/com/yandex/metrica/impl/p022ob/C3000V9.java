package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.V9 */
/* loaded from: classes2.dex */
public class C3000V9<T> implements InterfaceC3025W9<T> {

    /* renamed from: a */
    private final InterfaceC3025W9<T> f22530a;

    /* renamed from: b */
    private final C3243en f22531b;

    public C3000V9(InterfaceC3025W9<T> interfaceC3025W9, C3243en c3243en) {
        this.f22530a = interfaceC3025W9;
        this.f22531b = c3243en;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3025W9
    /* renamed from: a */
    public byte[] mo14514a(T t) {
        try {
            return this.f22531b.m15862a(this.f22530a.mo14514a((InterfaceC3025W9<T>) t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3025W9
    /* renamed from: a */
    public T mo14196a(byte[] bArr) throws IOException {
        try {
            C3243en c3243en = this.f22531b;
            c3243en.getClass();
            return this.f22530a.mo14196a(c3243en.m15863a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3025W9
    /* renamed from: a */
    public T mo14195a() {
        return this.f22530a.mo14195a();
    }
}
