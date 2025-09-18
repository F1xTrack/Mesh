package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: jZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9898jZ1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9898jZ1> CREATOR = new C8697aD1(15);

    /* renamed from: a */
    public final int f35238a;

    /* renamed from: b */
    public final String f35239b;

    /* renamed from: c */
    public final long f35240c;

    /* renamed from: d */
    public final Long f35241d;

    /* renamed from: e */
    public final String f35242e;

    /* renamed from: f */
    public final String f35243f;

    /* renamed from: g */
    public final Double f35244g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9898jZ1(C10666pZ1 c10666pZ1) {
        String str = c10666pZ1.f40212c;
        this(c10666pZ1.f40213d, c10666pZ1.f40214e, str, c10666pZ1.f40211b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f35238a);
        SafeParcelWriter.writeString(parcel, 2, this.f35239b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f35240c);
        SafeParcelWriter.writeLongObject(parcel, 4, this.f35241d, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.f35242e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f35243f, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.f35244g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Object zza() {
        Long l = this.f35241d;
        if (l != null) {
            return l;
        }
        Double d = this.f35244g;
        if (d != null) {
            return d;
        }
        String str = this.f35242e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public C9898jZ1(long j, Object obj, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f35238a = 2;
        this.f35239b = str;
        this.f35240c = j;
        this.f35243f = str2;
        if (obj == null) {
            this.f35241d = null;
            this.f35244g = null;
            this.f35242e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f35241d = (Long) obj;
            this.f35244g = null;
            this.f35242e = null;
        } else if (obj instanceof String) {
            this.f35241d = null;
            this.f35244g = null;
            this.f35242e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f35241d = null;
            this.f35244g = (Double) obj;
            this.f35242e = null;
        }
    }

    public C9898jZ1(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f35238a = i;
        this.f35239b = str;
        this.f35240c = j;
        this.f35241d = l;
        if (i == 1) {
            this.f35244g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f35244g = d;
        }
        this.f35242e = str2;
        this.f35243f = str3;
    }
}
