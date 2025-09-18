package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2766g1 implements Parcelable {
    public static final Parcelable.Creator<C2766g1> CREATOR = new a();
    public final String a;
    public final EnumC2716e1 b;
    public final String c;

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public class a implements Parcelable.Creator<C2766g1> {
        @Override // android.os.Parcelable.Creator
        public C2766g1 createFromParcel(Parcel parcel) {
            return new C2766g1(parcel.readString(), EnumC2716e1.a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C2766g1[] newArray(int i) {
            return new C2766g1[i];
        }
    }

    public C2766g1(String str, EnumC2716e1 enumC2716e1, String str2) {
        this.a = str;
        this.b = enumC2716e1;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2766g1.class != obj.getClass()) {
            return false;
        }
        C2766g1 c2766g1 = (C2766g1) obj;
        String str = this.a;
        if (str == null ? c2766g1.a != null : !str.equals(c2766g1.a)) {
            return false;
        }
        if (this.b != c2766g1.b) {
            return false;
        }
        String str2 = this.c;
        return str2 != null ? str2.equals(c2766g1.c) : c2766g1.c == null;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdentifiersResultInternal{mId='");
        sb.append(this.a);
        sb.append("', mStatus=");
        sb.append(this.b);
        sb.append(", mErrorExplanation='");
        return AbstractC1705Vq.l(sb, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.a());
        parcel.writeString(this.c);
    }
}
