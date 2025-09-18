package com.yandex.metrica.impl.ob;

import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2819i4 {
    private final C9 a;
    private final I8 b;

    public C2819i4(I8 i8) {
        this(i8, new C9(i8));
    }

    public int a() {
        int iD = this.b.d();
        this.b.a(iD + 1);
        return iD;
    }

    public C2819i4(I8 i8, C9 c9) {
        this.b = i8;
        this.a = c9;
    }

    public int a(int i) throws JSONException {
        int iA = this.a.a(i);
        this.a.a(i, iA + 1);
        return iA;
    }
}
