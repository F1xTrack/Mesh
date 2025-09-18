package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: uA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11256uA1 {

    /* renamed from: a */
    public static final int[] f43545a = {R.attr.theme, ru.mes.dnevnik.R.attr.theme};

    /* renamed from: b */
    public static final int[] f43546b = {ru.mes.dnevnik.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static boolean m25126a(Uri uri) {
        return uri != null && RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static Context m25127b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f43546b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C1130Ry) && ((C1130Ry) context).f10499a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C1130Ry c1130Ry = new C1130Ry(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f43545a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1130Ry.getTheme().applyStyle(resourceId2, true);
        }
        return c1130Ry;
    }
}
