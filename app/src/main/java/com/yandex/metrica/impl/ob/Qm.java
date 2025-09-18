package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public enum Qm {
    LOGIN("login"),
    LOGOUT("logout"),
    SWITCH("switch"),
    UPDATE("update");

    private String a;

    Qm(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
