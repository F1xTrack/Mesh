package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes.dex */
public abstract class WJ0 {

    /* renamed from: a */
    public static final TypedValue f13133a = new TypedValue();

    /* renamed from: a */
    public static Drawable m8747a(Context context, ReadableMap readableMap) throws Resources.NotFoundException {
        int color;
        String string = readableMap.getString("type");
        boolean zEquals = "ThemeAttrAndroid".equals(string);
        TypedValue typedValue = f13133a;
        if (!zEquals) {
            if (!"RippleAndroid".equals(string)) {
                throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Invalid type for android drawable: ", string));
            }
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                color = readableMap.getInt("color");
            } else {
                if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
                color = context.getResources().getColor(typedValue.resourceId);
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : new ColorDrawable(-1));
            if (readableMap.hasKey("rippleRadius")) {
                rippleDrawable.setRadius((int) AbstractC11406vL1.m25403b((float) readableMap.getDouble("rippleRadius")));
            }
            return rippleDrawable;
        }
        String string2 = readableMap.getString("attribute");
        SoftAssertions.assertNotNull(string2);
        int identifier = "selectableItemBackground".equals(string2) ? R.attr.selectableItemBackground : "selectableItemBackgroundBorderless".equals(string2) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(string2, "attr", ConstantDeviceInfo.APP_PLATFORM);
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            Drawable drawable = context.getResources().getDrawable(typedValue.resourceId, context.getTheme());
            if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) AbstractC11406vL1.m25403b((float) readableMap.getDouble("rippleRadius")));
            }
            return drawable;
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + identifier + " couldn't be resolved into a drawable");
    }
}
