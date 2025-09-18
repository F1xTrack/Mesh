package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7325u implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC7516v.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C3327d6(parcel, null);
            case 2:
                return new C1369Ri(parcel, (ClassLoader) null);
            case 3:
                return new C0227Cr(parcel, null);
            case 4:
                return new C6750qz(parcel, null);
            case 5:
                return new CL(parcel, null);
            case 6:
                return new UX(parcel, null);
            case 7:
                return new C1541Tn0(parcel, null);
            case 8:
                return new IO0(parcel, null);
            case 9:
                return new C4172hX0(parcel, null);
            case 10:
                return new D01(parcel, (ClassLoader) null);
            case 11:
                return new C7740w91(parcel, null);
            case 12:
                return new C3422db1(parcel, null);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C5373jl1(parcel, null);
                }
                C5373jl1 c5373jl1 = new C5373jl1(parcel);
                c5373jl1.a = parcel.readInt();
                c5373jl1.b = parcel.readInt();
                c5373jl1.c = parcel.readParcelable(null);
                return c5373jl1;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbstractC7516v[i];
            case 1:
                return new C3327d6[i];
            case 2:
                return new C1369Ri[i];
            case 3:
                return new C0227Cr[i];
            case 4:
                return new C6750qz[i];
            case 5:
                return new CL[i];
            case 6:
                return new UX[i];
            case 7:
                return new C1541Tn0[i];
            case 8:
                return new IO0[i];
            case 9:
                return new C4172hX0[i];
            case 10:
                return new D01[i];
            case 11:
                return new C7740w91[i];
            case 12:
                return new C3422db1[i];
            default:
                return new C5373jl1[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC7516v.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C3327d6(parcel, classLoader);
            case 2:
                return new C1369Ri(parcel, classLoader);
            case 3:
                return new C0227Cr(parcel, classLoader);
            case 4:
                return new C6750qz(parcel, classLoader);
            case 5:
                return new CL(parcel, classLoader);
            case 6:
                return new UX(parcel, classLoader);
            case 7:
                return new C1541Tn0(parcel, classLoader);
            case 8:
                return new IO0(parcel, classLoader);
            case 9:
                return new C4172hX0(parcel, classLoader);
            case 10:
                return new D01(parcel, classLoader);
            case 11:
                return new C7740w91(parcel, classLoader);
            case 12:
                return new C3422db1(parcel, classLoader);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C5373jl1(parcel, classLoader);
                }
                C5373jl1 c5373jl1 = new C5373jl1(parcel);
                c5373jl1.a = parcel.readInt();
                c5373jl1.b = parcel.readInt();
                c5373jl1.c = parcel.readParcelable(null);
                return c5373jl1;
        }
    }
}
