package p000;

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
public final class RunnableC6704qp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f41180a;

    /* renamed from: b */
    public /* synthetic */ Object f41181b;

    /* renamed from: c */
    public /* synthetic */ Object f41182c;

    /* renamed from: d */
    public /* synthetic */ Object f41183d;

    /* renamed from: e */
    public /* synthetic */ Object f41184e;

    public /* synthetic */ RunnableC6704qp(int i) {
        this.f41180a = i;
    }

    /* renamed from: a */
    private final void m24070a() {
        MJ1 mj1;
        C8989cV1 c8989cV1 = (C8989cV1) this.f41181b;
        AtomicReference atomicReference = (AtomicReference) this.f41182c;
        EY1 ey1 = (EY1) this.f41183d;
        VX1 vx1 = (VX1) this.f41184e;
        synchronized (atomicReference) {
            try {
                mj1 = c8989cV1.f17574e;
            } catch (RemoteException e) {
                c8989cV1.mo6070n().f8378g.m24554c(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (mj1 == null) {
                c8989cV1.mo6070n().f8378g.m24555d("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            Preconditions.checkNotNull(ey1);
            mj1.mo5324q(ey1, vx1, new BV1(atomicReference));
            c8989cV1.m10751M1();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x013f -> B:452:0x0146). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C8383Uo1 c8383Uo1M8569l;
        C8739aY1 c8739aY1;
        ZE1 ze1M5177d;
        String str;
        byte[] bArrMo5327w = null;
        switch (this.f41180a) {
            case 0:
                Promise promise = (Promise) this.f41184e;
                try {
                    ReactApplicationContext reactApplicationContext = ((CameraViewModule) this.f41181b).getReactApplicationContext();
                    O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    promise.resolve(NR1.m5690c((C4140gp) this.f41183d, TT1.m7695a(reactApplicationContext, (ReadableMap) this.f41182c)));
                    return;
                } catch (Throwable th) {
                    promise.reject(th);
                    return;
                }
            case 1:
                C7289zq c7289zq = (C7289zq) this.f41181b;
                if (c7289zq != null) {
                    QQ0 qq0 = (QQ0) this.f41184e;
                    ((ViewOnKeyListenerC0053Aq) qq0.f9619a).f422z = true;
                    c7289zq.f47025b.m1404c(false);
                    ((ViewOnKeyListenerC0053Aq) qq0.f9619a).f422z = false;
                }
                C7866Kq0 c7866Kq0 = (C7866Kq0) this.f41182c;
                if (c7866Kq0.isEnabled() && c7866Kq0.hasSubMenu()) {
                    ((MenuC7450Cq0) this.f41183d).m1418q(c7866Kq0, null, 4);
                    return;
                }
                return;
            case 2:
                C9733iH0 c9733iH0 = (C9733iH0) this.f41184e;
                C9861jH0 c9861jH0 = c9733iH0.f29036h;
                if (c9861jH0 == null) {
                    return;
                }
                C9733iH0 c9733iH02 = (C9733iH0) this.f41181b;
                WritableMap writableMapM22011a = c9861jH0.m22011a(c9733iH02, (String) this.f41182c);
                writableMapM22011a.putString("data", (String) this.f41183d);
                if (c9733iH0.f29035g == null) {
                    c9733iH0.m18995a(c9733iH02, new C4004ef(C11141tH0.m24864a(c9733iH02), writableMapM22011a, 14, false));
                    return;
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("nativeEvent", writableMapM22011a);
                writableNativeMap.putString("messagingModuleName", c9733iH0.f29034f);
                c9733iH0.f29035g.onMessage(writableNativeMap);
                return;
            case 3:
                String str2 = (String) this.f41181b;
                String str3 = (String) this.f41183d;
                Promise promise2 = (Promise) this.f41184e;
                try {
                    String strM157b = AL0.m157b(str2);
                    File file = new File(strM157b);
                    boolean zCreateNewFile = file.createNewFile();
                    boolean zEquals = str3.equals("uri");
                    String str4 = (String) this.f41182c;
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
                            promise2.reject("EEXIST", "File `" + strM157b + "` already exists");
                            return;
                        }
                        new FileOutputStream(file).write(AL0.m158c(str4, str3));
                    }
                    promise2.resolve(strM157b);
                    return;
                } catch (Exception e) {
                    promise2.reject("EUNSPECIFIED", e.getLocalizedMessage());
                    return;
                }
            case 4:
                C7497Dn1.m1895h((View) this.f41181b, (C7705Hn1) this.f41182c, (C11970zn1) this.f41183d);
                ((ValueAnimator) this.f41184e).start();
                return;
            case 5:
                C11687xZ0 c11687xZ0 = (C11687xZ0) this.f41183d;
                UUID uuid = (UUID) this.f41181b;
                String string = uuid.toString();
                C1210TE c1210teM7634G = C1210TE.m7634G();
                int i2 = C8123Po1.f9284c;
                Objects.toString(uuid);
                C7249zC c7249zC = (C7249zC) this.f41182c;
                Objects.toString(c7249zC);
                c1210teM7634G.getClass();
                C8123Po1 c8123Po1 = (C8123Po1) this.f41184e;
                WorkDatabase workDatabase = c8123Po1.f9285a;
                WorkDatabase workDatabase2 = c8123Po1.f9285a;
                workDatabase.m23793c();
                try {
                    c8383Uo1M8569l = workDatabase2.mo10328u().m8569l(string);
                } catch (Throwable th2) {
                    try {
                        C1210TE c1210teM7634G2 = C1210TE.m7634G();
                        int i3 = C8123Po1.f9284c;
                        c1210teM7634G2.getClass();
                        c11687xZ0.m25922k(th2);
                    } finally {
                        workDatabase2.m23795j();
                    }
                }
                if (c8383Uo1M8569l == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (c8383Uo1M8569l.f12135b == 2) {
                    C8019No1 c8019No1 = new C8019No1(string, c7249zC);
                    C8071Oo1 c8071Oo1Mo10327t = workDatabase2.mo10327t();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8071Oo1Mo10327t.f8627a;
                    workDatabase_Impl.m23792b();
                    workDatabase_Impl.m23793c();
                    try {
                        ((C1276UH) c8071Oo1Mo10327t.f8628b).m7954h(c8019No1);
                        workDatabase_Impl.m23799n();
                    } finally {
                        workDatabase_Impl.m23795j();
                    }
                } else {
                    C1210TE.m7634G().getClass();
                }
                c11687xZ0.m25921j(null);
                workDatabase2.m23799n();
                return;
            case 6:
                InterfaceC9230eL1 interfaceC9230eL1 = (InterfaceC9230eL1) this.f41184e;
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f41181b;
                binderC10262mP1.f37671a.m22486f0();
                C10152lY1 c10152lY1 = binderC10262mP1.f37671a;
                boolean zM6511E1 = c10152lY1.m22472U().m6511E1(null, IB1.f4749K0);
                String str5 = (String) this.f41182c;
                if (zM6511E1) {
                    RI1.m6952p(c10152lY1);
                    C8405Uz1 c8405Uz1 = c10152lY1.f37125c;
                    C10152lY1.m22451w(c8405Uz1);
                    List<ZY1> listM8230L1 = c8405Uz1.m8230L1(str5, (VX1) this.f41183d, ((Integer) IB1.f4832x.m3028a(null)).intValue());
                    ArrayList arrayList = new ArrayList();
                    for (ZY1 zy1 : listM8230L1) {
                        if (c10152lY1.m22476Y(zy1.f14968c)) {
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : zy1.f14969d.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            InterfaceC9230eL1 interfaceC9230eL12 = interfaceC9230eL1;
                            QX1 qx1 = new QX1(zy1.f14966a, zy1.f14967b.m3857c(), zy1.f14968c, bundle, RI1.m6942f(zy1.f14970e), zy1.f14971f, "");
                            try {
                                PK1 pk1 = (PK1) C8997cZ1.m10763P1(QK1.m6655v(), qx1.f9660b);
                                for (int i4 = 0; i4 < ((QK1) pk1.f39024b).m6658m(); i4++) {
                                    RK1 rk1 = (RK1) ((QK1) pk1.f39024b).m6659o(i4).m24347j();
                                    long jCurrentTimeMillis = c10152lY1.zzb().currentTimeMillis();
                                    rk1.m23414i();
                                    SK1.m7220K1((SK1) rk1.f39024b, jCurrentTimeMillis);
                                    pk1.m23414i();
                                    QK1.m6649p((QK1) pk1.f39024b, i4, (SK1) rk1.m23412e());
                                }
                                qx1.f9660b = ((QK1) pk1.m23412e()).m3857c();
                                if (c10152lY1.mo6070n().m6029D1(2)) {
                                    C8997cZ1 c8997cZ1 = c10152lY1.f37129g;
                                    C10152lY1.m22451w(c8997cZ1);
                                    qx1.f9665g = c8997cZ1.m10777H1((QK1) pk1.m23412e());
                                }
                                arrayList.add(qx1);
                            } catch (VS1 unused) {
                                c10152lY1.mo6070n().f8381j.m24554c(str5, "Failed to parse queued batch. appId");
                            }
                            interfaceC9230eL1 = interfaceC9230eL12;
                        }
                    }
                    c8739aY1 = new C8739aY1(arrayList);
                } else {
                    c8739aY1 = new C8739aY1(Collections.emptyList());
                }
                try {
                    interfaceC9230eL1.mo735r(c8739aY1);
                    return;
                } catch (RemoteException e2) {
                    c10152lY1.mo6070n().f8378g.m24553b(str5, e2, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 7:
                BinderC10262mP1 binderC10262mP12 = (BinderC10262mP1) this.f41181b;
                boolean zM6511E12 = binderC10262mP12.f37671a.m22472U().m6511E1(null, IB1.f4777Y0);
                C10152lY1 c10152lY12 = binderC10262mP12.f37671a;
                boolean zM6511E13 = c10152lY12.m22472U().m6511E1(null, IB1.f4782a1);
                Bundle bundle2 = (Bundle) this.f41182c;
                boolean zIsEmpty = bundle2.isEmpty();
                String str6 = (String) this.f41183d;
                if (zIsEmpty && zM6511E12) {
                    C8405Uz1 c8405Uz12 = c10152lY12.f37125c;
                    C10152lY1.m22451w(c8405Uz12);
                    c8405Uz12.mo7681v1();
                    c8405Uz12.m18576z1();
                    try {
                        c8405Uz12.m8212C1().execSQL("delete from default_event_params where app_id=?", new String[]{str6});
                        return;
                    } catch (SQLiteException e3) {
                        c8405Uz12.mo6070n().f8378g.m24554c(e3, "Error clearing default event params");
                        return;
                    }
                }
                C8405Uz1 c8405Uz13 = c10152lY12.f37125c;
                C10152lY1.m22451w(c8405Uz13);
                c8405Uz13.mo7681v1();
                c8405Uz13.m18576z1();
                byte[] bArrM3857c = c8405Uz13.m4343w1().m10779N1(new C1588ZE((C9110dP1) c8405Uz13.f11615b, "", str6, "dep", 0L, 0L, bundle2)).m3857c();
                c8405Uz13.mo6070n().f8386o.m24553b(((C9110dP1) c8405Uz13.f11615b).f26043m.m2163b(str6), Integer.valueOf(bArrM3857c.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str6);
                contentValues.put("parameters", bArrM3857c);
                try {
                    if (c8405Uz13.m8212C1().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        c8405Uz13.mo6070n().f8378g.m24554c(OL1.m6026B1(str6), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e4) {
                    c8405Uz13.mo6070n().f8378g.m24553b(OL1.m6026B1(str6), e4, "Error storing default event parameters. appId");
                }
                C8405Uz1 c8405Uz14 = c10152lY12.f37125c;
                C10152lY1.m22451w(c8405Uz14);
                EY1 ey1 = (EY1) this.f41184e;
                long j = ey1.f2752F;
                C9110dP1 c9110dP1 = (C9110dP1) c8405Uz14.f11615b;
                if (c9110dP1.f26037g.m6511E1(null, IB1.f4782a1) || c9110dP1.f26044n.currentTimeMillis() <= 15000 + j) {
                    try {
                        if (c8405Uz14.m8220G1("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j)}, 0L) > 0) {
                            return;
                        }
                        if (c8405Uz14.m8220G1("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j)}, 0L) > 0) {
                            if (zM6511E13) {
                                C8405Uz1 c8405Uz15 = c10152lY12.f37125c;
                                C10152lY1.m22451w(c8405Uz15);
                                c8405Uz15.m8239U1(str6, Long.valueOf(ey1.f2752F), null, bundle2);
                                return;
                            } else {
                                C8405Uz1 c8405Uz16 = c10152lY12.f37125c;
                                C10152lY1.m22451w(c8405Uz16);
                                c8405Uz16.m8239U1(str6, null, null, bundle2);
                                return;
                            }
                        }
                        return;
                    } catch (SQLiteException e5) {
                        c8405Uz14.mo6070n().f8378g.m24554c(e5, "Error checking backfill conditions");
                        return;
                    }
                }
                return;
            case 8:
                C8989cV1 c8989cV1M6946j = RI1.m6946j((C9110dP1) ((FR1) this.f41184e).f11615b);
                c8989cV1M6946j.m10744F1(new RunnableC7447Co1(c8989cV1M6946j, (AtomicReference) this.f41181b, (String) this.f41182c, (String) this.f41183d, c8989cV1M6946j.m10752N1(false), 3));
                return;
            case 9:
                C8989cV1 c8989cV1M6946j2 = RI1.m6946j(((AppMeasurementDynamiteService) this.f41184e).f18050a);
                int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((C9110dP1) c8989cV1M6946j2.m7852u1().f11615b).f26031a, 12451000);
                InterfaceC11266uF1 interfaceC11266uF1 = (InterfaceC11266uF1) this.f41181b;
                if (iIsGooglePlayServicesAvailable == 0) {
                    c8989cV1M6946j2.m10744F1(new RunnableC6704qp(c8989cV1M6946j2, (C11894zB1) this.f41182c, (String) this.f41183d, interfaceC11266uF1, 12, false));
                    return;
                } else {
                    c8989cV1M6946j2.mo6070n().f8381j.m24555d("Not bundling data. Service unavailable or out of date");
                    c8989cV1M6946j2.m7852u1().m22883X1(interfaceC11266uF1, new byte[0]);
                    return;
                }
            case 10:
                C8989cV1 c8989cV1M6946j3 = RI1.m6946j(((AppMeasurementDynamiteService) this.f41184e).f18050a);
                c8989cV1M6946j3.m10744F1(new RunnableC7447Co1(c8989cV1M6946j3, (String) this.f41182c, (String) this.f41183d, c8989cV1M6946j3.m10752N1(false), (InterfaceC11266uF1) this.f41181b, 4));
                return;
            case 11:
                m24070a();
                return;
            case 12:
                InterfaceC11266uF1 interfaceC11266uF12 = (InterfaceC11266uF1) this.f41183d;
                C8989cV1 c8989cV1 = (C8989cV1) this.f41184e;
                try {
                    MJ1 mj1 = c8989cV1.f17574e;
                    if (mj1 == null) {
                        c8989cV1.mo6070n().f8378g.m24555d("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArrMo5327w = mj1.mo5327w((String) this.f41182c, (C11894zB1) this.f41181b);
                        c8989cV1.m10751M1();
                        c8989cV1.m7852u1().m22883X1(interfaceC11266uF12, bArrMo5327w);
                    }
                } catch (RemoteException e6) {
                    c8989cV1.mo6070n().f8378g.m24554c(e6, "Failed to send event to the service to bundle");
                } finally {
                    c8989cV1.m7852u1().m22883X1(interfaceC11266uF12, bArrMo5327w);
                }
                return;
            case 13:
                C10641pN0 c10641pN0 = (C10641pN0) this.f41184e;
                C10282mZ1 c10282mZ1M22484e0 = ((C10152lY1) c10641pN0.f40042b).m22484e0();
                C10152lY1 c10152lY13 = (C10152lY1) c10641pN0.f40042b;
                c10152lY13.m22494l((String) this.f41181b, (C11894zB1) Preconditions.checkNotNull(c10282mZ1M22484e0.m22871K1((String) this.f41182c, (Bundle) this.f41183d, "auto", c10152lY13.zzb().currentTimeMillis(), false)));
                return;
            default:
                C10218m32 c10218m32 = (C10218m32) this.f41181b;
                C1356VY c1356vy = (C1356VY) this.f41182c;
                EnumC10593p02 enumC10593p02 = (EnumC10593p02) this.f41183d;
                String str7 = (String) this.f41184e;
                c10218m32.getClass();
                U41 u41 = (U41) c1356vy.f12612c;
                u41.f11645b = enumC10593p02;
                E22 e22 = (E22) u41.f11644a;
                String str8 = (e22 == null || (str = e22.f2364d) == null || str.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(str);
                C11979zs0 c11979zs0 = new C11979zs0();
                c11979zs0.f47055a = c10218m32.f37450a;
                c11979zs0.f47056b = c10218m32.f37451b;
                synchronized (C10218m32.class) {
                    try {
                        ze1M5177d = C10218m32.f37448k;
                        if (ze1M5177d == null) {
                            C7750Ik0 c7750Ik0M5373d = MT1.m5373d(Resources.getSystem().getConfiguration());
                            C7935Ly1 c7935Ly1 = new C7935Ly1();
                            for (int i5 = 0; i5 < c7750Ik0M5373d.f5121a.size(); i5++) {
                                c7935Ly1.m5175b(AbstractC1315Uu.m8200b(c7750Ik0M5373d.f5121a.get(i5)));
                            }
                            ze1M5177d = c7935Ly1.m5177d();
                            C10218m32.f37448k = ze1M5177d;
                        }
                    } finally {
                    }
                }
                c11979zs0.f47059e = ze1M5177d;
                c11979zs0.f47062h = Boolean.TRUE;
                c11979zs0.f47058d = str8;
                c11979zs0.f47057c = str7;
                c11979zs0.f47060f = c10218m32.f37455f.mo11144k() ? (String) c10218m32.f37455f.mo11142i() : c10218m32.f37453d.m24142a();
                c11979zs0.f47064j = 10;
                c11979zs0.f47065k = Integer.valueOf(c10218m32.f37457h);
                c1356vy.f12613d = c11979zs0;
                c10218m32.f37452c.mo21975a(c1356vy);
                return;
        }
    }

    public /* synthetic */ RunnableC6704qp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f41180a = i;
        this.f41181b = obj;
        this.f41182c = obj2;
        this.f41183d = obj3;
        this.f41184e = obj4;
    }

    public /* synthetic */ RunnableC6704qp(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f41180a = i;
        this.f41184e = obj;
        this.f41181b = obj2;
        this.f41182c = obj3;
        this.f41183d = obj4;
    }
}
