package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.em */
/* loaded from: classes2.dex */
public class C3242em implements Parcelable {
    public static final Parcelable.Creator<C3242em> CREATOR = new a();

    /* renamed from: a */
    public final b f23374a;

    /* renamed from: b */
    public final String f23375b;

    /* renamed from: com.yandex.metrica.impl.ob.em$a */
    public class a implements Parcelable.Creator<C3242em> {
        @Override // android.os.Parcelable.Creator
        public C3242em createFromParcel(Parcel parcel) {
            return new C3242em(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3242em[] newArray(int i) {
            return new C3242em[i];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);


        /* renamed from: a */
        public final int f23381a;

        b(int i) {
            this.f23381a = i;
        }

        /* renamed from: a */
        public static b m15861a(int i) {
            b[] bVarArrValues = values();
            for (int i2 = 0; i2 < 4; i2++) {
                b bVar = bVarArrValues[i2];
                if (bVar.f23381a == i) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C3242em(b bVar, String str) {
        this.f23374a = bVar;
        this.f23375b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3242em.class != obj.getClass()) {
            return false;
        }
        C3242em c3242em = (C3242em) obj;
        if (this.f23374a != c3242em.f23374a) {
            return false;
        }
        return this.f23375b.equals(c3242em.f23375b);
    }

    public int hashCode() {
        return this.f23375b.hashCode() + (this.f23374a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiParsingFilter{type=");
        sb.append(this.f23374a);
        sb.append(", value='");
        return AbstractC1374Vq.m8593l(sb, this.f23375b, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23374a.f23381a);
        parcel.writeString(this.f23375b);
    }

    public C3242em(Parcel parcel) {
        this.f23374a = b.m15861a(parcel.readInt());
        this.f23375b = (String) C3762ym.m17269a(parcel.readString(), "");
    }
}
