package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2275bA1 implements InterfaceC0877Kz1 {
    public final String a;
    public final ArrayList b;

    public C2275bA1(String str, ArrayList arrayList) {
        this.a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2275bA1)) {
            return false;
        }
        C2275bA1 c2275bA1 = (C2275bA1) obj;
        String str = this.a;
        if (str == null ? c2275bA1.a != null : !str.equals(c2275bA1.a)) {
            return false;
        }
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = c2275bA1.b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Iterator m() {
        return null;
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 zzc() {
        return this;
    }
}
