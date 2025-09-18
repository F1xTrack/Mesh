package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* renamed from: a02 */
/* loaded from: classes.dex */
public abstract class AbstractC2051a02 {
    public static boolean a(Context context, Uri uri) throws Exception {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strF = f(context, uri, "mime_type");
        long j = 0;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"flags"}, null, null, null);
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    j = cursorQuery.getLong(0);
                }
            } catch (Exception e) {
                e.toString();
            }
            int i = (int) j;
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            if ((i & 4) != 0) {
                return true;
            }
            if (!"vnd.android.document/directory".equals(strF) || (i & 8) == 0) {
                return (TextUtils.isEmpty(strF) || (i & 2) == 0) ? false : true;
            }
            return true;
        } finally {
            b(cursorQuery);
        }
    }

    public static void b(Cursor cursor) throws Exception {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(Context context, Uri uri) throws Exception {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            b(cursorQuery);
        }
    }

    public static String d(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !PN1.b(scheme, scheme2)) : scheme2 == null) {
            if (AbstractC0277Dh1.a(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i = 0;
                for (int i2 = 0; i2 < iMin && pathSegments.get(i2).equals(pathSegments2.get(i2)); i2++) {
                    i++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i3 = i; i3 < pathSegments.size(); i3++) {
                    sb.append("../");
                }
                while (i < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i));
                    if (i < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    public static int[] e(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    public static String f(Context context, Uri uri, String str) throws Exception {
        Throwable th;
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            } catch (Exception e) {
                e = e;
                cursorQuery = null;
            } catch (Throwable th2) {
                uri = 0;
                th = th2;
                b(uri);
                throw th;
            }
            try {
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    b(cursorQuery);
                    return null;
                }
                String string = cursorQuery.getString(0);
                b(cursorQuery);
                return string;
            } catch (Exception e2) {
                e = e2;
                e.toString();
                b(cursorQuery);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            b(uri);
            throw th;
        }
    }

    public static String g(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrE = e(str2);
        if (iArrE[0] != -1) {
            sb.append(str2);
            g(sb, iArrE[1], iArrE[2]);
            return sb.toString();
        }
        int[] iArrE2 = e(str);
        if (iArrE[3] == 0) {
            sb.append((CharSequence) str, 0, iArrE2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrE[2] == 0) {
            sb.append((CharSequence) str, 0, iArrE2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrE[1];
        if (i != 0) {
            int i2 = iArrE2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return g(sb, iArrE[1] + i2, i2 + iArrE[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrE2[1]);
            sb.append(str2);
            int i3 = iArrE2[1];
            return g(sb, i3, iArrE[2] + i3);
        }
        int i4 = iArrE2[0] + 2;
        int i5 = iArrE2[1];
        if (i4 >= i5 || i5 != iArrE2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrE2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrE2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return g(sb, iArrE2[1], i6 + iArrE[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrE2[1];
        return g(sb, i7, iArrE[2] + i7 + 1);
    }

    public static Uri i(String str, String str2) {
        return Uri.parse(h(str, str2));
    }
}
