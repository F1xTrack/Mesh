package defpackage;

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
public abstract class AbstractC6464pT0 {
    public volatile XY a;
    public Executor b;
    public D61 c;
    public boolean e;
    public ArrayList f;
    public final LinkedHashMap j;
    public final C2542ca0 d = d();
    public final LinkedHashMap g = new LinkedHashMap();
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public AbstractC6464pT0() {
        O90.e(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.j = new LinkedHashMap();
    }

    public static Object o(Class cls, D61 d61) {
        if (cls.isInstance(d61)) {
            return d61;
        }
        if (d61 instanceof AH) {
            return o(cls, ((AH) d61).m());
        }
        return null;
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().M().A() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        XY xyM = g().M();
        this.d.c(xyM);
        if (xyM.D()) {
            xyM.n();
        } else {
            xyM.m();
        }
    }

    public abstract C2542ca0 d();

    public abstract D61 e(C5651lD c5651lD);

    public List f(LinkedHashMap linkedHashMap) {
        O90.f(linkedHashMap, "autoMigrationSpecs");
        return MN.a;
    }

    public final D61 g() {
        D61 d61 = this.c;
        if (d61 != null) {
            return d61;
        }
        O90.o("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return SN.a;
    }

    public Map i() {
        return NN.a;
    }

    public final void j() {
        g().M().p();
        if (g().M().A()) {
            return;
        }
        C2542ca0 c2542ca0 = this.d;
        if (c2542ca0.e.compareAndSet(false, true)) {
            Executor executor = c2542ca0.a.b;
            if (executor != null) {
                executor.execute(c2542ca0.l);
            } else {
                O90.o("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(XY xy) {
        C2542ca0 c2542ca0 = this.d;
        c2542ca0.getClass();
        synchronized (c2542ca0.k) {
            if (c2542ca0.f) {
                return;
            }
            xy.w("PRAGMA temp_store = MEMORY;");
            xy.w("PRAGMA recursive_triggers='ON';");
            xy.w("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c2542ca0.c(xy);
            c2542ca0.g = xy.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c2542ca0.f = true;
        }
    }

    public final Cursor l(F61 f61, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return g().M().J(f61);
        }
        XY xyM = g().M();
        xyM.getClass();
        String strM = f61.m();
        String[] strArr = XY.e;
        O90.c(cancellationSignal);
        WY wy = new WY(0, f61);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) xyM.b;
        O90.f(sQLiteDatabase, "sQLiteDatabase");
        O90.f(strM, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(wy, strM, strArr, null, cancellationSignal);
        O90.e(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public final Object m(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            n();
            return objCall;
        } finally {
            j();
        }
    }

    public final void n() {
        g().M().U();
    }
}
