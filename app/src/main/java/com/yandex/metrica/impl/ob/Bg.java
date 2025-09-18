package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ValidationException;

/* loaded from: classes2.dex */
public class Bg extends Ag implements com.yandex.metrica.s {
    @Override // com.yandex.metrica.s
    public void b(String str, String str2) {
    }

    @Override // com.yandex.metrica.s
    public void d(String str, String str2) throws ValidationException {
        ((ro) Ag.b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }
}
