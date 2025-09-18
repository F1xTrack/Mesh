package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.em */
/* loaded from: classes2.dex */
public class C2737em implements Parcelable {
    public static final Parcelable.Creator<C2737em> CREATOR = new a();
    public final b a;
    public final String b;

    /* renamed from: com.yandex.metrica.impl.ob.em$a */
    public class a implements Parcelable.Creator<C2737em> {
        @Override // android.os.Parcelable.Creator
        public C2737em createFromParcel(Parcel parcel) {
            return new C2737em(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C2737em[] newArray(int i) {
            return new C2737em[i];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);

        public final int a;

        b(int i) {
            this.a = i;
        }

        public static b a(int i) {
            b[] bVarArrValues = values();
            for (int i2 = 0; i2 < 4; i2++) {
                b bVar = bVarArrValues[i2];
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C2737em(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2737em.class != obj.getClass()) {
            return false;
        }
        C2737em c2737em = (C2737em) obj;
        if (this.a != c2737em.a) {
            return false;
        }
        return this.b.equals(c2737em.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiParsingFilter{type=");
        sb.append(this.a);
        sb.append(", value='");
        return AbstractC1705Vq.l(sb, this.b, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a);
        parcel.writeString(this.b);
    }

    public C2737em(Parcel parcel) {
        this.a = b.a(parcel.readInt());
        this.b = (String) C3240ym.a(parcel.readString(), "");
    }
}
