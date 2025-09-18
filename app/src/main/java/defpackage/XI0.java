package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class XI0 implements Serializable {
    public final C0893Lf a;
    public final C0893Lf b;
    public final C0893Lf c;

    public XI0(C0893Lf c0893Lf, C0893Lf c0893Lf2, C0893Lf c0893Lf3) {
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The prime factor must not be null");
        }
        this.a = c0893Lf;
        if (c0893Lf2 == null) {
            throw new IllegalArgumentException("The factor CRT exponent must not be null");
        }
        this.b = c0893Lf2;
        if (c0893Lf3 == null) {
            throw new IllegalArgumentException("The factor CRT coefficient must not be null");
        }
        this.c = c0893Lf3;
    }
}
