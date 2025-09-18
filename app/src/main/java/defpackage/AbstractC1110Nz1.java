package defpackage;

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
public abstract class AbstractC1110Nz1 {
    public static final C0350Eg a = new C0350Eg(13);

    /* JADX WARN: Multi-variable type inference failed */
    public static C5520kX a(Context context, C2342bX c2342bX) {
        Cursor cursorW;
        C3513e41 c3513e41;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c2342bX.a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC8235ym.v("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = c2342bX.b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException(AbstractC1705Vq.i("Found content provider ", str, ", but package was not ", str3));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0350Eg c0350Eg = a;
        Collections.sort(arrayList, c0350Eg);
        List listC = c2342bX.d;
        if (listC == null) {
            listC = AbstractC6570q12.c(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorW = null;
            if (i >= listC.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listC.get(i));
            Collections.sort(arrayList2, c0350Eg);
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
            return new C5520kX(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str4).appendPath("file").build();
        if (Build.VERSION.SDK_INT < 24) {
            QQ0 qq0 = new QQ0();
            qq0.a = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            c3513e41 = qq0;
        } else {
            c3513e41 = new C3513e41(context, uriBuild);
        }
        try {
            cursorW = c3513e41.W(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c2342bX.c});
            if (cursorW != null && cursorW.getCount() > 0) {
                int columnIndex = cursorW.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorW.getColumnIndex("_id");
                int columnIndex3 = cursorW.getColumnIndex("file_id");
                int columnIndex4 = cursorW.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorW.getColumnIndex("font_weight");
                int columnIndex6 = cursorW.getColumnIndex("font_italic");
                while (cursorW.moveToNext()) {
                    arrayList3.add(new C5711lX(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorW.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorW.getLong(columnIndex3)), columnIndex4 != -1 ? cursorW.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorW.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorW.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorW.getInt(columnIndex) : 0));
                }
            }
            if (cursorW != null) {
                cursorW.close();
            }
            c3513e41.close();
            return new C5520kX(0, (C5711lX[]) arrayList3.toArray(new C5711lX[0]));
        } catch (Throwable th) {
            if (cursorW != null) {
                cursorW.close();
            }
            c3513e41.close();
            throw th;
        }
    }

    public static void b(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void c(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
