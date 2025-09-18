package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p000.AbstractC6275k2;
import p000.AbstractC8704aH0;
import p000.C6212j2;
import p000.C6803s7;
import p000.C7866Kq0;
import p000.InterfaceC6592p2;
import p000.InterfaceC7398Bq0;
import p000.InterfaceC8646Zq0;
import p000.KY1;
import p000.MenuC7450Cq0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C6803s7 implements InterfaceC8646Zq0, View.OnClickListener, InterfaceC6592p2 {

    /* renamed from: h */
    public C7866Kq0 f15751h;

    /* renamed from: i */
    public CharSequence f15752i;

    /* renamed from: j */
    public Drawable f15753j;

    /* renamed from: k */
    public InterfaceC7398Bq0 f15754k;

    /* renamed from: l */
    public C6212j2 f15755l;

    /* renamed from: m */
    public AbstractC6275k2 f15756m;

    /* renamed from: n */
    public boolean f15757n;

    /* renamed from: o */
    public boolean f15758o;

    /* renamed from: p */
    public final int f15759p;

    /* renamed from: q */
    public int f15760q;

    /* renamed from: r */
    public final int f15761r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f15757n = m9826h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15425c, 0, 0);
        this.f15759p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f15761r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f15760q = -1;
        setSaveEnabled(false);
    }

    @Override // p000.InterfaceC6592p2
    /* renamed from: a */
    public final boolean mo9824a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p000.InterfaceC6592p2
    /* renamed from: b */
    public final boolean mo9825b() {
        return !TextUtils.isEmpty(getText()) && this.f15751h.getIcon() == null;
    }

    @Override // p000.InterfaceC8646Zq0
    /* renamed from: c */
    public final void mo9614c(C7866Kq0 c7866Kq0) {
        this.f15751h = c7866Kq0;
        setIcon(c7866Kq0.getIcon());
        setTitle(c7866Kq0.getTitleCondensed());
        setId(c7866Kq0.f6332a);
        setVisibility(c7866Kq0.isVisible() ? 0 : 8);
        setEnabled(c7866Kq0.isEnabled());
        if (c7866Kq0.hasSubMenu() && this.f15755l == null) {
            this.f15755l = new C6212j2(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p000.InterfaceC8646Zq0
    public C7866Kq0 getItemData() {
        return this.f15751h;
    }

    /* renamed from: h */
    public final boolean m9826h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: i */
    public final void m9827i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f15752i);
        if (this.f15753j != null && ((this.f15751h.f6356y & 4) != 4 || (!this.f15757n && !this.f15758o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f15752i : null);
        CharSequence charSequence = this.f15751h.f6348q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f15751h.f6336e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f15751h.f6349r;
        if (TextUtils.isEmpty(charSequence2)) {
            KY1.m4672b(this, z3 ? null : this.f15751h.f6336e);
        } else {
            KY1.m4672b(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7398Bq0 interfaceC7398Bq0 = this.f15754k;
        if (interfaceC7398Bq0 != null) {
            interfaceC7398Bq0.mo892a(this.f15751h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15757n = m9826h();
        m9827i();
    }

    @Override // p000.C6803s7, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f15760q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f15759p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f15753j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f15753j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C6212j2 c6212j2;
        if (this.f15751h.hasSubMenu() && (c6212j2 = this.f15755l) != null && c6212j2.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f15758o != z) {
            this.f15758o = z;
            C7866Kq0 c7866Kq0 = this.f15751h;
            if (c7866Kq0 != null) {
                MenuC7450Cq0 menuC7450Cq0 = c7866Kq0.f6345n;
                menuC7450Cq0.f1712k = true;
                menuC7450Cq0.m1417p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f15753j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f15761r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m9827i();
    }

    public void setItemInvoker(InterfaceC7398Bq0 interfaceC7398Bq0) {
        this.f15754k = interfaceC7398Bq0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f15760q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC6275k2 abstractC6275k2) {
        this.f15756m = abstractC6275k2;
    }

    public void setTitle(CharSequence charSequence) {
        this.f15752i = charSequence;
        m9827i();
    }
}
