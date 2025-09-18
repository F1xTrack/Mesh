package p000;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u */
/* loaded from: classes.dex */
public final class C6921u implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f43440a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f43440a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC6984v.f44063b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C3907d6(parcel, null);
            case 2:
                return new C1114Ri(parcel, (ClassLoader) null);
            case 3:
                return new C0180Cr(parcel, null);
            case 4:
                return new C6714qz(parcel, null);
            case 5:
                return new C0148CL(parcel, null);
            case 6:
                return new C1292UX(parcel, null);
            case 7:
                return new C8328Tn0(parcel, null);
            case 8:
                return new IO0(parcel, null);
            case 9:
                return new C9637hX0(parcel, null);
            case 10:
                return new D01(parcel, (ClassLoader) null);
            case 11:
                return new C11509w91(parcel, null);
            case 12:
                return new C9134db1(parcel, null);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C9922jl1(parcel, null);
                }
                C9922jl1 c9922jl1 = new C9922jl1(parcel);
                c9922jl1.f35368a = parcel.readInt();
                c9922jl1.f35369b = parcel.readInt();
                c9922jl1.f35370c = parcel.readParcelable(null);
                return c9922jl1;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f43440a) {
            case 0:
                return new AbstractC6984v[i];
            case 1:
                return new C3907d6[i];
            case 2:
                return new C1114Ri[i];
            case 3:
                return new C0180Cr[i];
            case 4:
                return new C6714qz[i];
            case 5:
                return new C0148CL[i];
            case 6:
                return new C1292UX[i];
            case 7:
                return new C8328Tn0[i];
            case 8:
                return new IO0[i];
            case 9:
                return new C9637hX0[i];
            case 10:
                return new D01[i];
            case 11:
                return new C11509w91[i];
            case 12:
                return new C9134db1[i];
            default:
                return new C9922jl1[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f43440a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC6984v.f44063b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C3907d6(parcel, classLoader);
            case 2:
                return new C1114Ri(parcel, classLoader);
            case 3:
                return new C0180Cr(parcel, classLoader);
            case 4:
                return new C6714qz(parcel, classLoader);
            case 5:
                return new C0148CL(parcel, classLoader);
            case 6:
                return new C1292UX(parcel, classLoader);
            case 7:
                return new C8328Tn0(parcel, classLoader);
            case 8:
                return new IO0(parcel, classLoader);
            case 9:
                return new C9637hX0(parcel, classLoader);
            case 10:
                return new D01(parcel, classLoader);
            case 11:
                return new C11509w91(parcel, classLoader);
            case 12:
                return new C9134db1(parcel, classLoader);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C9922jl1(parcel, classLoader);
                }
                C9922jl1 c9922jl1 = new C9922jl1(parcel);
                c9922jl1.f35368a = parcel.readInt();
                c9922jl1.f35369b = parcel.readInt();
                c9922jl1.f35370c = parcel.readParcelable(null);
                return c9922jl1;
        }
    }
}
