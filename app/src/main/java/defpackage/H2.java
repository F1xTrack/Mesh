package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import androidx.fragment.app.q;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ H2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                O90.f(parcel, "parcel");
                return new I2(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 1:
                return new X5(parcel);
            case 2:
                C3520e7 c3520e7 = new C3520e7(parcel);
                c3520e7.a = parcel.readByte() != 0;
                return c3520e7;
            case 3:
                String string = parcel.readString();
                string.getClass();
                return new G7(parcel.readInt(), string);
            case 4:
                return new R8(parcel);
            case 5:
                return new b(parcel);
            case 6:
                return new C7453uf(parcel);
            case 7:
                return new C6123nh(parcel);
            case 8:
                return new C6898rl((C1478Ss0) parcel.readParcelable(C1478Ss0.class.getClassLoader()), (C1478Ss0) parcel.readParcelable(C1478Ss0.class.getClassLoader()), (InterfaceC6708ql) parcel.readParcelable(InterfaceC6708ql.class.getClassLoader()), (C1478Ss0) parcel.readParcelable(C1478Ss0.class.getClassLoader()), parcel.readInt());
            case 9:
                return new C6535pr(parcel);
            case 10:
                return new C6726qr(parcel);
            case 11:
                return new C1171Ou(parcel);
            case 12:
                ArrayList arrayList = parcel.readArrayList(InterfaceC6708ql.class.getClassLoader());
                int i = parcel.readInt();
                InterfaceC1408Rv interfaceC1408Rv = C1486Sv.d;
                if (i != 2 && i == 1) {
                    interfaceC1408Rv = C1486Sv.c;
                }
                arrayList.getClass();
                return new C1486Sv(arrayList, interfaceC1408Rv);
            case 13:
                return new C1654Uz(parcel);
            case 14:
                return new C6606qD(parcel.readLong());
            case 15:
                return new C6796rD(parcel.readLong());
            case 16:
                return new JL(parcel);
            case 17:
                return new IL(parcel);
            case 18:
                return new LP(parcel);
            case 19:
                C3983gY c3983gY = new C3983gY();
                c3983gY.a = parcel.readString();
                c3983gY.b = parcel.readInt();
                return c3983gY;
            case 20:
                C5523kY c5523kY = new C5523kY();
                c5523kY.e = null;
                c5523kY.f = new ArrayList();
                c5523kY.g = new ArrayList();
                c5523kY.a = parcel.createStringArrayList();
                c5523kY.b = parcel.createStringArrayList();
                c5523kY.c = (b[]) parcel.createTypedArray(b.CREATOR);
                c5523kY.d = parcel.readInt();
                c5523kY.e = parcel.readString();
                c5523kY.f = parcel.createStringArrayList();
                c5523kY.g = parcel.createTypedArrayList(C7453uf.CREATOR);
                c5523kY.h = parcel.createTypedArrayList(C3983gY.CREATOR);
                return c5523kY;
            case 21:
                return new q(parcel);
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
                O90.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                O90.c(parcelable);
                return new C6404p90((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new B90(parcel);
            default:
                C1994Zi0 c1994Zi0 = new C1994Zi0();
                c1994Zi0.a = parcel.readInt();
                c1994Zi0.b = parcel.readInt();
                c1994Zi0.c = parcel.readInt() == 1;
                return c1994Zi0;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new I2[i];
            case 1:
                return new X5[i];
            case 2:
                return new C3520e7[i];
            case 3:
                return new G7[i];
            case 4:
                return new R8[i];
            case 5:
                return new b[i];
            case 6:
                return new C7453uf[i];
            case 7:
                return new C6123nh[i];
            case 8:
                return new C6898rl[i];
            case 9:
                return new C6535pr[i];
            case 10:
                return new C6726qr[i];
            case 11:
                return new C1171Ou[i];
            case 12:
                return new C1486Sv[i];
            case 13:
                return new C1654Uz[i];
            case 14:
                return new C6606qD[i];
            case 15:
                return new C6796rD[i];
            case 16:
                return new JL[i];
            case 17:
                return new IL[i];
            case 18:
                return new LP[i];
            case 19:
                return new C3983gY[i];
            case 20:
                return new C5523kY[i];
            case 21:
                return new q[i];
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
                return new C6404p90[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new B90[i];
            default:
                return new C1994Zi0[i];
        }
    }
}
