package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p000.AbstractC8704aH0;
import p000.C7866Kq0;
import p000.C8539Xo1;
import p000.InterfaceC8646Zq0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC8646Zq0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C7866Kq0 f15764a;

    /* renamed from: b */
    public ImageView f15765b;

    /* renamed from: c */
    public RadioButton f15766c;

    /* renamed from: d */
    public TextView f15767d;

    /* renamed from: e */
    public CheckBox f15768e;

    /* renamed from: f */
    public TextView f15769f;

    /* renamed from: g */
    public ImageView f15770g;

    /* renamed from: h */
    public ImageView f15771h;

    /* renamed from: i */
    public LinearLayout f15772i;

    /* renamed from: j */
    public final Drawable f15773j;

    /* renamed from: k */
    public final int f15774k;

    /* renamed from: l */
    public final Context f15775l;

    /* renamed from: m */
    public boolean f15776m;

    /* renamed from: n */
    public final Drawable f15777n;

    /* renamed from: o */
    public final boolean f15778o;

    /* renamed from: p */
    public LayoutInflater f15779p;

    /* renamed from: q */
    public boolean f15780q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(getContext(), attributeSet, AbstractC8704aH0.f15440r, R.attr.listMenuViewStyle);
        this.f15773j = c8539Xo1M9117J.m9121C(5);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        this.f15774k = typedArray.getResourceId(1, -1);
        this.f15776m = typedArray.getBoolean(7, false);
        this.f15775l = context;
        this.f15777n = c8539Xo1M9117J.m9121C(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f15778o = typedArrayObtainStyledAttributes.hasValue(0);
        c8539Xo1M9117J.m9130M();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f15779p == null) {
            this.f15779p = LayoutInflater.from(getContext());
        }
        return this.f15779p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f15770g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f15771h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15771h.getLayoutParams();
        rect.top = this.f15771h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p000.InterfaceC8646Zq0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9614c(p000.C7866Kq0 r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo9614c(Kq0):void");
    }

    @Override // p000.InterfaceC8646Zq0
    public C7866Kq0 getItemData() {
        return this.f15764a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f15773j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f15767d = textView;
        int i = this.f15774k;
        if (i != -1) {
            textView.setTextAppearance(this.f15775l, i);
        }
        this.f15769f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f15770g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f15777n);
        }
        this.f15771h = (ImageView) findViewById(R.id.group_divider);
        this.f15772i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f15765b != null && this.f15776m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f15765b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f15766c == null && this.f15768e == null) {
            return;
        }
        if ((this.f15764a.f6355x & 4) != 0) {
            if (this.f15766c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f15766c = radioButton;
                LinearLayout linearLayout = this.f15772i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f15766c;
            view = this.f15768e;
        } else {
            if (this.f15768e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f15768e = checkBox;
                LinearLayout linearLayout2 = this.f15772i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f15768e;
            view = this.f15766c;
        }
        if (z) {
            compoundButton.setChecked(this.f15764a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f15768e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f15766c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f15764a.f6355x & 4) != 0) {
            if (this.f15766c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f15766c = radioButton;
                LinearLayout linearLayout = this.f15772i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f15766c;
        } else {
            if (this.f15768e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f15768e = checkBox;
                LinearLayout linearLayout2 = this.f15772i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f15768e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f15780q = z;
        this.f15776m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f15771h;
        if (imageView != null) {
            imageView.setVisibility((this.f15778o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f15764a.f6345n.getClass();
        boolean z = this.f15780q;
        if (z || this.f15776m) {
            ImageView imageView = this.f15765b;
            if (imageView == null && drawable == null && !this.f15776m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f15765b = imageView2;
                LinearLayout linearLayout = this.f15772i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f15776m) {
                this.f15765b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f15765b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f15765b.getVisibility() != 0) {
                this.f15765b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f15767d.getVisibility() != 8) {
                this.f15767d.setVisibility(8);
            }
        } else {
            this.f15767d.setText(charSequence);
            if (this.f15767d.getVisibility() != 0) {
                this.f15767d.setVisibility(0);
            }
        }
    }
}
