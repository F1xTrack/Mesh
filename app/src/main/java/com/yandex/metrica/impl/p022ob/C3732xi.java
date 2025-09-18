package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC1374Vq;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.xi */
/* loaded from: classes2.dex */
public final class C3732xi implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a */
    private final Boolean f25253a;

    /* renamed from: b */
    private final EnumC3221e1 f25254b;

    /* renamed from: c */
    private final String f25255c;

    /* renamed from: com.yandex.metrica.impl.ob.xi$a */
    public static final class a implements Parcelable.Creator<C3732xi> {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        public C3732xi createFromParcel(Parcel parcel) {
            Object value = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(value instanceof Boolean)) {
                value = null;
            }
            EnumC3221e1 enumC3221e1M15810a = EnumC3221e1.m15810a(parcel.readString());
            O90.m5967e(enumC3221e1M15810a, "IdentifierStatus.from(parcel.readString())");
            return new C3732xi((Boolean) value, enumC3221e1M15810a, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C3732xi[] newArray(int i) {
            return new C3732xi[i];
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3732xi(Boolean bool, EnumC3221e1 enumC3221e1, String str) {
        this.f25253a = bool;
        this.f25254b = enumC3221e1;
        this.f25255c = str;
    }

    /* renamed from: a */
    public final String m17189a() {
        return this.f25255c;
    }

    /* renamed from: b */
    public final Boolean m17190b() {
        return this.f25253a;
    }

    /* renamed from: c */
    public final EnumC3221e1 m17191c() {
        return this.f25254b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3732xi)) {
            return false;
        }
        C3732xi c3732xi = (C3732xi) obj;
        return O90.m5963a(this.f25253a, c3732xi.f25253a) && O90.m5963a(this.f25254b, c3732xi.f25254b) && O90.m5963a(this.f25255c, c3732xi.f25255c);
    }

    public int hashCode() {
        Boolean bool = this.f25253a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        EnumC3221e1 enumC3221e1 = this.f25254b;
        int iHashCode2 = (iHashCode + (enumC3221e1 != null ? enumC3221e1.hashCode() : 0)) * 31;
        String str = this.f25255c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.f25253a);
        sb.append(", status=");
        sb.append(this.f25254b);
        sb.append(", errorExplanation=");
        return AbstractC1374Vq.m8593l(sb, this.f25255c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f25253a);
        parcel.writeString(this.f25254b.m15811a());
        parcel.writeString(this.f25255c);
    }

    public C3732xi() {
        this(null, EnumC3221e1.UNKNOWN, null);
    }
}
