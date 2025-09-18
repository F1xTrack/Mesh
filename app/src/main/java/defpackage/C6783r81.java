package defpackage;

import android.database.Cursor;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: r81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6783r81 {
    public final String a;
    public final Object b;
    public final AbstractSet c;
    public final AbstractSet d;

    public C6783r81(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        O90.f(abstractSet, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final C6783r81 a(XY xy, String str) {
        Map mapB;
        C6482pZ0 c6482pZ0A;
        C6482pZ0 c6482pZ0;
        Cursor cursorS = xy.S("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorS.getColumnCount() <= 0) {
                mapB = NN.a;
                AbstractC2141aT1.a(cursorS, null);
            } else {
                int columnIndex = cursorS.getColumnIndex("name");
                int columnIndex2 = cursorS.getColumnIndex("type");
                int columnIndex3 = cursorS.getColumnIndex("notnull");
                int columnIndex4 = cursorS.getColumnIndex("pk");
                int columnIndex5 = cursorS.getColumnIndex("dflt_value");
                C2391bn0 c2391bn0 = new C2391bn0();
                while (cursorS.moveToNext()) {
                    String string = cursorS.getString(columnIndex);
                    String string2 = cursorS.getString(columnIndex2);
                    boolean z = cursorS.getInt(columnIndex3) != 0;
                    int i = cursorS.getInt(columnIndex4);
                    String string3 = cursorS.getString(columnIndex5);
                    O90.e(string, "name");
                    O90.e(string2, "type");
                    c2391bn0.put(string, new C6020n81(i, 2, string, string2, string3, z));
                }
                mapB = c2391bn0.b();
                AbstractC2141aT1.a(cursorS, null);
            }
            cursorS = xy.S("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorS.getColumnIndex(NotificationConstants.ID);
                int columnIndex7 = cursorS.getColumnIndex("seq");
                int columnIndex8 = cursorS.getColumnIndex("table");
                int columnIndex9 = cursorS.getColumnIndex("on_delete");
                int columnIndex10 = cursorS.getColumnIndex("on_update");
                List listB = RT1.b(cursorS);
                cursorS.moveToPosition(-1);
                C6482pZ0 c6482pZ02 = new C6482pZ0();
                while (cursorS.moveToNext()) {
                    if (cursorS.getInt(columnIndex7) == 0) {
                        int i2 = cursorS.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listB) {
                            int i4 = columnIndex7;
                            List list = listB;
                            if (((C6402p81) obj).a == i2) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i4;
                            listB = list;
                        }
                        int i5 = columnIndex7;
                        List list2 = listB;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C6402p81 c6402p81 = (C6402p81) it.next();
                            arrayList.add(c6402p81.c);
                            arrayList2.add(c6402p81.d);
                        }
                        String string4 = cursorS.getString(columnIndex8);
                        O90.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorS.getString(columnIndex9);
                        O90.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorS.getString(columnIndex10);
                        O90.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        c6482pZ02.add(new C6211o81(string4, string5, arrayList, string6, arrayList2));
                        columnIndex6 = i3;
                        columnIndex7 = i5;
                        listB = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                C6482pZ0 c6482pZ0A2 = AbstractC7627vZ0.a(c6482pZ02);
                AbstractC2141aT1.a(cursorS, null);
                cursorS = xy.S("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorS.getColumnIndex("name");
                    int columnIndex12 = cursorS.getColumnIndex("origin");
                    int columnIndex13 = cursorS.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        c6482pZ0A = null;
                        AbstractC2141aT1.a(cursorS, null);
                    } else {
                        C6482pZ0 c6482pZ03 = new C6482pZ0();
                        while (cursorS.moveToNext()) {
                            if ("c".equals(cursorS.getString(columnIndex12))) {
                                String string7 = cursorS.getString(columnIndex11);
                                boolean z2 = cursorS.getInt(columnIndex13) == 1;
                                O90.e(string7, "name");
                                C6593q81 c6593q81C = RT1.c(xy, string7, z2);
                                if (c6593q81C == null) {
                                    AbstractC2141aT1.a(cursorS, null);
                                    c6482pZ0 = null;
                                    break;
                                }
                                c6482pZ03.add(c6593q81C);
                            }
                        }
                        c6482pZ0A = AbstractC7627vZ0.a(c6482pZ03);
                        AbstractC2141aT1.a(cursorS, null);
                    }
                    c6482pZ0 = c6482pZ0A;
                    return new C6783r81(str, mapB, c6482pZ0A2, c6482pZ0);
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
        if (!(obj instanceof C6783r81)) {
            return false;
        }
        C6783r81 c6783r81 = (C6783r81) obj;
        if (!this.a.equals(c6783r81.a) || !this.b.equals(c6783r81.b) || !O90.a(this.c, c6783r81.c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.d;
        if (abstractSet2 == null || (abstractSet = c6783r81.d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
