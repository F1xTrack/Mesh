package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.mrousavy.camera.react.CameraViewModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qp */
/* loaded from: classes2.dex */
public final class RunnableC6720qp implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    public /* synthetic */ RunnableC6720qp(int i) {
        this.a = i;
    }

    private final void a() {
        MJ1 mj1;
        C2528cV1 c2528cV1 = (C2528cV1) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        EY1 ey1 = (EY1) this.d;
        VX1 vx1 = (VX1) this.e;
        synchronized (atomicReference) {
            try {
                mj1 = c2528cV1.e;
            } catch (RemoteException e) {
                c2528cV1.n().g.c(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (mj1 == null) {
                c2528cV1.n().g.d("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            Preconditions.checkNotNull(ey1);
            mj1.q(ey1, vx1, new BV1(atomicReference));
            c2528cV1.M1();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x013f -> B:452:0x0146). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1623Uo1 c1623Uo1L;
        C2156aY1 c2156aY1;
        ZE1 ze1D;
        String str;
        byte[] bArrW = null;
        switch (this.a) {
            case 0:
                Promise promise = (Promise) this.e;
                try {
                    ReactApplicationContext reactApplicationContext = ((CameraViewModule) this.b).getReactApplicationContext();
                    O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    promise.resolve(NR1.c((C4034gp) this.d, TT1.a(reactApplicationContext, (ReadableMap) this.c)));
                    return;
                } catch (Throwable th) {
                    promise.reject(th);
                    return;
                }
            case 1:
                C8437zq c8437zq = (C8437zq) this.b;
                if (c8437zq != null) {
                    QQ0 qq0 = (QQ0) this.e;
                    ((ViewOnKeyListenerC0068Aq) qq0.a).z = true;
                    c8437zq.b.c(false);
                    ((ViewOnKeyListenerC0068Aq) qq0.a).z = false;
                }
                C0849Kq0 c0849Kq0 = (C0849Kq0) this.c;
                if (c0849Kq0.isEnabled() && c0849Kq0.hasSubMenu()) {
                    ((MenuC0225Cq0) this.d).q(c0849Kq0, null, 4);
                    return;
                }
                return;
            case 2:
                C4315iH0 c4315iH0 = (C4315iH0) this.e;
                C5282jH0 c5282jH0 = c4315iH0.h;
                if (c5282jH0 == null) {
                    return;
                }
                C4315iH0 c4315iH02 = (C4315iH0) this.b;
                WritableMap writableMapA = c5282jH0.a(c4315iH02, (String) this.c);
                writableMapA.putString("data", (String) this.d);
                if (c4315iH0.g == null) {
                    c4315iH0.a(c4315iH02, new C3622ef(C7191tH0.a(c4315iH02), writableMapA, 14, false));
                    return;
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("nativeEvent", writableMapA);
                writableNativeMap.putString("messagingModuleName", c4315iH0.f);
                c4315iH0.g.onMessage(writableNativeMap);
                return;
            case 3:
                String str2 = (String) this.b;
                String str3 = (String) this.d;
                Promise promise2 = (Promise) this.e;
                try {
                    String strB = AL0.b(str2);
                    File file = new File(strB);
                    boolean zCreateNewFile = file.createNewFile();
                    boolean zEquals = str3.equals("uri");
                    String str4 = (String) this.c;
                    if (zEquals) {
                        File file2 = new File(str4.replace("ReactNativeBlobUtil-file://", ""));
                        if (!file2.exists()) {
                            promise2.reject("ENOENT", "Source file : " + str4 + " does not exist");
                            return;
                        }
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[10240];
                        for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileInputStream.close();
                        fileOutputStream.close();
                    } else {
                        if (!zCreateNewFile) {
                            promise2.reject("EEXIST", "File `" + strB + "` already exists");
                            return;
                        }
                        new FileOutputStream(file).write(AL0.c(str4, str3));
                    }
                    promise2.resolve(strB);
                    return;
                } catch (Exception e) {
                    promise2.reject("EUNSPECIFIED", e.getLocalizedMessage());
                    return;
                }
            case 4:
                C0295Dn1.h((View) this.b, (C0607Hn1) this.c, (C8430zn1) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 5:
                C8007xZ0 c8007xZ0 = (C8007xZ0) this.d;
                UUID uuid = (UUID) this.b;
                String string = uuid.toString();
                TE teG = TE.G();
                int i2 = C1233Po1.c;
                Objects.toString(uuid);
                C8317zC c8317zC = (C8317zC) this.c;
                Objects.toString(c8317zC);
                teG.getClass();
                C1233Po1 c1233Po1 = (C1233Po1) this.e;
                WorkDatabase workDatabase = c1233Po1.a;
                WorkDatabase workDatabase2 = c1233Po1.a;
                workDatabase.c();
                try {
                    c1623Uo1L = workDatabase2.u().l(string);
                } catch (Throwable th2) {
                    try {
                        TE teG2 = TE.G();
                        int i3 = C1233Po1.c;
                        teG2.getClass();
                        c8007xZ0.k(th2);
                    } finally {
                        workDatabase2.j();
                    }
                }
                if (c1623Uo1L == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (c1623Uo1L.b == 2) {
                    C1077No1 c1077No1 = new C1077No1(string, c8317zC);
                    C1155Oo1 c1155Oo1T = workDatabase2.t();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1155Oo1T.a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((UH) c1155Oo1T.b).h(c1077No1);
                        workDatabase_Impl.n();
                    } finally {
                        workDatabase_Impl.j();
                    }
                } else {
                    TE.G().getClass();
                }
                c8007xZ0.j(null);
                workDatabase2.n();
                return;
            case 6:
                InterfaceC3564eL1 interfaceC3564eL1 = (InterfaceC3564eL1) this.e;
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.b;
                binderC5880mP1.a.f0();
                C5716lY1 c5716lY1 = binderC5880mP1.a;
                boolean zE1 = c5716lY1.U().E1(null, IB1.K0);
                String str5 = (String) this.c;
                if (zE1) {
                    RI1.p(c5716lY1);
                    C1656Uz1 c1656Uz1 = c5716lY1.c;
                    C5716lY1.w(c1656Uz1);
                    List<ZY1> listL1 = c1656Uz1.L1(str5, (VX1) this.d, ((Integer) IB1.x.a(null)).intValue());
                    ArrayList arrayList = new ArrayList();
                    for (ZY1 zy1 : listL1) {
                        if (c5716lY1.Y(zy1.c)) {
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : zy1.d.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            InterfaceC3564eL1 interfaceC3564eL12 = interfaceC3564eL1;
                            QX1 qx1 = new QX1(zy1.a, zy1.b.c(), zy1.c, bundle, RI1.f(zy1.e), zy1.f, "");
                            try {
                                PK1 pk1 = (PK1) C2540cZ1.P1(QK1.v(), qx1.b);
                                for (int i4 = 0; i4 < ((QK1) pk1.b).m(); i4++) {
                                    RK1 rk1 = (RK1) ((QK1) pk1.b).o(i4).j();
                                    long jCurrentTimeMillis = c5716lY1.zzb().currentTimeMillis();
                                    rk1.i();
                                    SK1.K1((SK1) rk1.b, jCurrentTimeMillis);
                                    pk1.i();
                                    QK1.p((QK1) pk1.b, i4, (SK1) rk1.e());
                                }
                                qx1.b = ((QK1) pk1.e()).c();
                                if (c5716lY1.n().D1(2)) {
                                    C2540cZ1 c2540cZ1 = c5716lY1.g;
                                    C5716lY1.w(c2540cZ1);
                                    qx1.g = c2540cZ1.H1((QK1) pk1.e());
                                }
                                arrayList.add(qx1);
                            } catch (VS1 unused) {
                                c5716lY1.n().j.c(str5, "Failed to parse queued batch. appId");
                            }
                            interfaceC3564eL1 = interfaceC3564eL12;
                        }
                    }
                    c2156aY1 = new C2156aY1(arrayList);
                } else {
                    c2156aY1 = new C2156aY1(Collections.emptyList());
                }
                try {
                    interfaceC3564eL1.r(c2156aY1);
                    return;
                } catch (RemoteException e2) {
                    c5716lY1.n().g.b(str5, e2, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 7:
                BinderC5880mP1 binderC5880mP12 = (BinderC5880mP1) this.b;
                boolean zE12 = binderC5880mP12.a.U().E1(null, IB1.Y0);
                C5716lY1 c5716lY12 = binderC5880mP12.a;
                boolean zE13 = c5716lY12.U().E1(null, IB1.a1);
                Bundle bundle2 = (Bundle) this.c;
                boolean zIsEmpty = bundle2.isEmpty();
                String str6 = (String) this.d;
                if (zIsEmpty && zE12) {
                    C1656Uz1 c1656Uz12 = c5716lY12.c;
                    C5716lY1.w(c1656Uz12);
                    c1656Uz12.v1();
                    c1656Uz12.z1();
                    try {
                        c1656Uz12.C1().execSQL("delete from default_event_params where app_id=?", new String[]{str6});
                        return;
                    } catch (SQLiteException e3) {
                        c1656Uz12.n().g.c(e3, "Error clearing default event params");
                        return;
                    }
                }
                C1656Uz1 c1656Uz13 = c5716lY12.c;
                C5716lY1.w(c1656Uz13);
                c1656Uz13.v1();
                c1656Uz13.z1();
                byte[] bArrC = c1656Uz13.w1().N1(new ZE((C3386dP1) c1656Uz13.b, "", str6, "dep", 0L, 0L, bundle2)).c();
                c1656Uz13.n().o.b(((C3386dP1) c1656Uz13.b).m.b(str6), Integer.valueOf(bArrC.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str6);
                contentValues.put("parameters", bArrC);
                try {
                    if (c1656Uz13.C1().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        c1656Uz13.n().g.c(OL1.B1(str6), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e4) {
                    c1656Uz13.n().g.b(OL1.B1(str6), e4, "Error storing default event parameters. appId");
                }
                C1656Uz1 c1656Uz14 = c5716lY12.c;
                C5716lY1.w(c1656Uz14);
                EY1 ey1 = (EY1) this.e;
                long j = ey1.F;
                C3386dP1 c3386dP1 = (C3386dP1) c1656Uz14.b;
                if (c3386dP1.g.E1(null, IB1.a1) || c3386dP1.n.currentTimeMillis() <= 15000 + j) {
                    try {
                        if (c1656Uz14.G1("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j)}, 0L) > 0) {
                            return;
                        }
                        if (c1656Uz14.G1("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j)}, 0L) > 0) {
                            if (zE13) {
                                C1656Uz1 c1656Uz15 = c5716lY12.c;
                                C5716lY1.w(c1656Uz15);
                                c1656Uz15.U1(str6, Long.valueOf(ey1.F), null, bundle2);
                                return;
                            } else {
                                C1656Uz1 c1656Uz16 = c5716lY12.c;
                                C5716lY1.w(c1656Uz16);
                                c1656Uz16.U1(str6, null, null, bundle2);
                                return;
                            }
                        }
                        return;
                    } catch (SQLiteException e5) {
                        c1656Uz14.n().g.c(e5, "Error checking backfill conditions");
                        return;
                    }
                }
                return;
            case 8:
                C2528cV1 c2528cV1J = RI1.j((C3386dP1) ((FR1) this.e).b);
                c2528cV1J.F1(new RunnableC0220Co1(c2528cV1J, (AtomicReference) this.b, (String) this.c, (String) this.d, c2528cV1J.N1(false), 3));
                return;
            case 9:
                C2528cV1 c2528cV1J2 = RI1.j(((AppMeasurementDynamiteService) this.e).a);
                int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((C3386dP1) c2528cV1J2.u1().b).a, 12451000);
                InterfaceC7377uF1 interfaceC7377uF1 = (InterfaceC7377uF1) this.b;
                if (iIsGooglePlayServicesAvailable == 0) {
                    c2528cV1J2.F1(new RunnableC6720qp(c2528cV1J2, (C8316zB1) this.c, (String) this.d, interfaceC7377uF1, 12, false));
                    return;
                } else {
                    c2528cV1J2.n().j.d("Not bundling data. Service unavailable or out of date");
                    c2528cV1J2.u1().X1(interfaceC7377uF1, new byte[0]);
                    return;
                }
            case 10:
                C2528cV1 c2528cV1J3 = RI1.j(((AppMeasurementDynamiteService) this.e).a);
                c2528cV1J3.F1(new RunnableC0220Co1(c2528cV1J3, (String) this.c, (String) this.d, c2528cV1J3.N1(false), (InterfaceC7377uF1) this.b, 4));
                return;
            case 11:
                a();
                return;
            case 12:
                InterfaceC7377uF1 interfaceC7377uF12 = (InterfaceC7377uF1) this.d;
                C2528cV1 c2528cV1 = (C2528cV1) this.e;
                try {
                    MJ1 mj1 = c2528cV1.e;
                    if (mj1 == null) {
                        c2528cV1.n().g.d("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArrW = mj1.w((String) this.c, (C8316zB1) this.b);
                        c2528cV1.M1();
                        c2528cV1.u1().X1(interfaceC7377uF12, bArrW);
                    }
                } catch (RemoteException e6) {
                    c2528cV1.n().g.c(e6, "Failed to send event to the service to bundle");
                } finally {
                    c2528cV1.u1().X1(interfaceC7377uF12, bArrW);
                }
                return;
            case 13:
                C6446pN0 c6446pN0 = (C6446pN0) this.e;
                C5910mZ1 c5910mZ1E0 = ((C5716lY1) c6446pN0.b).e0();
                C5716lY1 c5716lY13 = (C5716lY1) c6446pN0.b;
                c5716lY13.l((String) this.b, (C8316zB1) Preconditions.checkNotNull(c5910mZ1E0.K1((String) this.c, (Bundle) this.d, "auto", c5716lY13.zzb().currentTimeMillis(), false)));
                return;
            default:
                C5814m32 c5814m32 = (C5814m32) this.b;
                VY vy = (VY) this.c;
                EnumC6375p02 enumC6375p02 = (EnumC6375p02) this.d;
                String str7 = (String) this.e;
                c5814m32.getClass();
                U41 u41 = (U41) vy.c;
                u41.b = enumC6375p02;
                E22 e22 = (E22) u41.a;
                String str8 = (e22 == null || (str = e22.d) == null || str.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(str);
                C8444zs0 c8444zs0 = new C8444zs0();
                c8444zs0.a = c5814m32.a;
                c8444zs0.b = c5814m32.b;
                synchronized (C5814m32.class) {
                    try {
                        ze1D = C5814m32.k;
                        if (ze1D == null) {
                            C0675Ik0 c0675Ik0D = MT1.d(Resources.getSystem().getConfiguration());
                            C0951Ly1 c0951Ly1 = new C0951Ly1();
                            for (int i5 = 0; i5 < c0675Ik0D.a.size(); i5++) {
                                c0951Ly1.b(AbstractC1639Uu.b(c0675Ik0D.a.get(i5)));
                            }
                            ze1D = c0951Ly1.d();
                            C5814m32.k = ze1D;
                        }
                    } finally {
                    }
                }
                c8444zs0.e = ze1D;
                c8444zs0.h = Boolean.TRUE;
                c8444zs0.d = str8;
                c8444zs0.c = str7;
                c8444zs0.f = c5814m32.f.k() ? (String) c5814m32.f.i() : c5814m32.d.a();
                c8444zs0.j = 10;
                c8444zs0.k = Integer.valueOf(c5814m32.h);
                vy.d = c8444zs0;
                c5814m32.c.a(vy);
                return;
        }
    }

    public /* synthetic */ RunnableC6720qp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ RunnableC6720qp(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
