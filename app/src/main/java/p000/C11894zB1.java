package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: zB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11894zB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11894zB1> CREATOR = new C7363Ay1(20);

    /* renamed from: a */
    public final String f46717a;

    /* renamed from: b */
    public final C10362nB1 f46718b;

    /* renamed from: c */
    public final String f46719c;

    /* renamed from: d */
    public final long f46720d;

    public C11894zB1(C11894zB1 c11894zB1, long j) {
        Preconditions.checkNotNull(c11894zB1);
        this.f46717a = c11894zB1.f46717a;
        this.f46718b = c11894zB1.f46718b;
        this.f46719c = c11894zB1.f46719c;
        this.f46720d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f46718b);
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(this.f46719c);
        sb.append(",name=");
        return AbstractC11153tN0.m24914z(sb, this.f46717a, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f46717a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f46718b, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46719c, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f46720d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C11894zB1(String str, C10362nB1 c10362nB1, String str2, long j) {
        this.f46717a = str;
        this.f46718b = c10362nB1;
        this.f46719c = str2;
        this.f46720d = j;
    }
}
