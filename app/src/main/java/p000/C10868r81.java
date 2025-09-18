package p000;

import android.database.Cursor;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: r81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10868r81 {

    /* renamed from: a */
    public final String f41352a;

    /* renamed from: b */
    public final Object f41353b;

    /* renamed from: c */
    public final AbstractSet f41354c;

    /* renamed from: d */
    public final AbstractSet f41355d;

    public C10868r81(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        O90.m5968f(abstractSet, "foreignKeys");
        this.f41352a = str;
        this.f41353b = map;
        this.f41354c = abstractSet;
        this.f41355d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: a */
    public static final C10868r81 m24162a(C1482XY c1482xy, String str) {
        Map mapM10510b;
        C10665pZ0 c10665pZ0M25450a;
        C10665pZ0 c10665pZ0;
        Cursor cursorM9075S = c1482xy.m9075S("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorM9075S.getColumnCount() <= 0) {
                mapM10510b = C0842NN.f7735a;
                AbstractC8729aT1.m9749a(cursorM9075S, null);
            } else {
                int columnIndex = cursorM9075S.getColumnIndex("name");
                int columnIndex2 = cursorM9075S.getColumnIndex("type");
                int columnIndex3 = cursorM9075S.getColumnIndex("notnull");
                int columnIndex4 = cursorM9075S.getColumnIndex("pk");
                int columnIndex5 = cursorM9075S.getColumnIndex("dflt_value");
                C8896bn0 c8896bn0 = new C8896bn0();
                while (cursorM9075S.moveToNext()) {
                    String string = cursorM9075S.getString(columnIndex);
                    String string2 = cursorM9075S.getString(columnIndex2);
                    boolean z = cursorM9075S.getInt(columnIndex3) != 0;
                    int i = cursorM9075S.getInt(columnIndex4);
                    String string3 = cursorM9075S.getString(columnIndex5);
                    O90.m5967e(string, "name");
                    O90.m5967e(string2, "type");
                    c8896bn0.put(string, new C10356n81(i, 2, string, string2, string3, z));
                }
                mapM10510b = c8896bn0.m10510b();
                AbstractC8729aT1.m9749a(cursorM9075S, null);
            }
            cursorM9075S = c1482xy.m9075S("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorM9075S.getColumnIndex(NotificationConstants.f19487ID);
                int columnIndex7 = cursorM9075S.getColumnIndex("seq");
                int columnIndex8 = cursorM9075S.getColumnIndex("table");
                int columnIndex9 = cursorM9075S.getColumnIndex("on_delete");
                int columnIndex10 = cursorM9075S.getColumnIndex("on_update");
                List listM7020b = RT1.m7020b(cursorM9075S);
                cursorM9075S.moveToPosition(-1);
                C10665pZ0 c10665pZ02 = new C10665pZ0();
                while (cursorM9075S.moveToNext()) {
                    if (cursorM9075S.getInt(columnIndex7) == 0) {
                        int i2 = cursorM9075S.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listM7020b) {
                            int i4 = columnIndex7;
                            List list = listM7020b;
                            if (((C10612p81) obj).f39862a == i2) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i4;
                            listM7020b = list;
                        }
                        int i5 = columnIndex7;
                        List list2 = listM7020b;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C10612p81 c10612p81 = (C10612p81) it.next();
                            arrayList.add(c10612p81.f39864c);
                            arrayList2.add(c10612p81.f39865d);
                        }
                        String string4 = cursorM9075S.getString(columnIndex8);
                        O90.m5967e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorM9075S.getString(columnIndex9);
                        O90.m5967e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorM9075S.getString(columnIndex10);
                        O90.m5967e(string6, "cursor.getString(onUpdateColumnIndex)");
                        c10665pZ02.add(new C10484o81(string4, string5, arrayList, string6, arrayList2));
                        columnIndex6 = i3;
                        columnIndex7 = i5;
                        listM7020b = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                C10665pZ0 c10665pZ0M25450a2 = AbstractC11433vZ0.m25450a(c10665pZ02);
                AbstractC8729aT1.m9749a(cursorM9075S, null);
                cursorM9075S = c1482xy.m9075S("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorM9075S.getColumnIndex("name");
                    int columnIndex12 = cursorM9075S.getColumnIndex("origin");
                    int columnIndex13 = cursorM9075S.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        c10665pZ0M25450a = null;
                        AbstractC8729aT1.m9749a(cursorM9075S, null);
                    } else {
                        C10665pZ0 c10665pZ03 = new C10665pZ0();
                        while (cursorM9075S.moveToNext()) {
                            if ("c".equals(cursorM9075S.getString(columnIndex12))) {
                                String string7 = cursorM9075S.getString(columnIndex11);
                                boolean z2 = cursorM9075S.getInt(columnIndex13) == 1;
                                O90.m5967e(string7, "name");
                                C10740q81 c10740q81M7021c = RT1.m7021c(c1482xy, string7, z2);
                                if (c10740q81M7021c == null) {
                                    AbstractC8729aT1.m9749a(cursorM9075S, null);
                                    c10665pZ0 = null;
                                    break;
                                }
                                c10665pZ03.add(c10740q81M7021c);
                            }
                        }
                        c10665pZ0M25450a = AbstractC11433vZ0.m25450a(c10665pZ03);
                        AbstractC8729aT1.m9749a(cursorM9075S, null);
                    }
                    c10665pZ0 = c10665pZ0M25450a;
                    return new C10868r81(str, mapM10510b, c10665pZ0M25450a2, c10665pZ0);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10868r81)) {
            return false;
        }
        C10868r81 c10868r81 = (C10868r81) obj;
        if (!this.f41352a.equals(c10868r81.f41352a) || !this.f41353b.equals(c10868r81.f41353b) || !O90.m5963a(this.f41354c, c10868r81.f41354c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f41355d;
        if (abstractSet2 == null || (abstractSet = c10868r81.f41355d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f41354c.hashCode() + ((this.f41353b.hashCode() + (this.f41352a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f41352a + "', columns=" + this.f41353b + ", foreignKeys=" + this.f41354c + ", indices=" + this.f41355d + '}';
    }
}
