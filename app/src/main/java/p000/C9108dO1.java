package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

/* renamed from: dO1 */
/* loaded from: classes.dex */
public class C9108dO1 implements JN1, InterfaceC0980PZ, InterfaceC10231mA0, InterfaceC9841j70, InterfaceC4243iS, InterfaceC0580JC, InterfaceC9200e61 {

    /* renamed from: d */
    public static C9108dO1 f26009d;

    /* renamed from: e */
    public static final String[] f26010e = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    public final /* synthetic */ int f26011a;

    /* renamed from: b */
    public Object f26012b;

    /* renamed from: c */
    public Object f26013c;

    public /* synthetic */ C9108dO1(int i, Object obj) {
        this.f26011a = i;
        this.f26012b = obj;
    }

    /* renamed from: L */
    public static synchronized void m17559L() {
        Context context;
        try {
            C9108dO1 c9108dO1 = f26009d;
            if (c9108dO1 != null && (context = (Context) c9108dO1.f26012b) != null && ((C10004kO1) c9108dO1.f26013c) != null) {
                context.getContentResolver().unregisterContentObserver((C10004kO1) f26009d.f26013c);
            }
            f26009d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: w */
    public static C9108dO1 m17560w(List list, C0481Hd c0481Hd) {
        AbstractC9104dM1.m17549h(list, "qualities cannot be null");
        AbstractC9104dM1.m17545d("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6630pe c6630pe = (C6630pe) it.next();
            AbstractC9104dM1.m17545d("qualities contain invalid quality: " + c6630pe, C6630pe.f40255k.contains(c6630pe));
        }
        return new C9108dO1(list, c0481Hd);
    }

    /* renamed from: A */
    public void m17561A(long j) {
        C9580h41 c9580h41 = (C9580h41) this.f26012b;
        try {
            String hexString = Long.toHexString(j);
            this.f26013c = "ExoPlayerCacheFileMetadata" + hexString;
            if (AbstractC7435Ci1.m1299a(c9580h41.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c9580h41.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC7435Ci1.m1300b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f26013c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f26013c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    /* renamed from: B */
    public void m17562B(C3934dX c3934dX) {
        int i = c3934dX.f26134b;
        Handler handler = (Handler) this.f26013c;
        C11287uQ0 c11287uQ0 = (C11287uQ0) this.f26012b;
        if (i == 0) {
            handler.post(new RunnableC1483XZ(c11287uQ0, 4, c3934dX.f26133a));
        } else {
            handler.post(new RunnableC0552Il(c11287uQ0, i, 0));
        }
    }

    /* renamed from: C */
    public synchronized CA0 m17563C() {
        CA0 ca0;
        ca0 = (CA0) this.f26012b;
        if (ca0 != null) {
            CA0 ca02 = ca0.f1235c;
            this.f26012b = ca02;
            if (ca02 == null) {
                this.f26013c = null;
            }
        }
        return ca0;
    }

    /* renamed from: D */
    public synchronized CA0 m17564D() {
        try {
            if (((CA0) this.f26012b) == null) {
                wait(1000);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m17563C();
    }

    /* renamed from: E */
    public void m17565E(Set set) {
        ((String) this.f26013c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C9580h41) this.f26012b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f26013c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    /* renamed from: F */
    public AbstractC0249Dx m17566F(AbstractC7742Ig0 abstractC7742Ig0, NE0 ne0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        AbstractC0249Dx c6975ur;
        O90.m5968f(ne0, "value");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        boolean zBooleanValue = AbstractC1605ZV.f14924N.m8799c(ne0.f7666m).booleanValue();
        ME0 me0 = ne0.f7656c;
        switch (me0 == null ? -1 : AbstractC7242z5.f46629a[me0.ordinal()]) {
            case 1:
                byte b = (byte) ne0.f7657d;
                return zBooleanValue ? new C8415Ve1(b) : new C0614Jk(b);
            case 2:
                c6975ur = new C6975ur(Character.valueOf((char) ne0.f7657d));
                break;
            case 3:
                short s = (short) ne0.f7657d;
                return zBooleanValue ? new C8415Ve1(s) : new C11360v01(s);
            case 4:
                int i = (int) ne0.f7657d;
                return zBooleanValue ? new C8415Ve1(i) : new C9589h90(i);
            case 5:
                long j = ne0.f7657d;
                return zBooleanValue ? new C8415Ve1(j) : new C7596Fl0(j);
            case 6:
                c6975ur = new C0612Ji(ne0.f7658e);
                break;
            case 7:
                c6975ur = new C0612Ji(ne0.f7659f);
                break;
            case 8:
                c6975ur = new C0612Ji(Boolean.valueOf(ne0.f7657d != 0));
                break;
            case 9:
                c6975ur = new C11246u51(interfaceC8392Ut0.getString(ne0.f7660g));
                break;
            case 10:
                c6975ur = new C9651he0(CB1.m1001a(interfaceC8392Ut0, ne0.f7661h), ne0.f7665l);
                break;
            case 11:
                c6975ur = new C1220TO(CB1.m1001a(interfaceC8392Ut0, ne0.f7661h), CB1.m1002b(interfaceC8392Ut0, ne0.f7662i));
                break;
            case 12:
                QE0 qe0 = ne0.f7663j;
                O90.m5967e(qe0, "getAnnotation(...)");
                c6975ur = new C0384G5((Object) m17575s(qe0, interfaceC8392Ut0));
                break;
            case 13:
                List list = ne0.f7664k;
                O90.m5967e(list, "getArrayElementList(...)");
                List<NE0> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
                for (NE0 ne02 : list2) {
                    X01 x01M26498e = ((InterfaceC7402Bs0) this.f26012b).mo897h().m26498e();
                    O90.m5965c(ne02);
                    arrayList.add(m17566F(x01M26498e, ne02, interfaceC8392Ut0));
                }
                return new C7791Je1(arrayList, abstractC7742Ig0);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + ne0.f7656c + " (expected " + abstractC7742Ig0 + ')').toString());
        }
        return c6975ur;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public int mo4559G() {
        return 1;
    }

    /* renamed from: H */
    public void m17567H(long j, long j2, String str) {
        ((String) this.f26013c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C9580h41) this.f26012b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.f26013c, null, contentValues);
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    /* renamed from: I */
    public void m17568I(EnumC6909to enumC6909to, C0039Ac c0039Ac) {
        C7275zc c7275zc;
        switch (enumC6909to.ordinal()) {
            case 0:
            case 2:
                c7275zc = new C7275zc(5, c0039Ac);
                break;
            case 1:
            case 4:
                c7275zc = new C7275zc(4, c0039Ac);
                break;
            case 3:
                C1246To c1246To = (C1246To) this.f26012b;
                synchronized (c1246To.f11518b) {
                    Iterator it = c1246To.f11521e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c7275zc = new C7275zc(1, null);
                        } else if (((C1183So) ((Map.Entry) it.next()).getValue()).f10982a == EnumC6909to.CLOSING) {
                            c7275zc = new C7275zc(2, null);
                        }
                    }
                }
                break;
            case 5:
                c7275zc = new C7275zc(2, c0039Ac);
                break;
            case 6:
            case 7:
                c7275zc = new C7275zc(3, c0039Ac);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC6909to);
        }
        c7275zc.toString();
        enumC6909to.toString();
        Objects.toString(c0039Ac);
        AbstractC7806Jm0.m4412f("CameraStateMachine");
        if (Objects.equals((C7275zc) ((C7560Et0) this.f26013c).mo1868d(), c7275zc)) {
            return;
        }
        c7275zc.toString();
        AbstractC7806Jm0.m4412f("CameraStateMachine");
        ((C7560Et0) this.f26013c).m2440k(c7275zc);
    }

    /* renamed from: J */
    public C10919rY0 m17569J(C8340Tt0 c8340Tt0, String str) {
        O90.m5968f(c8340Tt0, "name");
        String strM7801b = c8340Tt0.m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return new C10919rY0(this, new C10315mq0(strM7801b.concat(str)));
    }

    /* renamed from: K */
    public void m17570K(int i, C0577J9 c0577j9) throws IOException {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f26013c;
            if (entry == null || ((C11614x00) entry.getKey()).f45251a >= i) {
                return;
            }
            C11614x00 c11614x00 = (C11614x00) ((Map.Entry) this.f26013c).getKey();
            Object value = ((Map.Entry) this.f26013c).getValue();
            C4118gT c4118gT = C4118gT.f27807c;
            EnumC10568oo1 enumC10568oo1 = c11614x00.f45252b;
            boolean z = c11614x00.f45253c;
            int i2 = c11614x00.f45251a;
            if (z) {
                for (Object obj : (List) value) {
                    if (enumC10568oo1 == EnumC10568oo1.f39277e) {
                        c0577j9.m4220H(i2, 3);
                        ((AbstractC0631K0) obj).mo132f(c0577j9);
                        c0577j9.m4220H(i2, 4);
                    } else {
                        c0577j9.m4220H(i2, enumC10568oo1.f39282b);
                        C4118gT.m18565k(c0577j9, enumC10568oo1, obj);
                    }
                }
            } else if (enumC10568oo1 == EnumC10568oo1.f39277e) {
                c0577j9.m4220H(i2, 3);
                ((AbstractC0631K0) value).mo132f(c0577j9);
                c0577j9.m4220H(i2, 4);
            } else {
                c0577j9.m4220H(i2, enumC10568oo1.f39282b);
                C4118gT.m18565k(c0577j9, enumC10568oo1, value);
            }
            Iterator it = (Iterator) this.f26012b;
            if (it.hasNext()) {
                this.f26013c = (Map.Entry) it.next();
            } else {
                this.f26013c = null;
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: a */
    public InterfaceC9457g70 mo4037a() {
        return m17573q(((X11) this.f26012b).mo4037a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x004d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x004e, code lost:
    
        if (r3 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0050, code lost:
    
        p000.AbstractC10898rN1.f41633a = null;
     */
    @Override // p000.JN1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4301b(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object r1 = r9.f26012b
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L7e
            boolean r2 = p000.AbstractC10898rN1.m24324a()
            if (r2 == 0) goto L5c
            boolean r2 = p000.AbstractC10898rN1.f41634b
            r3 = 1
            if (r2 == 0) goto L13
            goto L57
        L13:
            java.lang.Class<rN1> r2 = p000.AbstractC10898rN1.class
            monitor-enter(r2)
            boolean r4 = p000.AbstractC10898rN1.f41634b     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L57
        L1c:
            r10 = move-exception
            goto L5a
        L1e:
            r4 = r3
        L1f:
            r5 = 2
            r6 = 0
            r7 = 0
            if (r4 > r5) goto L4d
            android.os.UserManager r5 = p000.AbstractC10898rN1.f41633a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L32
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L1c
            p000.AbstractC10898rN1.f41633a = r5     // Catch: java.lang.Throwable -> L1c
        L32:
            android.os.UserManager r5 = p000.AbstractC10898rN1.f41633a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L37
            goto L52
        L37:
            boolean r8 = p000.AbstractC8209Rf1.m7081v(r5)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            if (r8 != 0) goto L4e
            android.os.UserHandle r8 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            boolean r1 = r5.isUserRunning(r8)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            if (r1 != 0) goto L4d
            goto L4e
        L48:
            p000.AbstractC10898rN1.f41633a = r6     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto L1f
        L4d:
            r3 = r7
        L4e:
            if (r3 == 0) goto L52
            p000.AbstractC10898rN1.f41633a = r6     // Catch: java.lang.Throwable -> L1c
        L52:
            if (r3 == 0) goto L56
            p000.AbstractC10898rN1.f41634b = r3     // Catch: java.lang.Throwable -> L1c
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
        L57:
            if (r3 != 0) goto L5c
            goto L7e
        L5a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r10
        L5c:
            V32 r1 = new V32     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            r1.f12341a = r9     // Catch: java.lang.Throwable -> L7e
            r1.f12342b = r10     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r1.m8289a()     // Catch: java.lang.SecurityException -> L6a java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            goto L75
        L6a:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.Object r10 = r1.m8289a()     // Catch: java.lang.Throwable -> L79
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
        L75:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r0 = r10
            goto L7e
        L79:
            r10 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            throw r10     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9108dO1.mo4301b(java.lang.String):java.lang.Object");
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: c */
    public int mo4039c() {
        return ((X11) this.f26012b).mo4039c();
    }

    @Override // p000.InterfaceC9841j70
    public void close() {
        ((X11) this.f26012b).close();
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public /* synthetic */ void mo4560d() {
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: e */
    public void mo556e(Exception exc) {
        X21 x21 = (X21) this.f26013c;
        C11087ss0 c11087ss0 = (C11087ss0) this.f26012b;
        C11087ss0 c11087ss02 = x21.f13531f;
        if (c11087ss02 == null || c11087ss02 != c11087ss0) {
            return;
        }
        X21 x212 = (X21) this.f26013c;
        C11087ss0 c11087ss03 = (C11087ss0) this.f26012b;
        RunnableC0895OD runnableC0895OD = x212.f13527b;
        C0139CC c0139cc = x212.f13532g;
        InterfaceC0643KC interfaceC0643KC = c11087ss03.f42649c;
        runnableC0895OD.mo4921a(c0139cc, exc, interfaceC0643KC, interfaceC0643KC.mo3257d());
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: f */
    public void mo4042f() {
        ((X11) this.f26012b).mo4042f();
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public /* synthetic */ U51 mo4561g(byte[] bArr, int i, int i2) {
        return AbstractC11153tN0.m24896h(this, bArr, i2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C11677xU0(new C8326Tm0(23), new C7564Ev0(22), C0229Dd.f2083f, (GV0) ((C11287uQ0) this.f26012b).get(), (Provider) this.f26013c);
    }

    @Override // p000.InterfaceC9841j70
    public int getHeight() {
        return ((X11) this.f26012b).getHeight();
    }

    @Override // p000.InterfaceC9841j70
    public int getWidth() {
        return ((X11) this.f26012b).getWidth();
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: h */
    public Surface mo4044h() {
        return ((X11) this.f26012b).mo4044h();
    }

    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    public Object mo5748i(Uri uri, C1771bD c1771bD) {
        InterfaceC6952uU interfaceC6952uU = (InterfaceC6952uU) ((InterfaceC10231mA0) this.f26012b).mo5748i(uri, c1771bD);
        List list = (List) this.f26013c;
        return (list == null || list.isEmpty()) ? interfaceC6952uU : (InterfaceC6952uU) interfaceC6952uU.mo4151a(list);
    }

    @Override // p000.InterfaceC0580JC
    /* renamed from: j */
    public void mo557j(Object obj) {
        X21 x21 = (X21) this.f26013c;
        C11087ss0 c11087ss0 = (C11087ss0) this.f26012b;
        C11087ss0 c11087ss02 = x21.f13531f;
        if (c11087ss02 == null || c11087ss02 != c11087ss0) {
            return;
        }
        X21 x212 = (X21) this.f26013c;
        C11087ss0 c11087ss03 = (C11087ss0) this.f26012b;
        AbstractC4046fK abstractC4046fK = x212.f13526a.f7566p;
        if (obj != null && abstractC4046fK.mo17909c(c11087ss03.f42649c.mo3257d())) {
            x212.f13530e = obj;
            x212.f13527b.m5993n(2);
        } else {
            RunnableC0895OD runnableC0895OD = x212.f13527b;
            InterfaceC7740If0 interfaceC7740If0 = c11087ss03.f42647a;
            InterfaceC0643KC interfaceC0643KC = c11087ss03.f42649c;
            runnableC0895OD.mo4922c(interfaceC7740If0, obj, interfaceC0643KC, interfaceC0643KC.mo3257d(), x212.f13532g);
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: k */
    public void mo4047k(InterfaceC9713i70 interfaceC9713i70, Executor executor) {
        ((X11) this.f26012b).mo4047k(new H30(this, 2, interfaceC9713i70), executor);
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: l */
    public int mo4048l() {
        return ((X11) this.f26012b).mo4048l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:0x0123, code lost:
    
        r1 = r5;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x03a3, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0362 A[SYNTHETIC] */
    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4562m(byte[] r20, int r21, int r22, p000.C9072d61 r23, p000.InterfaceC6587oy r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9108dO1.mo4562m(byte[], int, int, d61, oy):void");
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: n */
    public InterfaceC9457g70 mo4049n() {
        return m17573q(((X11) this.f26012b).mo4049n());
    }

    /* renamed from: o */
    public void m17571o(Object obj, String str) {
        HashMap map = (HashMap) this.f26012b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f26013c).remove(str);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f26011a) {
            case 5:
                C0541Ia c0541Ia = (C0541Ia) this.f26013c;
                if (c0541Ia.f5004l == ((C6549oO) this.f26012b)) {
                    AbstractC7806Jm0.m4412f("AudioSource");
                    if (!(th instanceof IllegalStateException)) {
                        ExecutorC10151lY0 executorC10151lY0 = c0541Ia.f5002j;
                        C7967Mo1 c7967Mo1 = c0541Ia.f5003k;
                        if (executorC10151lY0 != null && c7967Mo1 != null) {
                            executorC10151lY0.execute(new RunnableC6720r4(c7967Mo1, 6, th));
                            break;
                        }
                    }
                }
                break;
            case 22:
                Objects.toString(th);
                AbstractC7806Jm0.m4412f("Recorder");
                break;
            case 26:
                int i = ((R61) this.f26012b).f10007f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    WT1.m8782a(i);
                    AbstractC7806Jm0.m4412f("SurfaceProcessorNode");
                    break;
                } else {
                    AbstractC7806Jm0.m4412f("SurfaceProcessorNode");
                    break;
                }
                break;
            default:
                C1339VH c1339vh = (C1339VH) this.f26012b;
                if (!((WR0) c1339vh.f12487c).f13185g) {
                    int iM8575a = ((C1373Vp) ((ArrayList) c1339vh.f12486b).get(0)).m8575a();
                    boolean z = th instanceof C11502w60;
                    C11507w81 c11507w81 = (C11507w81) this.f26013c;
                    if (z) {
                        C6937uF c6937uF = c11507w81.f44694c;
                        C1048Qe c1048Qe = new C1048Qe(iM8575a, (C11502w60) th);
                        c6937uF.getClass();
                        DV1.m1716a();
                        ((C0228Dc) c6937uF.f43620e).f2072m.mo3020b(c1048Qe);
                    } else {
                        C6937uF c6937uF2 = c11507w81.f44694c;
                        C1048Qe c1048Qe2 = new C1048Qe(iM8575a, new C11502w60("Failed to submit capture request", th));
                        c6937uF2.getClass();
                        DV1.m1716a();
                        ((C0228Dc) c6937uF2.f43620e).f2072m.mo3020b(c1048Qe2);
                    }
                    c11507w81.f44693b.m6782y();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        C6820sO c6820sO;
        switch (this.f26011a) {
            case 5:
                C11506w80 c11506w80 = (C11506w80) obj;
                C0541Ia c0541Ia = (C0541Ia) this.f26013c;
                if (!c0541Ia.f5001i || c0541Ia.f5004l != ((C6549oO) this.f26012b)) {
                    c11506w80.m25564a();
                    return;
                }
                boolean z = c0541Ia.f5007o;
                J01 j01 = c0541Ia.f4997e;
                C7156xj c7156xj = c0541Ia.f4996d;
                if (z) {
                    AbstractC9104dM1.m17550i(c0541Ia.f5008p > 0, null);
                    if (System.nanoTime() - c0541Ia.f5008p >= c0541Ia.f4998f) {
                        AbstractC9104dM1.m17550i(c0541Ia.f5007o, null);
                        try {
                            c7156xj.m25931c();
                            AbstractC7806Jm0.m4412f("AudioSource");
                            j01.m4104a();
                            j01.f5252a.set(false);
                            c0541Ia.f5007o = false;
                        } catch (C0667Ka unused) {
                            AbstractC7806Jm0.m4412f("AudioSource");
                            c0541Ia.f5008p = System.nanoTime();
                        }
                    }
                }
                if (!c0541Ia.f5007o) {
                    j01 = c7156xj;
                }
                if (c11506w80.f44689f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                ByteBuffer byteBuffer = c11506w80.f44686c;
                C7023vc c7023vc = j01.read(byteBuffer);
                int i = c7023vc.f44446a;
                if (i > 0) {
                    if (c0541Ia.f5010r) {
                        byte[] bArr = c0541Ia.f5011s;
                        if (bArr == null || bArr.length < i) {
                            c0541Ia.f5011s = new byte[i];
                        }
                        int iPosition = byteBuffer.position();
                        byteBuffer.put(c0541Ia.f5011s, 0, i);
                        byteBuffer.limit(byteBuffer.position()).position(iPosition);
                    }
                    ExecutorC10151lY0 executorC10151lY0 = c0541Ia.f5002j;
                    long j = c7023vc.f44447b;
                    if (executorC10151lY0 != null && j - c0541Ia.f5013u >= 200) {
                        c0541Ia.f5013u = j;
                        C7967Mo1 c7967Mo1 = c0541Ia.f5003k;
                        if (c0541Ia.f5014v == 2) {
                            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                            double dMax = 0.0d;
                            while (shortBufferAsShortBuffer.hasRemaining()) {
                                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                                c7967Mo1 = c7967Mo1;
                            }
                            C7967Mo1 c7967Mo12 = c7967Mo1;
                            c0541Ia.f5012t = dMax / 32767.0d;
                            if (c7967Mo12 != null) {
                                executorC10151lY0.execute(new RunnableC6720r4(c0541Ia, 9, c7967Mo12));
                            }
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + i);
                    long micros = TimeUnit.NANOSECONDS.toMicros(j);
                    if (c11506w80.f44689f.get()) {
                        throw new IllegalStateException("The buffer is submitted or canceled.");
                    }
                    AbstractC9104dM1.m17546e(micros >= 0);
                    c11506w80.f44690g = micros;
                    c11506w80.m25565b();
                } else {
                    AbstractC7806Jm0.m4412f("AudioSource");
                    c11506w80.m25564a();
                }
                c0541Ia.m3940c();
                return;
            case 22:
                InterfaceC3925dO interfaceC3925dO = (InterfaceC3925dO) obj;
                Objects.toString(interfaceC3925dO);
                AbstractC7806Jm0.m4412f("Recorder");
                if (interfaceC3925dO == null) {
                    return;
                }
                C9491gO0 c9491gO0 = (C9491gO0) this.f26013c;
                ScheduledFuture scheduledFuture = c9491gO0.f27743Y;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (c6820sO = c9491gO0.f27724F) != null && c6820sO == interfaceC3925dO) {
                    C9491gO0.m18483q(c6820sO);
                }
                c9491gO0.f27748b0 = (C10715py0) this.f26012b;
                c9491gO0.m18484A(null);
                c9491gO0.m18506u(c9491gO0.m18501n());
                return;
            case 26:
                T61 t61 = (T61) obj;
                t61.getClass();
                C0584JG c0584jg = (C0584JG) ((C8539Xo1) this.f26013c).f13981b;
                if (c0584jg.f5434e.get()) {
                    t61.close();
                    return;
                }
                RunnableC3973eA runnableC3973eA = new RunnableC3973eA(c0584jg, 11, t61);
                Objects.requireNonNull(t61);
                c0584jg.m4267b(runnableC3973eA, new RunnableC0204DE(3, t61));
                return;
            default:
                ((C11507w81) this.f26013c).f44693b.m6782y();
                return;
        }
    }

    /* renamed from: p */
    public void m17572p(long j, C9591hA0 c9591hA0) {
        if (c9591hA0.m18743a() < 9) {
            return;
        }
        int iM18749g = c9591hA0.m18749g();
        int iM18749g2 = c9591hA0.m18749g();
        int iM18763u = c9591hA0.m18763u();
        if (iM18749g == 434 && iM18749g2 == 1195456820 && iM18763u == 3) {
            AbstractC10780qS1.m24003b(j, c9591hA0, (InterfaceC8357Ub1[]) this.f26013c);
        }
    }

    /* renamed from: q */
    public C11814yZ0 m17573q(InterfaceC9457g70 interfaceC9457g70) {
        C10996s81 c10996s81;
        if (interfaceC9457g70 == null) {
            return null;
        }
        if (((OD0) this.f26013c) == null) {
            c10996s81 = C10996s81.f42278b;
        } else {
            OD0 od0 = (OD0) this.f26013c;
            Pair pair = new Pair(od0.f8312i, od0.f8313j.get(0));
            C10996s81 c10996s812 = C10996s81.f42278b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            c10996s81 = new C10996s81(arrayMap);
        }
        this.f26013c = null;
        return new C11814yZ0(interfaceC9457g70, new Size(interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight()), new C7097wn(new C0848NT((InterfaceC7034vn) null, c10996s81, interfaceC9457g70.mo18403P().getTimestamp())));
    }

    /* renamed from: r */
    public void m17574r(InterfaceC1538YR interfaceC1538YR, YM0 ym0) {
        int i = 0;
        while (true) {
            InterfaceC8357Ub1[] interfaceC8357Ub1Arr = (InterfaceC8357Ub1[]) this.f26013c;
            if (i >= interfaceC8357Ub1Arr.length) {
                return;
            }
            ym0.m9266a();
            ym0.m9267b();
            InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(ym0.f14272e, 3);
            C6686qX c6686qX = (C6686qX) ((List) this.f26012b).get(i);
            String str = c6686qX.f40974m;
            YN1.m9277b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C6623pX c6623pX = new C6623pX();
            ym0.m9267b();
            c6623pX.f40150a = (String) ym0.f14269b;
            c6623pX.f40161l = AbstractC8544Xr0.m9171n(str);
            c6623pX.f40154e = c6686qX.f40966e;
            c6623pX.f40153d = c6686qX.f40965d;
            c6623pX.f40145E = c6686qX.f40956F;
            c6623pX.f40164o = c6686qX.f40977p;
            F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w);
            interfaceC8357Ub1Arr[i] = interfaceC8357Ub1Mo2005w;
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    /* renamed from: s */
    public C7179y5 m17575s(QE0 qe0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        O90.m5968f(qe0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        InterfaceC6976us interfaceC6976usM17467d = AbstractC9060d12.m17467d((InterfaceC7402Bs0) this.f26012b, CB1.m1001a(interfaceC8392Ut0, qe0.f9544c), (T71) this.f26013c);
        Map mapM24786n = C0842NN.f7735a;
        if (qe0.f9545d.size() != 0 && !C6298kP.m22200f(interfaceC6976usM17467d)) {
            int i = AbstractC6814sI.f42360a;
            if (AbstractC6814sI.m24702n(interfaceC6976usM17467d, EnumC0118Bs.f1064e)) {
                Collection collectionMo1435g = interfaceC6976usM17467d.mo1435g();
                O90.m5967e(collectionMo1435g, "getConstructors(...)");
                C6707qs c6707qs = (C6707qs) AbstractC7167xu.m25973S(collectionMo1435g);
                if (c6707qs != null) {
                    List listMo1221f0 = c6707qs.mo1221f0();
                    O90.m5967e(listMo1221f0, "getValueParameters(...)");
                    List list = listMo1221f0;
                    int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(list));
                    if (iM24983b < 16) {
                        iM24983b = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
                    for (Object obj : list) {
                        linkedHashMap.put(((C8473Wh1) obj).getName(), obj);
                    }
                    List<OE0> list2 = qe0.f9545d;
                    O90.m5967e(list2, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (OE0 oe0 : list2) {
                        O90.m5965c(oe0);
                        C8473Wh1 c8473Wh1 = (C8473Wh1) linkedHashMap.get(CB1.m1002b(interfaceC8392Ut0, oe0.f8321c));
                        if (c8473Wh1 != null) {
                            C8340Tt0 c8340Tt0M1002b = CB1.m1002b(interfaceC8392Ut0, oe0.f8321c);
                            AbstractC7742Ig0 type = c8473Wh1.getType();
                            O90.m5967e(type, "getType(...)");
                            NE0 ne0 = oe0.f8322d;
                            O90.m5967e(ne0, "getValue(...)");
                            AbstractC0249Dx abstractC0249DxM17566F = m17566F(type, ne0, interfaceC8392Ut0);
                            pair = m17576t(abstractC0249DxM17566F, type, ne0) ? abstractC0249DxM17566F : null;
                            if (pair == null) {
                                String str = "Unexpected argument value: actual type " + ne0.f7656c + " != expected type " + type;
                                O90.m5968f(str, "message");
                                pair = new C6361lP(str);
                            }
                            pair = new kotlin.Pair(c8340Tt0M1002b, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapM24786n = AbstractC11077sn0.m24786n(arrayList);
                }
            }
        }
        return new C7179y5(interfaceC6976usM17467d.mo1492m(), mapM24786n, W21.f12940O0);
    }

    /* renamed from: t */
    public boolean m17576t(AbstractC0249Dx abstractC0249Dx, AbstractC7742Ig0 abstractC7742Ig0, NE0 ne0) {
        ME0 me0 = ne0.f7656c;
        int i = me0 == null ? -1 : AbstractC7242z5.f46629a[me0.ordinal()];
        if (i != 10) {
            InterfaceC7402Bs0 interfaceC7402Bs0 = (InterfaceC7402Bs0) this.f26012b;
            if (i != 13) {
                return O90.m5963a(abstractC0249Dx.mo412a(interfaceC7402Bs0), abstractC7742Ig0);
            }
            if (abstractC0249Dx instanceof C0513I8) {
                C0513I8 c0513i8 = (C0513I8) abstractC0249Dx;
                if (((List) c0513i8.f2329a).size() == ne0.f7664k.size()) {
                    AbstractC7742Ig0 abstractC7742Ig0M26499f = interfaceC7402Bs0.mo897h().m26499f(abstractC7742Ig0);
                    Collection collection = (Collection) c0513i8.f2329a;
                    O90.m5968f(collection, "<this>");
                    Iterable c9461g90 = new C9461g90(0, collection.size() - 1, 1);
                    if ((c9461g90 instanceof Collection) && ((Collection) c9461g90).isEmpty()) {
                        return true;
                    }
                    Iterator it = c9461g90.iterator();
                    while (((C9333f90) it).f27092c) {
                        int iM18193a = ((C9333f90) it).m18193a();
                        AbstractC0249Dx abstractC0249Dx2 = (AbstractC0249Dx) ((List) c0513i8.f2329a).get(iM18193a);
                        NE0 ne02 = (NE0) ne0.f7664k.get(iM18193a);
                        O90.m5967e(ne02, "getArrayElement(...)");
                        if (!m17576t(abstractC0249Dx2, abstractC7742Ig0M26499f, ne02)) {
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC0249Dx).toString());
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
        if (interfaceC6976us == null) {
            return true;
        }
        C8340Tt0 c8340Tt0 = AbstractC11955zg0.f46926e;
        if (AbstractC11955zg0.m26491b(interfaceC6976us, AbstractC10604p41.f39789P)) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f26011a) {
            case 21:
                return "QualitySelector{preferredQualities=" + ((List) this.f26012b) + ", fallbackStrategy=" + ((C0481Hd) this.f26013c) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public byte[] m17577u(C0719LP c0719lp) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f26012b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f26013c;
        try {
            dataOutputStream.writeBytes(c0719lp.f6622a);
            dataOutputStream.writeByte(0);
            String str = c0719lp.f6623b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c0719lp.f6624c);
            dataOutputStream.writeLong(c0719lp.f6625d);
            dataOutputStream.write(c0719lp.f6626e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: v */
    public synchronized void m17578v(CA0 ca0) {
        try {
            CA0 ca02 = (CA0) this.f26013c;
            if (ca02 != null) {
                ca02.f1235c = ca0;
                this.f26013c = ca0;
            } else {
                if (((CA0) this.f26012b) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f26013c = ca0;
                this.f26012b = ca0;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: x */
    public void m17579x(String str, InterfaceC6497nZ interfaceC6497nZ) {
        LinkedHashMap linkedHashMap = ((C0433Gs) this.f26013c).f3933a;
        G01 g01 = new G01(str, this);
        interfaceC6497nZ.invoke(g01);
        ArrayList arrayList = g01.f3525b;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((kotlin.Pair) it.next()).f36702a);
        }
        String str2 = (String) g01.f3526c.f36702a;
        String str3 = g01.f3524a;
        O90.m5968f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('(');
        sb.append(AbstractC7167xu.m25962H(arrayList2, "", null, null, XS0.f13781q, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb.append(str2);
        String string = sb.toString();
        String str4 = (String) this.f26012b;
        O90.m5968f(str4, "internalName");
        O90.m5968f(string, "jvmDescriptor");
        String str5 = str4 + '.' + string;
        C8751ae1 c8751ae1 = (C8751ae1) g01.f3526c.f36703b;
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C8751ae1) ((kotlin.Pair) it2.next()).f36703b);
        }
        linkedHashMap.put(str5, new C11768yC0(c8751ae1, arrayList3));
    }

    /* renamed from: y */
    public CctBackendFactory m17580y(String str) {
        Map mapEmptyMap;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.f26013c) == null) {
            Context context = (Context) this.f26012b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            if (bundle == null) {
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                mapEmptyMap = map;
            }
            this.f26013c = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.f26013c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    /* renamed from: z */
    public HashMap m17581z() {
        try {
            ((String) this.f26013c).getClass();
            Cursor cursorQuery = ((C9580h41) this.f26012b).getReadableDatabase().query((String) this.f26013c, f26010e, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C4010el(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    public /* synthetic */ C9108dO1(int i, boolean z) {
        this.f26011a = i;
    }

    public /* synthetic */ C9108dO1(Object obj, int i, Object obj2) {
        this.f26011a = i;
        this.f26013c = obj;
        this.f26012b = obj2;
    }

    public /* synthetic */ C9108dO1(Object obj, Object obj2, boolean z, int i) {
        this.f26011a = i;
        this.f26012b = obj;
        this.f26013c = obj2;
    }

    public C9108dO1(C9304ew1 c9304ew1, C7564Ev0 c7564Ev0) {
        this.f26011a = 14;
        this.f26012b = c9304ew1;
        this.f26013c = AbstractC0705LB.m4915b(new C4090g1(16, this));
    }

    public C9108dO1(int i) {
        this.f26011a = i;
        switch (i) {
            case 9:
                this.f26012b = new HashMap();
                this.f26013c = new ArrayList();
                break;
            case 11:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f26012b = byteArrayOutputStream;
                this.f26013c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 16:
                this.f26013c = new HashMap();
                break;
            case 29:
                this.f26012b = new C9591hA0();
                this.f26013c = new C9542gn1();
                break;
            default:
                this.f26012b = null;
                this.f26013c = null;
                break;
        }
    }

    public C9108dO1(Context context, int i) {
        this.f26011a = i;
        switch (i) {
            case 17:
                this.f26013c = null;
                this.f26012b = context;
                break;
            default:
                this.f26012b = context;
                C10004kO1 c10004kO1 = new C10004kO1(null);
                this.f26013c = c10004kO1;
                context.getContentResolver().registerContentObserver(AbstractC11789yM1.f46230a, true, c10004kO1);
                break;
        }
    }

    public C9108dO1(InterfaceC7402Bs0 interfaceC7402Bs0, T71 t71) {
        this.f26011a = 3;
        O90.m5968f(interfaceC7402Bs0, "module");
        O90.m5968f(t71, "notFoundClasses");
        this.f26012b = interfaceC7402Bs0;
        this.f26013c = t71;
    }

    public C9108dO1(List list) {
        this.f26011a = 28;
        this.f26012b = list;
        this.f26013c = new InterfaceC8357Ub1[list.size()];
    }

    public C9108dO1(C1246To c1246To) {
        this.f26011a = 8;
        this.f26012b = c1246To;
        C7560Et0 c7560Et0 = new C7560Et0();
        this.f26013c = c7560Et0;
        c7560Et0.m2440k(new C7275zc(5, null));
    }

    public C9108dO1(Context context, Object obj, LinkedHashSet linkedHashSet) {
        C7161xo c7161xoM25938a;
        this.f26011a = 7;
        C9937jt0 c9937jt0 = new C9937jt0(9);
        this.f26012b = new HashMap();
        this.f26013c = c9937jt0;
        if (obj instanceof C7161xo) {
            c7161xoM25938a = (C7161xo) obj;
        } else {
            c7161xoM25938a = C7161xo.m25938a(context, AbstractC7806Jm0.m4410d());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f26012b).put(str, new H61(context, str, c7161xoM25938a, (C9937jt0) this.f26013c));
        }
    }

    public C9108dO1(U41 u41, HashMap map, HashMap map2) {
        this.f26011a = 2;
        this.f26012b = u41;
        this.f26013c = map;
    }

    public C9108dO1(List list, C0481Hd c0481Hd) {
        this.f26011a = 21;
        AbstractC9104dM1.m17545d("No preferred quality and fallback strategy.", (list.isEmpty() && c0481Hd == C0481Hd.f4376c) ? false : true);
        this.f26012b = Collections.unmodifiableList(new ArrayList(list));
        this.f26013c = c0481Hd;
    }

    public C9108dO1(C0433Gs c0433Gs, String str) {
        this.f26011a = 24;
        O90.m5968f(str, "className");
        this.f26013c = c0433Gs;
        this.f26012b = str;
    }

    public C9108dO1(AbstractC11487w00 abstractC11487w00) {
        this.f26011a = 13;
        C4118gT c4118gT = abstractC11487w00.f44633a;
        c4118gT.getClass();
        Iterator it = ((C6724r8) c4118gT.f27808a.entrySet()).iterator();
        this.f26012b = it;
        if (it.hasNext()) {
            this.f26013c = (Map.Entry) it.next();
        }
    }
}
