package defpackage;

import android.database.Cursor;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class RT1 {
    public static String a(String str, String str2) {
        return AbstractC1705Vq.i("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(NotificationConstants.ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C6512pj0 c6512pj0C = AbstractC8259yu.c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            O90.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            O90.e(string2, "cursor.getString(toColumnIndex)");
            c6512pj0C.add(new C6402p81(i, string, i2, string2));
        }
        return AbstractC8069xu.V(AbstractC8259yu.b(c6512pj0C));
    }

    public static final C6593q81 c(XY xy, String str, boolean z) {
        Cursor cursorS = xy.S("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorS.getColumnIndex("seqno");
            int columnIndex2 = cursorS.getColumnIndex("cid");
            int columnIndex3 = cursorS.getColumnIndex("name");
            int columnIndex4 = cursorS.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorS.moveToNext()) {
                    if (cursorS.getInt(columnIndex2) >= 0) {
                        int i = cursorS.getInt(columnIndex);
                        String string = cursorS.getString(columnIndex3);
                        String str2 = cursorS.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        O90.e(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                O90.e(collectionValues, "columnsMap.values");
                List listB0 = AbstractC8069xu.b0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                O90.e(collectionValues2, "ordersMap.values");
                C6593q81 c6593q81 = new C6593q81(str, z, listB0, AbstractC8069xu.b0(collectionValues2));
                AbstractC2141aT1.a(cursorS, null);
                return c6593q81;
            }
            AbstractC2141aT1.a(cursorS, null);
            return null;
        } finally {
        }
    }
}
