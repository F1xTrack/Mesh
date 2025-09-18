package defpackage;

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
public class C3383dO1 implements JN1, PZ, InterfaceC5834mA0, InterfaceC5252j70, InterfaceC4347iS, JC, InterfaceC3519e61 {
    public static C3383dO1 d;
    public static final String[] e = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C3383dO1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized void L() {
        Context context;
        try {
            C3383dO1 c3383dO1 = d;
            if (c3383dO1 != null && (context = (Context) c3383dO1.b) != null && ((C5495kO1) c3383dO1.c) != null) {
                context.getContentResolver().unregisterContentObserver((C5495kO1) d.c);
            }
            d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static C3383dO1 w(List list, C0575Hd c0575Hd) {
        AbstractC3377dM1.h(list, "qualities cannot be null");
        AbstractC3377dM1.d("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6496pe c6496pe = (C6496pe) it.next();
            AbstractC3377dM1.d("qualities contain invalid quality: " + c6496pe, C6496pe.k.contains(c6496pe));
        }
        return new C3383dO1(list, c0575Hd);
    }

    public void A(long j) {
        C4086h41 c4086h41 = (C4086h41) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (AbstractC0202Ci1.a(c4086h41.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c4086h41.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC0202Ci1.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new C6353ou(e2);
        }
    }

    public void B(C3408dX c3408dX) {
        int i = c3408dX.b;
        Handler handler = (Handler) this.c;
        C7409uQ0 c7409uQ0 = (C7409uQ0) this.b;
        if (i == 0) {
            handler.post(new XZ(c7409uQ0, 4, c3408dX.a));
        } else {
            handler.post(new RunnableC0677Il(c7409uQ0, i, 0));
        }
    }

    public synchronized CA0 C() {
        CA0 ca0;
        ca0 = (CA0) this.b;
        if (ca0 != null) {
            CA0 ca02 = ca0.c;
            this.b = ca02;
            if (ca02 == null) {
                this.c = null;
            }
        }
        return ca0;
    }

    public synchronized CA0 D() {
        try {
            if (((CA0) this.b) == null) {
                wait(1000);
            }
        } catch (Throwable th) {
            throw th;
        }
        return C();
    }

    public void E(Set set) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C4086h41) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new C6353ou(e2);
        }
    }

