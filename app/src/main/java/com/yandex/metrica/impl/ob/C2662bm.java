package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC7209tN0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2662bm implements Parcelable {
    public static final Parcelable.Creator<C2662bm> CREATOR = new a();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List<C2737em> h;

    /* renamed from: com.yandex.metrica.impl.ob.bm$a */
    public class a implements Parcelable.Creator<C2662bm> {
        @Override // android.os.Parcelable.Creator
        public C2662bm createFromParcel(Parcel parcel) {
            return new C2662bm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C2662bm[] newArray(int i) {
            return new C2662bm[i];
        }
    }

    public C2662bm(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, List<C2737em> list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2662bm.class != obj.getClass()) {
            return false;
        }
        C2662bm c2662bm = (C2662bm) obj;
        if (this.a == c2662bm.a && this.b == c2662bm.b && this.c == c2662bm.c && this.d == c2662bm.d && this.e == c2662bm.e && this.f == c2662bm.f && this.g == c2662bm.g) {
            return this.h.equals(c2662bm.h);
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
        long j = this.d;
        return this.h.hashCode() + ((((((((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiParsingConfig{tooLongTextBound=");
        sb.append(this.a);
        sb.append(", truncatedTextBound=");
        sb.append(this.b);
        sb.append(", maxVisitedChildrenInLevel=");
        sb.append(this.c);
        sb.append(", afterCreateTimeout=");
        sb.append(this.d);
        sb.append(", relativeTextSizeCalculation=");
        sb.append(this.e);
        sb.append(", errorReporting=");
        sb.append(this.f);
        sb.append(", parsingAllowedByDefault=");
        sb.append(this.g);
        sb.append(", filters=");
        return AbstractC7209tN0.A(sb, this.h, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.h);
    }

    public C2662bm(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C2737em.class.getClassLoader());
        this.h = arrayList;
    }
}
