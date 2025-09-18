package p000;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: pj1 */
/* loaded from: classes.dex */
public final class C10686pj1 extends AbstractC8418Vg0 implements InterfaceC6688qZ {

    /* renamed from: e */
    public final /* synthetic */ int f40354e;

    /* renamed from: f */
    public final /* synthetic */ Object f40355f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10686pj1(int i, Object obj) {
        super(4);
        this.f40354e = i;
        this.f40355f = obj;
    }

    /* renamed from: a */
    public final Object m23859a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f40354e) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                long jLongValue3 = ((Number) obj3).longValue();
                double dDoubleValue = ((Number) obj4).doubleValue();
                ((C9817ix0) this.f40355f).m21947d(EnumC1158SP.f10722f, new C10558oj1(jLongValue, jLongValue2, jLongValue3, dDoubleValue));
                return C8313Tf1.f11463a;
            case 1:
                long jLongValue4 = ((Number) obj).longValue();
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                ((C9817ix0) this.f40355f).m21947d(EnumC1158SP.f10723g, new C10814qj1(jLongValue4, (String) obj4, iIntValue2, iIntValue));
                return C8313Tf1.f11463a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                O90.m5965c(sQLiteQuery);
                ((F61) this.f40355f).mo2493n(new C1855cZ(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
