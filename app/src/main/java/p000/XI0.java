package p000;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class XI0 implements Serializable {

    /* renamed from: a */
    public final C0734Lf f13665a;

    /* renamed from: b */
    public final C0734Lf f13666b;

    /* renamed from: c */
    public final C0734Lf f13667c;

    public XI0(C0734Lf c0734Lf, C0734Lf c0734Lf2, C0734Lf c0734Lf3) {
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The prime factor must not be null");
        }
        this.f13665a = c0734Lf;
        if (c0734Lf2 == null) {
            throw new IllegalArgumentException("The factor CRT exponent must not be null");
        }
        this.f13666b = c0734Lf2;
        if (c0734Lf3 == null) {
            throw new IllegalArgumentException("The factor CRT coefficient must not be null");
        }
        this.f13667c = c0734Lf3;
    }
}
