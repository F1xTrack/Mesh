package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p000.AbstractC10944rk1;
import p000.C0180Cr;
import p000.C0825N6;
import p000.C10895rM0;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0825N6 implements Checkable {

    /* renamed from: g */
    public static final int[] f18215g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f18216d;

    /* renamed from: e */
    public boolean f18217e;

    /* renamed from: f */
    public boolean f18218f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.imageButtonStyle);
        this.f18217e = true;
        this.f18218f = true;
        AbstractC10944rk1.m24482n(this, new C10895rM0(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18216d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f18216d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f18215g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0180Cr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0180Cr c0180Cr = (C0180Cr) parcelable;
        super.onRestoreInstanceState(c0180Cr.f44064a);
        setChecked(c0180Cr.f1728c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0180Cr c0180Cr = new C0180Cr(super.onSaveInstanceState());
        c0180Cr.f1728c = this.f18216d;
        return c0180Cr;
    }

    public void setCheckable(boolean z) {
        if (this.f18217e != z) {
            this.f18217e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f18217e || this.f18216d == z) {
            return;
        }
        this.f18216d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f18218f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f18218f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f18216d);
    }
}
