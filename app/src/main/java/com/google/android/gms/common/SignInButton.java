package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.HQ0;
import p000.MG0;

/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    private final void zaa(Context context) throws Resources.NotFoundException {
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = zaz.zaa(context, this.zaa, this.zab);
        } catch (HQ0 unused) {
            int i = this.zaa;
            int i2 = this.zab;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.zaa(context.getResources(), i, i2);
            this.zac = zaaaVar;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener == null || view != this.zac) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) throws Resources.NotFoundException {
        setStyle(this.zaa, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zac.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) throws Resources.NotFoundException {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i) throws Resources.NotFoundException {
        setStyle(i, this.zab);
    }

    public void setStyle(int i, int i2) throws Resources.NotFoundException {
        this.zaa = i;
        this.zab = i2;
        zaa(getContext());
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i, int i2, Scope[] scopeArr) throws Resources.NotFoundException {
        setStyle(i, i2);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.zad = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, MG0.f7076a, 0, 0);
        try {
            this.zaa = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.zab = typedArrayObtainStyledAttributes.getInt(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
