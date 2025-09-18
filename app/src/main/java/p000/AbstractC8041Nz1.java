package p000;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Nz1 */
/* loaded from: classes.dex */
public abstract class AbstractC8041Nz1 {

    /* renamed from: a */
    public static final C0295Eg f8153a = new C0295Eg(13);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C6306kX m5916a(Context context, C1791bX c1791bX) {
        Cursor cursorMo6693W;
        C9196e41 c9196e41;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c1791bX.f17057a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC7222ym.m26245v("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = c1791bX.f17058b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException(AbstractC1374Vq.m8590i("Found content provider ", str, ", but package was not ", str3));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0295Eg c0295Eg = f8153a;
        Collections.sort(arrayList, c0295Eg);
        List listM23926c = c1791bX.f17060d;
        if (listM23926c == null) {
            listM23926c = AbstractC10724q12.m23926c(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorMo6693W = null;
            if (i >= listM23926c.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM23926c.get(i));
            Collections.sort(arrayList2, c0295Eg);
            if (arrayList.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C6306kX(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str4).appendPath("file").build();
        if (Build.VERSION.SDK_INT < 24) {
            QQ0 qq0 = new QQ0();
            qq0.f9619a = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            c9196e41 = qq0;
        } else {
            c9196e41 = new C9196e41(context, uriBuild);
        }
        try {
            cursorMo6693W = c9196e41.mo6693W(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c1791bX.f17059c});
            if (cursorMo6693W != null && cursorMo6693W.getCount() > 0) {
                int columnIndex = cursorMo6693W.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo6693W.getColumnIndex("_id");
                int columnIndex3 = cursorMo6693W.getColumnIndex("file_id");
                int columnIndex4 = cursorMo6693W.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo6693W.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo6693W.getColumnIndex("font_italic");
                while (cursorMo6693W.moveToNext()) {
                    arrayList3.add(new C6369lX(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorMo6693W.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorMo6693W.getLong(columnIndex3)), columnIndex4 != -1 ? cursorMo6693W.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorMo6693W.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorMo6693W.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorMo6693W.getInt(columnIndex) : 0));
                }
            }
            if (cursorMo6693W != null) {
                cursorMo6693W.close();
            }
            c9196e41.close();
            return new C6306kX(0, (C6369lX[]) arrayList3.toArray(new C6369lX[0]));
        } catch (Throwable th) {
            if (cursorMo6693W != null) {
                cursorMo6693W.close();
            }
            c9196e41.close();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m5917b(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* renamed from: c */
    public static void m5918c(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
