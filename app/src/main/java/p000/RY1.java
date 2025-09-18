package p000;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.os.SystemClock;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class RY1 {
    /* renamed from: a */
    public static C9279ek0 m7033a(InterfaceC6237jR interfaceC6237jR) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC6237jR.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC6237jR.mo2723b(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C9279ek0(1, 0, length, i);
    }

    /* renamed from: b */
    public static final void m7034b(C1482XY c1482xy) throws SQLException {
        C10685pj0 c10685pj0M26272c = AbstractC7230yu.m26272c();
        Cursor cursorM9075S = c1482xy.m9075S("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorM9075S.moveToNext()) {
            try {
                c10685pj0M26272c.add(cursorM9075S.getString(0));
            } finally {
            }
        }
        AbstractC8729aT1.m9749a(cursorM9075S, null);
        ListIterator listIterator = AbstractC7230yu.m26271b(c10685pj0M26272c).listIterator(0);
        while (true) {
            C10429nj0 c10429nj0 = (C10429nj0) listIterator;
            if (!c10429nj0.hasNext()) {
                return;
            }
            String str = (String) c10429nj0.next();
            O90.m5967e(str, "triggerName");
            if (D51.m1556o(str, "room_fts_content_sync_", false)) {
                c1482xy.m9081w("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* renamed from: c */
    public static final Cursor m7035c(AbstractC10653pT0 abstractC10653pT0, C10781qT0 c10781qT0, boolean z) {
        O90.m5968f(abstractC10653pT0, "db");
        Cursor cursorM23797l = abstractC10653pT0.m23797l(c10781qT0, null);
        if (z && (cursorM23797l instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM23797l;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                O90.m5968f(cursorM23797l, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorM23797l.getColumnNames(), cursorM23797l.getCount());
                    while (cursorM23797l.moveToNext()) {
                        Object[] objArr = new Object[cursorM23797l.getColumnCount()];
                        int columnCount = cursorM23797l.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorM23797l.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorM23797l.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorM23797l.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorM23797l.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorM23797l.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    AbstractC8729aT1.m9749a(cursorM23797l, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorM23797l;
    }
}
