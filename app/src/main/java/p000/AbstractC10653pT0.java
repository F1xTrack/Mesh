package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: pT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10653pT0 {

    /* renamed from: a */
    public volatile C1482XY f40093a;

    /* renamed from: b */
    public Executor f40094b;

    /* renamed from: c */
    public D61 f40095c;

    /* renamed from: e */
    public boolean f40097e;

    /* renamed from: f */
    public ArrayList f40098f;

    /* renamed from: j */
    public final LinkedHashMap f40102j;

    /* renamed from: d */
    public final C8998ca0 f40096d = mo10330d();

    /* renamed from: g */
    public final LinkedHashMap f40099g = new LinkedHashMap();

    /* renamed from: h */
    public final ReentrantReadWriteLock f40100h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal f40101i = new ThreadLocal();

    public AbstractC10653pT0() {
        O90.m5967e(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f40102j = new LinkedHashMap();
    }

    /* renamed from: o */
    public static Object m23790o(Class cls, D61 d61) {
        if (cls.isInstance(d61)) {
            return d61;
        }
        if (d61 instanceof InterfaceC0018AH) {
            return m23790o(cls, ((InterfaceC0018AH) d61).m146m());
        }
        return null;
    }

    /* renamed from: a */
    public final void m23791a() {
        if (!this.f40097e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public final void m23792b() {
        if (!m23794g().mo1557M().m9072A() && this.f40101i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: c */
    public final void m23793c() {
        m23791a();
        m23791a();
        C1482XY c1482xyMo1557M = m23794g().mo1557M();
        this.f40096d.m10793c(c1482xyMo1557M);
        if (c1482xyMo1557M.m9073D()) {
            c1482xyMo1557M.m9078n();
        } else {
            c1482xyMo1557M.m9077m();
        }
    }

    /* renamed from: d */
    public abstract C8998ca0 mo10330d();

    /* renamed from: e */
    public abstract D61 mo10331e(C6349lD c6349lD);

    /* renamed from: f */
    public List mo10332f(LinkedHashMap linkedHashMap) {
        O90.m5968f(linkedHashMap, "autoMigrationSpecs");
        return C0779MN.f7117a;
    }

    /* renamed from: g */
    public final D61 m23794g() {
        D61 d61 = this.f40095c;
        if (d61 != null) {
            return d61;
        }
        O90.m5977o("internalOpenHelper");
        throw null;
    }

    /* renamed from: h */
    public Set mo10333h() {
        return C1156SN.f10705a;
    }

    /* renamed from: i */
    public Map mo10334i() {
        return C0842NN.f7735a;
    }

    /* renamed from: j */
    public final void m23795j() {
        m23794g().mo1557M().m9080p();
        if (m23794g().mo1557M().m9072A()) {
            return;
        }
        C8998ca0 c8998ca0 = this.f40096d;
        if (c8998ca0.f17619e.compareAndSet(false, true)) {
            Executor executor = c8998ca0.f17615a.f40094b;
            if (executor != null) {
                executor.execute(c8998ca0.f17626l);
            } else {
                O90.m5977o("internalQueryExecutor");
                throw null;
            }
        }
    }

    /* renamed from: k */
    public final void m23796k(C1482XY c1482xy) {
        C8998ca0 c8998ca0 = this.f40096d;
        c8998ca0.getClass();
        synchronized (c8998ca0.f17625k) {
            if (c8998ca0.f17620f) {
                return;
            }
            c1482xy.m9081w("PRAGMA temp_store = MEMORY;");
            c1482xy.m9081w("PRAGMA recursive_triggers='ON';");
            c1482xy.m9081w("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c8998ca0.m10793c(c1482xy);
            c8998ca0.f17621g = c1482xy.m9079o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c8998ca0.f17620f = true;
        }
    }

    /* renamed from: l */
    public final Cursor m23797l(F61 f61, CancellationSignal cancellationSignal) {
        m23791a();
        m23792b();
        if (cancellationSignal == null) {
            return m23794g().mo1557M().m9074J(f61);
        }
        C1482XY c1482xyMo1557M = m23794g().mo1557M();
        c1482xyMo1557M.getClass();
        String strMo2492m = f61.mo2492m();
        String[] strArr = C1482XY.f13842e;
        O90.m5965c(cancellationSignal);
        C1419WY c1419wy = new C1419WY(0, f61);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c1482xyMo1557M.f13844b;
        O90.m5968f(sQLiteDatabase, "sQLiteDatabase");
        O90.m5968f(strMo2492m, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c1419wy, strMo2492m, strArr, null, cancellationSignal);
        O90.m5967e(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    /* renamed from: m */
    public final Object m23798m(Callable callable) {
        m23793c();
        try {
            Object objCall = callable.call();
            m23799n();
            return objCall;
        } finally {
            m23795j();
        }
    }

    /* renamed from: n */
    public final void m23799n() {
        m23794g().mo1557M().m9076U();
    }
}
