package com.yandex.metrica.impl.p022ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.me */
/* loaded from: classes2.dex */
public class C3442me implements InterfaceC3208de {

    /* renamed from: a */
    private Set<String> f24264a;

    public C3442me(List<C3338ie> list) {
        if (list == null) {
            this.f24264a = new HashSet();
            return;
        }
        this.f24264a = new HashSet(list.size());
        for (C3338ie c3338ie : list) {
            if (c3338ie.f23648b) {
                this.f24264a.add(c3338ie.f23647a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3208de
    /* renamed from: a */
    public boolean mo15685a(String str) {
        return this.f24264a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f24264a + '}';
    }
}
