package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class jo<D> {
    public final a a;
    public final D b;

    public enum a {
        NEW,
        NOT_CHANGED,
        REFRESH
    }

    public jo(a aVar, D d) {
        this.a = aVar;
        this.b = d;
    }
}
