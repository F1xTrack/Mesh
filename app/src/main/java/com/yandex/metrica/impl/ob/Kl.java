package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC7209tN0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Kl implements Parcelable {
    public static final Parcelable.Creator<Kl> CREATOR = new a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final List<C2737em> p;

    public class a implements Parcelable.Creator<Kl> {
        @Override // android.os.Parcelable.Creator
        public Kl createFromParcel(Parcel parcel) {
            return new Kl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Kl[] newArray(int i) {
            return new Kl[i];
        }
    }

    public Kl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, int i2, int i3, int i4, int i5, List<C2737em> list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Kl.class != obj.getClass()) {
            return false;
        }
        Kl kl = (Kl) obj;
        if (this.a == kl.a && this.b == kl.b && this.c == kl.c && this.d == kl.d && this.e == kl.e && this.f == kl.f && this.g == kl.g && this.h == kl.h && this.i == kl.i && this.j == kl.j && this.k == kl.k && this.l == kl.l && this.m == kl.m && this.n == kl.n && this.o == kl.o) {
            return this.p.equals(kl.p);
        }
        return false;
    }

    public int hashCode() {
        return this.p.hashCode() + ((((((((((((((((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiCollectingConfig{textSizeCollecting=");
        sb.append(this.a);
        sb.append(", relativeTextSizeCollecting=");
        sb.append(this.b);
        sb.append(", textVisibilityCollecting=");
        sb.append(this.c);
        sb.append(", textStyleCollecting=");
        sb.append(this.d);
        sb.append(", infoCollecting=");
        sb.append(this.e);
        sb.append(", nonContentViewCollecting=");
        sb.append(this.f);
        sb.append(", textLengthCollecting=");
        sb.append(this.g);
        sb.append(", viewHierarchical=");
        sb.append(this.h);
        sb.append(", ignoreFiltered=");
        sb.append(this.i);
        sb.append(", webViewUrlsCollecting=");
        sb.append(this.j);
        sb.append(", tooLongTextBound=");
        sb.append(this.k);
        sb.append(", truncatedTextBound=");
        sb.append(this.l);
        sb.append(", maxEntitiesCount=");
        sb.append(this.m);
        sb.append(", maxFullContentLength=");
        sb.append(this.n);
        sb.append(", webViewUrlLimit=");
        sb.append(this.o);
        sb.append(", filters=");
        return AbstractC7209tN0.A(sb, this.p, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeList(this.p);
    }

    public Kl(Parcel parcel) {
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readByte() != 0;
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C2737em.class.getClassLoader());
        this.p = arrayList;
    }
}
