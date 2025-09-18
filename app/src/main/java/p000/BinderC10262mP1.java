package p000;

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
public final class BinderC10262mP1 extends AbstractBinderC10876rC1 implements MJ1 {

    /* renamed from: a */
    public final C10152lY1 f37671a;

    /* renamed from: b */
    public Boolean f37672b;

    /* renamed from: g */
    public String f37673g;

    public BinderC10262mP1(C10152lY1 c10152lY1) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        Preconditions.checkNotNull(c10152lY1);
        this.f37671a = c10152lY1;
        this.f37673g = null;
    }

    @Override // p000.MJ1
    /* renamed from: B */
    public final void mo5307B(EY1 ey1, C10588oy1 c10588oy1) {
        if (this.f37671a.m22472U().m6511E1(null, IB1.f4749K0)) {
            m22816K(ey1);
            RunnableC1192Sx runnableC1192Sx = new RunnableC1192Sx(19);
            runnableC1192Sx.f11079b = this;
            runnableC1192Sx.f11080c = ey1;
            runnableC1192Sx.f11081d = c10588oy1;
            m22815J(runnableC1192Sx);
        }
    }

    @Override // p000.MJ1
    /* renamed from: D */
    public final C7781Iz1 mo5308D(EY1 ey1) {
        m22816K(ey1);
        String str = ey1.f2754a;
        Preconditions.checkNotEmpty(str);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            return (C7781Iz1) c10152lY1.mo6071p0().m25411D1(new FM0(this, 3, ey1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            OL1 ol1Mo6070n = c10152lY1.mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get consent. appId");
            return new C7781Iz1(null);
        }
    }

    @Override // p000.MJ1
    /* renamed from: E */
    public final void mo5309E(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.f2754a);
        Preconditions.checkNotNull(ey1.f2774u);
        RunnableC10646pP1 runnableC10646pP1 = new RunnableC10646pP1();
        runnableC10646pP1.f40054c = this;
        runnableC10646pP1.f40053b = ey1;
        m22813H(runnableC10646pP1);
    }

    @Override // p000.MJ1
    /* renamed from: F */
    public final void mo5310F(EY1 ey1, Bundle bundle, XJ1 xj1) {
        m22816K(ey1);
        String str = (String) Preconditions.checkNotNull(ey1.f2754a);
        C11412vO1 c11412vO1Mo6071p0 = this.f37671a.mo6071p0();
        RunnableC7447Co1 runnableC7447Co1 = new RunnableC7447Co1();
        runnableC7447Co1.f1666b = this;
        runnableC7447Co1.f1667c = ey1;
        runnableC7447Co1.f1668d = bundle;
        runnableC7447Co1.f1669e = xj1;
        runnableC7447Co1.f1670f = str;
        c11412vO1Mo6071p0.m25412E1(runnableC7447Co1);
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList = null;
        XJ1 c11020sK1 = null;
        InterfaceC9230eL1 c10510oL1 = null;
        switch (i) {
            case 1:
                C11894zB1 c11894zB1 = (C11894zB1) AbstractC10364nC1.m23100a(parcel, C11894zB1.CREATOR);
                EY1 ey1 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5328y(c11894zB1, ey1);
                parcel2.writeNoException();
                return true;
            case 2:
                C9898jZ1 c9898jZ1 = (C9898jZ1) AbstractC10364nC1.m23100a(parcel, C9898jZ1.CREATOR);
                EY1 ey12 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5315d(c9898jZ1, ey12);
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
                EY1 ey13 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5320k(ey13);
                parcel2.writeNoException();
                return true;
            case 5:
                C11894zB1 c11894zB12 = (C11894zB1) AbstractC10364nC1.m23100a(parcel, C11894zB1.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC10364nC1.m23103d(parcel);
                Preconditions.checkNotNull(c11894zB12);
                Preconditions.checkNotEmpty(string);
                m22814I(string, true);
                m22815J(new RunnableC1192Sx(this, c11894zB12, string, 22, false));
                parcel2.writeNoException();
                return true;
            case 6:
                EY1 ey14 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5329z(ey14);
                parcel2.writeNoException();
                return true;
            case 7:
                EY1 ey15 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC10364nC1.m23103d(parcel);
                m22816K(ey15);
                String str = ey15.f2754a;
                Preconditions.checkNotNull(str);
                C10152lY1 c10152lY1 = this.f37671a;
                try {
                    List<C10666pZ1> list = (List) c10152lY1.mo6071p0().m25408A1(new FM0(this, 2, str)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (C10666pZ1 c10666pZ1 : list) {
                        if (z || !C10282mZ1.m22837A2(c10666pZ1.f40212c)) {
                            arrayList2.add(new C9898jZ1(c10666pZ1));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    c10152lY1.mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    c10152lY1.mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C11894zB1 c11894zB13 = (C11894zB1) AbstractC10364nC1.m23100a(parcel, C11894zB1.CREATOR);
                String string2 = parcel.readString();
                AbstractC10364nC1.m23103d(parcel);
                byte[] bArrMo5327w = mo5327w(string2, c11894zB13);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo5327w);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC10364nC1.m23103d(parcel);
                mo5314c(string3, string4, j, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                EY1 ey16 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                String strMo5325s = mo5325s(ey16);
                parcel2.writeNoException();
                parcel2.writeString(strMo5325s);
                return true;
            case 12:
                C7571Ey1 c7571Ey1 = (C7571Ey1) AbstractC10364nC1.m23100a(parcel, C7571Ey1.CREATOR);
                EY1 ey17 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5317g(c7571Ey1, ey17);
                parcel2.writeNoException();
                return true;
            case 13:
                C7571Ey1 c7571Ey12 = (C7571Ey1) AbstractC10364nC1.m23100a(parcel, C7571Ey1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                Preconditions.checkNotNull(c7571Ey12);
                Preconditions.checkNotNull(c7571Ey12.f2989c);
                Preconditions.checkNotEmpty(c7571Ey12.f2987a);
                m22814I(c7571Ey12.f2987a, true);
                m22815J(new RunnableC1420WZ(this, new C7571Ey1(c7571Ey12), z, 28));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC10364nC1.f38178a;
                z = parcel.readInt() != 0;
                EY1 ey18 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                List listMo5321l = mo5321l(string6, string7, z, ey18);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5321l);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC10364nC1.f38178a;
                z = parcel.readInt() != 0;
                AbstractC10364nC1.m23103d(parcel);
                List listMo5316e = mo5316e(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5316e);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                EY1 ey19 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                List listMo5319j = mo5319j(string11, string12, ey19);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5319j);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC10364nC1.m23103d(parcel);
                List listMo5322n = mo5322n(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5322n);
                return true;
            case 18:
                EY1 ey110 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5323o(ey110);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                EY1 ey111 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5312a(bundle, ey111);
                parcel2.writeNoException();
                return true;
            case 20:
                EY1 ey112 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5313b(ey112);
                parcel2.writeNoException();
                return true;
            case 21:
                EY1 ey113 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                C7781Iz1 c7781Iz1Mo5308D = mo5308D(ey113);
                parcel2.writeNoException();
                if (c7781Iz1Mo5308D == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c7781Iz1Mo5308D.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                EY1 ey114 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                List listMo5311a = mo5311a(bundle2, ey114);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5311a);
                return true;
            case 25:
                EY1 ey115 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5309E(ey115);
                parcel2.writeNoException();
                return true;
            case 26:
                EY1 ey116 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5318h(ey116);
                parcel2.writeNoException();
                return true;
            case 27:
                EY1 ey117 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5326u(ey117);
                parcel2.writeNoException();
                return true;
            case 29:
                EY1 ey118 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                VX1 vx1 = (VX1) AbstractC10364nC1.m23100a(parcel, VX1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c10510oL1 = iInterfaceQueryLocalInterface instanceof InterfaceC9230eL1 ? (InterfaceC9230eL1) iInterfaceQueryLocalInterface : new C10510oL1(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                AbstractC10364nC1.m23103d(parcel);
                mo5324q(ey118, vx1, c10510oL1);
                parcel2.writeNoException();
                return true;
            case 30:
                EY1 ey119 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                C10588oy1 c10588oy1 = (C10588oy1) AbstractC10364nC1.m23100a(parcel, C10588oy1.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                mo5307B(ey119, c10588oy1);
                parcel2.writeNoException();
                return true;
            case 31:
                EY1 ey120 = (EY1) AbstractC10364nC1.m23100a(parcel, EY1.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c11020sK1 = iInterfaceQueryLocalInterface2 instanceof XJ1 ? (XJ1) iInterfaceQueryLocalInterface2 : new C11020sK1(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                AbstractC10364nC1.m23103d(parcel);
                mo5310F(ey120, bundle3, c11020sK1);
                parcel2.writeNoException();
                return true;
        }
    }

    /* renamed from: H */
    public final void m22813H(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        C10152lY1 c10152lY1 = this.f37671a;
        if (c10152lY1.mo6071p0().m25414G1()) {
            runnable.run();
        } else {
            c10152lY1.mo6071p0().m25413F1(runnable);
        }
    }

    /* renamed from: I */
    public final void m22814I(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C10152lY1 c10152lY1 = this.f37671a;
        if (zIsEmpty) {
            c10152lY1.mo6070n().f8378g.m24555d("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f37672b == null) {
                    this.f37672b = Boolean.valueOf("com.google.android.gms".equals(this.f37673g) || UidVerifier.isGooglePlayServicesUid(c10152lY1.f37134l.f26031a, Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(c10152lY1.f37134l.f26031a).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f37672b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c10152lY1.mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f37673g == null && GooglePlayServicesUtilLight.uidHasPackageName(c10152lY1.f37134l.f26031a, Binder.getCallingUid(), str)) {
            this.f37673g = str;
        }
        if (str.equals(this.f37673g)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* renamed from: J */
    public final void m22815J(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        C10152lY1 c10152lY1 = this.f37671a;
        if (c10152lY1.mo6071p0().m25414G1()) {
            runnable.run();
        } else {
            c10152lY1.mo6071p0().m25412E1(runnable);
        }
    }

    /* renamed from: K */
    public final void m22816K(EY1 ey1) {
        Preconditions.checkNotNull(ey1);
        Preconditions.checkNotEmpty(ey1.f2754a);
        m22814I(ey1.f2754a, false);
        this.f37671a.m22484e0().m22887g2(ey1.f2755b, ey1.f2769p);
    }

    /* renamed from: L */
    public final void m22817L(C11894zB1 c11894zB1, EY1 ey1) {
        C10152lY1 c10152lY1 = this.f37671a;
        c10152lY1.m22486f0();
        c10152lY1.m22499r(c11894zB1, ey1);
    }

    @Override // p000.MJ1
    /* renamed from: a */
    public final List mo5311a(Bundle bundle, EY1 ey1) {
        m22816K(ey1);
        String str = ey1.f2754a;
        Preconditions.checkNotNull(str);
        C10152lY1 c10152lY1 = this.f37671a;
        if (!c10152lY1.m22472U().m6511E1(null, IB1.f4791d1)) {
            try {
                return (List) c10152lY1.mo6071p0().m25408A1(new CQ1(this, ey1, bundle, 1)).get();
            } catch (InterruptedException | ExecutionException e) {
                OL1 ol1Mo6070n = c10152lY1.mo6070n();
                ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get trigger URIs. appId");
                return Collections.emptyList();
            }
        }
        try {
            return (List) c10152lY1.mo6071p0().m25411D1(new CQ1(this, ey1, bundle, 0)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            OL1 ol1Mo6070n2 = c10152lY1.mo6070n();
            ol1Mo6070n2.f8378g.m24553b(OL1.m6026B1(str), e2, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // p000.MJ1
    /* renamed from: b */
    public final void mo5313b(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.f2754a);
        Preconditions.checkNotNull(ey1.f2774u);
        m22813H(new RunnableC11414vP1(this, ey1, 2));
    }

    @Override // p000.MJ1
    /* renamed from: c */
    public final void mo5314c(String str, String str2, long j, String str3) {
        m22815J(new RunnableC10798qb1(this, str2, str3, str, j, 1));
    }

    @Override // p000.MJ1
    /* renamed from: d */
    public final void mo5315d(C9898jZ1 c9898jZ1, EY1 ey1) {
        Preconditions.checkNotNull(c9898jZ1);
        m22816K(ey1);
        m22815J(new RunnableC1192Sx(this, c9898jZ1, ey1, 23, false));
    }

    @Override // p000.MJ1
    /* renamed from: e */
    public final List mo5316e(String str, String str2, String str3, boolean z) {
        m22814I(str, true);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            List<C10666pZ1> list = (List) c10152lY1.mo6071p0().m25408A1(new UP1(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10666pZ1 c10666pZ1 : list) {
                if (z || !C10282mZ1.m22837A2(c10666pZ1.f40212c)) {
                    arrayList.add(new C9898jZ1(c10666pZ1));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1Mo6070n = c10152lY1.mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1Mo6070n2 = c10152lY1.mo6070n();
            ol1Mo6070n2.f8378g.m24553b(OL1.m6026B1(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // p000.MJ1
    /* renamed from: g */
    public final void mo5317g(C7571Ey1 c7571Ey1, EY1 ey1) {
        Preconditions.checkNotNull(c7571Ey1);
        Preconditions.checkNotNull(c7571Ey1.f2989c);
        m22816K(ey1);
        C7571Ey1 c7571Ey12 = new C7571Ey1(c7571Ey1);
        c7571Ey12.f2987a = ey1.f2754a;
        m22815J(new RunnableC1192Sx(this, c7571Ey12, ey1, 20, false));
    }

    @Override // p000.MJ1
    /* renamed from: h */
    public final void mo5318h(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.f2754a);
        Preconditions.checkNotNull(ey1.f2774u);
        RunnableC11414vP1 runnableC11414vP1 = new RunnableC11414vP1();
        runnableC11414vP1.f44370c = this;
        runnableC11414vP1.f44369b = ey1;
        m22813H(runnableC11414vP1);
    }

    @Override // p000.MJ1
    /* renamed from: j */
    public final List mo5319j(String str, String str2, EY1 ey1) {
        m22816K(ey1);
        String str3 = ey1.f2754a;
        Preconditions.checkNotNull(str3);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            return (List) c10152lY1.mo6071p0().m25408A1(new UP1(this, str3, str, str2, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c10152lY1.mo6070n().f8378g.m24554c(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // p000.MJ1
    /* renamed from: k */
    public final void mo5320k(EY1 ey1) {
        m22816K(ey1);
        m22815J(new RunnableC11414vP1(this, ey1, 1));
    }

    @Override // p000.MJ1
    /* renamed from: l */
    public final List mo5321l(String str, String str2, boolean z, EY1 ey1) {
        m22816K(ey1);
        String str3 = ey1.f2754a;
        Preconditions.checkNotNull(str3);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            List<C10666pZ1> list = (List) c10152lY1.mo6071p0().m25408A1(new UP1(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10666pZ1 c10666pZ1 : list) {
                if (z || !C10282mZ1.m22837A2(c10666pZ1.f40212c)) {
                    arrayList.add(new C9898jZ1(c10666pZ1));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1Mo6070n = c10152lY1.mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1Mo6070n2 = c10152lY1.mo6070n();
            ol1Mo6070n2.f8378g.m24553b(OL1.m6026B1(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // p000.MJ1
    /* renamed from: n */
    public final List mo5322n(String str, String str2, String str3) {
        m22814I(str, true);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            return (List) c10152lY1.mo6071p0().m25408A1(new UP1(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c10152lY1.mo6070n().f8378g.m24554c(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // p000.MJ1
    /* renamed from: o */
    public final void mo5323o(EY1 ey1) {
        Preconditions.checkNotEmpty(ey1.f2754a);
        m22814I(ey1.f2754a, false);
        m22815J(new RunnableC10646pP1(this, ey1, 3));
    }

    @Override // p000.MJ1
    /* renamed from: q */
    public final void mo5324q(EY1 ey1, VX1 vx1, InterfaceC9230eL1 interfaceC9230eL1) {
        C10152lY1 c10152lY1 = this.f37671a;
        if (c10152lY1.m22472U().m6511E1(null, IB1.f4749K0)) {
            m22816K(ey1);
            String str = (String) Preconditions.checkNotNull(ey1.f2754a);
            C11412vO1 c11412vO1Mo6071p0 = c10152lY1.mo6071p0();
            RunnableC6704qp runnableC6704qp = new RunnableC6704qp(6);
            runnableC6704qp.f41181b = this;
            runnableC6704qp.f41182c = str;
            runnableC6704qp.f41183d = vx1;
            runnableC6704qp.f41184e = interfaceC9230eL1;
            c11412vO1Mo6071p0.m25412E1(runnableC6704qp);
        }
    }

    @Override // p000.MJ1
    /* renamed from: s */
    public final String mo5325s(EY1 ey1) {
        m22816K(ey1);
        C10152lY1 c10152lY1 = this.f37671a;
        try {
            return (String) c10152lY1.mo6071p0().m25408A1(new FM0(c10152lY1, 4, ey1)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            OL1 ol1Mo6070n = c10152lY1.mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(ey1.f2754a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // p000.MJ1
    /* renamed from: u */
    public final void mo5326u(EY1 ey1) {
        m22816K(ey1);
        m22815J(new RunnableC10646pP1(this, ey1, 2));
    }

    @Override // p000.MJ1
    /* renamed from: w */
    public final byte[] mo5327w(String str, C11894zB1 c11894zB1) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c11894zB1);
        m22814I(str, true);
        C10152lY1 c10152lY1 = this.f37671a;
        OL1 ol1Mo6070n = c10152lY1.mo6070n();
        C9110dP1 c9110dP1 = c10152lY1.f37134l;
        EL1 el1 = c9110dP1.f26043m;
        String str2 = c11894zB1.f46717a;
        ol1Mo6070n.f8385n.m24554c(el1.m2163b(str2), "Log and bundle. event");
        long jNanoTime = c10152lY1.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c10152lY1.mo6071p0().m25411D1(new CallableC6230jK(this, c11894zB1, str)).get();
            if (bArr == null) {
                c10152lY1.mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c10152lY1.mo6070n().f8385n.m24556e("Log and bundle processed. event, size, time_ms", c9110dP1.f26043m.m2163b(str2), Integer.valueOf(bArr.length), Long.valueOf((c10152lY1.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            OL1 ol1Mo6070n2 = c10152lY1.mo6070n();
            ol1Mo6070n2.f8378g.m24556e("Failed to log and bundle. appId, event, error", OL1.m6026B1(str), c9110dP1.f26043m.m2163b(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            OL1 ol1Mo6070n22 = c10152lY1.mo6070n();
            ol1Mo6070n22.f8378g.m24556e("Failed to log and bundle. appId, event, error", OL1.m6026B1(str), c9110dP1.f26043m.m2163b(str2), e);
            return null;
        }
    }

    @Override // p000.MJ1
    /* renamed from: y */
    public final void mo5328y(C11894zB1 c11894zB1, EY1 ey1) {
        Preconditions.checkNotNull(c11894zB1);
        m22816K(ey1);
        m22815J(new RunnableC1192Sx(this, c11894zB1, ey1, 21, false));
    }

    @Override // p000.MJ1
    /* renamed from: z */
    public final void mo5329z(EY1 ey1) {
        m22816K(ey1);
        m22815J(new RunnableC10646pP1(this, ey1, 1));
    }

    @Override // p000.MJ1
    /* renamed from: a */
    public final void mo5312a(Bundle bundle, EY1 ey1) {
        m22816K(ey1);
        String str = ey1.f2754a;
        Preconditions.checkNotNull(str);
        RunnableC6704qp runnableC6704qp = new RunnableC6704qp(7);
        runnableC6704qp.f41181b = this;
        runnableC6704qp.f41182c = bundle;
        runnableC6704qp.f41183d = str;
        runnableC6704qp.f41184e = ey1;
        m22815J(runnableC6704qp);
    }
}
