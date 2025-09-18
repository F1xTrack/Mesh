package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import defpackage.EnumC0625Ht1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i */
/* loaded from: classes2.dex */
public class C2814i {
    public static boolean a(String str, String str2) {
        int i = O2.a;
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    public static Integer b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static EnumC0625Ht1 c(String str) {
        return "inapp".equals(str) ? EnumC0625Ht1.a : "subs".equals(str) ? EnumC0625Ht1.b : EnumC0625Ht1.c;
    }

    public static boolean a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static String a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type == 0) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type == 1) {
                contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static long a() {
        return Lm.c().a();
    }

    public static int a(long j) {
        return ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
    }

    public static List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static void a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).putLong(str, sharedPreferences.getInt(str, i)).apply();
        } catch (ClassCastException unused) {
        }
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            U2.a(cursorRawQuery);
        }
    }

    public static int[] a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static com.yandex.metrica.w a(String str) {
        com.yandex.metrica.w wVar = new com.yandex.metrica.w();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                wVar.a = jSONObject.optString("UserInfo.UserId", null);
                wVar.b = jSONObject.optString("UserInfo.Type", null);
                wVar.c = C3240ym.b(jSONObject.optJSONObject("UserInfo.Options"));
            } catch (Throwable unused) {
            }
        }
        return wVar;
    }
}
