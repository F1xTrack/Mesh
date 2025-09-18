package p000;

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
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.p019vk.push.common.Logger;
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
public final class C10919rY0 implements InterfaceC6446ml, InterfaceC7430Cg0, InterfaceC1451X3, InterfaceC1388W3, InterfaceC10859r40, InterfaceC6850ss, InterfaceC4243iS {

    /* renamed from: f */
    public static C10919rY0 f41725f;

    /* renamed from: g */
    public static final String[] f41726g = {NotificationConstants.f19487ID, "key", "metadata"};

    /* renamed from: a */
    public final /* synthetic */ int f41727a;

    /* renamed from: b */
    public Object f41728b;

    /* renamed from: c */
    public Object f41729c;

    /* renamed from: d */
    public Object f41730d;

    /* renamed from: e */
    public Object f41731e;

    public /* synthetic */ C10919rY0(int i, boolean z) {
        this.f41727a = i;
    }

    /* renamed from: x */
    public static synchronized C10919rY0 m24401x() {
        try {
            if (f41725f == null) {
                f41725f = new C10919rY0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41725f;
    }

    /* renamed from: A */
    public void m24402A(SQLiteDatabase sQLiteDatabase) throws SQLException {
        String str = (String) this.f41728b;
        str.getClass();
        AbstractC7435Ci1.m1300b(sQLiteDatabase, 1, str);
        String str2 = (String) this.f41731e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.f41731e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* renamed from: B */
    public void m24403B(AbstractC10979s11 abstractC10979s11) throws Throwable {
        Object objMo821b = ((C0109Bj) this.f41730d).mo821b(abstractC10979s11);
        boolean z = objMo821b instanceof C6452mr;
        if (z) {
            C6452mr c6452mr = z ? (C6452mr) objMo821b : null;
            Throwable th = c6452mr != null ? c6452mr.f37965a : null;
            if (th != null) {
                throw th;
            }
            throw new C0245Dt("Channel was closed normally");
        }
        if (objMo821b instanceof C6515nr) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f41731e).getAndIncrement() == 0) {
            AbstractC9366fP1.m18230b((InterfaceC0754Lz) this.f41728b, null, new K01(this, null), 3);
        }
    }

    /* renamed from: C */
    public boolean m24404C(AbstractC6798s2 abstractC6798s2, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f41728b).onActionItemClicked(m24424w(abstractC6798s2), new MenuItemC8074Oq0((Context) this.f41729c, (InterfaceMenuItemC11884z61) menuItem));
    }

    /* renamed from: D */
    public boolean m24405D(AbstractC6798s2 abstractC6798s2, MenuC7450Cq0 menuC7450Cq0) {
        C11376v61 c11376v61M24424w = m24424w(abstractC6798s2);
        L01 l01 = (L01) this.f41731e;
        Menu menuC8904br0 = (Menu) l01.getOrDefault(menuC7450Cq0, null);
        if (menuC8904br0 == null) {
            menuC8904br0 = new MenuC8904br0((Context) this.f41729c, menuC7450Cq0);
            l01.put(menuC7450Cq0, menuC8904br0);
        }
        return ((ActionMode.Callback) this.f41728b).onCreateActionMode(c11376v61M24424w, menuC8904br0);
    }

