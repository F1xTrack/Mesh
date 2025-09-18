package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5880mP1 extends AbstractBinderC6795rC1 implements MJ1 {
    public final C5716lY1 a;
    public Boolean b;
    public String g;

    public BinderC5880mP1(C5716lY1 c5716lY1) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        Preconditions.checkNotNull(c5716lY1);
        this.a = c5716lY1;
        this.g = null;
    }

    @Override // defpackage.MJ1
    public final void B(EY1 ey1, C6367oy1 c6367oy1) {
        if (this.a.U().E1(null, IB1.K0)) {
            K(ey1);
            RunnableC1492Sx runnableC1492Sx = new RunnableC1492Sx(19);
            runnableC1492Sx.b = this;
            runnableC1492Sx.c = ey1;
            runnableC1492Sx.d = c6367oy1;
            J(runnableC1492Sx);
        }
    }

    @Override // defpackage.MJ1
    public final C0721Iz1 D(EY1 ey1) {
        K(ey1);
        String str = ey1.a;
        Preconditions.checkNotEmpty(str);
        C5716lY1 c5716lY1 = this.a;
        try {
            return (C0721Iz1) c5716lY1.p0().D1(new FM0(this, 3, ey1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            OL1 ol1N = c5716lY1.n();
            ol1N.g.b(OL1.B1(str), e, "Failed to get consent. appId");
            return new C0721Iz1(null);
        }
    }

    @Override // defpackage.MJ1
    public final void E(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.a);
        Preconditions.checkNotNull(ey1.u);
        RunnableC6453pP1 runnableC6453pP1 = new RunnableC6453pP1();
        runnableC6453pP1.c = this;
        runnableC6453pP1.b = ey1;
        H(runnableC6453pP1);
    }

    @Override // defpackage.MJ1
    public final void F(EY1 ey1, Bundle bundle, XJ1 xj1) {
        K(ey1);
        String str = (String) Preconditions.checkNotNull(ey1.a);
        C7595vO1 c7595vO1P0 = this.a.p0();
        RunnableC0220Co1 runnableC0220Co1 = new RunnableC0220Co1();
        runnableC0220Co1.b = this;
        runnableC0220Co1.c = ey1;
        runnableC0220Co1.d = bundle;
        runnableC0220Co1.e = xj1;
        runnableC0220Co1.f = str;
        c7595vO1P0.E1(runnableC0220Co1);
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList = null;
        XJ1 c7010sK1 = null;
        InterfaceC3564eL1 c6250oL1 = null;
        switch (i) {
            case 1:
                C8316zB1 c8316zB1 = (C8316zB1) AbstractC6032nC1.a(parcel, C8316zB1.CREATOR);
                EY1 ey1 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                y(c8316zB1, ey1);
                parcel2.writeNoException();
                return true;
            case 2:
                C5337jZ1 c5337jZ1 = (C5337jZ1) AbstractC6032nC1.a(parcel, C5337jZ1.CREATOR);
                EY1 ey12 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                d(c5337jZ1, ey12);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            default:
                return false;
            case 4:
                EY1 ey13 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                k(ey13);
                parcel2.writeNoException();
                return true;
            case 5:
                C8316zB1 c8316zB12 = (C8316zB1) AbstractC6032nC1.a(parcel, C8316zB1.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC6032nC1.d(parcel);
                Preconditions.checkNotNull(c8316zB12);
                Preconditions.checkNotEmpty(string);
                I(string, true);
                J(new RunnableC1492Sx(this, c8316zB12, string, 22, false));
                parcel2.writeNoException();
                return true;
            case 6:
                EY1 ey14 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                z(ey14);
                parcel2.writeNoException();
                return true;
            case 7:
                EY1 ey15 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC6032nC1.d(parcel);
                K(ey15);
                String str = ey15.a;
                Preconditions.checkNotNull(str);
                C5716lY1 c5716lY1 = this.a;
                try {
                    List<C6483pZ1> list = (List) c5716lY1.p0().A1(new FM0(this, 2, str)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (C6483pZ1 c6483pZ1 : list) {
                        if (z || !C5910mZ1.A2(c6483pZ1.c)) {
                            arrayList2.add(new C5337jZ1(c6483pZ1));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    c5716lY1.n().g.b(OL1.B1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    c5716lY1.n().g.b(OL1.B1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C8316zB1 c8316zB13 = (C8316zB1) AbstractC6032nC1.a(parcel, C8316zB1.CREATOR);
                String string2 = parcel.readString();
                AbstractC6032nC1.d(parcel);
                byte[] bArrW = w(string2, c8316zB13);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrW);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC6032nC1.d(parcel);
                c(string3, string4, j, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                EY1 ey16 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                String strS = s(ey16);
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 12:
                C0406Ey1 c0406Ey1 = (C0406Ey1) AbstractC6032nC1.a(parcel, C0406Ey1.CREATOR);
                EY1 ey17 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                g(c0406Ey1, ey17);
                parcel2.writeNoException();
                return true;
            case 13:
                C0406Ey1 c0406Ey12 = (C0406Ey1) AbstractC6032nC1.a(parcel, C0406Ey1.CREATOR);
                AbstractC6032nC1.d(parcel);
                Preconditions.checkNotNull(c0406Ey12);
                Preconditions.checkNotNull(c0406Ey12.c);
                Preconditions.checkNotEmpty(c0406Ey12.a);
                I(c0406Ey12.a, true);
                J(new WZ(this, new C0406Ey1(c0406Ey12), z, 28));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC6032nC1.a;
                z = parcel.readInt() != 0;
                EY1 ey18 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                List listL = l(string6, string7, z, ey18);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC6032nC1.a;
                z = parcel.readInt() != 0;
                AbstractC6032nC1.d(parcel);
                List listE = e(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                EY1 ey19 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                List listJ = j(string11, string12, ey19);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC6032nC1.d(parcel);
                List listN = n(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN);
                return true;
            case 18:
                EY1 ey110 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                o(ey110);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC6032nC1.a(parcel, Bundle.CREATOR);
                EY1 ey111 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                mo1a(bundle, ey111);
                parcel2.writeNoException();
                return true;
            case 20:
                EY1 ey112 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                b(ey112);
                parcel2.writeNoException();
                return true;
            case 21:
                EY1 ey113 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                C0721Iz1 c0721Iz1D = D(ey113);
                parcel2.writeNoException();
                if (c0721Iz1D == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c0721Iz1D.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                EY1 ey114 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC6032nC1.a(parcel, Bundle.CREATOR);
                AbstractC6032nC1.d(parcel);
                List listA = a(bundle2, ey114);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                return true;
            case 25:
                EY1 ey115 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                E(ey115);
                parcel2.writeNoException();
                return true;
            case 26:
                EY1 ey116 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                h(ey116);
                parcel2.writeNoException();
                return true;
            case 27:
                EY1 ey117 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                AbstractC6032nC1.d(parcel);
                u(ey117);
                parcel2.writeNoException();
                return true;
            case 29:
                EY1 ey118 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                VX1 vx1 = (VX1) AbstractC6032nC1.a(parcel, VX1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c6250oL1 = iInterfaceQueryLocalInterface instanceof InterfaceC3564eL1 ? (InterfaceC3564eL1) iInterfaceQueryLocalInterface : new C6250oL1(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                AbstractC6032nC1.d(parcel);
                q(ey118, vx1, c6250oL1);
                parcel2.writeNoException();
                return true;
            case 30:
                EY1 ey119 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                C6367oy1 c6367oy1 = (C6367oy1) AbstractC6032nC1.a(parcel, C6367oy1.CREATOR);
                AbstractC6032nC1.d(parcel);
                B(ey119, c6367oy1);
                parcel2.writeNoException();
                return true;
            case 31:
                EY1 ey120 = (EY1) AbstractC6032nC1.a(parcel, EY1.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC6032nC1.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c7010sK1 = iInterfaceQueryLocalInterface2 instanceof XJ1 ? (XJ1) iInterfaceQueryLocalInterface2 : new C7010sK1(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                AbstractC6032nC1.d(parcel);
                F(ey120, bundle3, c7010sK1);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void H(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        C5716lY1 c5716lY1 = this.a;
        if (c5716lY1.p0().G1()) {
            runnable.run();
        } else {
            c5716lY1.p0().F1(runnable);
        }
    }

    public final void I(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5716lY1 c5716lY1 = this.a;
        if (zIsEmpty) {
            c5716lY1.n().g.d("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    this.b = Boolean.valueOf("com.google.android.gms".equals(this.g) || UidVerifier.isGooglePlayServicesUid(c5716lY1.l.a, Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(c5716lY1.l.a).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c5716lY1.n().g.c(OL1.B1(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.g == null && GooglePlayServicesUtilLight.uidHasPackageName(c5716lY1.l.a, Binder.getCallingUid(), str)) {
            this.g = str;
        }
        if (str.equals(this.g)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void J(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        C5716lY1 c5716lY1 = this.a;
        if (c5716lY1.p0().G1()) {
            runnable.run();
        } else {
            c5716lY1.p0().E1(runnable);
        }
    }

    public final void K(EY1 ey1) {
        Preconditions.checkNotNull(ey1);
        Preconditions.checkNotEmpty(ey1.a);
        I(ey1.a, false);
        this.a.e0().g2(ey1.b, ey1.p);
    }

    public final void L(C8316zB1 c8316zB1, EY1 ey1) {
        C5716lY1 c5716lY1 = this.a;
        c5716lY1.f0();
        c5716lY1.r(c8316zB1, ey1);
    }

    @Override // defpackage.MJ1
    public final List a(Bundle bundle, EY1 ey1) {
        K(ey1);
        String str = ey1.a;
        Preconditions.checkNotNull(str);
        C5716lY1 c5716lY1 = this.a;
        if (!c5716lY1.U().E1(null, IB1.d1)) {
            try {
                return (List) c5716lY1.p0().A1(new CQ1(this, ey1, bundle, 1)).get();
            } catch (InterruptedException | ExecutionException e) {
                OL1 ol1N = c5716lY1.n();
                ol1N.g.b(OL1.B1(str), e, "Failed to get trigger URIs. appId");
                return Collections.emptyList();
            }
        }
        try {
            return (List) c5716lY1.p0().D1(new CQ1(this, ey1, bundle, 0)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            OL1 ol1N2 = c5716lY1.n();
            ol1N2.g.b(OL1.B1(str), e2, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // defpackage.MJ1
    public final void b(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.a);
        Preconditions.checkNotNull(ey1.u);
        H(new RunnableC7598vP1(this, ey1, 2));
    }

    @Override // defpackage.MJ1
    public final void c(String str, String str2, long j, String str3) {
        J(new RunnableC6680qb1(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.MJ1
    public final void d(C5337jZ1 c5337jZ1, EY1 ey1) {
        Preconditions.checkNotNull(c5337jZ1);
        K(ey1);
        J(new RunnableC1492Sx(this, c5337jZ1, ey1, 23, false));
    }

    @Override // defpackage.MJ1
    public final List e(String str, String str2, String str3, boolean z) {
        I(str, true);
        C5716lY1 c5716lY1 = this.a;
        try {
            List<C6483pZ1> list = (List) c5716lY1.p0().A1(new UP1(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6483pZ1 c6483pZ1 : list) {
                if (z || !C5910mZ1.A2(c6483pZ1.c)) {
                    arrayList.add(new C5337jZ1(c6483pZ1));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1N = c5716lY1.n();
            ol1N.g.b(OL1.B1(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1N2 = c5716lY1.n();
            ol1N2.g.b(OL1.B1(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // defpackage.MJ1
    public final void g(C0406Ey1 c0406Ey1, EY1 ey1) {
        Preconditions.checkNotNull(c0406Ey1);
        Preconditions.checkNotNull(c0406Ey1.c);
        K(ey1);
        C0406Ey1 c0406Ey12 = new C0406Ey1(c0406Ey1);
        c0406Ey12.a = ey1.a;
        J(new RunnableC1492Sx(this, c0406Ey12, ey1, 20, false));
    }

    @Override // defpackage.MJ1
    public final void h(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.a);
        Preconditions.checkNotNull(ey1.u);
        RunnableC7598vP1 runnableC7598vP1 = new RunnableC7598vP1();
        runnableC7598vP1.c = this;
        runnableC7598vP1.b = ey1;
        H(runnableC7598vP1);
    }

    @Override // defpackage.MJ1
    public final List j(String str, String str2, EY1 ey1) {
        K(ey1);
        String str3 = ey1.a;
        Preconditions.checkNotNull(str3);
        C5716lY1 c5716lY1 = this.a;
        try {
            return (List) c5716lY1.p0().A1(new UP1(this, str3, str, str2, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5716lY1.n().g.c(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // defpackage.MJ1
    public final void k(EY1 ey1) {
        K(ey1);
        J(new RunnableC7598vP1(this, ey1, 1));
    }

    @Override // defpackage.MJ1
    public final List l(String str, String str2, boolean z, EY1 ey1) {
        K(ey1);
        String str3 = ey1.a;
        Preconditions.checkNotNull(str3);
        C5716lY1 c5716lY1 = this.a;
        try {
            List<C6483pZ1> list = (List) c5716lY1.p0().A1(new UP1(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6483pZ1 c6483pZ1 : list) {
                if (z || !C5910mZ1.A2(c6483pZ1.c)) {
                    arrayList.add(new C5337jZ1(c6483pZ1));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1N = c5716lY1.n();
            ol1N.g.b(OL1.B1(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1N2 = c5716lY1.n();
            ol1N2.g.b(OL1.B1(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // defpackage.MJ1
    public final List n(String str, String str2, String str3) {
        I(str, true);
        C5716lY1 c5716lY1 = this.a;
        try {
            return (List) c5716lY1.p0().A1(new UP1(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c5716lY1.n().g.c(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // defpackage.MJ1
    public final void o(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.a);
        I(ey1.a, false);
        J(new RunnableC6453pP1(this, ey1, 3));
    }

    @Override // defpackage.MJ1
    public final void q(EY1 ey1, VX1 vx1, InterfaceC3564eL1 interfaceC3564eL1) {
        C5716lY1 c5716lY1 = this.a;
        if (c5716lY1.U().E1(null, IB1.K0)) {
            K(ey1);
            String str = (String) Preconditions.checkNotNull(ey1.a);
            C7595vO1 c7595vO1P0 = c5716lY1.p0();
            RunnableC6720qp runnableC6720qp = new RunnableC6720qp(6);
            runnableC6720qp.b = this;
            runnableC6720qp.c = str;
            runnableC6720qp.d = vx1;
            runnableC6720qp.e = interfaceC3564eL1;
            c7595vO1P0.E1(runnableC6720qp);
        }
    }

    @Override // defpackage.MJ1
    public final String s(EY1 ey1) {
        K(ey1);
        C5716lY1 c5716lY1 = this.a;
        try {
            return (String) c5716lY1.p0().A1(new FM0(c5716lY1, 4, ey1)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            OL1 ol1N = c5716lY1.n();
            ol1N.g.b(OL1.B1(ey1.a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.MJ1
    public final void u(EY1 ey1) {
        K(ey1);
        J(new RunnableC6453pP1(this, ey1, 2));
    }

    @Override // defpackage.MJ1
    public final byte[] w(String str, C8316zB1 c8316zB1) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c8316zB1);
        I(str, true);
        C5716lY1 c5716lY1 = this.a;
        OL1 ol1N = c5716lY1.n();
        C3386dP1 c3386dP1 = c5716lY1.l;
        EL1 el1 = c3386dP1.m;
        String str2 = c8316zB1.a;
        ol1N.n.c(el1.b(str2), "Log and bundle. event");
        long jNanoTime = c5716lY1.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c5716lY1.p0().D1(new CallableC5290jK(this, c8316zB1, str)).get();
            if (bArr == null) {
                c5716lY1.n().g.c(OL1.B1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c5716lY1.n().n.e("Log and bundle processed. event, size, time_ms", c3386dP1.m.b(str2), Integer.valueOf(bArr.length), Long.valueOf((c5716lY1.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1N2 = c5716lY1.n();
            ol1N2.g.e("Failed to log and bundle. appId, event, error", OL1.B1(str), c3386dP1.m.b(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1N22 = c5716lY1.n();
            ol1N22.g.e("Failed to log and bundle. appId, event, error", OL1.B1(str), c3386dP1.m.b(str2), e);
            return null;
        }
    }

    @Override // defpackage.MJ1
    public final void y(C8316zB1 c8316zB1, EY1 ey1) {
        Preconditions.checkNotNull(c8316zB1);
        K(ey1);
        J(new RunnableC1492Sx(this, c8316zB1, ey1, 21, false));
    }

    @Override // defpackage.MJ1
    public final void z(EY1 ey1) {
        K(ey1);
        J(new RunnableC6453pP1(this, ey1, 1));
    }

    @Override // defpackage.MJ1
    /* renamed from: a */
    public final void mo1a(Bundle bundle, EY1 ey1) {
        K(ey1);
        String str = ey1.a;
        Preconditions.checkNotNull(str);
        RunnableC6720qp runnableC6720qp = new RunnableC6720qp(7);
        runnableC6720qp.b = this;
        runnableC6720qp.c = bundle;
        runnableC6720qp.d = str;
        runnableC6720qp.e = ey1;
        J(runnableC6720qp);
    }
}
