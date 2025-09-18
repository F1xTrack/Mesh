package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* renamed from: x12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11619x12 {
    /* renamed from: a */
    public static boolean m25735a(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    /* renamed from: b */
    public static int m25736b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
