package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
class Sa implements InterfaceC3251z8 {
    private final InterfaceC3251z8 a;

    public Sa(Context context, D8 d8, InterfaceC3251z8 interfaceC3251z8) {
        this.a = interfaceC3251z8;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public int a(String str, int i) {
        return this.a.a(str, i);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public void b() {
        this.a.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public long a(String str, long j) {
        return this.a.a(str, j);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public String b(String str, String str2) {
        return this.a.b(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public boolean b(String str, boolean z) {
        return this.a.b(str, z);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 a(String str, boolean z) {
        this.a.a(str, z);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 b(String str) {
        this.a.b(str);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 b(String str, long j) {
        this.a.b(str, j);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public Set<String> a() {
        return this.a.a();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 b(String str, int i) {
        this.a.b(str, i);
        return this;
    }
}
