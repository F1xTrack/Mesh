package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.yandex.metrica.C3804w;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p000.EnumC7717Ht1;

/* renamed from: com.yandex.metrica.impl.ob.i */
/* loaded from: classes2.dex */
public class C3323i {
    /* renamed from: a */
    public static boolean m16068a(String str, String str2) {
        int i = C2819O2.f21836a;
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    /* renamed from: b */
    public static Integer m16071b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static EnumC7717Ht1 m16072c(String str) {
        return "inapp".equals(str) ? EnumC7717Ht1.f4566a : "subs".equals(str) ? EnumC7717Ht1.f4567b : EnumC7717Ht1.f4568c;
    }

    /* renamed from: a */
    public static boolean m16067a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: a */
    public static String m16063a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    /* renamed from: a */
    public static SharedPreferences m16061a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    /* renamed from: a */
    public static boolean m16069a(Collection<?> collection, Collection<?> collection2) {
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

    /* renamed from: a */
    public static void m16066a(Cursor cursor, ContentValues contentValues) {
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

    /* renamed from: a */
    public static long m16059a() {
        return C2764Lm.m14551c().mo14352a();
    }

    /* renamed from: a */
    public static int m16058a(long j) {
        return ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
    }

    /* renamed from: a */
    public static List<Integer> m16064a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m16065a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).putLong(str, sharedPreferences.getInt(str, i)).apply();
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: a */
    public static long m16060a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            C2968U2.m15239a(cursorRawQuery);
        }
    }

    /* renamed from: a */
    public static int[] m16070a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static C3804w m16062a(String str) {
        C3804w c3804w = new C3804w();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c3804w.f25529a = jSONObject.optString("UserInfo.UserId", null);
                c3804w.f25530b = jSONObject.optString("UserInfo.Type", null);
                c3804w.f25531c = C3762ym.m17287b(jSONObject.optJSONObject("UserInfo.Options"));
            } catch (Throwable unused) {
            }
        }
        return c3804w;
    }
}
