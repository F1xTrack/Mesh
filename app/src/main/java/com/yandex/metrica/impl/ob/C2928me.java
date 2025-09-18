package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2928me implements InterfaceC2704de {
    private Set<String> a;

    public C2928me(List<C2829ie> list) {
        if (list == null) {
            this.a = new HashSet();
            return;
        }
        this.a = new HashSet(list.size());
        for (C2829ie c2829ie : list) {
            if (c2829ie.b) {
                this.a.add(c2829ie.a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2704de
    public boolean a(String str) {
        return this.a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.a + '}';
    }
}
