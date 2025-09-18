package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10729q31 extends AbstractC10345n31 {
    public static final Parcelable.Creator<C10729q31> CREATOR = new C7856Kl0(29);

    /* renamed from: a */
    public final long f40559a;

    /* renamed from: b */
    public final boolean f40560b;

    /* renamed from: c */
    public final boolean f40561c;

    /* renamed from: d */
    public final boolean f40562d;

    /* renamed from: e */
    public final boolean f40563e;

    /* renamed from: f */
    public final long f40564f;

    /* renamed from: g */
    public final long f40565g;

    /* renamed from: h */
    public final List f40566h;

    /* renamed from: i */
    public final boolean f40567i;

    /* renamed from: j */
    public final long f40568j;

    /* renamed from: k */
    public final int f40569k;

    /* renamed from: l */
    public final int f40570l;

    /* renamed from: m */
    public final int f40571m;

    public C10729q31(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f40559a = j;
        this.f40560b = z;
        this.f40561c = z2;
        this.f40562d = z3;
        this.f40563e = z4;
        this.f40564f = j2;
        this.f40565g = j3;
        this.f40566h = Collections.unmodifiableList(list);
        this.f40567i = z5;
        this.f40568j = j4;
        this.f40569k = i;
        this.f40570l = i2;
        this.f40571m = i3;
    }

    @Override // p000.AbstractC10345n31
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f40564f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC0852NX.m5760i(sb, this.f40565g, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f40559a);
        parcel.writeByte(this.f40560b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f40561c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f40562d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f40563e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f40564f);
        parcel.writeLong(this.f40565g);
        List list = this.f40566h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C10601p31 c10601p31 = (C10601p31) list.get(i2);
            parcel.writeInt(c10601p31.f39762a);
            parcel.writeLong(c10601p31.f39763b);
            parcel.writeLong(c10601p31.f39764c);
        }
        parcel.writeByte(this.f40567i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f40568j);
        parcel.writeInt(this.f40569k);
        parcel.writeInt(this.f40570l);
        parcel.writeInt(this.f40571m);
    }

    public C10729q31(Parcel parcel) {
        this.f40559a = parcel.readLong();
        this.f40560b = parcel.readByte() == 1;
        this.f40561c = parcel.readByte() == 1;
        this.f40562d = parcel.readByte() == 1;
        this.f40563e = parcel.readByte() == 1;
        this.f40564f = parcel.readLong();
        this.f40565g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C10601p31(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f40566h = Collections.unmodifiableList(arrayList);
        this.f40567i = parcel.readByte() == 1;
        this.f40568j = parcel.readLong();
        this.f40569k = parcel.readInt();
        this.f40570l = parcel.readInt();
        this.f40571m = parcel.readInt();
    }
}
