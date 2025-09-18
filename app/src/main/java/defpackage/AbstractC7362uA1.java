package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: uA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7362uA1 {
    public static final int[] a = {R.attr.theme, ru.mes.dnevnik.R.attr.theme};
    public static final int[] b = {ru.mes.dnevnik.R.attr.materialThemeOverlay};

    public static boolean a(Uri uri) {
        return uri != null && RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C1417Ry) && ((C1417Ry) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C1417Ry c1417Ry = new C1417Ry(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1417Ry.getTheme().applyStyle(resourceId2, true);
        }
        return c1417Ry;
    }
}
