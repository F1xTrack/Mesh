package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.g1 */
/* loaded from: classes2.dex */
public class C3273g1 implements Parcelable {
    public static final Parcelable.Creator<C3273g1> CREATOR = new a();

    /* renamed from: a */
    public final String f23462a;

    /* renamed from: b */
    public final EnumC3221e1 f23463b;

    /* renamed from: c */
    public final String f23464c;

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public class a implements Parcelable.Creator<C3273g1> {
        @Override // android.os.Parcelable.Creator
        public C3273g1 createFromParcel(Parcel parcel) {
            return new C3273g1(parcel.readString(), EnumC3221e1.m15810a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C3273g1[] newArray(int i) {
            return new C3273g1[i];
        }
    }

    public C3273g1(String str, EnumC3221e1 enumC3221e1, String str2) {
        this.f23462a = str;
        this.f23463b = enumC3221e1;
        this.f23464c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3273g1.class != obj.getClass()) {
            return false;
        }
        C3273g1 c3273g1 = (C3273g1) obj;
        String str = this.f23462a;
        if (str == null ? c3273g1.f23462a != null : !str.equals(c3273g1.f23462a)) {
            return false;
        }
        if (this.f23463b != c3273g1.f23463b) {
            return false;
        }
        String str2 = this.f23464c;
        return str2 != null ? str2.equals(c3273g1.f23464c) : c3273g1.f23464c == null;
    }

    public int hashCode() {
        String str = this.f23462a;
        int iHashCode = (this.f23463b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.f23464c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentifiersResultInternal{mId='");
        sb.append(this.f23462a);
        sb.append("', mStatus=");
        sb.append(this.f23463b);
        sb.append(", mErrorExplanation='");
        return AbstractC1374Vq.m8593l(sb, this.f23464c, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23462a);
        parcel.writeString(this.f23463b.m15811a());
        parcel.writeString(this.f23464c);
    }
}
