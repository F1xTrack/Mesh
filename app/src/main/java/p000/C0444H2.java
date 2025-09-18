package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1720b;
import androidx.fragment.app.C1735q;
import java.util.ArrayList;

/* renamed from: H2 */
/* loaded from: classes.dex */
public final class C0444H2 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f3996a;

    public /* synthetic */ C0444H2(int i) {
        this.f3996a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3996a) {
            case 0:
                O90.m5968f(parcel, "parcel");
                return new C0507I2(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 1:
                return new C1453X5(parcel);
            case 2:
                C3970e7 c3970e7 = new C3970e7(parcel);
                c3970e7.f26543a = parcel.readByte() != 0;
                return c3970e7;
            case 3:
                String string = parcel.readString();
                string.getClass();
                return new C0386G7(parcel.readInt(), string);
            case 4:
                return new C1078R8(parcel);
            case 5:
                return new C1720b(parcel);
            case 6:
                return new C6963uf(parcel);
            case 7:
                return new C6505nh(parcel);
            case 8:
                return new C6763rl((C8286Ss0) parcel.readParcelable(C8286Ss0.class.getClassLoader()), (C8286Ss0) parcel.readParcelable(C8286Ss0.class.getClassLoader()), (InterfaceC6700ql) parcel.readParcelable(InterfaceC6700ql.class.getClassLoader()), (C8286Ss0) parcel.readParcelable(C8286Ss0.class.getClassLoader()), parcel.readInt());
            case 9:
                return new C6643pr(parcel);
            case 10:
                return new C6706qr(parcel);
            case 11:
                return new C0938Ou(parcel);
            case 12:
                ArrayList arrayList = parcel.readArrayList(InterfaceC6700ql.class.getClassLoader());
                int i = parcel.readInt();
                InterfaceC1127Rv interfaceC1127Rv = C1190Sv.f11071d;
                if (i != 2 && i == 1) {
                    interfaceC1127Rv = C1190Sv.f11070c;
                }
                arrayList.getClass();
                return new C1190Sv(arrayList, interfaceC1127Rv);
            case 13:
                return new C1320Uz(parcel);
            case 14:
                return new C6666qD(parcel.readLong());
            case 15:
                return new C6729rD(parcel.readLong());
            case 16:
                return new C0589JL(parcel);
            case 17:
                return new C0526IL(parcel);
            case 18:
                return new C0719LP(parcel);
            case 19:
                C4123gY c4123gY = new C4123gY();
                c4123gY.f27831a = parcel.readString();
                c4123gY.f27832b = parcel.readInt();
                return c4123gY;
            case 20:
                C6307kY c6307kY = new C6307kY();
                c6307kY.f36531e = null;
                c6307kY.f36532f = new ArrayList();
                c6307kY.f36533g = new ArrayList();
                c6307kY.f36527a = parcel.createStringArrayList();
                c6307kY.f36528b = parcel.createStringArrayList();
                c6307kY.f36529c = (C1720b[]) parcel.createTypedArray(C1720b.CREATOR);
                c6307kY.f36530d = parcel.readInt();
                c6307kY.f36531e = parcel.readString();
                c6307kY.f36532f = parcel.createStringArrayList();
                c6307kY.f36533g = parcel.createTypedArrayList(C6963uf.CREATOR);
                c6307kY.f36534h = parcel.createTypedArrayList(C4123gY.CREATOR);
                return c6307kY;
            case 21:
                return new C1735q(parcel);
            case 22:
                return new M00(parcel);
            case 23:
                return new G30(parcel);
            case 24:
                return new F30(parcel);
            case 25:
                return new Q50(parcel);
            case 26:
                return new R50(parcel);
            case 27:
                O90.m5968f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                O90.m5965c(parcelable);
                return new C10613p90((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new B90(parcel);
            default:
                C8630Zi0 c8630Zi0 = new C8630Zi0();
                c8630Zi0.f15100a = parcel.readInt();
                c8630Zi0.f15101b = parcel.readInt();
                c8630Zi0.f15102c = parcel.readInt() == 1;
                return c8630Zi0;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3996a) {
            case 0:
                return new C0507I2[i];
            case 1:
                return new C1453X5[i];
            case 2:
                return new C3970e7[i];
            case 3:
                return new C0386G7[i];
            case 4:
                return new C1078R8[i];
            case 5:
                return new C1720b[i];
            case 6:
                return new C6963uf[i];
            case 7:
                return new C6505nh[i];
            case 8:
                return new C6763rl[i];
            case 9:
                return new C6643pr[i];
            case 10:
                return new C6706qr[i];
            case 11:
                return new C0938Ou[i];
            case 12:
                return new C1190Sv[i];
            case 13:
                return new C1320Uz[i];
            case 14:
                return new C6666qD[i];
            case 15:
                return new C6729rD[i];
            case 16:
                return new C0589JL[i];
            case 17:
                return new C0526IL[i];
            case 18:
                return new C0719LP[i];
            case 19:
                return new C4123gY[i];
            case 20:
                return new C6307kY[i];
            case 21:
                return new C1735q[i];
            case 22:
                return new M00[i];
            case 23:
                return new G30[i];
            case 24:
                return new F30[i];
            case 25:
                return new Q50[i];
            case 26:
                return new R50[i];
            case 27:
                return new C10613p90[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new B90[i];
            default:
                return new C8630Zi0[i];
        }
    }
}
