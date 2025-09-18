package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Range;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.push.common.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

/* renamed from: rY0 */
/* loaded from: classes.dex */
public final class C6860rY0 implements InterfaceC5944ml, InterfaceC0195Cg0, X3, W3, InterfaceC6770r40, InterfaceC7110ss, InterfaceC4347iS {
    public static C6860rY0 f;
    public static final String[] g = {NotificationConstants.ID, "key", "metadata"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ C6860rY0(int i, boolean z) {
        this.a = i;
    }

    public static synchronized C6860rY0 x() {
        try {
            if (f == null) {
                f = new C6860rY0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public void A(SQLiteDatabase sQLiteDatabase) throws SQLException {
        String str = (String) this.b;
        str.getClass();
        AbstractC0202Ci1.b(sQLiteDatabase, 1, str);
        String str2 = (String) this.e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void B(AbstractC6950s11 abstractC6950s11) throws Throwable {
        Object objB = ((C0125Bj) this.d).b(abstractC6950s11);
        boolean z = objB instanceof C5962mr;
        if (z) {
            C5962mr c5962mr = z ? (C5962mr) objB : null;
            Throwable th = c5962mr != null ? c5962mr.a : null;
            if (th != null) {
                throw th;
            }
            throw new C0311Dt("Channel was closed normally");
        }
        if (objB instanceof C6153nr) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            AbstractC3767fP1.b((InterfaceC0952Lz) this.b, null, new K01(this, null), 3);
        }
    }

    public boolean C(AbstractC6952s2 abstractC6952s2, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(w(abstractC6952s2), new MenuItemC1160Oq0((Context) this.c, (InterfaceMenuItemC8301z61) menuItem));
    }

    public boolean D(AbstractC6952s2 abstractC6952s2, MenuC0225Cq0 menuC0225Cq0) {
        C7541v61 c7541v61W = w(abstractC6952s2);
        L01 l01 = (L01) this.e;
        Menu menuC2403br0 = (Menu) l01.getOrDefault(menuC0225Cq0, null);
        if (menuC2403br0 == null) {
            menuC2403br0 = new MenuC2403br0((Context) this.c, menuC0225Cq0);
            l01.put(menuC0225Cq0, menuC2403br0);
        }
        return ((ActionMode.Callback) this.b).onCreateActionMode(c7541v61W, menuC2403br0);
    }

    public void E() {
        byte[] bArr = AbstractC0199Ch1.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.e).iterator();
                O90.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    AN0 an0 = (AN0) it.next();
                    if (((ArrayDeque) this.c).size() >= 64) {
                        break;
                    }
                    if (an0.b.get() < 5) {
                        it.remove();
                        an0.b.incrementAndGet();
                        arrayList.add(an0);
                        ((ArrayDeque) this.c).add(an0);
                    }
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AN0 an02 = (AN0) arrayList.get(i);
            ExecutorService executorServiceT = t();
            an02.getClass();
            DN0 dn0 = an02.c;
            C6860rY0 c6860rY0 = dn0.a.a;
            byte[] bArr2 = AbstractC0199Ch1.a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceT).execute(an02);
                } catch (Throwable th2) {
                    dn0.a.a.v(an02);
                    throw th2;
                }
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                dn0.l(interruptedIOException);
                an02.a.w0(dn0, interruptedIOException);
                dn0.a.a.v(an02);
            }
        }
    }

    public synchronized List F() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.d;
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayDeque2));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AN0) it.next()).c);
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC8069xu.N(arrayDeque, arrayList));
            O90.e(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public synchronized int G() {
        return ((ArrayDeque) this.c).size() + ((ArrayDeque) this.d).size();
    }

    public C5534kb1 H(int i, C0074As c0074As, UO0 uo0) {
        C5960mq0 c5960mq0 = new C5960mq0(((C5960mq0) this.b).a + '@' + i);
        C3383dO1 c3383dO1 = (C3383dO1) this.e;
        List arrayList = (List) ((HashMap) c3383dO1.c).get(c5960mq0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) c3383dO1.c).put(c5960mq0, arrayList);
        }
        return ((U41) c3383dO1.b).A(c0074As, uo0, arrayList);
    }

    public C6860rY0 I() {
        return new C6860rY0(this, (C2192ak1) this.c);
    }

    public InterfaceC0877Kz1 J(String str) {
        C6860rY0 c6860rY0 = this;
        while (!((HashMap) c6860rY0.d).containsKey(str)) {
            c6860rY0 = (C6860rY0) c6860rY0.b;
            if (c6860rY0 == null) {
                throw new IllegalArgumentException(AbstractC8235ym.i(str, " is not defined"));
            }
        }
        return (InterfaceC0877Kz1) ((HashMap) c6860rY0.d).get(str);
    }

    public InterfaceC0877Kz1 K(C7321ty1 c7321ty1) {
        InterfaceC0877Kz1 interfaceC0877Kz1D = InterfaceC0877Kz1.i1;
        Iterator itY = c7321ty1.y();
        while (itY.hasNext()) {
            interfaceC0877Kz1D = ((C2192ak1) this.c).d(this, c7321ty1.i(((Integer) itY.next()).intValue()));
            if (interfaceC0877Kz1D instanceof C1497Sy1) {
                break;
            }
        }
        return interfaceC0877Kz1D;
    }

    public InterfaceC0877Kz1 L(InterfaceC0877Kz1 interfaceC0877Kz1) {
        return ((C2192ak1) this.c).d(this, interfaceC0877Kz1);
    }

    public void M(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        if (((HashMap) this.e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.d;
        if (interfaceC0877Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0877Kz1);
        }
    }

    public boolean N(String str) {
        C6860rY0 c6860rY0 = this;
        while (!((HashMap) c6860rY0.d).containsKey(str)) {
            c6860rY0 = (C6860rY0) c6860rY0.b;
            if (c6860rY0 == null) {
                return false;
            }
        }
        return true;
    }

    public void O(String str, InterfaceC0877Kz1 interfaceC0877Kz1) {
        C6860rY0 c6860rY0;
        C6860rY0 c6860rY02 = this;
        while (!((HashMap) c6860rY02.d).containsKey(str) && (c6860rY0 = (C6860rY0) c6860rY02.b) != null && c6860rY0.N(str)) {
            c6860rY02 = c6860rY0;
        }
        if (((HashMap) c6860rY02.e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) c6860rY02.d;
        if (interfaceC0877Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0877Kz1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r6, defpackage.AbstractC1963Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C6358ov1
            if (r0 == 0) goto L13
            r0 = r7
            ov1 r0 = (defpackage.C6358ov1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ov1 r0 = new ov1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.RQ1.d(r7)
            PS0 r7 = (defpackage.PS0) r7
            java.lang.Object r6 = r7.a
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.RQ1.d(r7)
            Tu1 r7 = new Tu1
            r2 = 0
            r4 = 1
            r7.<init>(r5, r6, r2, r4)
            r0.c = r3
            java.lang.Object r6 = r5.c
            Es1 r6 = (defpackage.C0388Es1) r6
            java.lang.Object r6 = r6.m85invokegIAlus(r7, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6860rY0.a(java.lang.String, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5944ml
    public void b(HashMap map) throws C6353ou {
        try {
            SQLiteDatabase writableDatabase = ((C4086h41) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m(writableDatabase, (C5753ll) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.d).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new C6353ou(e);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void c(C5753ll c5753ll, boolean z) {
        SparseArray sparseArray = (SparseArray) this.d;
        int i = c5753ll.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void d(C5753ll c5753ll) {
        ((SparseArray) this.d).put(c5753ll.a, c5753ll);
    }

    @Override // defpackage.InterfaceC5944ml
    public void delete() throws C6353ou {
        C4086h41 c4086h41 = (C4086h41) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c4086h41.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = AbstractC0202Ci1.a;
                try {
                    int i2 = AbstractC0277Dh1.a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new C6353ou(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new C6353ou(e2);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public boolean e() throws C6353ou {
        try {
            SQLiteDatabase readableDatabase = ((C4086h41) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return AbstractC0202Ci1.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C6353ou(e);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void f(HashMap map) throws C6353ou {
        SparseArray sparseArray = (SparseArray) this.d;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((C4086h41) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C5753ll c5753ll = (C5753ll) sparseArray.valueAt(i);
                    if (c5753ll == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m(writableDatabase, c5753ll);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C6353ou(e);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void g(long j) {
        String hexString = Long.toHexString(j);
        this.b = hexString;
        this.e = AbstractC8235ym.v("ExoPlayerCacheIndex", hexString);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C0610Ho1((Executor) ((Provider) this.b).get(), (PP) ((Provider) this.c).get(), (C1349Rb0) ((C1857Xo1) this.d).get(), (A71) ((Provider) this.e).get());
    }

    @Override // defpackage.InterfaceC5944ml
    public void h(HashMap map, SparseArray sparseArray) throws C6353ou {
        C4086h41 c4086h41 = (C4086h41) this.c;
        YN1.f(((SparseArray) this.d).size() == 0);
        try {
            SQLiteDatabase readableDatabase = c4086h41.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (AbstractC0202Ci1.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c4086h41.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c4086h41.getReadableDatabase();
            String str2 = (String) this.e;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, g, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C5753ll(i, string, C1241Pr0.g(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C6353ou(e);
        }
    }

    @Override // defpackage.X3
    public void i(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.InterfaceC7110ss
    public C6919rs j(C0074As c0074As) {
        O90.f(c0074As, "classId");
        TE0 te0 = (TE0) ((LinkedHashMap) this.e).get(c0074As);
        if (te0 == null) {
            return null;
        }
        ((C8277z) this.d).invoke(c0074As);
        return new C6919rs((C0999Mo1) this.b, te0, (C1450Sj) this.c, W21.O0);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
        switch (this.a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C3383dO1) this.d).c).put((C5960mq0) this.b, arrayList);
                    break;
                }
                break;
            default:
                ((C5534kb1) this.c).k();
                ((ArrayList) ((T71) this.d).a).add(new G5((InterfaceC7916x5) AbstractC8069xu.R((ArrayList) this.e)));
                break;
        }
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
        ((C5534kb1) this.b).l(c1559Tt0, obj);
    }

    public void m(SQLiteDatabase sQLiteDatabase, C5753ll c5753ll) throws SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1241Pr0.i(c5753ll.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.ID, Integer.valueOf(c5753ll.a));
        contentValues.put("key", c5753ll.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
        ((C5534kb1) this.b).n(c1559Tt0, c0230Cs);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        return ((C5534kb1) this.b).o(c1559Tt0);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
        ((C5534kb1) this.b).p(c1559Tt0, c0074As, c1559Tt02);
    }

    public C1903Ye q() {
        String strI = ((C3383dO1) this.b) == null ? " qualitySelector" : "";
        if (((Range) this.c) == null) {
            strI = strI.concat(" frameRate");
        }
        if (((Range) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " bitrate");
        }
        if (((Integer) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " aspectRatio");
        }
        if (strI.isEmpty()) {
            return new C1903Ye((C3383dO1) this.b, (Range) this.c, (Range) this.d, ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        return ((C5534kb1) this.b).r(c0074As, c1559Tt0);
    }

    public synchronized void s() {
        try {
            Iterator it = ((ArrayDeque) this.e).iterator();
            while (it.hasNext()) {
                ((AN0) it.next()).c.e();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((AN0) it2.next()).c.e();
            }
            Iterator it3 = ((ArrayDeque) this.d).iterator();
            while (it3.hasNext()) {
                ((DN0) it3.next()).e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.WC
    public ZC s0() {
        C6554px0 c6554px0 = new C6554px0((C6363ox0) this.d, (String) this.b, (N8) this.c);
        PE pe = (PE) this.e;
        if (pe != null) {
            c6554px0.d(pe);
        }
        return c6554px0;
    }

    public synchronized ExecutorService t() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.b) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = AbstractC0199Ch1.g + " Dispatcher";
                O90.f(str, "name");
                this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC7842wh1(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.b;
            O90.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void u(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        E();
    }

    public void v(AN0 an0) {
        O90.f(an0, "call");
        an0.b.decrementAndGet();
        u((ArrayDeque) this.c, an0);
    }

    public C7541v61 w(AbstractC6952s2 abstractC6952s2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7541v61 c7541v61 = (C7541v61) arrayList.get(i);
            if (c7541v61 != null && c7541v61.b == abstractC6952s2) {
                return c7541v61;
            }
        }
        C7541v61 c7541v612 = new C7541v61((Context) this.c, abstractC6952s2);
        arrayList.add(c7541v612);
        return c7541v612;
    }

    @Override // defpackage.W3
    public void w0(Bundle bundle) {
        synchronized (this.d) {
            Objects.toString(bundle);
            this.e = new CountDownLatch(1);
            ((C1562Tu0) this.b).w0(bundle);
            try {
                ((CountDownLatch) this.e).await(500, (TimeUnit) this.c);
            } catch (InterruptedException unused) {
            }
            this.e = null;
        }
    }

    public boolean y(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.d).booleanValue();
    }

    public boolean z(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public /* synthetic */ C6860rY0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public C6860rY0(C5996n11 c5996n11, C0388Es1 c0388Es1, C3669eu1 c3669eu1, Logger logger) {
        this.a = 18;
        O90.f(c3669eu1, "ipcClientsRepository");
        O90.f(logger, "logger");
        this.b = c5996n11;
        this.c = c0388Es1;
        this.d = c3669eu1;
        this.e = logger.createLogger("RegisterPushTokenUseCase");
    }

    public C6860rY0(C6860rY0 c6860rY0, C2192ak1 c2192ak1) {
        this.a = 19;
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = c6860rY0;
        this.c = c2192ak1;
    }

    public C6860rY0(C6231oF0 c6231oF0, C0999Mo1 c0999Mo1, C1450Sj c1450Sj, C8277z c8277z) {
        this.a = 12;
        this.b = c0999Mo1;
        this.c = c1450Sj;
        this.d = c8277z;
        List list = c6231oF0.g;
        O90.e(list, "getClass_List(...)");
        List list2 = list;
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj : list2) {
            linkedHashMap.put(CB1.a((C0999Mo1) this.b, ((TE0) obj).e), obj);
        }
        this.e = linkedHashMap;
    }

    public C6860rY0(InterfaceC0952Lz interfaceC0952Lz, C5661lG0 c5661lG0, C7141t11 c7141t11) {
        this.a = 14;
        this.b = interfaceC0952Lz;
        this.c = c7141t11;
        this.d = DS1.a(Integer.MAX_VALUE, 6, null);
        this.e = new AtomicInteger(0);
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0952Lz.b().g(C0396Ev0.e);
        if (interfaceC1115Ob0 == null) {
            return;
        }
        ((C2548cc0) interfaceC1115Ob0).D(true, new NK(1, new C3690f1(c5661lG0, 13, this)));
    }

    public C6860rY0(C1562Tu0 c1562Tu0, TimeUnit timeUnit) {
        this.a = 5;
        this.d = new Object();
        this.b = c1562Tu0;
        this.c = timeUnit;
    }

    public C6860rY0(C6363ox0 c6363ox0) {
        this.a = 10;
        this.d = c6363ox0;
        this.c = new N8(13);
    }

    public C6860rY0(C3383dO1 c3383dO1, C5960mq0 c5960mq0) {
        this.a = 2;
        this.e = c3383dO1;
        this.a = 2;
        this.d = c3383dO1;
        this.b = c5960mq0;
        this.c = new ArrayList();
    }

    public C6860rY0(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.e = new ArrayDeque();
                this.c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public C6860rY0(Context context, ActionMode.Callback callback) {
        this.a = 15;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new L01();
    }

    public C6860rY0(C5534kb1 c5534kb1, T71 t71, ArrayList arrayList) {
        this.a = 4;
        this.c = c5534kb1;
        this.d = t71;
        this.e = arrayList;
        this.b = c5534kb1;
    }

    public C6860rY0(HI hi) {
        this.a = 7;
        this.e = hi;
        List list = hi.e.t;
        O90.e(list, "getEnumEntryList(...)");
        List list2 = list;
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj : list2) {
            linkedHashMap.put(CB1.b((InterfaceC1637Ut0) hi.l.d, ((C3355dF0) obj).d), obj);
        }
        this.b = linkedHashMap;
        HI hi2 = (HI) this.e;
        this.c = ((C1922Yk0) ((C7955xI) hi2.l.c).a).c(new C3690f1(this, 7, hi2));
        Z41 z41 = ((C7955xI) ((HI) this.e).l.c).a;
        C3881g1 c3881g1 = new C3881g1(12, this);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        this.d = new C1688Vk0(c1922Yk0, c3881g1);
    }

    public C6860rY0(C4086h41 c4086h41) {
        this.a = 1;
        this.c = c4086h41;
        this.d = new SparseArray();
    }
}
