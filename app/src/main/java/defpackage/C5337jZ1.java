package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: jZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5337jZ1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5337jZ1> CREATOR = new C2093aD1(15);
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5337jZ1(C6483pZ1 c6483pZ1) {
        String str = c6483pZ1.c;
        this(c6483pZ1.d, c6483pZ1.e, str, c6483pZ1.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLongObject(parcel, 4, this.d, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Object zza() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public C5337jZ1(long j, Object obj, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        }
    }

    public C5337jZ1(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        if (i == 1) {
            this.g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.g = d;
        }
        this.e = str2;
        this.f = str3;
    }
}
