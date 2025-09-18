package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0444H2;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C1735q implements Parcelable {
    public static final Parcelable.Creator<C1735q> CREATOR = new C0444H2(21);

    /* renamed from: a */
    public final String f16246a;

    /* renamed from: b */
    public final String f16247b;

    /* renamed from: c */
    public final boolean f16248c;

    /* renamed from: d */
    public final int f16249d;

    /* renamed from: e */
    public final int f16250e;

    /* renamed from: f */
    public final String f16251f;

    /* renamed from: g */
    public final boolean f16252g;

    /* renamed from: h */
    public final boolean f16253h;

    /* renamed from: i */
    public final boolean f16254i;

    /* renamed from: j */
    public final boolean f16255j;

    /* renamed from: k */
    public final int f16256k;

    /* renamed from: l */
    public final String f16257l;

    /* renamed from: m */
    public final int f16258m;

    /* renamed from: n */
    public final boolean f16259n;

    public C1735q(Fragment fragment) {
        this.f16246a = fragment.getClass().getName();
        this.f16247b = fragment.mWho;
        this.f16248c = fragment.mFromLayout;
        this.f16249d = fragment.mFragmentId;
        this.f16250e = fragment.mContainerId;
        this.f16251f = fragment.mTag;
        this.f16252g = fragment.mRetainInstance;
        this.f16253h = fragment.mRemoving;
        this.f16254i = fragment.mDetached;
        this.f16255j = fragment.mHidden;
        this.f16256k = fragment.mMaxState.ordinal();
        this.f16257l = fragment.mTargetWho;
        this.f16258m = fragment.mTargetRequestCode;
        this.f16259n = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f16246a);
        sb.append(" (");
        sb.append(this.f16247b);
        sb.append(")}:");
        if (this.f16248c) {
            sb.append(" fromLayout");
        }
        int i = this.f16250e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f16251f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f16252g) {
            sb.append(" retainInstance");
        }
        if (this.f16253h) {
            sb.append(" removing");
        }
        if (this.f16254i) {
            sb.append(" detached");
        }
        if (this.f16255j) {
            sb.append(" hidden");
        }
        String str2 = this.f16257l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f16258m);
        }
        if (this.f16259n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16246a);
        parcel.writeString(this.f16247b);
        parcel.writeInt(this.f16248c ? 1 : 0);
        parcel.writeInt(this.f16249d);
        parcel.writeInt(this.f16250e);
        parcel.writeString(this.f16251f);
        parcel.writeInt(this.f16252g ? 1 : 0);
        parcel.writeInt(this.f16253h ? 1 : 0);
        parcel.writeInt(this.f16254i ? 1 : 0);
        parcel.writeInt(this.f16255j ? 1 : 0);
        parcel.writeInt(this.f16256k);
        parcel.writeString(this.f16257l);
        parcel.writeInt(this.f16258m);
        parcel.writeInt(this.f16259n ? 1 : 0);
    }

    public C1735q(Parcel parcel) {
        this.f16246a = parcel.readString();
        this.f16247b = parcel.readString();
        this.f16248c = parcel.readInt() != 0;
        this.f16249d = parcel.readInt();
        this.f16250e = parcel.readInt();
        this.f16251f = parcel.readString();
        this.f16252g = parcel.readInt() != 0;
        this.f16253h = parcel.readInt() != 0;
        this.f16254i = parcel.readInt() != 0;
        this.f16255j = parcel.readInt() != 0;
        this.f16256k = parcel.readInt();
        this.f16257l = parcel.readString();
        this.f16258m = parcel.readInt();
        this.f16259n = parcel.readInt() != 0;
    }
}
