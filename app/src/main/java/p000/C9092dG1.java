package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9092dG1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9092dG1> CREATOR = new C8697aD1(7);

    /* renamed from: a */
    public final long f25921a;

    /* renamed from: b */
    public final long f25922b;

    /* renamed from: c */
    public final boolean f25923c;

    /* renamed from: d */
    public final String f25924d;

    /* renamed from: e */
    public final String f25925e;

    /* renamed from: f */
    public final String f25926f;

    /* renamed from: g */
    public final Bundle f25927g;

    /* renamed from: h */
    public final String f25928h;

    public C9092dG1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f25921a = j;
        this.f25922b = j2;
        this.f25923c = z;
        this.f25924d = str;
        this.f25925e = str2;
        this.f25926f = str3;
        this.f25927g = bundle;
        this.f25928h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f25921a);
        SafeParcelWriter.writeLong(parcel, 2, this.f25922b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f25923c);
        SafeParcelWriter.writeString(parcel, 4, this.f25924d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f25925e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f25926f, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f25927g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f25928h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
