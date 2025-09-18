package com.yandex.metrica.impl.ob;

import defpackage.F91;

/* renamed from: com.yandex.metrica.impl.ob.ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2829ie {
    public final String a;
    public final boolean b;

    public C2829ie(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2829ie.class != obj.getClass()) {
            return false;
        }
        C2829ie c2829ie = (C2829ie) obj;
        if (this.b != c2829ie.b) {
            return false;
        }
        return this.a.equals(c2829ie.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PermissionState{name='");
        sb.append(this.a);
        sb.append("', granted=");
        return F91.w(sb, this.b, '}');
    }
}
