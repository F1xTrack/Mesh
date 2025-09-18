package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class BE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BE1> CREATOR = new C2093aD1(2);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;
    public final String f;

    public BE1(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.b, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