    public AbstractC0323Dx F(AbstractC0663Ig0 abstractC0663Ig0, NE0 ne0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        AbstractC0323Dx c7489ur;
        O90.f(ne0, "value");
        O90.f(interfaceC1637Ut0, "nameResolver");
        boolean zBooleanValue = ZV.N.c(ne0.m).booleanValue();
        ME0 me0 = ne0.c;
        switch (me0 == null ? -1 : AbstractC8296z5.a[me0.ordinal()]) {
            case 1:
                byte b = (byte) ne0.d;
                return zBooleanValue ? new C1671Ve1(b) : new C0752Jk(b);
            case 2:
                c7489ur = new C7489ur(Character.valueOf((char) ne0.d));
                break;
            case 3:
                short s = (short) ne0.d;
                return zBooleanValue ? new C1671Ve1(s) : new C7519v01(s);
            case 4:
                int i = (int) ne0.d;
                return zBooleanValue ? new C1671Ve1(i) : new C4100h90(i);
            case 5:
                long j = ne0.d;
                return zBooleanValue ? new C1671Ve1(j) : new C0444Fl0(j);
            case 6:
                c7489ur = new C0746Ji(ne0.e);
                break;
            case 7:
                c7489ur = new C0746Ji(ne0.f);
                break;
            case 8:
                c7489ur = new C0746Ji(Boolean.valueOf(ne0.d != 0));
                break;
            case 9:
                c7489ur = new C7347u51(interfaceC1637Ut0.getString(ne0.g));
                break;
            case 10:
                c7489ur = new C4193he0(CB1.a(interfaceC1637Ut0, ne0.h), ne0.l);
                break;
            case 11:
                c7489ur = new TO(CB1.a(interfaceC1637Ut0, ne0.h), CB1.b(interfaceC1637Ut0, ne0.i));
                break;
            case 12:
                QE0 qe0 = ne0.j;
                O90.e(qe0, "getAnnotation(...)");
                c7489ur = new G5((Object) s(qe0, interfaceC1637Ut0));
                break;
            case 13:
                List list = ne0.k;
                O90.e(list, "getArrayElementList(...)");
                List<NE0> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
                for (NE0 ne02 : list2) {
                    X01 x01E = ((InterfaceC0153Bs0) this.b).h().e();
                    O90.c(ne02);
                    arrayList.add(F(x01E, ne02, interfaceC1637Ut0));
                }
                return new C0736Je1(arrayList, abstractC0663Ig0);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + ne0.c + " (expected " + abstractC0663Ig0 + ')').toString());
        }
        return c7489ur;
    }

    @Override // defpackage.InterfaceC3519e61
    public int G() {
        return 1;
    }

    public void H(long j, long j2, String str) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C4086h41) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e2) {
            throw new C6353ou(e2);
        }
    }

    public void I(EnumC7289to enumC7289to, C0026Ac c0026Ac) {
        C8395zc c8395zc;
        switch (enumC7289to.ordinal()) {
            case 0:
            case 2:
                c8395zc = new C8395zc(5, c0026Ac);
                break;
            case 1:
            case 4:
                c8395zc = new C8395zc(4, c0026Ac);
                break;
            case 3:
                C1543To c1543To = (C1543To) this.b;
                synchronized (c1543To.b) {
                    Iterator it = c1543To.e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c8395zc = new C8395zc(1, null);
                        } else if (((C1465So) ((Map.Entry) it.next()).getValue()).a == EnumC7289to.CLOSING) {
                            c8395zc = new C8395zc(2, null);
                        }
                    }
                }
                break;
            case 5:
                c8395zc = new C8395zc(2, c0026Ac);
                break;
            case 6:
            case 7:
                c8395zc = new C8395zc(3, c0026Ac);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC7289to);
        }
        c8395zc.toString();
        enumC7289to.toString();
        Objects.toString(c0026Ac);
        AbstractC0759Jm0.f("CameraStateMachine");
        if (Objects.equals((C8395zc) ((C0390Et0) this.c).d(), c8395zc)) {
            return;
        }
        c8395zc.toString();
        AbstractC0759Jm0.f("CameraStateMachine");
        ((C0390Et0) this.c).k(c8395zc);
    }

    public C6860rY0 J(C1559Tt0 c1559Tt0, String str) {
        O90.f(c1559Tt0, "name");
        String strB = c1559Tt0.b();
        O90.e(strB, "asString(...)");
        return new C6860rY0(this, new C5960mq0(strB.concat(str)));
    }

    public void K(int i, J9 j9) throws IOException {
        while (true) {
            Map.Entry entry = (Map.Entry) this.c;
            if (entry == null || ((C7899x00) entry.getKey()).a >= i) {
                return;
            }
            C7899x00 c7899x00 = (C7899x00) ((Map.Entry) this.c).getKey();
            Object value = ((Map.Entry) this.c).getValue();
            C3968gT c3968gT = C3968gT.c;
            EnumC6337oo1 enumC6337oo1 = c7899x00.b;
            boolean z = c7899x00.c;
            int i2 = c7899x00.a;
            if (z) {
                for (Object obj : (List) value) {
                    if (enumC6337oo1 == EnumC6337oo1.e) {
                        j9.H(i2, 3);
                        ((K0) obj).f(j9);
                        j9.H(i2, 4);
                    } else {
                        j9.H(i2, enumC6337oo1.b);
                        C3968gT.k(j9, enumC6337oo1, obj);
                    }
                }
            } else if (enumC6337oo1 == EnumC6337oo1.e) {
                j9.H(i2, 3);
                ((K0) value).f(j9);
                j9.H(i2, 4);
            } else {
                j9.H(i2, enumC6337oo1.b);
                C3968gT.k(j9, enumC6337oo1, value);
            }
            Iterator it = (Iterator) this.b;
            if (it.hasNext()) {
                this.c = (Map.Entry) it.next();
            } else {
                this.c = null;
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public InterfaceC3903g70 a() {
        return q(((X11) this.b).a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x004d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x004e, code lost:
    
        if (r3 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0050, code lost:
    
        defpackage.AbstractC6828rN1.a = null;
     */
    @Override // defpackage.JN1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object r1 = r9.b
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L7e
            boolean r2 = defpackage.AbstractC6828rN1.a()
            if (r2 == 0) goto L5c
            boolean r2 = defpackage.AbstractC6828rN1.b
            r3 = 1
            if (r2 == 0) goto L13
            goto L57
        L13:
            java.lang.Class<rN1> r2 = defpackage.AbstractC6828rN1.class
            monitor-enter(r2)
            boolean r4 = defpackage.AbstractC6828rN1.b     // Catch: java.lang.Throwable -> L1c
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
            android.os.UserManager r5 = defpackage.AbstractC6828rN1.a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L32
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L1c
            defpackage.AbstractC6828rN1.a = r5     // Catch: java.lang.Throwable -> L1c
        L32:
            android.os.UserManager r5 = defpackage.AbstractC6828rN1.a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L37
            goto L52
        L37:
            boolean r8 = defpackage.AbstractC1362Rf1.v(r5)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            if (r8 != 0) goto L4e
            android.os.UserHandle r8 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            boolean r1 = r5.isUserRunning(r8)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L48
            if (r1 != 0) goto L4d
            goto L4e
        L48:
            defpackage.AbstractC6828rN1.a = r6     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto L1f
        L4d:
            r3 = r7
        L4e:
            if (r3 == 0) goto L52
            defpackage.AbstractC6828rN1.a = r6     // Catch: java.lang.Throwable -> L1c
        L52:
            if (r3 == 0) goto L56
            defpackage.AbstractC6828rN1.b = r3     // Catch: java.lang.Throwable -> L1c
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
            r1.a = r9     // Catch: java.lang.Throwable -> L7e
            r1.b = r10     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r1.a()     // Catch: java.lang.SecurityException -> L6a java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            goto L75
        L6a:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.Object r10 = r1.a()     // Catch: java.lang.Throwable -> L79
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3383dO1.b(java.lang.String):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5252j70
    public int c() {
        return ((X11) this.b).c();
    }

    @Override // defpackage.InterfaceC5252j70
    public void close() {
        ((X11) this.b).close();
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ void d() {
    }

    @Override // defpackage.JC
    public void e(Exception exc) {
        X21 x21 = (X21) this.c;
        C7111ss0 c7111ss0 = (C7111ss0) this.b;
        C7111ss0 c7111ss02 = x21.f;
        if (c7111ss02 == null || c7111ss02 != c7111ss0) {
            return;
        }
        X21 x212 = (X21) this.c;
        C7111ss0 c7111ss03 = (C7111ss0) this.b;
        OD od = x212.b;
        CC cc = x212.g;
        KC kc = c7111ss03.c;
        od.a(cc, exc, kc, kc.d());
    }

    @Override // defpackage.InterfaceC5252j70
    public void f() {
        ((X11) this.b).f();
    }

    @Override // defpackage.InterfaceC3519e61
    public /* synthetic */ U51 g(byte[] bArr, int i, int i2) {
        return AbstractC7209tN0.h(this, bArr, i2);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C7992xU0(new C1538Tm0(23), new C0396Ev0(22), C0263Dd.f, (GV0) ((C7409uQ0) this.b).get(), (Provider) this.c);
    }

    @Override // defpackage.InterfaceC5252j70
    public int getHeight() {
        return ((X11) this.b).getHeight();
    }

    @Override // defpackage.InterfaceC5252j70
    public int getWidth() {
        return ((X11) this.b).getWidth();
    }

    @Override // defpackage.InterfaceC5252j70
    public Surface h() {
        return ((X11) this.b).h();
    }

    @Override // defpackage.InterfaceC5834mA0
    public Object i(Uri uri, C2282bD c2282bD) {
        InterfaceC7420uU interfaceC7420uU = (InterfaceC7420uU) ((InterfaceC5834mA0) this.b).i(uri, c2282bD);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? interfaceC7420uU : (InterfaceC7420uU) interfaceC7420uU.a(list);
    }

    @Override // defpackage.JC
    public void j(Object obj) {
        X21 x21 = (X21) this.c;
        C7111ss0 c7111ss0 = (C7111ss0) this.b;
        C7111ss0 c7111ss02 = x21.f;
        if (c7111ss02 == null || c7111ss02 != c7111ss0) {
            return;
        }
        X21 x212 = (X21) this.c;
        C7111ss0 c7111ss03 = (C7111ss0) this.b;
        AbstractC3750fK abstractC3750fK = x212.a.p;
        if (obj != null && abstractC3750fK.c(c7111ss03.c.d())) {
            x212.e = obj;
            x212.b.n(2);
        } else {
            OD od = x212.b;
            InterfaceC0660If0 interfaceC0660If0 = c7111ss03.a;
            KC kc = c7111ss03.c;
            od.c(interfaceC0660If0, obj, kc, kc.d(), x212.g);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public void k(InterfaceC4285i70 interfaceC4285i70, Executor executor) {
        ((X11) this.b).k(new H30(this, 2, interfaceC4285i70), executor);
    }

    @Override // defpackage.InterfaceC5252j70
    public int l() {
        return ((X11) this.b).l();
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
    @Override // defpackage.InterfaceC3519e61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(byte[] r20, int r21, int r22, defpackage.C3329d61 r23, defpackage.InterfaceC6365oy r24) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3383dO1.m(byte[], int, int, d61, oy):void");
    }

    @Override // defpackage.InterfaceC5252j70
    public InterfaceC3903g70 n() {
        return q(((X11) this.b).n());
    }

    public void o(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 5:
                C0644Ia c0644Ia = (C0644Ia) this.c;
                if (c0644Ia.l == ((C6257oO) this.b)) {
                    AbstractC0759Jm0.f("AudioSource");
                    if (!(th instanceof IllegalStateException)) {
                        ExecutorC5715lY0 executorC5715lY0 = c0644Ia.j;
                        C0999Mo1 c0999Mo1 = c0644Ia.k;
                        if (executorC5715lY0 != null && c0999Mo1 != null) {
                            executorC5715lY0.execute(new RunnableC6769r4(c0999Mo1, 6, th));
                            break;
                        }
                    }
                }
                break;
            case 22:
                Objects.toString(th);
                AbstractC0759Jm0.f("Recorder");
                break;
            case 26:
                int i = ((R61) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    WT1.a(i);
                    AbstractC0759Jm0.f("SurfaceProcessorNode");
                    break;
                } else {
                    AbstractC0759Jm0.f("SurfaceProcessorNode");
                    break;
                }
                break;
            default:
                VH vh = (VH) this.b;
                if (!((WR0) vh.c).g) {
                    int iA = ((C1702Vp) ((ArrayList) vh.b).get(0)).a();
                    boolean z = th instanceof C7730w60;
                    C7737w81 c7737w81 = (C7737w81) this.c;
                    if (z) {
                        C7375uF c7375uF = c7737w81.c;
                        C1279Qe c1279Qe = new C1279Qe(iA, (C7730w60) th);
                        c7375uF.getClass();
                        DV1.a();
                        ((C0260Dc) c7375uF.e).m.b(c1279Qe);
                    } else {
                        C7375uF c7375uF2 = c7737w81.c;
                        C1279Qe c1279Qe2 = new C1279Qe(iA, new C7730w60("Failed to submit capture request", th));
                        c7375uF2.getClass();
                        DV1.a();
                        ((C0260Dc) c7375uF2.e).m.b(c1279Qe2);
                    }
                    c7737w81.b.y();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        C7020sO c7020sO;
        switch (this.a) {
            case 5:
                C7736w80 c7736w80 = (C7736w80) obj;
                C0644Ia c0644Ia = (C0644Ia) this.c;
                if (!c0644Ia.i || c0644Ia.l != ((C6257oO) this.b)) {
                    c7736w80.a();
                    return;
                }
                boolean z = c0644Ia.o;
                J01 j01 = c0644Ia.e;
                C8036xj c8036xj = c0644Ia.d;
                if (z) {
                    AbstractC3377dM1.i(c0644Ia.p > 0, null);
                    if (System.nanoTime() - c0644Ia.p >= c0644Ia.f) {
                        AbstractC3377dM1.i(c0644Ia.o, null);
                        try {
                            c8036xj.c();
                            AbstractC0759Jm0.f("AudioSource");
                            j01.a();
                            j01.a.set(false);
                            c0644Ia.o = false;
                        } catch (C0800Ka unused) {
                            AbstractC0759Jm0.f("AudioSource");
                            c0644Ia.p = System.nanoTime();
                        }
                    }
                }
                if (!c0644Ia.o) {
                    j01 = c8036xj;
                }
                if (c7736w80.f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                ByteBuffer byteBuffer = c7736w80.c;
                C7635vc c7635vc = j01.read(byteBuffer);
                int i = c7635vc.a;
                if (i > 0) {
                    if (c0644Ia.r) {
                        byte[] bArr = c0644Ia.s;
                        if (bArr == null || bArr.length < i) {
                            c0644Ia.s = new byte[i];
                        }
                        int iPosition = byteBuffer.position();
                        byteBuffer.put(c0644Ia.s, 0, i);
                        byteBuffer.limit(byteBuffer.position()).position(iPosition);
                    }
                    ExecutorC5715lY0 executorC5715lY0 = c0644Ia.j;
                    long j = c7635vc.b;
                    if (executorC5715lY0 != null && j - c0644Ia.u >= 200) {
                        c0644Ia.u = j;
                        C0999Mo1 c0999Mo1 = c0644Ia.k;
                        if (c0644Ia.v == 2) {
                            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                            double dMax = 0.0d;
                            while (shortBufferAsShortBuffer.hasRemaining()) {
                                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                                c0999Mo1 = c0999Mo1;
                            }
                            C0999Mo1 c0999Mo12 = c0999Mo1;
                            c0644Ia.t = dMax / 32767.0d;
                            if (c0999Mo12 != null) {
                                executorC5715lY0.execute(new RunnableC6769r4(c0644Ia, 9, c0999Mo12));
                            }
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + i);
                    long micros = TimeUnit.NANOSECONDS.toMicros(j);
                    if (c7736w80.f.get()) {
                        throw new IllegalStateException("The buffer is submitted or canceled.");
                    }
                    AbstractC3377dM1.e(micros >= 0);
                    c7736w80.g = micros;
                    c7736w80.b();
                } else {
                    AbstractC0759Jm0.f("AudioSource");
                    c7736w80.a();
                }
                c0644Ia.c();
                return;
            case 22:
                InterfaceC3381dO interfaceC3381dO = (InterfaceC3381dO) obj;
                Objects.toString(interfaceC3381dO);
                AbstractC0759Jm0.f("Recorder");
                if (interfaceC3381dO == null) {
                    return;
                }
                C3954gO0 c3954gO0 = (C3954gO0) this.c;
                ScheduledFuture scheduledFuture = c3954gO0.Y;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (c7020sO = c3954gO0.F) != null && c7020sO == interfaceC3381dO) {
                    C3954gO0.q(c7020sO);
                }
                c3954gO0.b0 = (C6557py0) this.b;
                c3954gO0.A(null);
                c3954gO0.u(c3954gO0.n());
                return;
            case 26:
                T61 t61 = (T61) obj;
                t61.getClass();
                JG jg = (JG) ((C1857Xo1) this.c).b;
                if (jg.e.get()) {
                    t61.close();
                    return;
                }
                RunnableC3529eA runnableC3529eA = new RunnableC3529eA(jg, 11, t61);
                Objects.requireNonNull(t61);
                jg.b(runnableC3529eA, new DE(3, t61));
                return;
            default:
                ((C7737w81) this.c).b.y();
                return;
        }
    }

    public void p(long j, C4103hA0 c4103hA0) {
        if (c4103hA0.a() < 9) {
            return;
        }
        int iG = c4103hA0.g();
        int iG2 = c4103hA0.g();
        int iU = c4103hA0.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            AbstractC6653qS1.b(j, c4103hA0, (InterfaceC1584Ub1[]) this.c);
        }
    }

    public C8197yZ0 q(InterfaceC3903g70 interfaceC3903g70) {
        C6974s81 c6974s81;
        if (interfaceC3903g70 == null) {
            return null;
        }
        if (((OD0) this.c) == null) {
            c6974s81 = C6974s81.b;
        } else {
            OD0 od0 = (OD0) this.c;
            Pair pair = new Pair(od0.i, od0.j.get(0));
            C6974s81 c6974s812 = C6974s81.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            c6974s81 = new C6974s81(arrayMap);
        }
        this.c = null;
        return new C8197yZ0(interfaceC3903g70, new Size(interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight()), new C7858wn(new NT((InterfaceC7668vn) null, c6974s81, interfaceC3903g70.P().getTimestamp())));
    }

    public void r(YR yr, YM0 ym0) {
        int i = 0;
        while (true) {
            InterfaceC1584Ub1[] interfaceC1584Ub1Arr = (InterfaceC1584Ub1[]) this.c;
            if (i >= interfaceC1584Ub1Arr.length) {
                return;
            }
            ym0.a();
            ym0.b();
            InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(ym0.e, 3);
            C6666qX c6666qX = (C6666qX) ((List) this.b).get(i);
            String str = c6666qX.m;
            YN1.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C6475pX c6475pX = new C6475pX();
            ym0.b();
            c6475pX.a = (String) ym0.b;
            c6475pX.l = AbstractC1865Xr0.n(str);
            c6475pX.e = c6666qX.e;
            c6475pX.d = c6666qX.d;
            c6475pX.E = c6666qX.F;
            c6475pX.o = c6666qX.p;
            F91.B(c6475pX, interfaceC1584Ub1W);
            interfaceC1584Ub1Arr[i] = interfaceC1584Ub1W;
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public C8106y5 s(QE0 qe0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        O90.f(qe0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        InterfaceC7492us interfaceC7492usD = AbstractC3312d12.d((InterfaceC0153Bs0) this.b, CB1.a(interfaceC1637Ut0, qe0.c), (T71) this.c);
        Map mapN = NN.a;
        if (qe0.d.size() != 0 && !C5496kP.f(interfaceC7492usD)) {
            int i = AbstractC7002sI.a;
            if (AbstractC7002sI.n(interfaceC7492usD, EnumC0152Bs.e)) {
                Collection collectionG = interfaceC7492usD.g();
                O90.e(collectionG, "getConstructors(...)");
                C6729qs c6729qs = (C6729qs) AbstractC8069xu.S(collectionG);
                if (c6729qs != null) {
                    List listF0 = c6729qs.f0();
                    O90.e(listF0, "getValueParameters(...)");
                    List list = listF0;
                    int iB = AbstractC7287tn0.b(AbstractC8449zu.k(list));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj : list) {
                        linkedHashMap.put(((C1758Wh1) obj).getName(), obj);
                    }
                    List<OE0> list2 = qe0.d;
                    O90.e(list2, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (OE0 oe0 : list2) {
                        O90.c(oe0);
                        C1758Wh1 c1758Wh1 = (C1758Wh1) linkedHashMap.get(CB1.b(interfaceC1637Ut0, oe0.c));
                        if (c1758Wh1 != null) {
                            C1559Tt0 c1559Tt0B = CB1.b(interfaceC1637Ut0, oe0.c);
                            AbstractC0663Ig0 type = c1758Wh1.getType();
                            O90.e(type, "getType(...)");
                            NE0 ne0 = oe0.d;
                            O90.e(ne0, "getValue(...)");
                            AbstractC0323Dx abstractC0323DxF = F(type, ne0, interfaceC1637Ut0);
                            pair = t(abstractC0323DxF, type, ne0) ? abstractC0323DxF : null;
                            if (pair == null) {
                                String str = "Unexpected argument value: actual type " + ne0.c + " != expected type " + type;
                                O90.f(str, "message");
                                pair = new C5687lP(str);
                            }
                            pair = new kotlin.Pair(c1559Tt0B, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapN = AbstractC7096sn0.n(arrayList);
                }
            }
        }
        return new C8106y5(interfaceC7492usD.m(), mapN, W21.O0);
    }

    public boolean t(AbstractC0323Dx abstractC0323Dx, AbstractC0663Ig0 abstractC0663Ig0, NE0 ne0) {
        ME0 me0 = ne0.c;
        int i = me0 == null ? -1 : AbstractC8296z5.a[me0.ordinal()];
        if (i != 10) {
            InterfaceC0153Bs0 interfaceC0153Bs0 = (InterfaceC0153Bs0) this.b;
            if (i != 13) {
                return O90.a(abstractC0323Dx.a(interfaceC0153Bs0), abstractC0663Ig0);
            }
            if (abstractC0323Dx instanceof I8) {
                I8 i8 = (I8) abstractC0323Dx;
                if (((List) i8.a).size() == ne0.k.size()) {
                    AbstractC0663Ig0 abstractC0663Ig0F = interfaceC0153Bs0.h().f(abstractC0663Ig0);
                    Collection collection = (Collection) i8.a;
                    O90.f(collection, "<this>");
                    Iterable c3909g90 = new C3909g90(0, collection.size() - 1, 1);
                    if ((c3909g90 instanceof Collection) && ((Collection) c3909g90).isEmpty()) {
                        return true;
                    }
                    Iterator it = c3909g90.iterator();
                    while (((C3718f90) it).c) {
                        int iA = ((C3718f90) it).a();
                        AbstractC0323Dx abstractC0323Dx2 = (AbstractC0323Dx) ((List) i8.a).get(iA);
                        NE0 ne02 = (NE0) ne0.k.get(iA);
                        O90.e(ne02, "getArrayElement(...)");
                        if (!t(abstractC0323Dx2, abstractC0663Ig0F, ne02)) {
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC0323Dx).toString());
        }
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
        if (interfaceC7492us == null) {
            return true;
        }
        C1559Tt0 c1559Tt0 = AbstractC8408zg0.e;
        if (AbstractC8408zg0.b(interfaceC7492us, AbstractC6390p41.P)) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((C0575Hd) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public byte[] u(LP lp) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(lp.a);
            dataOutputStream.writeByte(0);
            String str = lp.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(lp.c);
            dataOutputStream.writeLong(lp.d);
            dataOutputStream.write(lp.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public synchronized void v(CA0 ca0) {
        try {
            CA0 ca02 = (CA0) this.c;
            if (ca02 != null) {
                ca02.c = ca0;
                this.c = ca0;
            } else {
                if (((CA0) this.b) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.c = ca0;
                this.b = ca0;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void x(String str, InterfaceC6099nZ interfaceC6099nZ) {
        LinkedHashMap linkedHashMap = ((C0542Gs) this.c).a;
        G01 g01 = new G01(str, this);
        interfaceC6099nZ.invoke(g01);
        ArrayList arrayList = g01.b;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((kotlin.Pair) it.next()).a);
        }
        String str2 = (String) g01.c.a;
        String str3 = g01.a;
        O90.f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('(');
        sb.append(AbstractC8069xu.H(arrayList2, "", null, null, XS0.q, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb.append(str2);
        String string = sb.toString();
        String str4 = (String) this.b;
        O90.f(str4, "internalName");
        O90.f(string, "jvmDescriptor");
        String str5 = str4 + '.' + string;
        C2174ae1 c2174ae1 = (C2174ae1) g01.c.b;
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C2174ae1) ((kotlin.Pair) it2.next()).b);
        }
        linkedHashMap.put(str5, new C8128yC0(c2174ae1, arrayList3));
    }

    public CctBackendFactory y(String str) {
        Map mapEmptyMap;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
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
            this.c = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.c).get(str);
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

    public HashMap z() {
        try {
            ((String) this.c).getClass();
            Cursor cursorQuery = ((C4086h41) this.b).getReadableDatabase().query((String) this.c, e, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C3640el(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e2) {
            throw new C6353ou(e2);
        }
    }

    public /* synthetic */ C3383dO1(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ C3383dO1(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ C3383dO1(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C3383dO1(C3675ew1 c3675ew1, C0396Ev0 c0396Ev0) {
        this.a = 14;
        this.b = c3675ew1;
        this.c = LB.b(new C3881g1(16, this));
    }

    public C3383dO1(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new HashMap();
                this.c = new ArrayList();
                break;
            case 11:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 16:
                this.c = new HashMap();
                break;
            case 29:
                this.b = new C4103hA0();
                this.c = new C4030gn1();
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    public C3383dO1(Context context, int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.c = null;
                this.b = context;
                break;
            default:
                this.b = context;
                C5495kO1 c5495kO1 = new C5495kO1(null);
                this.c = c5495kO1;
                context.getContentResolver().registerContentObserver(AbstractC8159yM1.a, true, c5495kO1);
                break;
        }
    }

    public C3383dO1(InterfaceC0153Bs0 interfaceC0153Bs0, T71 t71) {
        this.a = 3;
        O90.f(interfaceC0153Bs0, "module");
        O90.f(t71, "notFoundClasses");
        this.b = interfaceC0153Bs0;
        this.c = t71;
    }

    public C3383dO1(List list) {
        this.a = 28;
        this.b = list;
        this.c = new InterfaceC1584Ub1[list.size()];
    }

    public C3383dO1(C1543To c1543To) {
        this.a = 8;
        this.b = c1543To;
        C0390Et0 c0390Et0 = new C0390Et0();
        this.c = c0390Et0;
        c0390Et0.k(new C8395zc(5, null));
    }

    public C3383dO1(Context context, Object obj, LinkedHashSet linkedHashSet) {
        C8051xo c8051xoA;
        this.a = 7;
        C5396jt0 c5396jt0 = new C5396jt0(9);
        this.b = new HashMap();
        this.c = c5396jt0;
        if (obj instanceof C8051xo) {
            c8051xoA = (C8051xo) obj;
        } else {
            c8051xoA = C8051xo.a(context, AbstractC0759Jm0.d());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.b).put(str, new H61(context, str, c8051xoA, (C5396jt0) this.c));
        }
    }

    public C3383dO1(U41 u41, HashMap map, HashMap map2) {
        this.a = 2;
        this.b = u41;
        this.c = map;
    }

    public C3383dO1(List list, C0575Hd c0575Hd) {
        this.a = 21;
        AbstractC3377dM1.d("No preferred quality and fallback strategy.", (list.isEmpty() && c0575Hd == C0575Hd.c) ? false : true);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = c0575Hd;
    }

    public C3383dO1(C0542Gs c0542Gs, String str) {
        this.a = 24;
        O90.f(str, "className");
        this.c = c0542Gs;
        this.b = str;
    }

    public C3383dO1(AbstractC7709w00 abstractC7709w00) {
        this.a = 13;
        C3968gT c3968gT = abstractC7709w00.a;
        c3968gT.getClass();
        Iterator it = ((C6781r8) c3968gT.a.entrySet()).iterator();
        this.b = it;
        if (it.hasNext()) {
            this.c = (Map.Entry) it.next();
        }
    }
}
