package com.yandex.metrica;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class w {
    public String a;
    public String b;
    public HashMap c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        String str = this.a;
        if (str == null ? wVar.a != null : !str.equals(wVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? wVar.b != null : !str2.equals(wVar.b)) {
            return false;
        }
        HashMap map = this.c;
        HashMap map2 = wVar.c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HashMap map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
