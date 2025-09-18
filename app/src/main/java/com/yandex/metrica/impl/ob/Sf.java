package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Sf extends AbstractC2714e {
    public byte[] b;

    public Sf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        if (Arrays.equals(this.b, C2764g.d)) {
            return;
        }
        c2639b.b(1, this.b);
    }

    public Sf b() {
        this.b = C2764g.d;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        if (Arrays.equals(this.b, C2764g.d)) {
            return 0;
        }
        return C2639b.a(1, this.b);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL != 10) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.b = c2614a.d();
            }
        }
        return this;
    }
}
