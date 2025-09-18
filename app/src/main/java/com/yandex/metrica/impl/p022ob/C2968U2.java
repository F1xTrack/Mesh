package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.U2 */
/* loaded from: classes2.dex */
public final class C2968U2 {

    /* renamed from: a */
    private static final C3039Wn f22434a = new C3039Wn();

    /* renamed from: a */
    public static boolean m15244a(Object obj) {
        return obj != null;
    }

    /* renamed from: b */
    public static int m15248b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m15251c(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: a */
    public static String m15230a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? "0.0" : packageInfo.versionName;
    }

    /* renamed from: b */
    public static boolean m15250b(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m15243a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static boolean m15249b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static void m15241a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15242a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15239a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m15245a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m15240a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> boolean m15247a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* renamed from: a */
    public static boolean m15246a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public static String m15231a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    /* renamed from: a */
    public static Set<Integer> m15238a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static String m15232a(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    /* renamed from: a */
    public static List<String> m15236a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: a */
    public static Object m15229a(InterfaceC3038Wm interfaceC3038Wm, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return interfaceC3038Wm.mo14148a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, S> S m15228a(InterfaceC3038Wm<T, S> interfaceC3038Wm, Context context, String str, String str2, String str3) {
        try {
            return (S) m15229a((InterfaceC3038Wm) interfaceC3038Wm, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <K, V> List<Map.Entry<K, V>> m15235a(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m15237a(List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry<K, V> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <T> List<T> m15234a(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public static BigDecimal m15233a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m15227a(double d, double d2) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d2 : d;
    }
}