    /* renamed from: E */
    public void m24406E() {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f41731e).iterator();
                O90.m5967e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    AN0 an0 = (AN0) it.next();
                    if (((ArrayDeque) this.f41729c).size() >= 64) {
                        break;
                    }
                    if (an0.f178b.get() < 5) {
                        it.remove();
                        an0.f178b.incrementAndGet();
                        arrayList.add(an0);
                        ((ArrayDeque) this.f41729c).add(an0);
                    }
                }
                m24408G();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AN0 an02 = (AN0) arrayList.get(i);
            ExecutorService executorServiceM24421t = m24421t();
            an02.getClass();
            DN0 dn0 = an02.f179c;
            C10919rY0 c10919rY0 = dn0.f1980a.f39371a;
            byte[] bArr2 = AbstractC7433Ch1.f1577a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceM24421t).execute(an02);
                } catch (Throwable th2) {
                    dn0.f1980a.f39371a.m24423v(an02);
                    throw th2;
                }
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                dn0.m1674l(interruptedIOException);
                an02.f177a.mo852w0(dn0, interruptedIOException);
                dn0.f1980a.f39371a.m24423v(an02);
            }
        }
    }

    /* renamed from: F */
    public synchronized List m24407F() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f41730d;
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f41729c;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayDeque2));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AN0) it.next()).f179c);
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC7167xu.m25968N(arrayDeque, arrayList));
            O90.m5967e(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    /* renamed from: G */
    public synchronized int m24408G() {
        return ((ArrayDeque) this.f41729c).size() + ((ArrayDeque) this.f41730d).size();
    }

    /* renamed from: H */
    public C10030kb1 m24409H(int i, C0055As c0055As, UO0 uo0) {
        C10315mq0 c10315mq0 = new C10315mq0(((C10315mq0) this.f41728b).f37960a + '@' + i);
        C9108dO1 c9108dO1 = (C9108dO1) this.f41731e;
        List arrayList = (List) ((HashMap) c9108dO1.f26013c).get(c10315mq0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) c9108dO1.f26013c).put(c10315mq0, arrayList);
        }
        return ((U41) c9108dO1.f26012b).m7876A(c0055As, uo0, arrayList);
    }

    /* renamed from: I */
    public C10919rY0 m24410I() {
        return new C10919rY0(this, (C8763ak1) this.f41729c);
    }

    /* renamed from: J */
    public InterfaceC7885Kz1 m24411J(String str) {
        C10919rY0 c10919rY0 = this;
        while (!((HashMap) c10919rY0.f41730d).containsKey(str)) {
            c10919rY0 = (C10919rY0) c10919rY0.f41728b;
            if (c10919rY0 == null) {
                throw new IllegalArgumentException(AbstractC7222ym.m26232i(str, " is not defined"));
            }
        }
        return (InterfaceC7885Kz1) ((HashMap) c10919rY0.f41730d).get(str);
    }

    /* renamed from: K */
    public InterfaceC7885Kz1 m24412K(C11228ty1 c11228ty1) {
        InterfaceC7885Kz1 interfaceC7885Kz1M9804d = InterfaceC7885Kz1.f6417i1;
        Iterator itM25044y = c11228ty1.m25044y();
        while (itM25044y.hasNext()) {
            interfaceC7885Kz1M9804d = ((C8763ak1) this.f41729c).m9804d(this, c11228ty1.m25037i(((Integer) itM25044y.next()).intValue()));
            if (interfaceC7885Kz1M9804d instanceof C8299Sy1) {
                break;
            }
        }
        return interfaceC7885Kz1M9804d;
    }

    /* renamed from: L */
    public InterfaceC7885Kz1 m24413L(InterfaceC7885Kz1 interfaceC7885Kz1) {
        return ((C8763ak1) this.f41729c).m9804d(this, interfaceC7885Kz1);
    }

    /* renamed from: M */
    public void m24414M(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        if (((HashMap) this.f41731e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.f41730d;
        if (interfaceC7885Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC7885Kz1);
        }
    }

    /* renamed from: N */
    public boolean m24415N(String str) {
        C10919rY0 c10919rY0 = this;
        while (!((HashMap) c10919rY0.f41730d).containsKey(str)) {
            c10919rY0 = (C10919rY0) c10919rY0.f41728b;
            if (c10919rY0 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    public void m24416O(String str, InterfaceC7885Kz1 interfaceC7885Kz1) {
        C10919rY0 c10919rY0;
        C10919rY0 c10919rY02 = this;
        while (!((HashMap) c10919rY02.f41730d).containsKey(str) && (c10919rY0 = (C10919rY0) c10919rY02.f41728b) != null && c10919rY0.m24415N(str)) {
            c10919rY02 = c10919rY0;
        }
        if (((HashMap) c10919rY02.f41731e).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) c10919rY02.f41730d;
        if (interfaceC7885Kz1 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC7885Kz1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m24417a(java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C10582ov1
            if (r0 == 0) goto L13
            r0 = r7
            ov1 r0 = (p000.C10582ov1) r0
            int r1 = r0.f39362c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39362c = r1
            goto L18
        L13:
            ov1 r0 = new ov1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f39360a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f39362c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r7)
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p000.RQ1.m7017d(r7)
            Tu1 r7 = new Tu1
            r2 = 0
            r4 = 1
            r7.<init>(r5, r6, r2, r4)
            r0.f39362c = r3
            java.lang.Object r6 = r5.f41729c
            Es1 r6 = (p000.C7559Es1) r6
            java.lang.Object r6 = r6.m26679invokegIAlus(r7, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10919rY0.m24417a(java.lang.String, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: b */
    public void mo18854b(HashMap map) throws C6583ou {
        try {
            SQLiteDatabase writableDatabase = ((C9580h41) this.f41729c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m24402A(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m24418m(writableDatabase, (C6383ll) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.f41730d).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: c */
    public void mo18855c(C6383ll c6383ll, boolean z) {
        SparseArray sparseArray = (SparseArray) this.f41730d;
        int i = c6383ll.f37278a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: d */
    public void mo18856d(C6383ll c6383ll) {
        ((SparseArray) this.f41730d).put(c6383ll.f37278a, c6383ll);
    }

    @Override // p000.InterfaceC6446ml
    public void delete() throws C6583ou {
        C9580h41 c9580h41 = (C9580h41) this.f41729c;
        String str = (String) this.f41728b;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c9580h41.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = AbstractC7435Ci1.f1592a;
                try {
                    int i2 = AbstractC7485Dh1.f2166a;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new C6583ou(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new C6583ou(e2);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: e */
    public boolean mo18857e() throws C6583ou {
        try {
            SQLiteDatabase readableDatabase = ((C9580h41) this.f41729c).getReadableDatabase();
            String str = (String) this.f41728b;
            str.getClass();
            return AbstractC7435Ci1.m1299a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C6583ou(e);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: f */
    public void mo18858f(HashMap map) throws C6583ou {
        SparseArray sparseArray = (SparseArray) this.f41730d;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((C9580h41) this.f41729c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C6383ll c6383ll = (C6383ll) sparseArray.valueAt(i);
                    if (c6383ll == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.f41731e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m24418m(writableDatabase, c6383ll);
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
            throw new C6583ou(e);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: g */
    public void mo18859g(long j) {
        String hexString = Long.toHexString(j);
        this.f41728b = hexString;
        this.f41731e = AbstractC7222ym.m26245v("ExoPlayerCacheIndex", hexString);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C7707Ho1((Executor) ((Provider) this.f41728b).get(), (InterfaceC0970PP) ((Provider) this.f41729c).get(), (C8200Rb0) ((C8539Xo1) this.f41730d).get(), (A71) ((Provider) this.f41731e).get());
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: h */
    public void mo18860h(HashMap map, SparseArray sparseArray) throws C6583ou {
        C9580h41 c9580h41 = (C9580h41) this.f41729c;
        YN1.m9281f(((SparseArray) this.f41730d).size() == 0);
        try {
            SQLiteDatabase readableDatabase = c9580h41.getReadableDatabase();
            String str = (String) this.f41728b;
            str.getClass();
            if (AbstractC7435Ci1.m1299a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c9580h41.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m24402A(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c9580h41.getReadableDatabase();
            String str2 = (String) this.f41731e;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f41726g, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C6383ll(i, string, C8128Pr0.m6438g(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C6583ou(e);
        }
    }

    @Override // p000.InterfaceC1451X3
    /* renamed from: i */
    public void mo2900i(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f41731e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p000.InterfaceC6850ss
    /* renamed from: j */
    public C6770rs mo2901j(C0055As c0055As) {
        O90.m5968f(c0055As, "classId");
        TE0 te0 = (TE0) ((LinkedHashMap) this.f41731e).get(c0055As);
        if (te0 == null) {
            return null;
        }
        ((C7236z) this.f41730d).invoke(c0055As);
        return new C6770rs((C7967Mo1) this.f41728b, te0, (C1178Sj) this.f41729c, W21.f12940O0);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
        switch (this.f41727a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f41729c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((C9108dO1) this.f41730d).f26013c).put((C10315mq0) this.f41728b, arrayList);
                    break;
                }
                break;
            default:
                ((C10030kb1) this.f41729c).mo1263k();
                ((ArrayList) ((T71) this.f41730d).f11173a).add(new C0384G5((InterfaceC7116x5) AbstractC7167xu.m25972R((ArrayList) this.f41731e)));
                break;
        }
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
        ((C10030kb1) this.f41728b).mo1264l(c8340Tt0, obj);
    }

    /* renamed from: m */
    public void m24418m(SQLiteDatabase sQLiteDatabase, C6383ll c6383ll) throws SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C8128Pr0.m6439i(c6383ll.f37282e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.f19487ID, Integer.valueOf(c6383ll.f37278a));
        contentValues.put("key", c6383ll.f37279b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.f41731e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
        ((C10030kb1) this.f41728b).mo1265n(c8340Tt0, c0181Cs);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        return ((C10030kb1) this.f41728b).mo1266o(c8340Tt0);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
        ((C10030kb1) this.f41728b).mo1267p(c8340Tt0, c0055As, c8340Tt02);
    }

    /* renamed from: q */
    public C1551Ye m24419q() {
        String strM26232i = ((C9108dO1) this.f41728b) == null ? " qualitySelector" : "";
        if (((Range) this.f41729c) == null) {
            strM26232i = strM26232i.concat(" frameRate");
        }
        if (((Range) this.f41730d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " bitrate");
        }
        if (((Integer) this.f41731e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " aspectRatio");
        }
        if (strM26232i.isEmpty()) {
            return new C1551Ye((C9108dO1) this.f41728b, (Range) this.f41729c, (Range) this.f41730d, ((Integer) this.f41731e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        return ((C10030kb1) this.f41728b).mo1268r(c0055As, c8340Tt0);
    }

    /* renamed from: s */
    public synchronized void m24420s() {
        try {
            Iterator it = ((ArrayDeque) this.f41731e).iterator();
            while (it.hasNext()) {
                ((AN0) it.next()).f179c.m1668e();
            }
            Iterator it2 = ((ArrayDeque) this.f41729c).iterator();
            while (it2.hasNext()) {
                ((AN0) it2.next()).f179c.m1668e();
            }
            Iterator it3 = ((ArrayDeque) this.f41730d).iterator();
            while (it3.hasNext()) {
                ((DN0) it3.next()).m1668e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC1397WC
    /* renamed from: s0 */
    public InterfaceC1586ZC mo506s0() {
        C10713px0 c10713px0 = new C10713px0((C10585ox0) this.f41730d, (String) this.f41728b, (C0827N8) this.f41729c);
        C0959PE c0959pe = (C0959PE) this.f41731e;
        if (c0959pe != null) {
            c10713px0.mo5255d(c0959pe);
        }
        return c10713px0;
    }

    /* renamed from: t */
    public synchronized ExecutorService m24421t() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f41728b) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = AbstractC7433Ch1.f1583g + " Dispatcher";
                O90.m5968f(str, "name");
                this.f41728b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC11577wh1(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f41728b;
            O90.m5965c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* renamed from: u */
    public void m24422u(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m24406E();
    }

    /* renamed from: v */
    public void m24423v(AN0 an0) {
        O90.m5968f(an0, "call");
        an0.f178b.decrementAndGet();
        m24422u((ArrayDeque) this.f41729c, an0);
    }

    /* renamed from: w */
    public C11376v61 m24424w(AbstractC6798s2 abstractC6798s2) {
        ArrayList arrayList = (ArrayList) this.f41730d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11376v61 c11376v61 = (C11376v61) arrayList.get(i);
            if (c11376v61 != null && c11376v61.f44161b == abstractC6798s2) {
                return c11376v61;
            }
        }
        C11376v61 c11376v612 = new C11376v61((Context) this.f41729c, abstractC6798s2);
        arrayList.add(c11376v612);
        return c11376v612;
    }

    @Override // p000.InterfaceC1388W3
    /* renamed from: w0 */
    public void mo1476w0(Bundle bundle) {
        synchronized (this.f41730d) {
            Objects.toString(bundle);
            this.f41731e = new CountDownLatch(1);
            ((C8342Tu0) this.f41728b).mo1476w0(bundle);
            try {
                ((CountDownLatch) this.f41731e).await(500, (TimeUnit) this.f41729c);
            } catch (InterruptedException unused) {
            }
            this.f41731e = null;
        }
    }

    /* renamed from: y */
    public boolean m24425y(Context context) {
        if (((Boolean) this.f41730d) == null) {
            this.f41730d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.f41729c).booleanValue();
        return ((Boolean) this.f41730d).booleanValue();
    }

    /* renamed from: z */
    public boolean m24426z(Context context) {
        if (((Boolean) this.f41729c) == null) {
            this.f41729c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.f41729c).booleanValue();
        return ((Boolean) this.f41729c).booleanValue();
    }

    public /* synthetic */ C10919rY0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f41727a = i;
        this.f41728b = obj;
        this.f41729c = obj2;
        this.f41730d = obj3;
        this.f41731e = obj4;
    }

    public C10919rY0(C10339n11 c10339n11, C7559Es1 c7559Es1, C9300eu1 c9300eu1, Logger logger) {
        this.f41727a = 18;
        O90.m5968f(c9300eu1, "ipcClientsRepository");
        O90.m5968f(logger, "logger");
        this.f41728b = c10339n11;
        this.f41729c = c7559Es1;
        this.f41730d = c9300eu1;
        this.f41731e = logger.createLogger("RegisterPushTokenUseCase");
    }

    public C10919rY0(C10919rY0 c10919rY0, C8763ak1 c8763ak1) {
        this.f41727a = 19;
        this.f41730d = new HashMap();
        this.f41731e = new HashMap();
        this.f41728b = c10919rY0;
        this.f41729c = c8763ak1;
    }

    public C10919rY0(C10497oF0 c10497oF0, C7967Mo1 c7967Mo1, C1178Sj c1178Sj, C7236z c7236z) {
        this.f41727a = 12;
        this.f41728b = c7967Mo1;
        this.f41729c = c1178Sj;
        this.f41730d = c7236z;
        List list = c10497oF0.f38911g;
        O90.m5967e(list, "getClass_List(...)");
        List list2 = list;
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b < 16 ? 16 : iM24983b);
        for (Object obj : list2) {
            linkedHashMap.put(CB1.m1001a((C7967Mo1) this.f41728b, ((TE0) obj).f11232e), obj);
        }
        this.f41731e = linkedHashMap;
    }

    public C10919rY0(InterfaceC0754Lz interfaceC0754Lz, C10115lG0 c10115lG0, C11107t11 c11107t11) {
        this.f41727a = 14;
        this.f41728b = interfaceC0754Lz;
        this.f41729c = c11107t11;
        this.f41730d = DS1.m1689a(Integer.MAX_VALUE, 6, null);
        this.f41731e = new AtomicInteger(0);
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0754Lz.mo2469b().mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 == null) {
            return;
        }
        ((C9002cc0) interfaceC8044Ob0).m10798D(true, new C0839NK(1, new C4027f1(c10115lG0, 13, this)));
    }

    public C10919rY0(C8342Tu0 c8342Tu0, TimeUnit timeUnit) {
        this.f41727a = 5;
        this.f41730d = new Object();
        this.f41728b = c8342Tu0;
        this.f41729c = timeUnit;
    }

    public C10919rY0(C10585ox0 c10585ox0) {
        this.f41727a = 10;
        this.f41730d = c10585ox0;
        this.f41729c = new C0827N8(13);
    }

    public C10919rY0(C9108dO1 c9108dO1, C10315mq0 c10315mq0) {
        this.f41727a = 2;
        this.f41731e = c9108dO1;
        this.f41727a = 2;
        this.f41730d = c9108dO1;
        this.f41728b = c10315mq0;
        this.f41729c = new ArrayList();
    }

    public C10919rY0(int i) {
        this.f41727a = i;
        switch (i) {
            case 8:
                this.f41731e = new ArrayDeque();
                this.f41729c = new ArrayDeque();
                this.f41730d = new ArrayDeque();
                break;
            default:
                this.f41728b = null;
                this.f41729c = null;
                this.f41730d = null;
                this.f41731e = new ArrayDeque();
                break;
        }
    }

    public C10919rY0(Context context, ActionMode.Callback callback) {
        this.f41727a = 15;
        this.f41729c = context;
        this.f41728b = callback;
        this.f41730d = new ArrayList();
        this.f41731e = new L01();
    }

    public C10919rY0(C10030kb1 c10030kb1, T71 t71, ArrayList arrayList) {
        this.f41727a = 4;
        this.f41729c = c10030kb1;
        this.f41730d = t71;
        this.f41731e = arrayList;
        this.f41728b = c10030kb1;
    }

    public C10919rY0(C0460HI c0460hi) {
        this.f41727a = 7;
        this.f41731e = c0460hi;
        List list = c0460hi.f4204e.f11247t;
        O90.m5967e(list, "getEnumEntryList(...)");
        List list2 = list;
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b < 16 ? 16 : iM24983b);
        for (Object obj : list2) {
            linkedHashMap.put(CB1.m1002b((InterfaceC8392Ut0) c0460hi.f4211l.f12663d, ((C9089dF0) obj).f25901d), obj);
        }
        this.f41728b = linkedHashMap;
        C0460HI c0460hi2 = (C0460HI) this.f41731e;
        this.f41729c = ((C8582Yk0) ((C7129xI) c0460hi2.f4211l.f12662c).f45518a).m9351c(new C4027f1(this, 7, c0460hi2));
        Z41 z41 = ((C7129xI) ((C0460HI) this.f41731e).f4211l.f12662c).f45518a;
        C4090g1 c4090g1 = new C4090g1(12, this);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        this.f41730d = new C8426Vk0(c8582Yk0, c4090g1);
    }

    public C10919rY0(C9580h41 c9580h41) {
        this.f41727a = 1;
        this.f41729c = c9580h41;
        this.f41730d = new SparseArray();
    }
}
