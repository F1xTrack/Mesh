package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Us0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8390Us0 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C8390Us0> CREATOR = new C7856Kl0(11);

    /* renamed from: a */
    public final long f12181a;

    /* renamed from: b */
    public final long f12182b;

    /* renamed from: c */
    public final long f12183c;

    /* renamed from: d */
    public final long f12184d;

    /* renamed from: e */
    public final long f12185e;

    public C8390Us0(long j, long j2, long j3, long j4, long j5) {
        this.f12181a = j;
        this.f12182b = j2;
        this.f12183c = j3;
        this.f12184d = j4;
        this.f12185e = j5;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final /* synthetic */ void mo31d0(C11209tp0 c11209tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: e0 */
    public final /* synthetic */ byte[] mo32e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8390Us0.class != obj.getClass()) {
            return false;
        }
        C8390Us0 c8390Us0 = (C8390Us0) obj;
        return this.f12181a == c8390Us0.f12181a && this.f12182b == c8390Us0.f12182b && this.f12183c == c8390Us0.f12183c && this.f12184d == c8390Us0.f12184d && this.f12185e == c8390Us0.f12185e;
    }

    public final int hashCode() {
        return AbstractC9809it0.m21935a(this.f12185e) + ((AbstractC9809it0.m21935a(this.f12184d) + ((AbstractC9809it0.m21935a(this.f12183c) + ((AbstractC9809it0.m21935a(this.f12182b) + ((AbstractC9809it0.m21935a(this.f12181a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12181a + ", photoSize=" + this.f12182b + ", photoPresentationTimestampUs=" + this.f12183c + ", videoStartPosition=" + this.f12184d + ", videoSize=" + this.f12185e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12181a);
        parcel.writeLong(this.f12182b);
        parcel.writeLong(this.f12183c);
        parcel.writeLong(this.f12184d);
        parcel.writeLong(this.f12185e);
    }

    public C8390Us0(Parcel parcel) {
        this.f12181a = parcel.readLong();
        this.f12182b = parcel.readLong();
        this.f12183c = parcel.readLong();
        this.f12184d = parcel.readLong();
        this.f12185e = parcel.readLong();
    }
}
