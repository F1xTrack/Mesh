package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.os.SystemClock;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class RY1 {
    public static C3638ek0 a(InterfaceC5311jR interfaceC5311jR) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC5311jR.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC5311jR.b(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C3638ek0(1, 0, length, i);
    }

    public static final void b(XY xy) throws SQLException {
        C6512pj0 c6512pj0C = AbstractC8259yu.c();
        Cursor cursorS = xy.S("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorS.moveToNext()) {
            try {
                c6512pj0C.add(cursorS.getString(0));
            } finally {
            }
        }
        AbstractC2141aT1.a(cursorS, null);
        ListIterator listIterator = AbstractC8259yu.b(c6512pj0C).listIterator(0);
        while (true) {
            C6130nj0 c6130nj0 = (C6130nj0) listIterator;
            if (!c6130nj0.hasNext()) {
                return;
            }
            String str = (String) c6130nj0.next();
            O90.e(str, "triggerName");
            if (D51.o(str, "room_fts_content_sync_", false)) {
                xy.w("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final Cursor c(AbstractC6464pT0 abstractC6464pT0, C6655qT0 c6655qT0, boolean z) {
        O90.f(abstractC6464pT0, "db");
        Cursor cursorL = abstractC6464pT0.l(c6655qT0, null);
        if (z && (cursorL instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorL;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                O90.f(cursorL, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorL.getColumnNames(), cursorL.getCount());
                    while (cursorL.moveToNext()) {
                        Object[] objArr = new Object[cursorL.getColumnCount()];
                        int columnCount = cursorL.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorL.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorL.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorL.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorL.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorL.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    AbstractC2141aT1.a(cursorL, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorL;
    }
}
