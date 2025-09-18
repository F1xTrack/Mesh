package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Ey1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7571Ey1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7571Ey1> CREATOR = new C7363Ay1(3);

    /* renamed from: a */
    public String f2987a;

    /* renamed from: b */
    public String f2988b;

    /* renamed from: c */
    public C9898jZ1 f2989c;

    /* renamed from: d */
    public long f2990d;

    /* renamed from: e */
    public boolean f2991e;

    /* renamed from: f */
    public String f2992f;

    /* renamed from: g */
    public final C11894zB1 f2993g;

    /* renamed from: h */
    public long f2994h;

    /* renamed from: i */
    public C11894zB1 f2995i;

    /* renamed from: j */
    public final long f2996j;

    /* renamed from: k */
    public final C11894zB1 f2997k;

    public C7571Ey1(C7571Ey1 c7571Ey1) {
        Preconditions.checkNotNull(c7571Ey1);
        this.f2987a = c7571Ey1.f2987a;
        this.f2988b = c7571Ey1.f2988b;
        this.f2989c = c7571Ey1.f2989c;
        this.f2990d = c7571Ey1.f2990d;
        this.f2991e = c7571Ey1.f2991e;
        this.f2992f = c7571Ey1.f2992f;
        this.f2993g = c7571Ey1.f2993g;
        this.f2994h = c7571Ey1.f2994h;
        this.f2995i = c7571Ey1.f2995i;
        this.f2996j = c7571Ey1.f2996j;
        this.f2997k = c7571Ey1.f2997k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f2987a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2988b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f2989c, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f2990d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f2991e);
        SafeParcelWriter.writeString(parcel, 7, this.f2992f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f2993g, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f2994h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f2995i, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f2996j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f2997k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C7571Ey1(String str, String str2, C9898jZ1 c9898jZ1, long j, boolean z, String str3, C11894zB1 c11894zB1, long j2, C11894zB1 c11894zB12, long j3, C11894zB1 c11894zB13) {
        this.f2987a = str;
        this.f2988b = str2;
        this.f2989c = c9898jZ1;
        this.f2990d = j;
        this.f2991e = z;
        this.f2992f = str3;
        this.f2993g = c11894zB1;
        this.f2994h = j2;
        this.f2995i = c11894zB12;
        this.f2996j = j3;
        this.f2997k = c11894zB13;
    }
}
