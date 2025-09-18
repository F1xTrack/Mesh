package p000;

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
    /* renamed from: a */
    public static Uri m4554a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return M50.m5260d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Drawable m4555b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* renamed from: c */
    public static Icon m4556c(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i = iconCompat.f16097a;
        String strM5258b = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.f16098b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f16098b);
                break;
            case 2:
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = iconCompat.f16098b;
                    if (i2 >= 28) {
                        strM5258b = M50.m5258b(obj);
                    } else {
                        try {
                            strM5258b = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f16106j;
                    strM5258b = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f16098b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f16106j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM5258b, iconCompat.f16101e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f16098b, iconCompat.f16101e, iconCompat.f16102f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f16098b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m9977a((Bitmap) iconCompat.f16098b, false));
                    break;
                } else {
                    iconCreateWithBitmap = L50.m4899b((Bitmap) iconCompat.f16098b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = N50.m5541a(iconCompat.m9981e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m9981e());
                    }
                    Uri uriM9981e = iconCompat.m9981e();
                    String scheme = uriM9981e.getScheme();
                    if (RemoteMessageConst.Notification.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM9981e);
                        } catch (Exception unused2) {
                            uriM9981e.toString();
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f16098b));
                        } catch (FileNotFoundException unused3) {
                            uriM9981e.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m9981e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m9977a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = L50.m4899b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.f16103g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f16104h;
        if (mode != IconCompat.f16096k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
