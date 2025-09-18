package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.Il */
/* loaded from: classes2.dex */
public class C2688Il implements Parcelable {
    public static final Parcelable.Creator<C2688Il> CREATOR = new a();

    /* renamed from: a */
    public final boolean f21448a;

    /* renamed from: b */
    public final boolean f21449b;

    /* renamed from: c */
    public final boolean f21450c;

    /* renamed from: d */
    public final boolean f21451d;

    /* renamed from: e */
    public final C3164bm f21452e;

    /* renamed from: f */
    public final C2738Kl f21453f;

    /* renamed from: g */
    public final C2738Kl f21454g;

    /* renamed from: h */
    public final C2738Kl f21455h;

    /* renamed from: com.yandex.metrica.impl.ob.Il$a */
    public class a implements Parcelable.Creator<C2688Il> {
        @Override // android.os.Parcelable.Creator
        public C2688Il createFromParcel(Parcel parcel) {
            return new C2688Il(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C2688Il[] newArray(int i) {
            return new C2688Il[i];
        }
    }

    public C2688Il(C2885Qi c2885Qi) {
        this(c2885Qi.m14880f().f24718k, c2885Qi.m14880f().f24720m, c2885Qi.m14880f().f24719l, c2885Qi.m14880f().f24721n, c2885Qi.m14871T(), c2885Qi.m14870S(), c2885Qi.m14869R(), c2885Qi.m14872U());
    }

    /* renamed from: a */
    public boolean m14368a() {
        return (this.f21452e == null || this.f21453f == null || this.f21454g == null || this.f21455h == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2688Il.class != obj.getClass()) {
            return false;
        }
        C2688Il c2688Il = (C2688Il) obj;
        if (this.f21448a != c2688Il.f21448a || this.f21449b != c2688Il.f21449b || this.f21450c != c2688Il.f21450c || this.f21451d != c2688Il.f21451d) {
            return false;
        }
        C3164bm c3164bm = this.f21452e;
        if (c3164bm == null ? c2688Il.f21452e != null : !c3164bm.equals(c2688Il.f21452e)) {
            return false;
        }
        C2738Kl c2738Kl = this.f21453f;
        if (c2738Kl == null ? c2688Il.f21453f != null : !c2738Kl.equals(c2688Il.f21453f)) {
            return false;
        }
        C2738Kl c2738Kl2 = this.f21454g;
        if (c2738Kl2 == null ? c2688Il.f21454g != null : !c2738Kl2.equals(c2688Il.f21454g)) {
            return false;
        }
        C2738Kl c2738Kl3 = this.f21455h;
        return c2738Kl3 != null ? c2738Kl3.equals(c2688Il.f21455h) : c2688Il.f21455h == null;
    }

    public int hashCode() {
        int i = (((((((this.f21448a ? 1 : 0) * 31) + (this.f21449b ? 1 : 0)) * 31) + (this.f21450c ? 1 : 0)) * 31) + (this.f21451d ? 1 : 0)) * 31;
        C3164bm c3164bm = this.f21452e;
        int iHashCode = (i + (c3164bm != null ? c3164bm.hashCode() : 0)) * 31;
        C2738Kl c2738Kl = this.f21453f;
        int iHashCode2 = (iHashCode + (c2738Kl != null ? c2738Kl.hashCode() : 0)) * 31;
        C2738Kl c2738Kl2 = this.f21454g;
        int iHashCode3 = (iHashCode2 + (c2738Kl2 != null ? c2738Kl2.hashCode() : 0)) * 31;
        C2738Kl c2738Kl3 = this.f21455h;
        return iHashCode3 + (c2738Kl3 != null ? c2738Kl3.hashCode() : 0);
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.f21448a + ", uiEventSendingEnabled=" + this.f21449b + ", uiCollectingForBridgeEnabled=" + this.f21450c + ", uiRawEventSendingEnabled=" + this.f21451d + ", uiParsingConfig=" + this.f21452e + ", uiEventSendingConfig=" + this.f21453f + ", uiCollectingForBridgeConfig=" + this.f21454g + ", uiRawEventSendingConfig=" + this.f21455h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f21448a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21449b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21450c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21451d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f21452e, i);
        parcel.writeParcelable(this.f21453f, i);
        parcel.writeParcelable(this.f21454g, i);
        parcel.writeParcelable(this.f21455h, i);
    }

    public C2688Il(boolean z, boolean z2, boolean z3, boolean z4, C3164bm c3164bm, C2738Kl c2738Kl, C2738Kl c2738Kl2, C2738Kl c2738Kl3) {
        this.f21448a = z;
        this.f21449b = z2;
        this.f21450c = z3;
        this.f21451d = z4;
        this.f21452e = c3164bm;
        this.f21453f = c2738Kl;
        this.f21454g = c2738Kl2;
        this.f21455h = c2738Kl3;
    }

    public C2688Il(Parcel parcel) {
        this.f21448a = parcel.readByte() != 0;
        this.f21449b = parcel.readByte() != 0;
        this.f21450c = parcel.readByte() != 0;
        this.f21451d = parcel.readByte() != 0;
        this.f21452e = (C3164bm) parcel.readParcelable(C3164bm.class.getClassLoader());
        this.f21453f = (C2738Kl) parcel.readParcelable(C2738Kl.class.getClassLoader());
        this.f21454g = (C2738Kl) parcel.readParcelable(C2738Kl.class.getClassLoader());
        this.f21455h = (C2738Kl) parcel.readParcelable(C2738Kl.class.getClassLoader());
    }
}
