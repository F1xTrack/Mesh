package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8819bA1 implements InterfaceC7885Kz1 {

    /* renamed from: a */
    public final String f16854a;

    /* renamed from: b */
    public final ArrayList f16855b;

    public C8819bA1(String str, ArrayList arrayList) {
        this.f16854a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f16855b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8819bA1)) {
            return false;
        }
        C8819bA1 c8819bA1 = (C8819bA1) obj;
        String str = this.f16854a;
        if (str == null ? c8819bA1.f16854a != null : !str.equals(c8819bA1.f16854a)) {
            return false;
        }
        ArrayList arrayList = this.f16855b;
        ArrayList arrayList2 = c8819bA1.f16855b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f16854a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f16855b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: m */
    public final Iterator mo1959m() {
        return null;
    }

    @Override // p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // p000.InterfaceC7885Kz1
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // p000.InterfaceC7885Kz1
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // p000.InterfaceC7885Kz1
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // p000.InterfaceC7885Kz1
    public final InterfaceC7885Kz1 zzc() {
        return this;
    }
}
