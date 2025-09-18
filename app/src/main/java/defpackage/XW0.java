package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.a;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public final class XW0 extends a {
    public WW0 a;
    public RW0 b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public C5772lr0 k;
    public boolean l;
    public final int m;

    public XW0(S91 s91) {
        super(s91);
        this.a = WW0.a;
        this.b = RW0.a;
        this.g = "";
        this.h = true;
        this.j = true;
        this.m = OZ1.e(this);
    }

    private final C6854rW0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof C7618vW0) {
            return ((C7618vW0) parent).getConfig();
        }
        return null;
    }

    public final C6473pW0 getScreenStackFragment() {
        C6854rW0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    public static void l(XW0 xw0) {
        O90.f(xw0, "this$0");
        xw0.s(new C7098so(xw0.m, xw0.getId(), 22));
        xw0.setToolbarElementsVisibility(0);
    }

    public static void m(XW0 xw0) {
        O90.f(xw0, "this$0");
        xw0.s(new C7098so(xw0.m, xw0.getId(), 24));
        xw0.setToolbarElementsVisibility(8);
    }

    private final void setSearchViewListeners(AbstractC5330jX0 abstractC5330jX0) {
        abstractC5330jX0.setOnQueryTextListener(new GQ0(2, this));
        abstractC5330jX0.setOnQueryTextFocusChangeListener(new ViewOnFocusChangeListenerC1633Us(3, this));
        abstractC5330jX0.setOnCloseListener(new C1724Vw0(14, this));
        abstractC5330jX0.setOnSearchClickListener(new ViewOnClickListenerC1555Ts(7, this));
    }

    private final void setToolbarElementsVisibility(int i) {
        C7618vW0 c7618vW0;
        int i2 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            C6854rW0 headerConfig = getHeaderConfig();
            if (headerConfig != null) {
                Object obj = headerConfig.c.get(i2);
                O90.e(obj, "get(...)");
                c7618vW0 = (C7618vW0) obj;
            } else {
                c7618vW0 = null;
            }
            if ((c7618vW0 != null ? c7618vW0.getType() : null) != EnumC7427uW0.e && c7618vW0 != null) {
                c7618vW0.setVisibility(i);
            }
            if (i2 == configSubviewsCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final RW0 getAutoCapitalize() {
        return this.b;
    }

    public final boolean getAutoFocus() {
        return this.i;
    }

    public final Integer getHeaderIconColor() {
        return this.e;
    }

    public final Integer getHintTextColor() {
        return this.f;
    }

    public final WW0 getInputType() {
        return this.a;
    }

    public final String getPlaceholder() {
        return this.g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.j;
    }

    public final Integer getTextColor() {
        return this.c;
    }

    public final Integer getTintColor() {
        return this.d;
    }

    public final void o() {
        NB nb;
        C6473pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (nb = screenStackFragment.n) == null) {
            return;
        }
        nb.clearFocus();
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6473pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null) {
            return;
        }
        screenStackFragment.o = new C5661lG0(4, this);
    }

    public final void p() {
        NB nb;
        C6473pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (nb = screenStackFragment.n) == null) {
            return;
        }
        nb.t("");
    }

    public final void q() {
        NB nb;
        C6473pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (nb = screenStackFragment.n) == null) {
            return;
        }
        nb.setIconified(false);
        nb.requestFocusFromTouch();
    }

    public final void r(String str) {
        C6473pW0 screenStackFragment;
        NB nb;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (nb = screenStackFragment.n) == null) {
            return;
        }
        nb.setText(str);
    }

    public final void s(AbstractC6260oP abstractC6260oP) {
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(abstractC6260oP);
        }
    }

    public final void setAutoCapitalize(RW0 rw0) {
        O90.f(rw0, "<set-?>");
        this.b = rw0;
    }

    public final void setAutoFocus(boolean z) {
        this.i = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f = num;
    }

    public final void setInputType(WW0 ww0) {
        O90.f(ww0, "<set-?>");
        this.a = ww0;
    }

    public final void setPlaceholder(String str) {
        O90.f(str, "<set-?>");
        this.g = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.h = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.j = z;
    }

    public final void setTextColor(Integer num) {
        this.c = num;
    }

    public final void setTintColor(Integer num) {
        this.d = num;
    }

    public final void t() {
        Integer num;
        Integer num2;
        EditText editTextR;
        ColorStateList textColors;
        C6473pW0 screenStackFragment = getScreenStackFragment();
        Integer numValueOf = null;
        NB nb = screenStackFragment != null ? screenStackFragment.n : null;
        if (nb != null) {
            if (!this.l) {
                setSearchViewListeners(nb);
                this.l = true;
            }
            nb.setInputType(this.a.a(this.b));
            C5772lr0 c5772lr0 = this.k;
            if (c5772lr0 != null) {
                Integer num3 = this.c;
                Integer num4 = (Integer) c5772lr0.c;
                if (num3 != null) {
                    if (num4 == null) {
                        EditText editTextR2 = c5772lr0.R();
                        if (editTextR2 != null && (textColors = editTextR2.getTextColors()) != null) {
                            numValueOf = Integer.valueOf(textColors.getDefaultColor());
                        }
                        c5772lr0.c = numValueOf;
                    }
                    EditText editTextR3 = c5772lr0.R();
                    if (editTextR3 != null) {
                        editTextR3.setTextColor(num3.intValue());
                    }
                } else if (num4 != null && (editTextR = c5772lr0.R()) != null) {
                    editTextR.setTextColor(num4.intValue());
                }
            }
            C5772lr0 c5772lr02 = this.k;
            if (c5772lr02 != null) {
                Integer num5 = this.d;
                Drawable drawable = (Drawable) c5772lr02.d;
                if (num5 != null) {
                    if (drawable == null) {
                        c5772lr02.d = ((NB) c5772lr02.b).findViewById(R.id.search_plate).getBackground();
                    }
                    ((NB) c5772lr02.b).findViewById(R.id.search_plate).setBackgroundColor(num5.intValue());
                } else if (drawable != null) {
                    ((NB) c5772lr02.b).findViewById(R.id.search_plate).setBackground(drawable);
                }
            }
            C5772lr0 c5772lr03 = this.k;
            if (c5772lr03 != null && (num2 = this.e) != null) {
                int iIntValue = num2.intValue();
                NB nb2 = (NB) c5772lr03.b;
                ((ImageView) nb2.findViewById(R.id.search_button)).setColorFilter(iIntValue);
                ((ImageView) nb2.findViewById(R.id.search_close_btn)).setColorFilter(iIntValue);
            }
            C5772lr0 c5772lr04 = this.k;
            if (c5772lr04 != null && (num = this.f) != null) {
                int iIntValue2 = num.intValue();
                EditText editTextR4 = c5772lr04.R();
                if (editTextR4 != null) {
                    editTextR4.setHintTextColor(iIntValue2);
                }
            }
            C5772lr0 c5772lr05 = this.k;
            if (c5772lr05 != null) {
                String str = this.g;
                boolean z = this.j;
                O90.f(str, "placeholder");
                if (z) {
                    ((NB) c5772lr05.b).setQueryHint(str);
                } else {
                    EditText editTextR5 = c5772lr05.R();
                    if (editTextR5 != null) {
                        editTextR5.setHint(str);
                    }
                }
            }
            nb.setOverrideBackAction(this.h);
        }
    }
}
