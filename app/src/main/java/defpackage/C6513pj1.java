package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: pj1 */
/* loaded from: classes.dex */
public final class C6513pj1 extends AbstractC1676Vg0 implements InterfaceC6672qZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6513pj1(int i, Object obj) {
        super(4);
        this.e = i;
        this.f = obj;
    }

    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                long jLongValue3 = ((Number) obj3).longValue();
                double dDoubleValue = ((Number) obj4).doubleValue();
                ((C5217ix0) this.f).d(SP.f, new C6322oj1(jLongValue, jLongValue2, jLongValue3, dDoubleValue));
                return C1518Tf1.a;
            case 1:
                long jLongValue4 = ((Number) obj).longValue();
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                ((C5217ix0) this.f).d(SP.g, new C6704qj1(jLongValue4, (String) obj4, iIntValue2, iIntValue));
                return C1518Tf1.a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                O90.c(sQLiteQuery);
                ((F61) this.f).n(new C2538cZ(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
