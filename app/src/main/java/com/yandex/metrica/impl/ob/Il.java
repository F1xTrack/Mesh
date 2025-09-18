package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Il implements Parcelable {
    public static final Parcelable.Creator<Il> CREATOR = new a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final C2662bm e;
    public final Kl f;
    public final Kl g;
    public final Kl h;

    public class a implements Parcelable.Creator<Il> {
        @Override // android.os.Parcelable.Creator
        public Il createFromParcel(Parcel parcel) {
            return new Il(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Il[] newArray(int i) {
            return new Il[i];
        }
    }

    public Il(Qi qi) {
        this(qi.f().k, qi.f().m, qi.f().l, qi.f().n, qi.T(), qi.S(), qi.R(), qi.U());
    }

    public boolean a() {
        return (this.e == null || this.f == null || this.g == null || this.h == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Il.class != obj.getClass()) {
            return false;
        }
        Il il = (Il) obj;
        if (this.a != il.a || this.b != il.b || this.c != il.c || this.d != il.d) {
            return false;
        }
        C2662bm c2662bm = this.e;
        if (c2662bm == null ? il.e != null : !c2662bm.equals(il.e)) {
            return false;
        }
        Kl kl = this.f;
        if (kl == null ? il.f != null : !kl.equals(il.f)) {
            return false;
        }
        Kl kl2 = this.g;
        if (kl2 == null ? il.g != null : !kl2.equals(il.g)) {
            return false;
        }
        Kl kl3 = this.h;
        return kl3 != null ? kl3.equals(il.h) : il.h == null;
    }

    public int hashCode() {
        int i = (((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        C2662bm c2662bm = this.e;
        int iHashCode = (i + (c2662bm != null ? c2662bm.hashCode() : 0)) * 31;
        Kl kl = this.f;
        int iHashCode2 = (iHashCode + (kl != null ? kl.hashCode() : 0)) * 31;
        Kl kl2 = this.g;
        int iHashCode3 = (iHashCode2 + (kl2 != null ? kl2.hashCode() : 0)) * 31;
        Kl kl3 = this.h;
        return iHashCode3 + (kl3 != null ? kl3.hashCode() : 0);
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.a + ", uiEventSendingEnabled=" + this.b + ", uiCollectingForBridgeEnabled=" + this.c + ", uiRawEventSendingEnabled=" + this.d + ", uiParsingConfig=" + this.e + ", uiEventSendingConfig=" + this.f + ", uiCollectingForBridgeConfig=" + this.g + ", uiRawEventSendingConfig=" + this.h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }

    public Il(boolean z, boolean z2, boolean z3, boolean z4, C2662bm c2662bm, Kl kl, Kl kl2, Kl kl3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = c2662bm;
        this.f = kl;
        this.g = kl2;
        this.h = kl3;
    }

    public Il(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = (C2662bm) parcel.readParcelable(C2662bm.class.getClassLoader());
        this.f = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
        this.g = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
        this.h = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
    }
}
