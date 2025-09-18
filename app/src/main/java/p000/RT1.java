package p000;

import android.database.Cursor;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class RT1 {
    /* renamed from: a */
    public static String m7019a(String str, String str2) {
        return AbstractC1374Vq.m8590i("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    /* renamed from: b */
    public static final List m7020b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(NotificationConstants.f19487ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C10685pj0 c10685pj0M26272c = AbstractC7230yu.m26272c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            O90.m5967e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            O90.m5967e(string2, "cursor.getString(toColumnIndex)");
            c10685pj0M26272c.add(new C10612p81(i, string, i2, string2));
        }
        return AbstractC7167xu.m25976V(AbstractC7230yu.m26271b(c10685pj0M26272c));
    }

    /* renamed from: c */
    public static final C10740q81 m7021c(C1482XY c1482xy, String str, boolean z) {
        Cursor cursorM9075S = c1482xy.m9075S("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorM9075S.getColumnIndex("seqno");
            int columnIndex2 = cursorM9075S.getColumnIndex("cid");
            int columnIndex3 = cursorM9075S.getColumnIndex("name");
            int columnIndex4 = cursorM9075S.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorM9075S.moveToNext()) {
                    if (cursorM9075S.getInt(columnIndex2) >= 0) {
                        int i = cursorM9075S.getInt(columnIndex);
                        String string = cursorM9075S.getString(columnIndex3);
                        String str2 = cursorM9075S.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        O90.m5967e(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                O90.m5967e(collectionValues, "columnsMap.values");
                List listM25982b0 = AbstractC7167xu.m25982b0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                O90.m5967e(collectionValues2, "ordersMap.values");
                C10740q81 c10740q81 = new C10740q81(str, z, listM25982b0, AbstractC7167xu.m25982b0(collectionValues2));
                AbstractC8729aT1.m9749a(cursorM9075S, null);
                return c10740q81;
            }
            AbstractC8729aT1.m9749a(cursorM9075S, null);
            return null;
        } finally {
        }
    }
}
