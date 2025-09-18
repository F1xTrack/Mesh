package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1705Vq;
import defpackage.O90;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.xi */
/* loaded from: classes2.dex */
public final class C3211xi implements Parcelable {
    public static final a CREATOR = new a(null);
    private final Boolean a;
    private final EnumC2716e1 b;
    private final String c;

    /* renamed from: com.yandex.metrica.impl.ob.xi$a */
    public static final class a implements Parcelable.Creator<C3211xi> {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        public C3211xi createFromParcel(Parcel parcel) {
            Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(value instanceof Boolean)) {
                value = null;
            }
            EnumC2716e1 enumC2716e1A = EnumC2716e1.a(parcel.readString());
            O90.e(enumC2716e1A, "IdentifierStatus.from(parcel.readString())");
            return new C3211xi((Boolean) value, enumC2716e1A, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C3211xi[] newArray(int i) {
            return new C3211xi[i];
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3211xi(Boolean bool, EnumC2716e1 enumC2716e1, String str) {
        this.a = bool;
        this.b = enumC2716e1;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final Boolean b() {
        return this.a;
    }

    public final EnumC2716e1 c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3211xi)) {
            return false;
        }
        C3211xi c3211xi = (C3211xi) obj;
        return O90.a(this.a, c3211xi.a) && O90.a(this.b, c3211xi.b) && O90.a(this.c, c3211xi.c);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        EnumC2716e1 enumC2716e1 = this.b;
        int iHashCode2 = (iHashCode + (enumC2716e1 != null ? enumC2716e1.hashCode() : 0)) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return AbstractC1705Vq.l(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.a());
        parcel.writeString(this.c);
    }

    public C3211xi() {
        this(null, EnumC2716e1.UNKNOWN, null);
    }
}
