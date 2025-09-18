package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class H {
    public final a a;
    public final Boolean b;

    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public H(a aVar, Boolean bool) {
        this.a = aVar;
        this.b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h = (H) obj;
        if (this.a != h.a) {
            return false;
        }
        Boolean bool = this.b;
        return bool != null ? bool.equals(h.b) : h.b == null;
    }

    public int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
