package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Wa */
/* loaded from: classes2.dex */
public class C3026Wa implements Parcelable {
    public static final Parcelable.Creator<C3026Wa> CREATOR = new a();

    /* renamed from: a */
    public final long f22681a;

    /* renamed from: b */
    public final int f22682b;

    /* renamed from: com.yandex.metrica.impl.ob.Wa$a */
    public class a implements Parcelable.Creator<C3026Wa> {
        @Override // android.os.Parcelable.Creator
        public C3026Wa createFromParcel(Parcel parcel) {
            return new C3026Wa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3026Wa[] newArray(int i) {
            return new C3026Wa[i];
        }
    }

    public C3026Wa(long j, int i) {
        this.f22681a = j;
        this.f22682b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticsConfig{expirationTimestampSeconds=");
        sb.append(this.f22681a);
        sb.append(", intervalSeconds=");
        return AbstractC7222ym.m26235l(sb, this.f22682b, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22681a);
        parcel.writeInt(this.f22682b);
    }

    public C3026Wa(Parcel parcel) {
        this.f22681a = parcel.readLong();
        this.f22682b = parcel.readInt();
    }
}
