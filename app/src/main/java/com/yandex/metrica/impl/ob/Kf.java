package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Kf extends AbstractC2714e {
    private static volatile Kf[] d;
    public byte[] b;
    public byte[] c;

    public Kf() {
        b();
    }

    public static Kf[] c() {
        if (d == null) {
            synchronized (C2664c.a) {
                try {
                    if (d == null) {
                        d = new Kf[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        byte[] bArr = this.b;
        byte[] bArr2 = C2764g.d;
        if (!Arrays.equals(bArr, bArr2)) {
            c2639b.b(1, this.b);
        }
        if (Arrays.equals(this.c, bArr2)) {
            return;
        }
        c2639b.b(2, this.c);
    }

    public Kf b() {
        byte[] bArr = C2764g.d;
        this.b = bArr;
        this.c = bArr;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        byte[] bArr = this.b;
        byte[] bArr2 = C2764g.d;
        int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
        return !Arrays.equals(this.c, bArr2) ? iA + C2639b.a(2, this.c) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.b = c2614a.d();
            } else if (iL != 18) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.c = c2614a.d();
            }
        }
        return this;
    }
}
