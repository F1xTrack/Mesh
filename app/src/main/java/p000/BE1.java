package p000;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class BE1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BE1> CREATOR = new C8697aD1(2);

    /* renamed from: a */
    public final int f668a;

    /* renamed from: b */
    public final IBinder f669b;

    /* renamed from: c */
    public final IBinder f670c;

    /* renamed from: d */
    public final PendingIntent f671d;

    /* renamed from: e */
    public final String f672e;

    /* renamed from: f */
    public final String f673f;

    public BE1(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f668a = i;
        this.f669b = iBinder;
        this.f670c = iBinder2;
        this.f671d = pendingIntent;
        this.f672e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f673f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f668a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f669b, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f670c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f671d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f672e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f673f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
