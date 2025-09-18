package com.yandex.metrica.impl.ob;

import java.io.File;

/* loaded from: classes2.dex */
public final class Q7 implements Vm<File, String> {
    private final K7 a;
    private final P7 b;

    public Q7(K7 k7, P7 p7) {
        this.a = k7;
        this.b = p7;
    }

    @Override // com.yandex.metrica.impl.ob.Vm
    public String a(File file) {
        return this.b.a(file, this.a);
    }
}
