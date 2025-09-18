package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class K50 {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return M50.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i = iconCompat.a;
        String strB = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.b;
                    if (i2 >= 28) {
                        strB = M50.b(obj);
                    } else {
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.b, false));
                    break;
                } else {
                    iconCreateWithBitmap = L50.b((Bitmap) iconCompat.b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = N50.a(iconCompat.e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.e());
                    }
                    Uri uriE = iconCompat.e();
                    String scheme = uriE.getScheme();
                    if (RemoteMessageConst.Notification.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception unused2) {
                            uriE.toString();
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException unused3) {
                            uriE.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = L50.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
