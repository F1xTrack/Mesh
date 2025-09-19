package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import p000.AbstractC11153tN0;
import p000.AbstractC4173hL;

/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i2) throws Resources.NotFoundException {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int iZab = zab(i2, ru.mes.dnevnik.R.drawable.common_google_signin_btn_icon_dark, ru.mes.dnevnik.R.drawable.common_google_signin_btn_icon_light, ru.mes.dnevnik.R.drawable.common_google_signin_btn_icon_light);
        int iZab2 = zab(i2, ru.mes.dnevnik.R.drawable.common_google_signin_btn_text_dark, ru.mes.dnevnik.R.drawable.common_google_signin_btn_text_light, ru.mes.dnevnik.R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(iZab);
        AbstractC4173hL.m18806h(drawable, resources.getColorStateList(ru.mes.dnevnik.R.color.common_google_signin_btn_tint));
        AbstractC4173hL.m18807i(drawable, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, ru.mes.dnevnik.R.color.common_google_signin_btn_text_dark, ru.mes.dnevnik.R.color.common_google_signin_btn_text_light, ru.mes.dnevnik.R.color.common_google_signin_btn_text_light))));
        if (i == 0) {
            setText(resources.getString(ru.mes.dnevnik.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(ru.mes.dnevnik.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
