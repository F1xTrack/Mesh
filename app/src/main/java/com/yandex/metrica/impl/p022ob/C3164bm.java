package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.bm */
/* loaded from: classes2.dex */
public class C3164bm implements Parcelable {
    public static final Parcelable.Creator<C3164bm> CREATOR = new a();

    /* renamed from: a */
    public final int f23148a;

    /* renamed from: b */
    public final int f23149b;

    /* renamed from: c */
    public final int f23150c;

    /* renamed from: d */
    public final long f23151d;

    /* renamed from: e */
    public final boolean f23152e;

    /* renamed from: f */
    public final boolean f23153f;

    /* renamed from: g */
    public final boolean f23154g;

    /* renamed from: h */
    public final List<C3242em> f23155h;

    /* renamed from: com.yandex.metrica.impl.ob.bm$a */
    public class a implements Parcelable.Creator<C3164bm> {
        @Override // android.os.Parcelable.Creator
        public C3164bm createFromParcel(Parcel parcel) {
            return new C3164bm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3164bm[] newArray(int i) {
            return new C3164bm[i];
        }
    }

    public C3164bm(int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, List<C3242em> list) {
        this.f23148a = i;
        this.f23149b = i2;
        this.f23150c = i3;
        this.f23151d = j;
        this.f23152e = z;
        this.f23153f = z2;
        this.f23154g = z3;
        this.f23155h = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3164bm.class != obj.getClass()) {
            return false;
        }
        C3164bm c3164bm = (C3164bm) obj;
        if (this.f23148a == c3164bm.f23148a && this.f23149b == c3164bm.f23149b && this.f23150c == c3164bm.f23150c && this.f23151d == c3164bm.f23151d && this.f23152e == c3164bm.f23152e && this.f23153f == c3164bm.f23153f && this.f23154g == c3164bm.f23154g) {
            return this.f23155h.equals(c3164bm.f23155h);
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.f23148a * 31) + this.f23149b) * 31) + this.f23150c) * 31;
        long j = this.f23151d;
        return this.f23155h.hashCode() + ((((((((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.f23152e ? 1 : 0)) * 31) + (this.f23153f ? 1 : 0)) * 31) + (this.f23154g ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiParsingConfig{tooLongTextBound=");
        sb.append(this.f23148a);
        sb.append(", truncatedTextBound=");
        sb.append(this.f23149b);
        sb.append(", maxVisitedChildrenInLevel=");
        sb.append(this.f23150c);
        sb.append(", afterCreateTimeout=");
        sb.append(this.f23151d);
        sb.append(", relativeTextSizeCalculation=");
        sb.append(this.f23152e);
        sb.append(", errorReporting=");
        sb.append(this.f23153f);
        sb.append(", parsingAllowedByDefault=");
        sb.append(this.f23154g);
        sb.append(", filters=");
        return AbstractC11153tN0.m24883A(sb, this.f23155h, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23148a);
        parcel.writeInt(this.f23149b);
        parcel.writeInt(this.f23150c);
        parcel.writeLong(this.f23151d);
        parcel.writeByte(this.f23152e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23153f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23154g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f23155h);
    }

    public C3164bm(Parcel parcel) {
        this.f23148a = parcel.readInt();
        this.f23149b = parcel.readInt();
        this.f23150c = parcel.readInt();
        this.f23151d = parcel.readLong();
        this.f23152e = parcel.readByte() != 0;
        this.f23153f = parcel.readByte() != 0;
        this.f23154g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3242em.class.getClassLoader());
        this.f23155h = arrayList;
    }
}
