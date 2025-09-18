package defpackage;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: jX0 */
/* loaded from: classes.dex */
public abstract class AbstractC5330jX0 extends AbstractC1760Wi0 implements InterfaceC6925ru {
    public static final C6846rT1 u1;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public InterfaceC3790fX0 K;
    public InterfaceC3599eX0 L;
    public View.OnFocusChangeListener M;
    public View.OnClickListener N;
    public boolean O;
    public boolean P;
    public BB Q;
    public boolean R;
    public CharSequence S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public String a0;
    public CharSequence b0;
    public boolean c0;
    public int d0;
    public SearchableInfo e0;
    public final SearchView$SearchAutoComplete p;
    public final View q;
    public Bundle q1;
    public final View r;
    public final ZW0 r1;
    public final View s;
    public final ZW0 s1;
    public final ImageView t;
    public final WeakHashMap t1;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public C4363iX0 y;
    public final Rect z;

    static {
        C6846rT1 c6846rT1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            C6846rT1 c6846rT12 = new C6846rT1(23, false);
            c6846rT12.b = null;
            c6846rT12.c = null;
            c6846rT12.d = null;
            C6846rT1.E();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c6846rT12.b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c6846rT12.c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c6846rT12.d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c6846rT1 = c6846rT12;
        }
        u1 = c6846rT1;
    }

    public AbstractC5330jX0(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        NB nb = (NB) this;
        this.r1 = new ZW0(nb, 0);
        this.s1 = new ZW0(nb, 1);
        this.t1 = new WeakHashMap();
        ViewOnClickListenerC2437c2 viewOnClickListenerC2437c2 = new ViewOnClickListenerC2437c2(4, nb);
        ViewOnKeyListenerC2343bX0 viewOnKeyListenerC2343bX0 = new ViewOnKeyListenerC2343bX0(nb);
        C2533cX0 c2533cX0 = new C2533cX0(nb);
        C2264b7 c2264b7 = new C2264b7(2, nb);
        C0126Bj0 c0126Bj0 = new C0126Bj0(1, nb);
        YW0 yw0 = new YW0(nb);
        int[] iArr = AbstractC2104aH0.u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        C1857Xo1 c1857Xo1 = new C1857Xo1(context, typedArrayObtainStyledAttributes);
        AbstractC6897rk1.m(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.p = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        viewFindViewById.setBackground(c1857Xo1.C(20));
        viewFindViewById2.setBackground(c1857Xo1.C(25));
        imageView.setImageDrawable(c1857Xo1.C(23));
        imageView2.setImageDrawable(c1857Xo1.C(15));
        imageView3.setImageDrawable(c1857Xo1.C(12));
        imageView4.setImageDrawable(c1857Xo1.C(28));
        imageView5.setImageDrawable(c1857Xo1.C(23));
        this.E = c1857Xo1.C(22);
        KY1.b(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC2437c2);
        imageView3.setOnClickListener(viewOnClickListenerC2437c2);
        imageView2.setOnClickListener(viewOnClickListenerC2437c2);
        imageView4.setOnClickListener(viewOnClickListenerC2437c2);
        searchView$SearchAutoComplete.setOnClickListener(viewOnClickListenerC2437c2);
        searchView$SearchAutoComplete.addTextChangedListener(yw0);
        searchView$SearchAutoComplete.setOnEditorActionListener(c2533cX0);
        searchView$SearchAutoComplete.setOnItemClickListener(c2264b7);
        searchView$SearchAutoComplete.setOnItemSelectedListener(c0126Bj0);
        searchView$SearchAutoComplete.setOnKeyListener(viewOnKeyListenerC2343bX0);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2152aX0(nb));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.J = typedArrayObtainStyledAttributes.getText(14);
        this.S = typedArrayObtainStyledAttributes.getText(21);
        int i = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c1857Xo1.M();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0979Mi(1, nb));
        }
        z(this.O);
        w();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.U = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.U = false;
    }

    @Override // defpackage.InterfaceC6925ru
    public final void d() {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.d0 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // defpackage.InterfaceC6925ru
    public final void e() {
        t("");
        clearFocus();
        z(true);
        this.p.setImeOptions(this.d0);
        this.c0 = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.V;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public BB getSuggestionsAdapter() {
        return this.Q;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.b0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.q1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.e0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.q1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (i >= 29) {
            AbstractC3409dX0.a(searchView$SearchAutoComplete);
            return;
        }
        C6846rT1 c6846rT1 = u1;
        c6846rT1.getClass();
        C6846rT1.E();
        Method method = (Method) c6846rT1.b;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c6846rT1.getClass();
        C6846rT1.E();
        Method method2 = (Method) c6846rT1.c;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.O) {
            InterfaceC3599eX0 interfaceC3599eX0 = this.L;
            if (interfaceC3599eX0 == null || !interfaceC3599eX0.f()) {
                clearFocus();
                z(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.r1);
        post(this.s1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.AbstractC1760Wi0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int[] iArr = this.B;
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i6;
            int height = searchView$SearchAutoComplete.getHeight() + i5;
            Rect rect = this.z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.A;
            rect2.set(i7, 0, i8, i9);
            C4363iX0 c4363iX0 = this.y;
            if (c4363iX0 == null) {
                C4363iX0 c4363iX02 = new C4363iX0(searchView$SearchAutoComplete, rect2, rect);
                this.y = c4363iX02;
                setTouchDelegate(c4363iX02);
            } else {
                c4363iX0.b.set(rect2);
                Rect rect3 = c4363iX0.d;
                rect3.set(rect2);
                int i10 = -c4363iX0.e;
                rect3.inset(i10, i10);
                c4363iX0.c.set(rect);
            }
        }
    }

    @Override // defpackage.AbstractC1760Wi0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.P) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.V;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.V;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.V) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4172hX0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4172hX0 c4172hX0 = (C4172hX0) parcelable;
        super.onRestoreInstanceState(c4172hX0.a);
        z(c4172hX0.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4172hX0 c4172hX0 = new C4172hX0(super.onSaveInstanceState());
        c4172hX0.c = this.P;
        return c4172hX0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.r1);
    }

    public final void p(int i) {
        String strH;
        Cursor cursor = this.Q.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentL = null;
            try {
                try {
                    int i2 = ViewOnClickListenerC5823m61.x;
                    String strH2 = ViewOnClickListenerC5823m61.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.e0.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = ViewOnClickListenerC5823m61.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.e0.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = ViewOnClickListenerC5823m61.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentL = l(strH2, strH3 == null ? null : Uri.parse(strH3), ViewOnClickListenerC5823m61.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC5823m61.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException unused3) {
                    intentL.toString();
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void q(int i) {
        Editable text = this.p.getText();
        Cursor cursor = this.Q.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.Q.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.U || !isFocusable()) {
            return false;
        }
        if (this.P) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.p.requestFocus(i, rect);
        if (zRequestFocus) {
            z(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC3790fX0 interfaceC3790fX0 = this.K;
        if (interfaceC3790fX0 != null) {
            String string = text.toString();
            XW0 xw0 = (XW0) ((GQ0) interfaceC3790fX0).b;
            xw0.s(new PW(xw0.m, xw0.getId(), 6, string));
        } else {
            if (this.e0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchView$SearchAutoComplete.setImeVisibility(false);
            searchView$SearchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.q1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            o();
            return;
        }
        z(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.O == z) {
            return;
        }
        this.O = z;
        z(z);
        w();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.V = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC3599eX0 interfaceC3599eX0) {
        this.L = interfaceC3599eX0;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC3790fX0 interfaceC3790fX0) {
        this.K = interfaceC3790fX0;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.N = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.S = charSequence;
        w();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.T = z;
        BB bb = this.Q;
        if (bb instanceof ViewOnClickListenerC5823m61) {
            ((ViewOnClickListenerC5823m61) bb).p = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.e0 = searchableInfo;
        Intent intent = null;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (searchableInfo != null) {
            searchView$SearchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchView$SearchAutoComplete.setImeOptions(this.e0.getImeOptions());
            int inputType = this.e0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.e0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchView$SearchAutoComplete.setInputType(inputType);
            BB bb = this.Q;
            if (bb != null) {
                bb.b(null);
            }
            if (this.e0.getSuggestAuthority() != null) {
                ViewOnClickListenerC5823m61 viewOnClickListenerC5823m61 = new ViewOnClickListenerC5823m61(getContext(), this, this.e0, this.t1);
                this.Q = viewOnClickListenerC5823m61;
                searchView$SearchAutoComplete.setAdapter(viewOnClickListenerC5823m61);
                ((ViewOnClickListenerC5823m61) this.Q).p = this.T ? 2 : 1;
            }
            w();
        }
        SearchableInfo searchableInfo2 = this.e0;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.e0.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else if (this.e0.getVoiceSearchLaunchRecognizer()) {
                intent = this.I;
            }
            if (intent != null) {
                z = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.W = z;
        if (z) {
            searchView$SearchAutoComplete.setPrivateImeOptions("nm");
        }
        z(this.P);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.R = z;
        z(this.P);
    }

    public void setSuggestionsAdapter(BB bb) {
        this.Q = bb;
        this.p.setAdapter(bb);
    }

    public final void t(String str) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setText(str);
        if (str != null) {
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.b0 = str;
        }
    }

    public final void u() {
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        int i = (!zIsEmpty || (this.O && !this.c0)) ? 0 : 8;
        ImageView imageView = this.v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void v() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void w() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.O;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (z && (drawable = this.E) != null) {
            int textSize = (int) (searchView$SearchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    public final void x() {
        this.s.setVisibility(((this.R || this.W) && !this.P && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void y(boolean z) {
        boolean z2 = this.R;
        this.u.setVisibility((!z2 || !(z2 || this.W) || this.P || !hasFocus() || (!z && this.W)) ? 8 : 0);
    }

    public final void z(boolean z) {
        this.P = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i2);
        y(!zIsEmpty);
        this.q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.O) ? 8 : 0);
        u();
        if (this.W && !this.P && zIsEmpty) {
            this.u.setVisibility(8);
            i = 0;
        }
        this.w.setVisibility(i);
        x();
    }

    public void setOnSuggestionListener(InterfaceC3981gX0 interfaceC3981gX0) {
    }
}
