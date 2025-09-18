package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Kl */
/* loaded from: classes2.dex */
public class C2738Kl implements Parcelable {
    public static final Parcelable.Creator<C2738Kl> CREATOR = new a();

    /* renamed from: a */
    public final boolean f21592a;

    /* renamed from: b */
    public final boolean f21593b;

    /* renamed from: c */
    public final boolean f21594c;

    /* renamed from: d */
    public final boolean f21595d;

    /* renamed from: e */
    public final boolean f21596e;

    /* renamed from: f */
    public final boolean f21597f;

    /* renamed from: g */
    public final boolean f21598g;

    /* renamed from: h */
    public final boolean f21599h;

    /* renamed from: i */
    public final boolean f21600i;

    /* renamed from: j */
    public final boolean f21601j;

    /* renamed from: k */
    public final int f21602k;

    /* renamed from: l */
    public final int f21603l;

    /* renamed from: m */
    public final int f21604m;

    /* renamed from: n */
    public final int f21605n;

    /* renamed from: o */
    public final int f21606o;

    /* renamed from: p */
    public final List<C3242em> f21607p;

    /* renamed from: com.yandex.metrica.impl.ob.Kl$a */
    public class a implements Parcelable.Creator<C2738Kl> {
        @Override // android.os.Parcelable.Creator
        public C2738Kl createFromParcel(Parcel parcel) {
            return new C2738Kl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C2738Kl[] newArray(int i) {
            return new C2738Kl[i];
        }
    }

    public C2738Kl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, int i2, int i3, int i4, int i5, List<C3242em> list) {
        this.f21592a = z;
        this.f21593b = z2;
        this.f21594c = z3;
        this.f21595d = z4;
        this.f21596e = z5;
        this.f21597f = z6;
        this.f21598g = z7;
        this.f21599h = z8;
        this.f21600i = z9;
        this.f21601j = z10;
        this.f21602k = i;
        this.f21603l = i2;
        this.f21604m = i3;
        this.f21605n = i4;
        this.f21606o = i5;
        this.f21607p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2738Kl.class != obj.getClass()) {
            return false;
        }
        C2738Kl c2738Kl = (C2738Kl) obj;
        if (this.f21592a == c2738Kl.f21592a && this.f21593b == c2738Kl.f21593b && this.f21594c == c2738Kl.f21594c && this.f21595d == c2738Kl.f21595d && this.f21596e == c2738Kl.f21596e && this.f21597f == c2738Kl.f21597f && this.f21598g == c2738Kl.f21598g && this.f21599h == c2738Kl.f21599h && this.f21600i == c2738Kl.f21600i && this.f21601j == c2738Kl.f21601j && this.f21602k == c2738Kl.f21602k && this.f21603l == c2738Kl.f21603l && this.f21604m == c2738Kl.f21604m && this.f21605n == c2738Kl.f21605n && this.f21606o == c2738Kl.f21606o) {
            return this.f21607p.equals(c2738Kl.f21607p);
        }
        return false;
    }

    public int hashCode() {
        return this.f21607p.hashCode() + ((((((((((((((((((((((((((((((this.f21592a ? 1 : 0) * 31) + (this.f21593b ? 1 : 0)) * 31) + (this.f21594c ? 1 : 0)) * 31) + (this.f21595d ? 1 : 0)) * 31) + (this.f21596e ? 1 : 0)) * 31) + (this.f21597f ? 1 : 0)) * 31) + (this.f21598g ? 1 : 0)) * 31) + (this.f21599h ? 1 : 0)) * 31) + (this.f21600i ? 1 : 0)) * 31) + (this.f21601j ? 1 : 0)) * 31) + this.f21602k) * 31) + this.f21603l) * 31) + this.f21604m) * 31) + this.f21605n) * 31) + this.f21606o) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiCollectingConfig{textSizeCollecting=");
        sb.append(this.f21592a);
        sb.append(", relativeTextSizeCollecting=");
        sb.append(this.f21593b);
        sb.append(", textVisibilityCollecting=");
        sb.append(this.f21594c);
        sb.append(", textStyleCollecting=");
        sb.append(this.f21595d);
        sb.append(", infoCollecting=");
        sb.append(this.f21596e);
        sb.append(", nonContentViewCollecting=");
        sb.append(this.f21597f);
        sb.append(", textLengthCollecting=");
        sb.append(this.f21598g);
        sb.append(", viewHierarchical=");
        sb.append(this.f21599h);
        sb.append(", ignoreFiltered=");
        sb.append(this.f21600i);
        sb.append(", webViewUrlsCollecting=");
        sb.append(this.f21601j);
        sb.append(", tooLongTextBound=");
        sb.append(this.f21602k);
        sb.append(", truncatedTextBound=");
        sb.append(this.f21603l);
        sb.append(", maxEntitiesCount=");
        sb.append(this.f21604m);
        sb.append(", maxFullContentLength=");
        sb.append(this.f21605n);
        sb.append(", webViewUrlLimit=");
        sb.append(this.f21606o);
        sb.append(", filters=");
        return AbstractC11153tN0.m24883A(sb, this.f21607p, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f21592a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21593b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21594c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21595d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21596e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21597f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21598g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21599h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21600i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21601j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f21602k);
        parcel.writeInt(this.f21603l);
        parcel.writeInt(this.f21604m);
        parcel.writeInt(this.f21605n);
        parcel.writeInt(this.f21606o);
        parcel.writeList(this.f21607p);
    }

    public C2738Kl(Parcel parcel) {
        this.f21592a = parcel.readByte() != 0;
        this.f21593b = parcel.readByte() != 0;
        this.f21594c = parcel.readByte() != 0;
        this.f21595d = parcel.readByte() != 0;
        this.f21596e = parcel.readByte() != 0;
        this.f21597f = parcel.readByte() != 0;
        this.f21598g = parcel.readByte() != 0;
        this.f21599h = parcel.readByte() != 0;
        this.f21600i = parcel.readByte() != 0;
        this.f21601j = parcel.readByte() != 0;
        this.f21602k = parcel.readInt();
        this.f21603l = parcel.readInt();
        this.f21604m = parcel.readInt();
        this.f21605n = parcel.readInt();
        this.f21606o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3242em.class.getClassLoader());
        this.f21607p = arrayList;
    }
}
