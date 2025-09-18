package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1932a;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public final class XW0 extends C1932a {

    /* renamed from: a */
    public WW0 f13815a;

    /* renamed from: b */
    public RW0 f13816b;

    /* renamed from: c */
    public Integer f13817c;

    /* renamed from: d */
    public Integer f13818d;

    /* renamed from: e */
    public Integer f13819e;

    /* renamed from: f */
    public Integer f13820f;

    /* renamed from: g */
    public String f13821g;

    /* renamed from: h */
    public boolean f13822h;

    /* renamed from: i */
    public boolean f13823i;

    /* renamed from: j */
    public boolean f13824j;

    /* renamed from: k */
    public C10189lr0 f13825k;

    /* renamed from: l */
    public boolean f13826l;

    /* renamed from: m */
    public final int f13827m;

    public XW0(S91 s91) {
        super(s91);
        this.f13815a = WW0.f13237a;
        this.f13816b = RW0.f10249a;
        this.f13821g = "";
        this.f13822h = true;
        this.f13824j = true;
        this.f13827m = OZ1.m6094e(this);
    }

    private final C10915rW0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof C11427vW0) {
            return ((C11427vW0) parent).getConfig();
        }
        return null;
    }

    public final C10659pW0 getScreenStackFragment() {
        C10915rW0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    /* renamed from: l */
    public static void m9061l(XW0 xw0) {
        O90.m5968f(xw0, "this$0");
        xw0.m9068s(new C6846so(xw0.f13827m, xw0.getId(), 22));
        xw0.setToolbarElementsVisibility(0);
    }

    /* renamed from: m */
    public static void m9062m(XW0 xw0) {
        O90.m5968f(xw0, "this$0");
        xw0.m9068s(new C6846so(xw0.f13827m, xw0.getId(), 24));
        xw0.setToolbarElementsVisibility(8);
    }

    private final void setSearchViewListeners(AbstractC9893jX0 abstractC9893jX0) {
        abstractC9893jX0.setOnQueryTextListener(new GQ0(2, this));
        abstractC9893jX0.setOnQueryTextFocusChangeListener(new ViewOnFocusChangeListenerC1313Us(3, this));
        abstractC9893jX0.setOnCloseListener(new C8450Vw0(14, this));
        abstractC9893jX0.setOnSearchClickListener(new ViewOnClickListenerC1250Ts(7, this));
    }

    private final void setToolbarElementsVisibility(int i) {
        C11427vW0 c11427vW0;
        int i2 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            C10915rW0 headerConfig = getHeaderConfig();
            if (headerConfig != null) {
                Object obj = headerConfig.f41695c.get(i2);
                O90.m5967e(obj, "get(...)");
                c11427vW0 = (C11427vW0) obj;
            } else {
                c11427vW0 = null;
            }
            if ((c11427vW0 != null ? c11427vW0.getType() : null) != EnumC11299uW0.f43716e && c11427vW0 != null) {
                c11427vW0.setVisibility(i);
            }
            if (i2 == configSubviewsCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final RW0 getAutoCapitalize() {
        return this.f13816b;
    }

    public final boolean getAutoFocus() {
        return this.f13823i;
    }

    public final Integer getHeaderIconColor() {
        return this.f13819e;
    }

    public final Integer getHintTextColor() {
        return this.f13820f;
    }

    public final WW0 getInputType() {
        return this.f13815a;
    }

    public final String getPlaceholder() {
        return this.f13821g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f13822h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f13824j;
    }

    public final Integer getTextColor() {
        return this.f13817c;
    }

    public final Integer getTintColor() {
        return this.f13818d;
    }

    /* renamed from: o */
    public final void m9064o() {
        C0830NB c0830nb;
        C10659pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c0830nb = screenStackFragment.f40135n) == null) {
            return;
        }
        c0830nb.clearFocus();
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10659pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null) {
            return;
        }
        screenStackFragment.f40136o = new C10115lG0(4, this);
    }

    /* renamed from: p */
    public final void m9065p() {
        C0830NB c0830nb;
        C10659pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c0830nb = screenStackFragment.f40135n) == null) {
            return;
        }
        c0830nb.m22062t("");
    }

    /* renamed from: q */
    public final void m9066q() {
        C0830NB c0830nb;
        C10659pW0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c0830nb = screenStackFragment.f40135n) == null) {
            return;
        }
        c0830nb.setIconified(false);
        c0830nb.requestFocusFromTouch();
    }

    /* renamed from: r */
    public final void m9067r(String str) {
        C10659pW0 screenStackFragment;
        C0830NB c0830nb;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (c0830nb = screenStackFragment.f40135n) == null) {
            return;
        }
        c0830nb.setText(str);
    }

    /* renamed from: s */
    public final void m9068s(AbstractC6550oP abstractC6550oP) {
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(abstractC6550oP);
        }
    }

    public final void setAutoCapitalize(RW0 rw0) {
        O90.m5968f(rw0, "<set-?>");
        this.f13816b = rw0;
    }

    public final void setAutoFocus(boolean z) {
        this.f13823i = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f13819e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f13820f = num;
    }

    public final void setInputType(WW0 ww0) {
        O90.m5968f(ww0, "<set-?>");
        this.f13815a = ww0;
    }

    public final void setPlaceholder(String str) {
        O90.m5968f(str, "<set-?>");
        this.f13821g = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.f13822h = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.f13824j = z;
    }

    public final void setTextColor(Integer num) {
        this.f13817c = num;
    }

    public final void setTintColor(Integer num) {
        this.f13818d = num;
    }

    /* renamed from: t */
    public final void m9069t() {
        Integer num;
        Integer num2;
        EditText editTextM22559R;
        ColorStateList textColors;
        C10659pW0 screenStackFragment = getScreenStackFragment();
        Integer numValueOf = null;
        C0830NB c0830nb = screenStackFragment != null ? screenStackFragment.f40135n : null;
        if (c0830nb != null) {
            if (!this.f13826l) {
                setSearchViewListeners(c0830nb);
                this.f13826l = true;
            }
            c0830nb.setInputType(this.f13815a.mo7391a(this.f13816b));
            C10189lr0 c10189lr0 = this.f13825k;
            if (c10189lr0 != null) {
                Integer num3 = this.f13817c;
                Integer num4 = (Integer) c10189lr0.f37324c;
                if (num3 != null) {
                    if (num4 == null) {
                        EditText editTextM22559R2 = c10189lr0.m22559R();
                        if (editTextM22559R2 != null && (textColors = editTextM22559R2.getTextColors()) != null) {
                            numValueOf = Integer.valueOf(textColors.getDefaultColor());
                        }
                        c10189lr0.f37324c = numValueOf;
                    }
                    EditText editTextM22559R3 = c10189lr0.m22559R();
                    if (editTextM22559R3 != null) {
                        editTextM22559R3.setTextColor(num3.intValue());
                    }
                } else if (num4 != null && (editTextM22559R = c10189lr0.m22559R()) != null) {
                    editTextM22559R.setTextColor(num4.intValue());
                }
            }
            C10189lr0 c10189lr02 = this.f13825k;
            if (c10189lr02 != null) {
                Integer num5 = this.f13818d;
                Drawable drawable = (Drawable) c10189lr02.f37325d;
                if (num5 != null) {
                    if (drawable == null) {
                        c10189lr02.f37325d = ((C0830NB) c10189lr02.f37323b).findViewById(R.id.search_plate).getBackground();
                    }
                    ((C0830NB) c10189lr02.f37323b).findViewById(R.id.search_plate).setBackgroundColor(num5.intValue());
                } else if (drawable != null) {
                    ((C0830NB) c10189lr02.f37323b).findViewById(R.id.search_plate).setBackground(drawable);
                }
            }
            C10189lr0 c10189lr03 = this.f13825k;
            if (c10189lr03 != null && (num2 = this.f13819e) != null) {
                int iIntValue = num2.intValue();
                C0830NB c0830nb2 = (C0830NB) c10189lr03.f37323b;
                ((ImageView) c0830nb2.findViewById(R.id.search_button)).setColorFilter(iIntValue);
                ((ImageView) c0830nb2.findViewById(R.id.search_close_btn)).setColorFilter(iIntValue);
            }
            C10189lr0 c10189lr04 = this.f13825k;
            if (c10189lr04 != null && (num = this.f13820f) != null) {
                int iIntValue2 = num.intValue();
                EditText editTextM22559R4 = c10189lr04.m22559R();
                if (editTextM22559R4 != null) {
                    editTextM22559R4.setHintTextColor(iIntValue2);
                }
            }
            C10189lr0 c10189lr05 = this.f13825k;
            if (c10189lr05 != null) {
                String str = this.f13821g;
                boolean z = this.f13824j;
                O90.m5968f(str, "placeholder");
                if (z) {
                    ((C0830NB) c10189lr05.f37323b).setQueryHint(str);
                } else {
                    EditText editTextM22559R5 = c10189lr05.m22559R();
                    if (editTextM22559R5 != null) {
                        editTextM22559R5.setHint(str);
                    }
                }
            }
            c0830nb.setOverrideBackAction(this.f13822h);
        }
    }
}
